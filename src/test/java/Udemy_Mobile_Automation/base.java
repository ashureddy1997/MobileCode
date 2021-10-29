package Udemy_Mobile_Automation;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
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
		   
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		   //Find element by Absolute xpath		  
		   driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]").click();		 
		   //Find element by Relative xpath
		   driver.findElement(By.xpath("//*[@text='Views']")).click();
		   //Find element by Id/Resource Id
		   driver.findElementById("android:id/text1").click();
		   //Find element by Class name
		   driver.findElementsByClassName("android.widget.TextView").get(2).click();
		   //Find xpath by Recorder in Appium
		   MobileElement el5 = (MobileElement) driver.findElementById("android:id/text1");
		   el5.click();
		}catch (Exception e) 
		{
		e.printStackTrace();
		}	  			
	}
}
