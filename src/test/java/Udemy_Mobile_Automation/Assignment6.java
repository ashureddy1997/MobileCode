package Udemy_Mobile_Automation;
import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Assignment6 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		File f=new File("src");
		File filePath=new File(f, "ApiDemos-debug.apk");
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vishuEmulator");
		cap.setCapability(MobileCapabilityType.APP, filePath.getAbsolutePath());
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TouchAction touch=new TouchAction(driver);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		Thread.sleep(1000);
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		//touch.longPress(LongPressOptions.longPressOptions().withElement("nnnn"))
		//touch.longPress(driver.findElementsByClassName("android.view.View").get(0)).moveTo(driver.findElementsByClassName("android.view.View").get(1)).release().perform();
		
	}

}


