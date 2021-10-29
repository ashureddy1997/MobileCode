package apidemos;
//API Demos-Views-Auto complete-1 ScreenTop-Enter United-ENTER-DEL-DOWN 3 TIMES-ENTER

import java.net.URL;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DropdownHandle1 {
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
			driver.findElementByXPath("//*[@text='Views']").click();
			driver.findElementByXPath("//*[@text='Auto Complete']").click();
			driver.findElementByXPath("//*[@text='1. Screen Top']").click();
			driver.findElementById("com.touchboarder.android.api.demos:id/edit").sendKeys("United");
			driver.pressKey(new KeyEvent(AndroidKey.ENTER))	;
			driver.pressKey(new KeyEvent(AndroidKey.DEL))	;
			driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
			driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
			driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
			driver.pressKey(new KeyEvent(AndroidKey.ENTER));
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
