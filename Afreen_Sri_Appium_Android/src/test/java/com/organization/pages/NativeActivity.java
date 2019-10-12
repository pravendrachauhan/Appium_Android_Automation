package com.organization.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class NativeActivity extends BasePage{
	
	@FindBy(id=appPackageName+":id/na_ib_tile1")
	private WebElement tile1;
	
	@FindBy(id=appPackageName+":id/na_ib_tile2")
	private WebElement tile2;
	
	@FindBy(id=appPackageName+":id/na_tv_score")
	private WebElement numberText;
		
	public NativeActivity(AppiumDriver<WebElement> driver) {
		super(driver);
	}
	
	public void clickTile1() {
		tile1.click();
	}
	
	public void clickTile2() {
		tile2.click();
	}
	
	public String getNumberText() {
		return numberText.getText();
	}
	
	
}
