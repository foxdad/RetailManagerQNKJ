package com.boyu.kiss.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.codec.binary.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boyu.kiss.entity.Commodity;
import com.boyu.kiss.entity.CommodityType;
import com.boyu.kiss.service.impl.CommodityServiceImpl;
import com.boyu.kiss.service.impl.CommodityTypeServiceImpl;

@RestController
public class CommodityController {

	@Autowired
	private CommodityServiceImpl commodityService;
	
	@Autowired
	private CommodityTypeServiceImpl commodityTypeService;

	//添加商品接口
	@RequestMapping("/addCommodity.do")
	public String addCommodity(Commodity commodity,HttpServletRequest request) {
		//对字节数组字符串进行Base64解码并生成图片
		String commodityImg = upImgs(commodity.getImage(),"commodity",request);
		String detailedImg = upImgs(commodity.getDetailedurl(),"commodity",request);
		if(commodityImg!=null&&detailedImg!=null) {
			commodity.setImage(commodityImg);
			commodity.setDetailedurl(detailedImg);
			Integer rows = commodityService.insert(commodity);
			if(rows == 1)
				return "{\"result\": \"OK\"}";
			else {
				return "{\"result\": \"failed\"}";
			}
		}
		return "{\"result\": \"failed\"}";
	}
	/*@ResponseBody
	@RequestMapping("/addCommodity")
	public String addCommodity(Commodity commodity) {

		Integer rows = commodityService.insert(commodity);
		if(rows == 1)
			return "{\"result\": \"OK\"}";
		else {
			return "{\"result\": \"failed\"}";
		}

	}*/
	@RequestMapping("/test")
	public String addCommodity(String str,HttpServletRequest request) {
		//对字节数组字符串进行Base64解码并生成图片
        if (str == null) //图像数据为空
        	return "{\"result\": \"failed\"}";
      
        try 
        {
            //Base64解码
        	String imgs = str.replaceAll("data:image/jpeg;base64,", "");
        	System.out.println(imgs);
        	byte[] b = Base64.decodeBase64(imgs);
            for(int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                {//调整异常数据
                    b[i]+=256;
                }
            }
            //生成jpeg图片
            String files = new SimpleDateFormat("yyyyMMddHHmmssSSS")
                    .format(new Date())
                    + (new Random().nextInt(9000) % (9000 - 1000 + 1) + 1000)
                    + ".jpg";
           /* File path2 = new File(ResourceUtils.getURL("classpath:").getPath());
            if(!path.exists())
            	path2 = new File("");
            System.out.println("path:"+path2.getAbsolutePath());

            //如果上传目录为/static/images/upload/，则可以如下获取：
            File upload = new File(path2.getAbsolutePath(),"static/images/commodity/");
            if(!upload.exists()) upload.mkdirs();
            System.out.println("upload url:"+upload.getAbsolutePath());*/

            String path = request.getServletContext().getRealPath("\\")+"\\static\\images\\commodity\\"+files;
            System.out.println(path);
            OutputStream out = new FileOutputStream(path);    
            out.write(b);
            out.flush();
            out.close();
           
        } 
        catch (Exception e) 
        {
        	return "{\"result\": \"failed\"}";
        }
        return "{\"result\": \"OK\"}";
	}
	public static String upImgs(String strbase64,String path,HttpServletRequest request) {
		//对字节数组字符串进行Base64解码并生成图片
        if (strbase64 == null) //图像数据为空
        	return null;
      
        try 
        {
            //Base64解码
        	String imgs = strbase64.replaceAll("data:image/jpeg;base64,", "");
        	byte[] b = Base64.decodeBase64(imgs);
            for(int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                {//调整异常数据
                    b[i]+=256;
                }
            }
            //生成jpeg图片
            String files = new SimpleDateFormat("yyyyMMddHHmmssSSS")
                    .format(new Date())
                    + (new Random().nextInt(9000) % (9000 - 1000 + 1) + 1000)
                    + ".jpg";
            //存服务器的相对路径
            String file = "\\static\\images\\"+path+"\\"+files;
            String filepath = request.getServletContext().getRealPath("\\")+file;
            System.out.println(path);
            OutputStream out = new FileOutputStream(filepath);    
            out.write(b);
            out.flush();
            out.close();
            return file;
        } 
        catch (Exception e) 
        {
        	return null;
        }
        
	}
	//商品上下架接口
	@RequestMapping("/commodityUpAndDown.do")
	public String commodityUpAndDown(int commodityId,int action) {
		Commodity commodity = new Commodity();
		commodity.setId(commodityId);
		commodity.setIsShelfs(action);
		Integer rows = commodityService.updateById(commodity);
		if(rows == 1)
			return "{\"result\": \"OK\"}";
		else {
			return "{\"result\": \"failed\"}";
		}
	}
	//修改商品信息接口
	@RequestMapping("/updateCommodity.do")
	public String updateCommodity(Commodity commodity) {
		Integer rows = commodityService.updateById(commodity);
		if(rows == 1)
			return "{\"result\": \"OK\"}";
		else {
			return "{\"result\": \"failed\"}";
		}
	}
	
	//单个/批量删除商品信息接口
	@RequestMapping("/deletesCommodity.do")
	public String deletesCommodity(Integer [] commodityId) {
		
		List<Integer> idList = Arrays.asList(commodityId);
		Integer rows = commodityService.deleteBatchIds(idList);
		if(rows >= 1)
			return "{\"result\": \"OK\"}";
		
		return "{\"result\": \"failed\"}";

	}
	//添加分类
	@RequestMapping("/addCommodityType")
	public String addCommodityType(CommodityType commodityType) {
		
		Integer rows = commodityTypeService.insert(commodityType);
		if(rows == 1)
			return "{\"result\": \"OK\"}";
		else {
			return "{\"result\": \"failed\"}";
		}
	}
	//删除分类/批量删除分类
	@RequestMapping("/deleteCommodityType")
	public String deleteCommodityType(Integer[] classificationId) {
		List<Integer> idList = Arrays.asList(classificationId);
		Integer rows = commodityTypeService.deleteBatchIds(idList);
		if(rows >= 1)
			return "{\"result\": \"OK\"}";
		else {
			return "{\"result\": \"failed\"}";
		}
	}
	//根据店铺id获取店铺的所有分类
	@RequestMapping("/getAllCommodityType")
	public List<CommodityType> getAllCommodityType(int storeId) {
		Map<String, Object> map = new  HashMap<String,Object>();
		map.put("storeId", storeId);
		List<CommodityType> commodityTypeList = commodityTypeService.selectByMap(map);
		return commodityTypeList;
	}
}
