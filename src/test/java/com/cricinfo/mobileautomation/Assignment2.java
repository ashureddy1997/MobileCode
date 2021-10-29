package com.cricinfo.mobileautomation;
//Launch app-Tap on signup later-Finish-Check Home Icon-Series-Test icon is displayed or not

import static java.time.Duration.ofMillis;


import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Dimension;
import static java.time.Duration.ofMillis;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Assignment2 {
	
	@Test
    public void desiredCapabalities()
	{
		try
		{
    	DesiredCapabilities capab=new DesiredCapabilities();
		capab.setCapability("platformName" ,"Android");
		capab.setCapability("platformVersion" ,"9");
		capab.setCapability("deviceName" ,"72e932b2");
		capab.setCapability("appPackage" ,"com.july.cricinfo");		
		capab.setCapability("appActivity" ,"com.espn.sportscenter.ui.LaunchActivity");
		capab.setCapability("noReset" ,"false");
		
		//Android Driver installed  //network protocol passing with Capabilities  
		AppiumDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capab);
		
		//inspect->record-->tap for xpath
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@text='ALLOW']")).click();			
		Thread.sleep(6000);
	    driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
		Thread.sleep(3000);	
		driver.findElementByXPath("//*[@text='Sign Up Later']").click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@text='Finish']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='OK']")).click();
		Thread.sleep(8000);
		
	
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Home");
		el3.click();
		if(el3.isDisplayed()) {
			System.out.println("yes");
		}else {
			System.out.println(" ");
		}
		 Thread.sleep(6000);
		
		MobileElement oEle1 = driver.findElement(By.xpath("//*[@text='Home']"));
		if(oEle1.isDisplayed()) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		 Thread.sleep(6000);
		 MobileElement oEle2 = driver.findElement(By.xpath("//*[@text='Series']"));
			if(oEle2.isDisplayed()) {
				System.out.println("Series Icon is present");
			}else {
				System.out.println("Series Icon is not found ");
			}
			 Thread.sleep(6000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
   }
}
