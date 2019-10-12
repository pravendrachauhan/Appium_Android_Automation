package Afreen_Sri_Appium_Android.Afreen_Sri_Appium_Android;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AndroidTest {

	static String headerLocator="android:id/action_bar_title";
	static String appPackageName="com.testdroid.sample.android";

	public static void main(String[] args) throws IOException, InterruptedException {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "AndroidEmulator");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("app", "/Users/pravendrachauhan/eclipse-workspace/Anuj_POM_Appium_Android/Testdroid.apk");
		capabilities.setCapability("appActivity", appPackageName+".MM_MainMenu");
		capabilities.setCapability("appPackage", appPackageName);
		capabilities.setCapability("noReset", true);

		AppiumDriver<WebElement> driver =new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"),capabilities);
		WebElement nativeActivityButton = driver.findElement(By.id(appPackageName+":id/mm_b_native"));
		nativeActivityButton.click();
		
		//adb shell am start -n com.testdroid.sample.android/.NA_Native
//		Runtime r = Runtime.getRuntime();
//		String[] commands = {"bash", "-c", "adb shell am start -n com.testdroid.sample.android/.NA_Native"};
//		Process p = r.exec(commands);
//		p.waitFor();
		//Runtime.getRuntime().exec("adb shell am start -n com.testdroid.sample.android/.NA_Native");
		
		WebElement nativeActivityHeader = driver.findElement(By.id(headerLocator));
		String text = nativeActivityHeader.getText();
		
		if(text.equals("Native Activity")) {
			System.out.println("Native Activity screen found");
		}
		else {
			System.out.println("Native Activity screen not found");
		}
		driver.navigate().back();
		WebElement hybridActivityButton = driver.findElement(By.id(appPackageName+":id/mm_b_hybrid"));
		hybridActivityButton.click();
		
		WebElement hybridActivityHeader = driver.findElement(By.id(headerLocator));
		String text1 = hybridActivityHeader.getText();
		
		if(text1.equals("Hybrid Activity")) {
			System.out.println("Hybrid Activity screen found");
		}
		else {
			System.out.println("Hybrid Activity screen not found");
		}
		
		driver.context("WEBVIEW_"+appPackageName);
		driver.findElement(By.name("q")).sendKeys("pravendra");
		driver.findElement(By.tagName("button")).click();
		
		driver.quit();
	
	}

}
