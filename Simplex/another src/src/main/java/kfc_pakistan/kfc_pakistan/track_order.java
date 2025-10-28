package kfc_pakistan.kfc_pakistan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.*;
import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.MobileElement;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class track_order {

//	JavascriptExecutor js = (JavascriptExecutor) driver;

	
	// Track Order page
	
	
	By menu_icon = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	
	By track_order_menu_link = By.xpath("//android.widget.Button[@content-desc='Track Order']");

	By phone_number = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"); // Edit it
	                                
	    By order_no = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]"); // Edit it

	By order_details = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[2]");

	By previous_screen_link = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

    
	By success_msg_text = By.xpath("//android.view.View[@content-desc='Your order has been placed, Thank you for choosing KFC. Your order tracking ID is 10263021']");
	
	By track_order = By.xpath("//android.widget.Button[@content-desc='TRACK ORDER']");
	
	By phone_input = By.xpath("//android.widget.EditText[@text='3144209707']");
	
	By phone_input_error = By.xpath("//android.view.View[@content-desc='Please Enter Valid Phone Number']");

	By order_no_input = By.xpath("//android.widget.EditText[@text='10263021']");
	
	By missing_order_no_error = By.xpath("//android.view.View[@content-desc='Please enter order number']");
	
	By track_order_button = By.xpath("//android.widget.Button[@content-desc='Track Order']");
	
	By track_order_progress_text = By.xpath("//android.view.View[@content-desc='Track Order Progress']");
	
	By step_no = By.xpath("//android.view.View[@content-desc='STEP 1']");
	
	By new_order_text = By.xpath("//android.view.View[@content-desc='New Order']");
	
	By expected_delivery_time = By.xpath("//android.view.View[@content-desc='Expected Delivery Time : 15 mins']");
	
	By total_bill = By.xpath("//android.view.View[@content-desc='Rs 361']");
	
	By order_details_arrow = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[2]");
	
	By order_not_found_popup = By.xpath("//android.widget.Toast[@text='Order Not Found']");
	
	By back_link = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
	
	
	
	public AndroidDriver driver;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	
	public track_order(AndroidDriver driver) {

		this.driver = driver;

	}
	
	
	public void track_order_link() {  // Payment page button
  		
	    	driver.findElement(track_order).click();
			
	}
	    
	
	public void track_the_order() {
	    	
	    driver.findElement(track_order_button).click();
	    	
	}
	  
	
    public void track_order_page() {
    	
    	
    	driver.findElement(menu_icon).click();
    	
    	driver.findElement(track_order_menu_link).click();
		
		
	}
    
   public void click_back_link() {
    	
    	
	   driver.findElement(back_link).click();
		
		
	}

	
    public void required_fields_check() throws InterruptedException {
    	
    	
    	driver.findElement(track_order_button).click();
    	
    	Thread.sleep(3000);
    	
    	WebElement phone_error_element = driver.findElement(phone_input_error);

		String actual_phone_error = phone_error_element.getAttribute("content-desc");

		String expected_phone_error = "Please Enter Valid Phone Number";

		Assert.assertEquals(actual_phone_error, expected_phone_error, "Test case failed");
		
		WebElement order_error_element = driver.findElement(missing_order_no_error);

		String actual_order_error = order_error_element.getAttribute("content-desc");

		String expected_order_error = "Please enter order number";

		Assert.assertEquals(actual_order_error, expected_order_error, "Test case failed");
    	
	}
    
    
    public void reopen_track_order_page() {
    	
    	driver.findElement(back_link).click(); 	
    	
    	driver.findElement(track_order_menu_link).click();
    	
      }
    
    public void wrong_order_no_check() {
    	
    	
    	driver.findElement(phone_number).click();
    	
    	driver.findElement(phone_number).sendKeys("3144209707");	
    	
    	driver.findElement(order_no).click();
    	
    	driver.findElement(order_no).sendKeys("123456");
    	
    	driver.findElement(track_order_button).click();
    	
    	WebElement error_element = driver.findElement(order_not_found_popup);

		String actual_error = error_element.getAttribute("text");

		String expected_error = "Order Not Found";

		Assert.assertEquals(actual_error, expected_error, "Test case failed");

    	
	}
    

}






