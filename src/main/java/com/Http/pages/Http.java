package com.Http.pages;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.hibernate.validator.internal.util.privilegedactions.GetMethod;
import org.junit.runner.Request;
import org.openqa.jetty.html.Form;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Http {
	
////	public static void main(String[] args) throws Exception {
////	        	CloseableHttpClient httpclient = HttpClients.createDefault();
////	        	
////	            try {
////	            HttpGet httpGet = new HttpGet("http://google-gruyere.appspot.com/305269248717/newsnippet.gtl");
////	            CloseableHttpResponse response1 = httpclient.execute(httpGet);
////	            try {
////	                System.out.println(response1.getStatusLine());
////	                
////	            } finally {
////	                response1.close();
////	            }
////
////	            HttpPost httpPost = new HttpPost("http://google-gruyere.appspot.com/305269248717/newsnippet.gtl");
////	            List <NameValuePair> nvps = new ArrayList <NameValuePair>();
////	            nvps.add(new BasicNameValuePair("newsnippet2", "abcd"));
////	            nvps.add(new BasicNameValuePair("password", "secret"));
////	            httpPost.setEntity(new UrlEncodedFormEntity(nvps));
////	            CloseableHttpResponse response2 = httpclient.execute(httpPost);
////	            http://google-gruyere.appspot.com/305269248717/newsnippet2?snippet=abcd
////	            	http://google-gruyere.appspot.com/305269248717/newsnippet2?snippet=abcdef HTTP/1.1
////
////	            try {
////	                System.out.println(response2.getStatusLine());
////	                HttpEntity entity2 = response2.getEntity();
////	                EntityUtils.consume(entity2);
////	            } finally {
////	                response2.close();
////	            }
////	        } finally {
////	            httpclient.close();
////	        }
////	    }
//
////		public static void main(String[] args) {
////		String url = "http://google-gruyere.appspot.com/305269248717/newsnippet.gtl";
////	    // Create an instance of HttpClient.
////		 HttpClient client = HttpClientBuilder.create().build();
//
//	    // Create a method instance.
//		 //HttpGet request = new HttpGet(url);
//	    
////	    // Provide custom retry handler is necessary
////	    method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, 
////	    		new DefaultHttpMethodRetryHandler(3, false));
//	    
////	    Request.Get("http://google-gruyere.appspot.com/305269248717/newsnippet.gtl").execute().returnContent();
////	    Request.Post("http://targethost/login").bodyForm(Form.form().add("username",  "vip").add("password",  "secret").build())
////	    .execute().returnContent();
////		
	
	
	@FindBy(css="a [href['/305269248717/']")
	private WebElementFacade signInButton;
	
	@FindBy(name="uid")
	private WebElementFacade user;
	
	@FindBy(name="pw")
	private WebElementFacade pass;
	
	@FindBy(css="td input[type='text']")
	private WebElementFacade login;
	
	@FindBy(css="div textarea[name='snippet']")
	private WebElementFacade addnewSnippet;
	
	@FindBy(css="a[href['/305269248717/newsnippet.gtl']")
	private WebElementFacade typesnippet;
	
	@FindBy(css="td input[type='submit']")
	private WebElementFacade submit;
	
	public void signIn() {
		signInButton.click();
	}
	
	public void user() {
		user.click();
	}
	
	public void typeUser(String username) {
		user.type(username);
		}
	
	public void pass() {
		pass.click();
	}
	
	public void typePass(String password) {
		pass.type(password);
	}
	
	public void login() {
		login.click();
	}
	
	public void newsnippet() {
		addnewSnippet.click();
	}
	
	public void typeSnippet(String snippet) {
		typesnippet.type(snippet);
	}
	
	public void submitSnippet() {
		submit.click();
	}
	
	
	
	
	
	
}

