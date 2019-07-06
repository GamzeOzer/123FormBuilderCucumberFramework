package com.FormBuilder.steps;

import org.junit.Assert;

import com.FormBuilder.pages.HomePage;
import com.FormBuilder.pages.LoginPage;
import com.FormBuilder.pages.OpeningPage;
import com.FormBuilder.utils.CommonMethods;
import com.FormBuilder.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps extends CommonMethods{
	
	OpeningPage oPage;
	HomePage home;
	LoginPage login;
	@Given("I am on FormBuilder page")
	public void i_am_on_FormBuilder_page() {
	    
	}

	@Given("I see the Formbuilder logo")
	public void i_see_the_Formbuilder_logo() {
		oPage=new OpeningPage();
	    Assert.assertTrue(oPage.openingPageLogo.isDisplayed());
	}

	@When("I click login button")
	public void i_click_login_button() {
	    click(oPage.loginBtn);
	}

	@When("I provide valid mail and password")
	public void i_provide_valid_mail_and_password() {
		login=new LoginPage();
	   sendText(login.username, ConfigsReader.getProperty("username"));
	   sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@When("I uncheck Keep me logged in")
	public void i_uncheck_Keep_me_logged_in() {
		if(login.checkBox.isSelected()) {
			   click(login.checkBox);
		   }
	}
	@When("I click loginsecond button")
	public void i_click_loginsecond_button() {
	   click(login.submit);
	}


	@Then("I see dashboard")
	public void i_see_dashboard() {
		home=new HomePage();
	    waitForElementBeVisible(home.dashboard, 20);
	    Assert.assertTrue(home.dashboard.isDisplayed());
	}



}
