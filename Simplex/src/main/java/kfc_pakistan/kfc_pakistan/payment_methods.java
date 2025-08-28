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

public class payment_methods {

	// Payment Method

	By select_payment_mode = By.xpath("//android.widget.Button[@content-desc='SELECT PAYMENT MODE']");

	By payment_mode_close = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button");

	By confirm_payment_mode_close = By.xpath(
			"//android.view.View[@content-desc='Confirm Payment Mode Are you sure you want to continue with Card On Delivery ?']/android.widget.Button[1]");

	By confirm_payment_mode_yes = By.xpath("//android.widget.Button[@content-desc='No']");

	By confirm_payment_mode_no = By.xpath("//android.widget.Button[@content-desc='Yes']");

	By success_message = By.className("android.view.View");

	By track_order = By.xpath("//android.widget.Button[@content-desc='TRACK ORDER']");

	// Cash Payment

	By cash_payment = By.xpath("//android.widget.ImageView[@content-desc='Cash Payment']");

	By cash_yes = By.xpath("//android.widget.Button[@content-desc='Yes']");

	By cash_no = By.xpath("//android.widget.Button[@content-desc='No']");

	// Online Payment

	By online_payment = By.xpath("//android.widget.ImageView[@content-desc='Online Payment']");

	By card_number = By.xpath("//android.widget.EditText[@resource-id='card_number']");

	By expiry_month = By.xpath("//android.widget.EditText[@resource-id=':r1:']"); // see pic

	By expiry_year = By.xpath("//android.widget.EditText[@resource-id=':r2:']"); // see pic

	By card_cvc = By.xpath("//android.widget.EditText[@resource-id='card_cvn']"); // text = 123

	By make_payment = By.xpath("//android.widget.Button[@text='MAKE PAYMENT']");

	// Jazz cash payment

	By jazz_cash_payment = By.xpath("//android.widget.ImageView[@content-desc='Jazz Cash Wallet']");

	By another_phone_radio = By.xpath("//android.view.View[@content-desc='Another Phone Number']");

	By phone_input_field = By.xpath("//android.view.View[@text='3144209707']");

	By phone_value = By.xpath("//android.widget.EditText[@text='3144209707']");

	// Card on Delivery payment

	By card_delivery = By.xpath("//android.widget.ImageView[@content-desc='Card On Delivery']");

	By card_delivery_yes = By.xpath("//android.widget.Button[@content-desc='Yes']");

	By card_delivery_no = By.xpath("//android.widget.Button[@content-desc='No']");

	// Proceed or Back button

	By proceed_button = By.xpath("//android.widget.Button[@content-desc='PROCEED']");

	By back_button = By.xpath("//android.widget.Button[@content-desc='BACK']");

	// Payment success/failure popup message

	By payment_success = By.xpath("");

	By payment_failure = By.xpath("//android.widget.Toast[@text='Payment is unsuccessful']");

	// Track Order page // See track order file

	By phone_number = By.className("android.widget.EditText"); // xpath value has hard coded phone no
																// //android.widget.EditText[@text="3144209707"]

	By order_id = By.className("android.widget.EditText"); // xpath value has hard coded order id
															// //android.widget.EditText[@text="10263023"]

	// By track_order_button =
	// By.className("//android.widget.Button[@content-desc='Track Order']"); // Edit
	// it

	By order_details = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[2]");

	By previous_screen_link = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

	By your_order_placed = By.xpath(
			"//android.view.View[@content-desc='Your order has been placed, Thank you for choosing KFC. Your order tracking ID is 10263052']");

	By track_order_button = By.xpath("//android.widget.Button[@content-desc='TRACK ORDER']");

	
	public AndroidDriver driver;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public payment_methods(AndroidDriver driver) {

		this.driver = driver;

	}

	public void cash_payment_function() throws InterruptedException {

		driver.findElement(select_payment_mode).click();
		driver.findElement(cash_payment).click();
		driver.findElement(cash_yes).click();
		driver.findElement(proceed_button).click();
		Thread.sleep(8000);
		

	}

	public void online_payment_function() throws InterruptedException {

		driver.findElement(select_payment_mode).click();

		driver.findElement(online_payment).click();

		driver.findElement(proceed_button).click();

		Thread.sleep(8000);

		driver.findElement(card_number).click();

		driver.findElement(card_number).sendKeys("4242424242424242");

		driver.findElement(expiry_month).click();

		driver.findElement(expiry_month).sendKeys("12");

		driver.findElement(expiry_year).click();

		driver.findElement(expiry_year).sendKeys("2028");

		driver.findElement(card_cvc).click();

		driver.findElement(card_cvc).sendKeys("123");

		driver.findElement(make_payment).click();

	}

	public void jazz_payment_function() throws InterruptedException {

		driver.findElement(select_payment_mode).click();

		driver.findElement(jazz_cash_payment).click();

		Thread.sleep(4000);

		// driver.findElement(another_phone_radio).click();

		// driver.findElement(phone_input_field).click();

		// driver.findElement(phone_value).type("");

		driver.findElement(proceed_button).click();

	}

	public void card_delivery_function() {

		driver.findElement(select_payment_mode).click();

		driver.findElement(card_delivery).click();

		driver.findElement(card_delivery_yes).click();

		driver.findElement(proceed_button).click();

	}

	public void verify_payment_success() {

//	    WebElement success_message = driver.findElement(By.xpath(""));

//	    System.out.println(success_message);

//	    Assert.assertEquals(success_message, "", "Assertion Failed");

		driver.findElement(track_order_button).click();

	}

	public void verify_jazz_payment_status() {

		// By payment_success = By.xpath("//android.widget.Toast[@text='Payment is successful']");

		// By payment_failure = By.xpath("//android.widget.Toast[@text='Payment is unsuccessful']");

//	     WebElement status_message = driver.findElement(By.xpath("//android.widget.Toast"));

//	     System.out.println(status_message);

//	     Assert.assertEquals(status_message, "", "Assertion Successful");

//       Assert.assertEquals(status_message, "", "Assertion Failed");

	}
	
	public void track_order() {
		
		driver.findElement(track_order_button).click();
	
	}
	
	
    public String get_order_tracking_id() {
    	
		
//	    WebElement tracking_id = driver.findElement(By.xpath("//android.widget.EditText[@text='10263080']"));
	    
//	    WebElement tracking_id_class = driver.findElement(By.className("android.widget.EditText[2]"));
	    
	    WebElement tracking_id_class = driver.findElement(By.xpath("//android.widget.EditText[2]"));
	    
	    String tracking_id = tracking_id_class.getAttribute("text");
	    
	    System.out.println(tracking_id);
	      		
		return tracking_id;
		
		
	}

}













