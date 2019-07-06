package com.FormBuilder.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FormBuilder.utils.BaseClass;

public class LoginPage extends BaseClass{
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//div[@class='form-group keep']/div/label/label")
	public WebElement checkBox;
	
	@FindBy(id="submit-form-button")
	public WebElement submit;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
}
