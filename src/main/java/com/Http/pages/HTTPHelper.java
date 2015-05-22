package com.Http.pages;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class HTTPHelper {

 private final static String USER_AGENT = "Mozilla/5.0";

 public static void main(String[] args) throws Exception {
  
  HttpClient client = new DefaultHttpClient();
  sendGet(client, "http://google-gruyere.appspot.com/305269248717/login?uid=cristinacc&pw=cris");
  Thread.sleep(2000);

  for (int i=0; i<10; i++){
   sendGet(client, "http://google-gruyere.appspot.com/117885354528/newsnippet2?snippet=autosnip" + Integer.toString(i));
   Thread.sleep(2000);
  } 
}
 
 public static void sendGet(HttpClient client, String url) throws ClientProtocolException, IOException{
  
  HttpGet request = new HttpGet(url);
  System.out.println("Sending get to: " + url);

  // add request header
  request.addHeader("Connection", USER_AGENT);
  HttpResponse response = client.execute(request);
  System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

  BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
  StringBuffer result = new StringBuffer();
  String line = "";
  while ((line = rd.readLine()) != null) {
   result.append(line);
  }
  System.out.println(result);

 }



}