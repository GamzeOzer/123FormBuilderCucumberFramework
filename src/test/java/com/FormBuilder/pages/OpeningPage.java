package com.FormBuilder.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FormBuilder.utils.BaseClass;

public class OpeningPage extends BaseClass {

	
	@FindBy(xpath="//img[contains(@src,'logos/123FormBuilder')]")
	public WebElement openingPageLogo;
	
	@FindBy(css="a[href*='login']")
	public WebElement loginBtn;
	
	
	public OpeningPage() {
		PageFactory.initElements(driver, this);
	}
}
