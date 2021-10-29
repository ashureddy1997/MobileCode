package apidemos;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ListDiologue {
	@Test
	public void tc_InvokeApp()
	{
	
		try {
			DesiredCapabilities capabilities=new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "72e932b2");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.touchboarder.android.api.demos");
			capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.touchboarder.androidapidemos.MainActivity");
			capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
			capabilities.setCapability(MobileCapabilityType.FULL_RESET, "false");
			//driver=new AndroidDriver<AndriodE>	
			AndroidDriver<AndroidElement>driver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//*[@text='API Demos']")).click();
			driver.findElement(By.xpath("//*[@text='App']")).click();
			driver.findElement(By.xpath("//*[@text='Alert Dialogs']")).click();
			driver.findElement(By.xpath("//*[@text='LIST DIALOG']")).click();
			//driver.findElementsByClassName("android.widget.ListView");
			//System.out.println(item);
			List<AndroidElement>list=driver.findElementsByXPath("//android.widget.TextView[starts-with(@text,'command')]");
			for(AndroidElement item:list)
			System.out.println(item.getText());
			

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


}
