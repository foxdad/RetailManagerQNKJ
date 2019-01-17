package com.boyu.kiss.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boyu.kiss.entity.CodeInforVo;
import com.boyu.kiss.entity.RoleMenu;
import com.boyu.kiss.entity.User;
import com.boyu.kiss.result.GetRegisterResult;
import com.boyu.kiss.result.UserVO;
import com.boyu.kiss.service.impl.RoleMenuServiceImpl;
import com.boyu.kiss.service.impl.UserServiceImpl;
import com.boyu.kiss.utils.SMS;

@Controller
public class UserController {
	//验证码长度
	private final static int codeLength =6;
	private final static Map<String, CodeInforVo> codeInforMap = new HashMap<String,CodeInforVo>();
	public static final String REGEX_PASSWORD = "^[a-zA-Z0-9]{8,20}$";
	public static final String REGEX_PHONE = "(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$";
	private final static long CodeOutDate = 5*60*1000;  //验证码过期时间
	
	@Autowired
	private UserServiceImpl serviceImpl;
	@Autowired
	private RoleMenuServiceImpl roleMenuService;
	
	@RequestMapping("/getUser.do")
	@ResponseBody
	public User getUser(Integer id){
		User user = serviceImpl.selectById(id);
		return user;
	}
	
	@RequestMapping("/addAdmin")
	@ResponseBody
	public String addAdmin(User user){
		int rows = serviceImpl.insert(user);
		if(rows == 1)
			return "添加成功";
		return "添加失败";
	}

	@RequestMapping("/login.do")
	@ResponseBody
	public Map<String, Object> login(String username,String password,int roleId) {
		Map<String, Object> map = serviceImpl.login(username,password,roleId);
		return map;
	}
	//发送验证码
	@RequestMapping("/getCode")
	@ResponseBody
	public GetRegisterResult sendCode(@RequestParam(value="phone",defaultValue="") String phoneNumber ){
		
		GetRegisterResult result = new  GetRegisterResult();
		boolean bPhone = Pattern.matches(REGEX_PHONE,phoneNumber);
		if(!bPhone){
			result.setState(500);
			result.setMessage("手机号为空");
			return result;
		}
		String code =UserController.getCode();
		if( code== null || code.length()==0){
			result.setState(500);
			result.setMessage("无效的验证码");
			return result;
		}
		
		try {
			SMS.batchsendsm(phoneNumber,code);
		} catch (Exception e) {
			result.setState(500);
			result.setMessage("验证码发送失败");
			return result;
		}
		CodeInforVo codeInfor = new CodeInforVo();
		codeInfor.setCode(code);
		codeInfor.setPhone(phoneNumber);
		codeInfor.setDate(System.currentTimeMillis());
		codeInforMap.put(phoneNumber,codeInfor);
		result.setState(200);
		result.setMessage("验证码发送成功");
		result.setData(code);  					
		return  result;

	}
	//注册
	@ResponseBody
	@RequestMapping("/register")
	public GetRegisterResult register(String phone,String password,String code,int roleId) {
		boolean bPhone = Pattern.matches(REGEX_PHONE,phone);
		boolean bPassword = Pattern.matches(REGEX_PASSWORD,password);
		
		GetRegisterResult result = new  GetRegisterResult();
		//判断手机号及密码是否含非法值
		if(bPhone&&bPassword) {
			CodeInforVo codeInforVo = codeInforMap.get(phone);
			//判断手机号key值是否存在
			if(codeInforVo == null) {
				result.setState(500);
				result.setMessage("手机号码不一致");
				return result;
			}
			else {
				//判断验证码是否过期及验证码是否正确
				if( System.currentTimeMillis()- codeInforVo.getDate() > CodeOutDate ){
					
					result.setState(500);
					result.setMessage("验证码已过期");
					return result;
				}
				else if(!codeInforVo.getCode().equals(code)){
					result.setState(500);
					result.setMessage("验证码错误");
					return result;
				}
				else {
					User user = new User();
					user.setUserName(phone);
					user.setPassword(password);
					user.setRoleid(roleId);
					int rows = serviceImpl.insert(user);
					//判断是否注册成功
					if(rows == 1) {
						result.setState(200);
						result.setMessage("注册成功");
						return result;
					}
					else {
						result.setState(500);
						result.setMessage("系统错误");
						return result;
					}
					
				}
			}
		}
		else {
			result.setState(500);
			result.setMessage("手机号或密码格式不正确");
			return result;
		}
	}
	//产生一个6位随机数
	public static String getCode(){
		  
		 Random rand = new  Random();
		 int  a ;
		 String  result ="";
		 for( int j =0; j<codeLength; j++ ){
			 a = Math.abs( rand.nextInt()%9 );
			 result += String.valueOf(a);
		 }
		 return  result;
	  }
	
	@RequestMapping(value="/login")
	public String loginning(String username,String password,HttpServletRequest request){
		User user = serviceImpl.selectUser(username, password);
		if (user != null) {
			request.getSession().setAttribute("user", user);
			Map<String, Object> map = new HashMap<String,Object>();
			map.put("roleid", user.getRoleid());
			List<RoleMenu> Menulist = roleMenuService.selectByMap(map);
			request.getSession().setAttribute("Menulist", Menulist);
			return "pre/index";
		}else {
			request.setAttribute("error", "用户名或密码错误");
			return "login";
		}		
	}
	@ResponseBody
	@RequestMapping("/selectUserList")
	public Map<String, Object> selectUserList(Integer page,Integer limit) {
		Map<String,Object> resultMap = new HashMap<String,Object>();
		
		int count = serviceImpl.selectUserListCount();
		int begin = (page-1) * limit;
		int end = limit;
		List<UserVO> userList = serviceImpl.selectUserList(begin,end);
		resultMap.put("count", count);
		resultMap.put("data", userList);
		System.out.println("111111111111");
		return resultMap;
		
	}
}
