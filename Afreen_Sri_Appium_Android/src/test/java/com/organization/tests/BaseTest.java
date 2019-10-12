package com.organization.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	AppiumDriver<WebElement> driver;
	String appPackageName="com.testdroid.sample.android";

//	<suite name="Suite">
//	  <test thread-count="5" name="Test">
//	    <classes>
//	      <class name="com.organization.tests.HybridActivityTest"/>
//	      <class name="com.organization.tests.NativeActivityTest"/>
//	    </classes>
//	  </test> <!-- Test -->
//	</suite> <!-- Suite -->
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");

	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");

	}
	
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "AndroidEmulator");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("app", "/Users/pravendrachauhan/eclipse-workspace/Anuj_POM_Appium_Android/Testdroid.apk");
		capabilities.setCapability("appActivity", appPackageName+".MM_MainMenu");
		capabilities.setCapability("appPackage", appPackageName);
		capabilities.setCapability("noReset", true);

		driver =new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"),capabilities);
	
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
