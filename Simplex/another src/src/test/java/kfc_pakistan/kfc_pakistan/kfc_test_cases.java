package kfc_pakistan.kfc_pakistan;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.Keys;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.*;
import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.android.options.UiAutomator2Options;
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.MobileElement;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
//import org.junit.*;
//import org.junit.Test;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import kfc_pakistan.kfc_pakistan.kfc_pages;
import kfc_pakistan.kfc_pakistan.home_page;
import kfc_pakistan.kfc_pakistan.cart_page;
import kfc_pakistan.kfc_pakistan.login_page;
import kfc_pakistan.kfc_pakistan.profile_page;
import kfc_pakistan.kfc_pakistan.track_order;
import kfc_pakistan.kfc_pakistan.payment_methods;
import kfc_pakistan.kfc_pakistan.my_orders;
import kfc_pakistan.kfc_pakistan.menu_page;
import kfc_pakistan.kfc_pakistan.store_locator;



public class kfc_test_cases {

	public void setup() {

	}

	public static void main(String[] args) throws Exception {

		BaseOptions options = new BaseOptions().amend("appium:deviceName", "Galaxy A03")
				// .amend("appium:deviceName", "Galaxy A05")
				.amend("platformName", "Android").amend("appium:platformVersion", "11")
				// .amend("appium:platformVersion", "14")
				.amend("appium:udid", "R9YRB0HB9WH")
				// .amend("appium:udid", "R9VX30004XZ")
				.amend("appium:automationName", "UiAutomator2").amend("appium:appPackage", "io.bramerz.kfc")
				.amend("appium:appActivity", "io.bramerz.kfc.MainActivity");
		// .amend("appium:ensureWebviewsHavePages", true)
		// .amend("appium:nativeWebScreenshot", true)
		// .amend("appium:newCommandTimeout", 3600)
		// .amend("appium:connectHardwareKeyboard", true);

		URL url = new URL("http://127.0.0.1:4723/");

		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	 // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		kfc_pages page_obj = new kfc_pages(driver);
		popups popup_obj = new popups(driver);
		home_page home_obj = new home_page(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		cart_page cart_obj = new cart_page(driver);
		my_addresses address_obj = new my_addresses(driver);
		my_orders order_obj = new my_orders(driver);
		payment_methods payment_obj = new payment_methods(driver);
		track_order track_obj = new track_order(driver);
		profile_page profile_obj = new profile_page(driver);
		select_channel_popup channel_obj = new select_channel_popup(driver);
		store_locator store_obj = new store_locator(driver);
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		

		
		// 1- Test cases 16: Invalid mobile number // Done
		
		 // popup_obj.close_popups();

		// login_obj.invalid_no("333434183");

		
		// 2- Test cases 17: Wrong OTP number // Done
		
		
		// popup_obj.close_popups();

		// login_obj.wrong_otp("3144209707", "1234");

		
		// 3- Test cases 19: Expired OTP number // In progress
		
		// popup_obj.close_popups();

		// login_obj.expired_otp("3144209707", "0707");

		
		// 4- Verify Profile checks // Done
		
		// popup_obj.close_popups();

		// login_obj.login("3144209707", "0707");

		// profile_obj.profile_required_fields_checks();

		
		// 5- Test cases 27: Valid Phone check // Done
		
		// popup_obj.close_popups();

		// login_obj.login("3144209707", "0707");

		// profile_obj.valid_phone_check("12345");

		
		// 6- Test cases 22: Valid Email check // Done
		
		// popup_obj.close_popups();

		// login_obj.login("3144209707", "0707");

		// profile_obj.valid_email_check("arslan.com");

		
		// 7- Test cases 7: Valid Email check // Done
		
		// popup_obj.close_popups();

		// login_obj.login("3144209707", "0707");

		// profile_obj.valid_email_check("arslan@gmail");

		
		// 8- Test cases 25, 26: Valid Profile Pic check
		
		// popup_obj.close_popups();

		// login_obj.login("3144209707", "0707");

		// profile_obj.profile_pic_check();

		
		// 9- Test cases 3: Test pickup flow  // In progress
		
		// popup_obj.close_popups();

		// page_obj.pickup_flow();

		
		// 10- Login happy flow // Done
		
		// popup_obj.close_popups();
		
		// login_obj.open_login_page();

		// login_obj.login("3144209707", "0707");

		
		// 11- Test case 7: Purchase item without login  // Done
		
//		 popup_obj.close_popups();
//
//		 menu_obj.add_to_bucket();
//		 
//		 channel_obj.new_location();
//			
//		 Thread.sleep(5000);
//			
//		 menu_obj.view_bucket_link();
//			
//		 Thread.sleep(3000);
//			
//		 cart_obj.check_out(); 
//			
//		 Thread.sleep(3000);
//		 
//		 login_obj.login("3144209707", "0707");
//		 
//		 cart_obj.check_out();
//			
//		 payment_obj.cash_payment_function();
//		 
//		 Thread.sleep(22000);  // add explicit wait here
//
//		 track_obj.verify_success_msg();
		 
		
		// 12- Test case 1: Login and Purchase item workflow i.e. Happy journey  // Done
		
//		ExtentTest test1= extent.createTest("Test case 12");
//
//		popup_obj.close_popups();
//		
//		test1.pass("Popup windows closed");
//		
//		Thread.sleep(5000);
		 
//      login_obj.open_login_page(); 
//		
//		login_obj.login("3144209707", "0707");
//		
//		test1.pass("Login Success");
//
//		menu_obj.add_to_bucket();
//		
//		channel_obj.select_delivery();
//		
//		Thread.sleep(5000);
//		
//		menu_obj.view_bucket_link();
//		
//		test1.pass("Item successfuly added to cart");
//		
//		Thread.sleep(3000);
//		
//		cart_obj.check_out();
//		
//		Thread.sleep(3000);
//		
//		payment_obj.cash_payment_function();
//		
//		test1.pass("Item successfuly purchased");
//		
//		test1.info("Test completed");
//		
//		extent.flush();
		 
		 
//		13- Test case 2: Buy product through product popup window
		 
		 popup_obj.close_popups();
			
		 Thread.sleep(5000);
		 
		 login_obj.open_login_page();
			
		 login_obj.login("3144209707", "0707");
		 
		 menu_obj.open_menu_page();
		 
		 Thread.sleep(12000);
		 
		 menu_obj.item_popup_add();
		 
		 channel_obj.select_delivery();
			
		 Thread.sleep(5000);
			
		 menu_obj.view_bucket_link_800();
			
		 Thread.sleep(3000);
		 
		 cart_obj.verify_total_bill("");
			
		 cart_obj.check_out_851();
			
		 Thread.sleep(3000);
			
		 payment_obj.cash_payment_function();
	
		 
		 
		 
		 
//		14- Test case 4: Verify that online payment is working fine
		
//		15- Test case 5: Verify that Jazz Cash is working fine
		
//		16- Test case 6: Verify that Card on Delivery is working fine
		 
//		17- Test case 9: Verify that feedback popup window is showing accurate data
		 
//		18- Test case 10: Verify that feedback functionality is working fine
		
//		19- Test case 11: Verify that reorder functionality is working fine
		 
//		20- Test case 14: Verify that reorder functionality is working fine 
		 
//		21- Test case 15: Verify that reorder functionality is working fine
		 
//		22- Test case 28, 29, 30: Add, Edit and Delete address
		 
//		23- Test case 33: Add to favorites working fine

//		24- Test case 34: Track id with wrong number
		 
//		25- Test case 36: Donation functionality
		 
//		26- Test case 37: Careers form
		 

	}

	public static void test_case_x() {

		// Write test case here

	}

}





