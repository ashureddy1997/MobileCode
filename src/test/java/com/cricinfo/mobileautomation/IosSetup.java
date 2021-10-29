package com.cricinfo.mobileautomation;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class IosSetup {

  AppiumDriver<MobileElement> driver=null;
@BeforeTest
public void desireCapabalities()  {
	try
	{
	DesiredCapabilities capabalities= new DesiredCapabilities();
	File file = new File("/Users/");
	capabalities.setCapability("platformName", "IOS");
	capabalities.setCapability("platformVersion", "12.1");
	capabalities.setCapability("automationName", "XCUITest");
	capabalities.setCapability("deviceName", "iPhone 8 plus");
	capabalities.setCapability("bundleId", "com.facebook.wda.integrationApp");
	capabalities.setCapability("app", file.getAbsolutePath());
	capabalities.setCapability("fullReset", true);
	driver=new IOSDriver<MobileElement>(new URL("http://0.0.0.0.4723"),capabalities);
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
