package com.organization.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class HomePage extends BasePage{
	
	@FindBy(id=appPackageName+":id/mm_b_native")
	private WebElement nativeActivityButton;
	
	@FindBy(id=appPackageName+":id/mm_b_hybrid")
	private WebElement hybridActivityButton;
	
	public HomePage(AppiumDriver<WebElement> driver) {
		super(driver);
	}
	
	public void clickOnNativeActivity() {
		nativeActivityButton.click();
	}
	
	public void clickOnHybridActivity() {
		hybridActivityButton.click();
	}

}
