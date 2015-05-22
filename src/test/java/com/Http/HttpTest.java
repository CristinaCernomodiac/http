package com.Http;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.Http.steps.HttpSteps;


public class HttpTest {

	@Managed(uniqueSession = true)
    public WebDriver webdriver;
	
	@ManagedPages(defaultUrl = "http://www.facebook.com")
    public Pages pages;
	
	@Steps
    public HttpSteps httpsteps;
	
	@Test
	public void checkrequest() throws Exception {
		httpsteps.checkFirstget();
	}
	
	
	
	
}
