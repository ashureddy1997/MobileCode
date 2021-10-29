package com.cricinfo.mobileautomation;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Mobileautomation

{
	@Test
    public void desiredCapabalities()
	{
		try
		{
    	DesiredCapabilities capab=new DesiredCapabilities();
		capab.setCapability("platformName" ,"Android");
		capab.setCapability("platformVersion" ,"10");
		capab.setCapability("deviceName" ,"b9e82310");
		capab.setCapability("appPackage" ,"com.july.cricinfo");		
		capab.setCapability("appActivity" ,"com.espn.sportscenter.ui.LaunchActivity");
		capab.setCapability("noReset" ,"false");
		//Android Driver installed  //network protocol passing with Capabilities  
		AppiumDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capab);
		
		//inspect->record-->tap for xpath
		Thread.sleep(3000);
		driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
	
		Thread.sleep(3000);
		driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@text='Sign Up Later']").click();
		Thread.sleep(2000);

		 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='India']")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Finish']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("android:id/button1")).click();
		
		
		
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
  