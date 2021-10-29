package com.cricinfo.mobileautomation;
import java.net.URL;
import io.appium.java_client.touch.TapOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;
import static java.time.Duration.ofMillis;


public class Assignment6{
public static AppiumDriver<MobileElement> driver=null;



@BeforeTest
public static void launchApp()
{
try
{
	DesiredCapabilities capab=new DesiredCapabilities();
	capab.setCapability("platformName" ,"Android");
	capab.setCapability("platformVersion" ,"9");
	capab.setCapability("deviceName" ,"72e932b2");
	capab.setCapability("appPackage" ,"com.july.cricinfo");		
	capab.setCapability("appActivity" ,"com.espn.sportscenter.ui.LaunchActivity");
	capab.setCapability("noReset" ,"false");
	
	driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capab);Thread.sleep(6000);
    


}catch (Exception e) {
System.out.println(e);
}

}
@Test
public void testcase1()
{
try
{   Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@text='ALLOW']")).click();			
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
	Thread.sleep(6000);
    driver.findElement(By.id("com.july.cricinfo:id/btn_sign_up_later")).click();
    Thread.sleep(3000);
    driver.findElement(By.className("android.widget.FrameLayout")).click();
   //driver.findElement(By.xpath("//*[@text='India']")).click();
   Thread.sleep(8000);
   driver.findElement(By.id("com.july.cricinfo:id/nextText")).click();
   Thread.sleep(8000);
   verticalSwipeByPercentages(0.80,0.20,0.40);
       }catch (Exception e) 
        {
        System.out.println("exception occured in testcase1 :"+e);
       }

}


public static void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage)
{
       Dimension size = driver.manage().window().getSize();
       int anchor = (int) (size.width * anchorPercentage);
       int startPoint = (int) (size.height * startPercentage);
       int endPoint = (int) (size.height * endPercentage);

     //  new TouchAction(driver).tap(TapOptions.tapOptions().withElement(element)
             /* .press(PointOption.point(anchor, startPoint))
               .waitAction(WaitOptions.waitOptions(ofMillis(8000)))
               .moveTo(PointOption.point(anchor, endPoint))
               .release().perform();*/
       
}


}

