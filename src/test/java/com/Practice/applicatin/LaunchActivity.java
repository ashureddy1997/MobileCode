package com.Practice.applicatin;

import static java.time.Duration.ofMillis;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class LaunchActivity {
	public static AppiumDriver<MobileElement> driver=null;

	@Test
	public void Desiredcapabilities()
	{
	   try {
		   DesiredCapabilities capab=new DesiredCapabilities();
		   capab.setCapability("platformName", "Android");
		   capab.setCapability("platformVersion", "9");
		   capab.setCapability("deviceName", "72e932b2");
		    capab.setCapability("noReset", "true");
		   capab.setCapability("appPackage", "com.flipkart.android");
		   capab.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
		 
		   driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capab);
		  Thread.sleep(5000);
		  
		 MobileElement el2 = (MobileElement) driver.findElementById("com.flipkart.android:id/search_widget_textbox");
		  el2.click();
		  Thread.sleep(5000);
		  //search for phone
		  MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Search grocery products in Supermart");
		  el4.sendKeys("Phones");
		  //select mobiles
		  MobileElement el6 = (MobileElement) driver.findElementById("com.flipkart.android:id/txt_subtitle");
		  el6.click();	  
		  //Scroll for Mi
		  for(int i=1;i<=7;i++)
		  {
		  verticalSwipeByPercentages(0.80,0.20,0.40);
		  }
          Thread.sleep(5000);
          driver.findElement(By.xpath("(//*[@class='android.widget.TextView'])[1]")).click();
		  
		  

		}catch (Exception e) 
		{
		e.printStackTrace();
		}
	}

	   public static void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage)
	   {
	          Dimension size = driver.manage().window().getSize();
	          int anchor = (int) (size.width * anchorPercentage);
	          int startPoint = (int) (size.height * startPercentage);
	          int endPoint = (int) (size.height * endPercentage);

	          new TouchAction(driver)
	                  .press(PointOption.point(anchor, startPoint))
	                  .waitAction(WaitOptions.waitOptions(ofMillis(8000)))
	                  .moveTo(PointOption.point(anchor, endPoint))
	                  .release().perform();
	   }


	}

