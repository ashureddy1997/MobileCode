package com.cricinfo.mobileautomation;

	import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;  
import io.appium.java_client.android.AndroidDriver;

public class Mobileautomation2
{
	DesiredCapabilities dc=null;
	AppiumDriver<MobileElement> driver=null;

//	@BeforeTest
	public void desiredCaps()
	{
		try {
		dc=new DesiredCapabilities();
		dc.setCapability("platformName" ,"Android");
		dc.setCapability("platformVersion" ,"10");
		dc.setCapability("deviceName" ,"b9e82310");
		dc.setCapability("appPackage" ,"com.july.cricinfo");
		dc.setCapability("appActivity" ,"com.espn.sportscenter.ui.LaunchActivity");
		dc.setCapability("noReset" ,"false");
			
		} catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void automateMobile()
	{
		try
		{
		driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		
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
		}catch(Exception e )
		{
			e.getMessage();
		}
		
	}
	
	@AfterTest
	public void killTHeDriver()
	{
		driver=null;
		dc=null; 
	}
}
