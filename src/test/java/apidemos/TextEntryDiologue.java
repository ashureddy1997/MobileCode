package apidemos;
//API Demos-App-Alert Dialogs-TEXT ENTRY DIALOG-Enter username and Password-Ok

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TextEntryDiologue {
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
			driver.findElement(By.xpath("//*[@text='App']")).click();
			driver.findElement(By.xpath("//*[@text='Alert Dialogs']")).click();
			driver.findElement(By.xpath("//*[@text='TEXT ENTRY DIALOG']")).click();
			driver.findElementById("com.touchboarder.android.api.demos:id/username_edit").sendKeys("kumar");
			driver.findElementById("com.touchboarder.android.api.demos:id/password_edit").sendKeys("*123");
			driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
			} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


}
