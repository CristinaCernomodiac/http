package com.Http.steps;

import java.net.HttpURLConnection;

import com.Http.pages.GruyerePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HttpSteps extends ScenarioSteps {
	
	HttpURLConnection connection = null;  
	GruyerePage gruyerepage;
	
	@Step
	public void checkFirstget() throws Exception {
		gruyerepage.sendGet();
	}
}
