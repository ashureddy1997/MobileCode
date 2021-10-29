package apidemos;

import java.net.URL;
import java.util.List;
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

public class KeyEvents {
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
			driver.findElementByXPath("//*[@text='App']").click();
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			driver.pressKey(new KeyEvent(AndroidKey.HOME));
			//driver.pressKey(new KeyEvent(AndroidKey.ENTER));
			//driver.pressKey(new KeyEvent(AndroidKey.CAPS_LOCK));
			//driver.pressKey(new KeyEvent(AndroidKey.DPAD_UP));
			//driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
			//driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
			//driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
			//driver.pressKey(new KeyEvent(AndroidKey.SPACE));
			//driver.pressKey(new KeyEvent(AndroidKey.TAB));
			//driver.pressKey(new KeyEvent(AndroidKey.KEYCODE_ZOOM_IN));
			//driver.pressKey(new KeyEvent(AndroidKey.KEYCODE_ZOOM_OUT));
			
			
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
