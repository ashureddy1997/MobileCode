package apidemos;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;


public class Practice {
	public void test()
	{
		AppiumDriver<MobileElement>driver=null;
		try{

			DesiredCapabilities capab=new DesiredCapabilities();
			capab.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, value);
			capab.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, value);
			capab.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, value);
			capab.setCapability(MobileCapabilityType.PLATFORM_VERSION, value);
			capab.setCapability(MobileCapabilityType.NO_RESET, value);
			capab.setCapability(MobileCapabilityType.FULL_RESET, value);
			capab.setCapability(MobileCapabilityType.DEVICE_NAME, value);
			driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capab);	 		
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			AndroidElement views=driver.findElementByXPath("//*[@text='Animation']");
			
			 TouchAction touch=new TouchAction(driver);
			 touch.tap(tapOptions().withElement(element(bbbb))).perform();
			 touch.longPress(longPressOptions().withElement(element(bbbb))).perform();
			 touch.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
			 touch.longPress(ElementOption.element(dragFromcircle)).moveTo(ElementOption.element(dragTocircle)).release().perform();
			 driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		    		
			 
			

		}catch (Exception e) 
		{
			e.printStackTrace();
		}

	}}
