package apidemos;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ChromeTest {
    @Test
	public static void InvokeApp()
		{

			try {

		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "72e932b2");
		caps.setCapability("udid", "72e932b2"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("noReset", true);
		caps.setCapability("app-package", "com.google.android.apps.chrome");  
	    caps.setCapability("app-activity", "com.google.android.apps.chrome.Main");  
		
		
		//Set ChromeDriver location
		System.setProperty("webdriver.chrome.driver","E:\\Mobile_Automation\\com.cricinfo.automation\\Library\\Drivers\\chromedriver.exe");
		
		//Instantiate Appium Driver
		AppiumDriver<MobileElement> driver = null;

			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			
				
		//Open URL in Chrome Browser
		driver.get("http://www.google.com");
			}catch(Exception e) 
			{
				e.printStackTrace();
			}

		}}