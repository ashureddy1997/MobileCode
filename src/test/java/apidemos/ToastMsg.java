package apidemos;




	import java.net.URL;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.Test;
	import static java.time.Duration.ofSeconds;
	import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
	import io.appium.java_client.MobileBy;
	import io.appium.java_client.TouchAction;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.remote.AndroidMobileCapabilityType;
	import io.appium.java_client.remote.MobileCapabilityType;
	import static io.appium.java_client.touch.TapOptions.tapOptions;
	import static io.appium.java_client.touch.offset.ElementOption.element;
	import io.appium.java_client.touch.TapOptions;
	import io.appium.java_client.touch.offset.ElementOption;

	public class ToastMsg {
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
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Spinner\"))")).click();
				driver.findElementByXPath("//*[@text='red']").click();
				String toastmsg=driver.findElement(MobileBy.className("//android.widget.Toast[1]")).getText();
				System.out.println(toastmsg);
				
				
			}catch(Exception e) 
			{
				e.printStackTrace();
			}

		}}