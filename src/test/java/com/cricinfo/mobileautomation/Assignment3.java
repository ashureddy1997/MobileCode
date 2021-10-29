package com.cricinfo.mobileautomation;
/*Launch app-Tap on signup later->Finish->Navigate to Home page->Tap on Search icon->
Enter your favourite team->Check search item is coming or not*/

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Assignment3 {
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
		driver.findElement(By.xpath("//*[@text='ALLOW'][0]")).click();
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@text='Sign Up Later']").click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@text='Finish']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='OK']")).click();
		Thread.sleep(8000);
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Search");
		el2.click();
		Thread.sleep(6000);
		MobileElement el4 = (MobileElement) driver.findElementById("com.july.cricinfo:id/search_src_text");
		el4.sendKeys("India");
		Thread.sleep(10000);
		driver.findElementById("com.july.cricinfo:id/search_src_text").click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
   }
}


