package com.boyu.kiss.utils;

import java.io.FileOutputStream;
import java.io.OutputStream;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.codec.binary.Base64;

public class ImgsUtil{

	public static String upImgs(String strbase64,String path,HttpServletRequest request) {
		//对字节数组字符串进行Base64解码并生成图片
        if (strbase64 == null) //图像数据为空
        	return null;
      
        try 
        {
            //Base64解码
        	String imgs = strbase64.substring(strbase64.indexOf(",") );
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
            String f = "/static/images/"+path+"/"+files;
           
            String file =ImgsUtil.path(request)+f;
            //String filepath = request.getServletContext().getRealPath("\\")+file;
            String filepath = "H:/aaa/RetailManager/src/main/webapp/"+f;
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
	
	

	public static String path(HttpServletRequest request) {
		String scheme = request.getScheme();
		String ip = request.getServerName();
		int port = request.getServerPort();
		String webapp = request.getContextPath();
		return scheme+"://"+ip+":"+port+webapp;
	}
}
