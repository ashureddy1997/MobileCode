package apidemos;
//API Demos-App-Alert Diologue-Ok Cancel Dilog With A Message

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AlertsTest {
	@Test
	public void tc_InvokeApp()
	{
		AppiumDriver<MobileElement> driver=null;
		try {
			DesiredCapabilities capabilities=new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "72e932b2");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.touchboarder.android.api.demos");
			capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.touchboarder.androidapidemos.MainActivity");
			capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
			capabilities.setCapability(MobileCapabilityType.FULL_RESET, "false");
			driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);	 		
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//*[@text='API Demos']")).click();
			driver.findElement(By.xpath("//*[@text='App']")).click();
			driver.findElement(By.xpath("//*[@text='Alert Dialogs']")).click();
			driver.findElement(By.xpath("//*[@text='OK CANCEL DIALOG WITH A MESSAGE']")).click();
			String ActualAlertMessage=driver.findElementById("android:id/alertTitle").getText();
			System.out.println(ActualAlertMessage);
			driver.findElementById("android:id/button1").click();		

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


}
