package com.cricinfo.mobileautomation;
import java.io.File;
//import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Mobileautomation3 {
	
	public AppiumDriver<MobileElement> driver;
	
		@Test
	    public void desiredCapabalities()
		{
			try
			{
				
	    	DesiredCapabilities capab=new DesiredCapabilities();
	    	
		    //Important
	    	File fget=new File("‪E:\\Mobile_Automation\\com.cricinfo.automation\\src\\test\\java\\Udemy_Mobile_Automation\\original.apk");//absolute path
			capab.setCapability("platformName" ,"Android");
			capab.setCapability("platformVersion" ,"9");
			capab.setCapability("devicename" ,"72e932b2");
			
			//capab.setCapability("appPackage" ,"com.july.cricinfo");
		   // capab.setCapability("appActivity" ,"com.espn.sportscenter.ui.LaunchActivity");
		    
		    
		    //Important
		    System.out.println(fget);
		     capab.setCapability("app",fget);
		    
			capab.setCapability("noReset" ,"false");
			//Android Driver installed  //network protocol passing with Capabilities  
			 driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capab);
			
			/*inspect->record-->tap for xpath
			
	        Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@text='ALLOW']")).click();			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@text='Sign Up Later']").click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@text='India']")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@text='Finish']")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("android:id/button1")).click();
			Thread.sleep(4000);*/
			
			
			
			}
			
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	  


