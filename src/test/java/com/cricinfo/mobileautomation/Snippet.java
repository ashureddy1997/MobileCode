/*package com.cricinfo.mobileautomation;

public class Snippet {
	import io.appium.java_client.TouchAction;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.MobileElement;
	import org.openqa.selenium.Dimension;
	import static io.appium.java_client.touch.WaitOptions;
	import static io.appium.java_client.touch.offset.PointOption;
	import static java.time.Duration.ofMillis;
	
	//Vertical Swipe by percentages
	    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
	        Dimension size = driver.manage().window().getSize();
	        int anchor = (int) (size.width * anchorPercentage);
	        int startPoint = (int) (size.height * startPercentage);
	        int endPoint = (int) (size.height * endPercentage);
	
	        new TouchAction(driver)
	                .press(PointOption.point(anchor, startPoint))
	                .waitAction(WaitOptions.waitOptions(ofMillis(1000)))
	                .moveTo(PointOption.point(anchor, endPoint))
	                .release().perform();
	    }
	
	public void verticalSwipeByPercentages(0.80,0.20,0.40) {
	        Dimension size = driver.manage().window().getSize();
	        int anchor = (int) (size.width * anchorPercentage);
	        int startPoint = (int) (size.height * startPercentage);
	        int endPoint = (int) (size.height * endPercentage);
	
	        new TouchAction(driver)
	                .press(PointOption.point(anchor, startPoint))
	                .waitAction(WaitOptions.waitOptions(ofMillis(1000)))
	                .moveTo(PointOption.point(anchor, endPoint))
	                .release().perform();
	    }
	
	
	
	
	    //Swipe by elements
	    public void swipeByElements (MobileElement startElement, MobileElement endElement) {
	        int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
	        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);
	
	        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
	        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);
	
	        new TouchAction(driver)
	                .press(PointOption.point(startX,startY))
	                .waitAction(WaitOptions.waitOptions(ofMillis(1000)))
	                .moveTo(PointOption.point(endX, endY))
	                .release().perform();
	
}*/

