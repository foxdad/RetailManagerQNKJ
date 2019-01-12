package com.boyu.kiss.controller;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.codec.Decoder;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.binary.Base64;
import org.apache.tomcat.util.bcel.classfile.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boyu.kiss.entity.Commodity;
import com.boyu.kiss.service.impl.CommodityServiceImpl;

@RestController
public class CommodityController {

	@Autowired
	private CommodityServiceImpl commodityService;
	//添加商品接口
	/*@RequestMapping("/addCommodity.do")
	public String addCommodity(Commodity commodity,HttpServletRequest request) {
		//对字节数组字符串进行Base64解码并生成图片
        if (commodity.getImage() == null) //图像数据为空
        	return "{\"result\": \"failed\"}";
      
        try 
        {
            //Base64解码
        	byte[] b = Base64.decodeBase64(commodity.getImage());
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
            String path = request.getServletPath()+"/static/images/commodity"+files;
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
		Integer rows = commodityService.insert(commodity);
		if(rows == 1)
			return "{\"result\": \"OK\"}";
		else {
			return "{\"result\": \"failed\"}";
		}
	}*/
	/*@RequestMapping("/test")
	public String addCommodity(String str,HttpServletRequest request) {
		//对字节数组字符串进行Base64解码并生成图片
        if (str == null) //图像数据为空
        	return "{\"result\": \"failed\"}";
      
        try 
        {
            //Base64解码
        	byte[] b = Base64.decodeBase64(str);
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
            String path = request.getServletPath()+"/static/images/commodity"+files;
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
		Integer rows = commodityService.insert(commodity);
		if(rows == 1)
			return "{\"result\": \"OK\"}";
		else {
			return "{\"result\": \"failed\"}";
		}
	}*/
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
}
