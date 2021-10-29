package apidemos;

import java.net.URL;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;


import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class LongPress {
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
			AndroidDriver<AndroidElement>driver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//*[@text='API Demos']")).click();
			//AndroidElement views=driver.findElementByXPath("//*[@text='Animation']");
			WebElement views=driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")"));
			TouchAction touch=new TouchAction(driver);
			touch.tap(tapOptions().withElement(element(views))).perform();
			driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();;
			WebElement peopleNames=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
			touch.longPress(longPressOptions().withElement(element(peopleNames))).release().perform();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}

	}

}


