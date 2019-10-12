package com.organization.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class HybridActivity extends BasePage{

	@FindBy(name="q")
	private WebElement searchInput;
	
	@FindBy(tagName="button")
	private WebElement searchButton;
	
	public HybridActivity(AppiumDriver<WebElement> driver) {
		super(driver);
	}
	
	public void inputSearchText(String text) {
		searchInput.sendKeys(text);
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
	
}
