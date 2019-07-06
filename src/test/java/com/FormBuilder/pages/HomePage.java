package com.FormBuilder.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FormBuilder.utils.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="//span[text()='Dashboard']")
	public WebElement dashboard;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
}
