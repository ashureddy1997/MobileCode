package com.cricinfo.mobileautomation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;



public class Assignment1{
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		
		DesiredCapabilities capabilities = new DesiredCapabilities();  

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "72e932b2");
		 capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		 //capabilities.setCapability("appPackage", "com.android.chrome");
		  capabilities.setCapability("appActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");
		   
		 
	//	 capabilities.setCapability(MobileCapabilityType.APP, filePath.getAbsolutePath());

		
		// capabilities.setCapability("autoWebview", "true");
		// capabilities.setCapability("app", "E://WineApkFile//app-staging-release_6_.apk");
		//Set ChromeDriver location
			System.setProperty("webdriver.chrome.driver","E:\\Mobile_Automation\\com.cricinfo.automation\\Library\\Drivers\\chromedriver.exe");
			
		 AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(3000);
		 driver.get("https://qwww.wine.com");
		 Thread.sleep(3000);
		
	}

}
