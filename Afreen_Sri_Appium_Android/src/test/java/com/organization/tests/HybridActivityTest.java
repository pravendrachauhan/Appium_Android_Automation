package com.organization.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.organization.pages.HomePage;
import com.organization.pages.HybridActivity;

public class HybridActivityTest extends BaseTest{
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method in HybridActivityTest");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method in HybridActivityTest");
	}
	
	@Test
	public void testHybridActivity1() throws MalformedURLException {
		HomePage home=new HomePage(driver);
		home.clickOnHybridActivity();
		String headerText = home.getHeaderText();
		AssertJUnit.assertEquals(headerText, "Hybrid Activity");
	}
	
	@Test
	public void testHybridActivity2() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.context("WEBVIEW_"+appPackageName);
		HybridActivity nativeActivity=new HybridActivity(driver);
		nativeActivity.inputSearchText("pravendra");
		nativeActivity.clickSearchButton();
		//Assert.assertEquals(text, "9");
	}
	
	
	
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	
	

}
