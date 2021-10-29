package Udemy_Mobile_Automation;
import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
@Test

public class LaunchApp {
	public static void main( String args[]) throws MalformedURLException 
	{			
     File fget=new File("E:\\Mobile_Automation\\com.cricinfo.automation\\src\\test\\java\\Udemy_Mobile_Automation\\original.apk");//absolute path		
     DesiredCapabilities capabilities = new DesiredCapabilities();
     capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium" );
     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "72e932b2");
     capabilities.setCapability("platformVersion" ,"9");
     capabilities.setCapability("platformName" ,"Android");
     capabilities.setCapability(MobileCapabilityType.APP, fget);  
     try {
		AppiumDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	} 

	    

	}
	
	


