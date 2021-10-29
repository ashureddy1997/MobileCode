package apidemos;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LaunchActivity {
	public static AppiumDriver<MobileElement> driver=null;

	@Test
	public static void Desiredcapabilities()
	{
		try {
			DesiredCapabilities capab=new DesiredCapabilities();
			capab.setCapability("appPackage", "com.touchboarder.android.api.demos");
			capab.setCapability("appActivity", "com.touchboarder.androidapidemos.MainActivity");			  
			capab.setCapability("platformName", "Android");
			capab.setCapability("platformVersion", "9");
			capab.setCapability("deviceName", "72e932b2");
			capab.setCapability("noReset", "true");	
			driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capab);	 
		}catch (Exception e) 
		{
			e.printStackTrace();
		}	  			
	}
}
