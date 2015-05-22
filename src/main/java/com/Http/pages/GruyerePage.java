package com.Http.pages;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebElement;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

 
public class GruyerePage extends PageObject {
	
	private static final String USER_AGENT = "Chrome/42.0.2311.152 m";
	
	public static void main(String[] args) throws Exception{
		   sendGet();
		  }
		   public static void sendGet() throws Exception {
		   
		   String url = "http://google-gruyere.appspot.com/305269248717/newsnippet2?snippet=abcd";
		   
		   //newsnippet2?snippet=abcd 
		  
		   URL obj = new URL(url);
		   HttpURLConnection con = (HttpURLConnection)obj.openConnection();
		   
		  
		   // optional default is GET
		   con.setRequestMethod("GET");
		  
		   //add request header
		   
		   con.setRequestProperty("User-Agent", USER_AGENT);
		  
		   int responseCode = con.getResponseCode();
		   System.out.println("\nSending 'GET' request to URL : " + url);
		   System.out.println("Response Code : " + responseCode);
		  
		   BufferedReader in = new BufferedReader(
		           new InputStreamReader(con.getInputStream()));
		   String inputLine;
		   StringBuffer response = new StringBuffer();
		  
		   while ((inputLine = in.readLine()) != null) {
		    response.append(inputLine);
		   }
		   in.close();
		  
		   //print result
		   System.out.println(response.toString());
		  
		  }
	 }
 
