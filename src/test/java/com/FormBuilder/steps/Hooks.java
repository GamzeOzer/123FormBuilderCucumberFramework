package com.FormBuilder.steps;

import com.FormBuilder.utils.BaseClass;
import com.FormBuilder.utils.CommonMethods;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	@Before
	public void start(Scenario scenario) {
		System.out.println("starting the test="+scenario.getName());
		setUp();
	}
	
	@After
	public void end(Scenario scenario) {
		if(!scenario.isFailed()) {
			byte[] shot = CommonMethods.takeScreenshot();
			scenario.embed(shot, "image/png");
		}
		System.out.println("ending the test="+scenario.getName());
		tearDown();
	}

}
