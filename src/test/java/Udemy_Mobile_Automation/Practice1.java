package Udemy_Mobile_Automation;
import static java.time.Duration.ofMillis;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Practice1 extends base {
	
	@Test
	public static void test1() throws InterruptedException
	{
		
		   MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]");
		   el1.click();
		   driver.findElement(By.xpath("//*[@text='Preference']")).click();		 
		   driver.findElement(By.xpath("//*[@text='3. Preference dependencies']")).click();
		   driver.findElement(By.xpath("//*[@text='WiFi settings']")).click();
		   driver.findElement(By.className("android.widget.EditText")).sendKeys("Hello");
		   driver.findElementsByClassName("android.widget.Button").get(1).click();	 
	}}




