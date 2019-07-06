package com.FormBuilder.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/Login.feature",
		glue="com/FormBuilder/steps",
		//dryRun=true,
		monochrome=true,
		tags= {""},
		plugin= {"pretty", "html:target/cucumber-default-reports"}
		
		)
public class TestRunner {

}
