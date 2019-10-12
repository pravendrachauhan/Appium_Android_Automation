package com.organization.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class BasePage {
	final String appPackageName="com.testdroid.sample.android";
	
	@FindBy(id="android:id/action_bar_title")
	private WebElement headerLocator;
	
	public BasePage(AppiumDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getHeaderText() {
		return headerLocator.getText();
	}
	

}
