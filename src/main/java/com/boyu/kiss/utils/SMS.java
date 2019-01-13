package com.boyu.kiss.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class SMS {

	//把接口地址和参数赋值，之后调用SMS3方法，参数photo是手机号，code是之前生成的验证码。
	 public static void batchsendsm(String phone,String code)
		{
			try{
				String  userid = URLEncoder.encode("15773411484","UTF-8"); //188			
	 
				String url = "http://apis.renxinl.com:8080/smsgate/varsend.do?";
				String para = "user="+userid+"&pwd=db23edd89c2af58b933985d4485adfd6&params="+phone+","+code+"&mid=4";
				
			  String str="";
			  str=SMS3(para,url);
			  System.out.println(str);
			 }catch (Exception e) {
				 e.printStackTrace();
			}
		}
		
		
	//postData是上面拼接的参数值，postURL 是接口的地址。我觉得这个方法是能访问到第三方接口的方法。
		public static String SMS3(String postData,String postUrl){
			try{
				URL url = new URL(postUrl);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("POST");
	 
	            conn.setRequestProperty("accept", "*/*");
	            conn.setRequestProperty("connection", "Keep-Alive");
	            conn.setRequestProperty("user-agent",
	                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
	            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
				
				conn.setUseCaches(false);
				conn.setDoOutput(true);
				conn.setDoInput(true);
				OutputStreamWriter out= new OutputStreamWriter(conn.getOutputStream(),"UTF-8");
				out.write(postData);
				out.flush();
				out.close();
				if(conn.getResponseCode()!=HttpURLConnection.HTTP_OK){
					System.out.println("connect failed!");
					return "";
				}
				String line,result = "";
				BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
				while((line= in.readLine()) != null){
					result += line+"\n";
				}
				in.close();
				return result;
			}catch(IOException e){
				e.printStackTrace(System.out);
			}
			return "";
		} 
}
