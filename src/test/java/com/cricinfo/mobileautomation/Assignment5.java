package com.cricinfo.mobileautomation;
/*Launch app->Tap on Sign up later->Select your Favourite taem->ICC world cup->india
 * ->Finish->Navigate to Home page->Tap on series icon
 */
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Assignment5 {
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
		Thread.sleep(6000);
		driver.findElementByXPath("//*[@text='Sign Up Later']").click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@text='Finish']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='OK']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@text='ICC World Cup']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@text='India']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@text='Finish']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@text='Series']")).click();
		Thread.sleep(8000);
       
		
				}catch(Exception e)
		{
			e.printStackTrace();
		}
   }
}


