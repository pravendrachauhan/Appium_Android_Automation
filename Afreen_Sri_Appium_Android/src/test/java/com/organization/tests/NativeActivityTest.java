package com.organization.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.organization.pages.HomePage;
import com.organization.pages.NativeActivity;


public class NativeActivityTest extends BaseTest{

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method in NativeActivityTest");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method in NativeActivityTest");
	}
	
	@Test
	public void testNativeActivity1() throws MalformedURLException {
		HomePage home=new HomePage(driver);
		home.clickOnNativeActivity();
		String headerText = home.getHeaderText();
		AssertJUnit.assertEquals(headerText, "Native Activity");
	}
	
	@Test(dependsOnMethods= {"testNativeActivity1"})
	public void testNativeActivity2() {
		NativeActivity nativeActivity=new NativeActivity(driver);
		nativeActivity.clickTile1();
		nativeActivity.clickTile2();
		String text = nativeActivity.getNumberText();
		AssertJUnit.assertEquals(text, "9");
	}
	
	
	
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	
	

}
