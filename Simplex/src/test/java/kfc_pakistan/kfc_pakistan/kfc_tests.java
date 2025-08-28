package kfc_pakistan.kfc_pakistan;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
// import org.junit.*;
// import org.junit.Test; // this import is causing issue with import org.testng.annotations.Test;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertEquals;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentTest;

import kfc_pakistan.kfc_pakistan.kfc_pages;
import kfc_pakistan.kfc_pakistan.appium_setup;
import kfc_pakistan.kfc_pakistan.kfc_pages;
import kfc_pakistan.kfc_pakistan.home_page;
import kfc_pakistan.kfc_pakistan.cart_page;
import kfc_pakistan.kfc_pakistan.login_page;
import kfc_pakistan.kfc_pakistan.profile_page;
import kfc_pakistan.kfc_pakistan.track_order;
import kfc_pakistan.kfc_pakistan.payment_methods;
import kfc_pakistan.kfc_pakistan.my_orders;
import kfc_pakistan.kfc_pakistan.menu_page;
import kfc_pakistan.kfc_pakistan.careers_page;
import kfc_pakistan.kfc_pakistan.store_locator;

//import io.appium.java_client.remote.MobileCapabilityType;


public class kfc_tests extends appium_setup {
	



//	@Test(priority = 1)
	@Test(enabled = false)
	public void test_case_1() throws MalformedURLException, InterruptedException { // Test case 1: Login and Purchase item workflow i.e. Happy journey

		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		popups popup_obj = new popups(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		cart_page cart_obj = new cart_page(driver);
		payment_methods payment_obj = new payment_methods(driver);
		select_channel_popup channel_obj = new select_channel_popup(driver);
		
//		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
//		ExtentTest test1= extent.createTest("Test case 1");

		popup_obj.close_popups();
		Thread.sleep(5000);
        login_obj.open_login_page();
        Thread.sleep(5000);
		login_obj.login("3144209707", "0707");
		Thread.sleep(5000);
		menu_obj.add_to_bucket();
		Thread.sleep(5000);
		channel_obj.select_delivery();
		Thread.sleep(5000);
		menu_obj.view_bucket_link_310();
		Thread.sleep(3000);
		cart_obj.check_out_361();
		Thread.sleep(3000);
		payment_obj.cash_payment_function();
		Thread.sleep(6000);
//		test1.pass("Test case 1 passed");
//		test1.info("Test completed");
//		extent.flush();
		driver.quit();

	}

//	@Test(priority = 2)
	@Test(enabled = false)
	public void test_case_2() throws MalformedURLException, InterruptedException { // Test case 2: Buy product through product popup window // In progress
																			
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		popups popup_obj = new popups(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		cart_page cart_obj = new cart_page(driver);
		payment_methods payment_obj = new payment_methods(driver);
		select_channel_popup channel_obj = new select_channel_popup(driver);

		popup_obj.close_popups();
		Thread.sleep(5000);
		login_obj.open_login_page();
		Thread.sleep(5000);
		login_obj.login("3144209707", "0707");
		Thread.sleep(5000);
		menu_obj.open_menu_page();
		Thread.sleep(12000);
			
//		menu_obj.item_popup_add();
		
		menu_obj.select_drink();
		menu_obj.select_add_on();
		menu_obj.set_quantity();
		
		Thread.sleep(5000);
		channel_obj.select_delivery();
		Thread.sleep(5000);
		
		menu_obj.view_bucket_link_800(); // need to edit this method
		
		
		Thread.sleep(3000);
		cart_obj.verify_total_bill("800"); // need to edit this method
		Thread.sleep(4000);
		cart_obj.check_out_851();
		Thread.sleep(4000);
		payment_obj.cash_payment_function();
		Thread.sleep(7000);
		

	}
	

//	@Test(priority = 3)
	@Test(enabled = false)
	public void test_case_3() throws MalformedURLException, InterruptedException { // Test cases 3: Test pickup flow
																	
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		popups popup_obj = new popups(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		cart_page cart_obj = new cart_page(driver);
		payment_methods payment_obj = new payment_methods(driver);
		select_channel_popup channel_obj = new select_channel_popup(driver);

		popup_obj.close_popups();
		Thread.sleep(5000);
        login_obj.open_login_page();
        Thread.sleep(5000);
		login_obj.login("3144209707", "0707");
		Thread.sleep(5000);
		menu_obj.add_to_bucket();
		Thread.sleep(5000);
		channel_obj.select_pickup();
		Thread.sleep(5000);
		menu_obj.view_bucket_link_310();
		Thread.sleep(3000);
		cart_obj.check_out_311();
		Thread.sleep(3000);
		payment_obj.jazz_payment_function();
		Thread.sleep(6000);
		driver.quit();
	}
	
	

//	@Test(priority = 4)
	@Test(enabled = false)

	public void test_case_4() throws MalformedURLException, InterruptedException { // Test case 4: Verify that online payment is working fine
																				
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		popups popup_obj = new popups(driver);	
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		cart_page cart_obj = new cart_page(driver);
		payment_methods payment_obj = new payment_methods(driver);
		select_channel_popup channel_obj = new select_channel_popup(driver);
		
		popup_obj.close_popups();
		Thread.sleep(5000);
        login_obj.open_login_page();
        Thread.sleep(5000);
		login_obj.login("3144209707", "0707");
		Thread.sleep(5000);
		menu_obj.add_to_bucket();
		Thread.sleep(5000);
		channel_obj.select_delivery();
		Thread.sleep(5000);
		menu_obj.view_bucket_link_310();
		Thread.sleep(3000);
		cart_obj.check_out_361();
		Thread.sleep(3000);
		payment_obj.online_payment_function();
		Thread.sleep(9000);
		payment_obj.verify_payment_success();
		driver.quit();
	}

	
//	@Test(priority = 5)
	@Test(enabled = false)

	public void test_case_5() throws MalformedURLException, InterruptedException { // Test case 5: Verify that Jazz Cash is working fine
																	

		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		popups popup_obj = new popups(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		cart_page cart_obj = new cart_page(driver);
		payment_methods payment_obj = new payment_methods(driver);
		select_channel_popup channel_obj = new select_channel_popup(driver);
	
//		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
		
		popup_obj.close_popups();
		Thread.sleep(5000);
        login_obj.open_login_page();
        Thread.sleep(5000);
		login_obj.login("3144209707", "0707");
		Thread.sleep(5000);
		menu_obj.add_to_bucket();
		Thread.sleep(5000);
		channel_obj.select_delivery();
		Thread.sleep(5000);
		menu_obj.view_bucket_link_310();
		Thread.sleep(3000);
		cart_obj.check_out_361();
		Thread.sleep(3000);
		payment_obj.jazz_payment_function();
		Thread.sleep(25000);
		payment_obj.verify_jazz_payment_status();
		driver.quit();

	}

	
//	@Test(priority = 6)
	@Test(enabled = false)

	public void test_case_6() throws MalformedURLException, InterruptedException { // Test case 6: Verify that Card on Delivery is working fine
																	
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
		popups popup_obj = new popups(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		cart_page cart_obj = new cart_page(driver);
		payment_methods payment_obj = new payment_methods(driver);
		select_channel_popup channel_obj = new select_channel_popup(driver);

//		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);

		popup_obj.close_popups();
		Thread.sleep(5000);
        login_obj.open_login_page();
        Thread.sleep(5000);
		login_obj.login("3144209707", "0707");
		Thread.sleep(5000);
		menu_obj.add_to_bucket();
		Thread.sleep(5000);
		channel_obj.select_delivery();
		Thread.sleep(5000);
		menu_obj.view_bucket_link_310();
		Thread.sleep(3000);
		cart_obj.check_out_361();
		Thread.sleep(3000);
		payment_obj.card_delivery_function();
		Thread.sleep(6000);
		driver.quit();
		
	}

	
//	@Test(priority = 7)
	@Test(enabled = false)

	public void test_case_7() throws MalformedURLException, InterruptedException { // Test case 7: Purchase item without login  // Done
																				

		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		popups popup_obj = new popups(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		cart_page cart_obj = new cart_page(driver);
		payment_methods payment_obj = new payment_methods(driver);
		track_order track_obj = new track_order(driver);
		select_channel_popup channel_obj = new select_channel_popup(driver);

		popup_obj.close_popups();
		menu_obj.add_to_bucket();
		channel_obj.new_location();
		Thread.sleep(5000);
		menu_obj.view_bucket_link_310();
		Thread.sleep(3000);
		cart_obj.check_out_361();
		Thread.sleep(3000);
		login_obj.login("3144209707", "0707");
		cart_obj.check_out_361();
		payment_obj.cash_payment_function();
		
		Thread.sleep(22000); // add explicit wait here
		
		track_obj.track_order_link();
		
		driver.quit();
		

	}
	
	
	@Test(priority = 8)
//	@Test(enabled = false)

	public void test_case_8() throws MalformedURLException, InterruptedException { 	// Verify that order history page is updated successfully // In progress
		
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		popups popup_obj = new popups(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		cart_page cart_obj = new cart_page(driver);
		my_orders order_obj = new my_orders(driver);
		payment_methods payment_obj = new payment_methods(driver);
		select_channel_popup channel_obj = new select_channel_popup(driver);
		track_order track_obj = new track_order(driver);

		popup_obj.close_popups();
		Thread.sleep(5000);
        login_obj.open_login_page();
        Thread.sleep(5000);
		login_obj.login("3144209707", "0707");
		Thread.sleep(5000);
//		menu_obj.add_to_bucket();
//		Thread.sleep(5000);
//		channel_obj.select_delivery();
//		Thread.sleep(5000);
//		menu_obj.view_bucket_link_310();
//		Thread.sleep(3000);
//		cart_obj.check_out_361();
//		Thread.sleep(3000);
//		
//		payment_obj.cash_payment_function();
//		
//		payment_obj.track_order();
//		
//		Thread.sleep(3000);
//		
//		String tracking_id = payment_obj.get_order_tracking_id();
//		
//		Thread.sleep(6000);
//		
//		track_obj.click_back_link();
//		
//		Thread.sleep(4000);
//			
//		order_obj.my_orders_page_2();
//		
//		Thread.sleep(4000);
//		
//		order_obj.verify_latest_order_id(tracking_id);
		

		order_obj.my_orders_page();
		Thread.sleep(4000);
		order_obj.view_info();
	
	}

	
	
//	@Test(priority = 9)
	@Test(enabled = false)

	public void test_case_9() throws MalformedURLException, InterruptedException { // Test case 9: Verify that view info and feedback popup window is showing accurate data
			                                                                       // skip this test
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		popups popup_obj = new popups(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		cart_page cart_obj = new cart_page(driver);
		my_orders order_obj = new my_orders(driver);
		payment_methods payment_obj = new payment_methods(driver);
		select_channel_popup channel_obj = new select_channel_popup(driver);
		
		popup_obj.close_popups();
		Thread.sleep(5000);
        login_obj.open_login_page();
        Thread.sleep(5000);
		login_obj.login("3144209707", "0707");
		Thread.sleep(5000);
		menu_obj.add_to_bucket();
		Thread.sleep(5000);
		channel_obj.select_delivery();
		Thread.sleep(5000);
		menu_obj.view_bucket_link_310();
		Thread.sleep(3000);
		cart_obj.check_out_361();
		Thread.sleep(3000);
		payment_obj.cash_payment_function();
		Thread.sleep(6000);
		order_obj.my_orders_page();
		Thread.sleep(5000);
		order_obj.order_history_info();
		Thread.sleep(5000);
		order_obj.view_info();
		driver.quit();
	}
	
//	@Test(priority = 10)
	@Test(enabled = false)

	public void test_case_10() throws MalformedURLException, InterruptedException { // Test case 10: Verify that feedback functionality is working fine //Done
		
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		popups popup_obj = new popups(driver);
		login_page login_obj = new login_page(driver);
		my_orders order_obj = new my_orders(driver);

//		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);

		popup_obj.close_popups();
		login_obj.open_login_page();
		Thread.sleep(5000);
		login_obj.login("3144209707", "0707");
		Thread.sleep(3000);
		order_obj.my_orders_page();
		Thread.sleep(5000);
		order_obj.submit_feedback();
		driver.quit();
	}
	
	
//	@Test(priority = 11)
	@Test(enabled = false)

	public void test_case_11() throws MalformedURLException, InterruptedException { // Test case 11: Verify that reorder functionality is working fine// Done
			
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		popups popup_obj = new popups(driver);
		login_page login_obj = new login_page(driver);
		my_orders order_obj = new my_orders(driver);
		select_channel_popup channel_obj = new select_channel_popup(driver);
		home_page home_obj = new home_page(driver);	
		menu_page menu_obj = new menu_page(driver);
		cart_page cart_obj = new cart_page(driver);
		payment_methods payment_obj = new payment_methods(driver);	
		
//		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
		
		popup_obj.close_popups();
		login_obj.open_login_page();
		login_obj.login("3144209707", "0707");
		Thread.sleep(3000);
		order_obj.my_orders_page();
		Thread.sleep(5000);
		order_obj.reorder_item();
		Thread.sleep(3000);
		channel_obj.select_delivery();
		Thread.sleep(3000);
		order_obj.back_link_click();
		home_obj.explore_menu_click();
		Thread.sleep(3000);
		menu_obj.view_bucket_link_310();
		cart_obj.check_out_361();
		Thread.sleep(3000);
		payment_obj.cash_payment_function();
		Thread.sleep(8000);
		payment_obj.verify_payment_success();
  
		driver.quit();
	}
	
	
	@Test(enabled = false)

	public void test_case_12() throws MalformedURLException, InterruptedException { 
			
		
	}
	
	
	
//	@Test(priority = 15)
	@Test(enabled = false)

	public void test_case_15() throws MalformedURLException, InterruptedException { // Test case 15: Verify GST value // Done
			
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		popups popup_obj = new popups(driver);
	
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		select_channel_popup channel_obj = new select_channel_popup(driver);
		cart_page cart_obj = new cart_page(driver);
		
		popup_obj.close_popups();
		login_obj.open_login_page();
		login_obj.login("3144209707", "0707");
		
		Thread.sleep(5000);
		menu_obj.add_to_bucket();
		Thread.sleep(5000);
		channel_obj.select_delivery();
		Thread.sleep(5000);
		
		menu_obj.view_bucket_link_310();
		Thread.sleep(3000);
		cart_obj.verify_gst_value();
		
//		cart_obj.check_out_361();		
//		Thread.sleep(3000);
//		payment_obj.cash_payment_function();
//		Thread.sleep(8000);
//		payment_obj.verify_payment_success();

		
	}
	
	
//	@Test(priority = 16)
	@Test(enabled = false)

	public void test_case_16() throws MalformedURLException, InterruptedException { // Test cases 16: Invalid mobile number on login page //Done
			
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		popups popup_obj = new popups(driver);
		home_page home_obj = new home_page(driver);
		login_page login_obj = new login_page(driver);
		profile_page profile_obj = new profile_page(driver);
	
//		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
	
		popup_obj.close_popups();
		login_obj.invalid_no("333434183");
		driver.quit();
		
	}
	
	
//	@Test(priority = 17)
	@Test(enabled = false)

	public void test_case_17() throws MalformedURLException, InterruptedException { // Test cases 17: Wrong OTP number // Done
			
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		popups popup_obj = new popups(driver);

		login_page login_obj = new login_page(driver);

		profile_page profile_obj = new profile_page(driver);

//		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
	
		popup_obj.close_popups();
		login_obj.wrong_otp("3144209707", "1234");
		
		driver.quit();
		
	}
	
	
	@Test(enabled = false)
	public void test_case_18() throws MalformedURLException, InterruptedException { 
			
		
	}
	
	
//	@Test(priority = 19)
	@Test(enabled = false)

	public void test_case_19() throws MalformedURLException, InterruptedException { // Test cases 19: Expired OTP number // cannot be implemented with test otp 0707
			
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		popups popup_obj = new popups(driver);
		login_page login_obj = new login_page(driver);
		profile_page profile_obj = new profile_page(driver);

//		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
		
		popup_obj.close_popups();
		login_obj.expired_otp("3144209707", "0707");
		
		driver.quit();
		
	}
	
	@Test(enabled = false)

	public void test_case_20() throws MalformedURLException, InterruptedException { 
			
		
	}
	
	@Test(enabled = false)

	public void test_case_21() throws MalformedURLException, InterruptedException { 
			
		
	}
	
	
//	@Test(priority = 22)
	@Test(enabled = false)

	public void test_case_22() throws MalformedURLException, InterruptedException { // Test cases 22: Verify valid Email checks //Done
			
		
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;	

		popups popup_obj = new popups(driver);
		home_page home_obj = new home_page(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		profile_page profile_obj = new profile_page(driver);
	
//		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);

		popup_obj.close_popups();
		
		login_obj.open_login_page();

		login_obj.login("3144209707", "0707");
		
		profile_obj.open_profile_page();

		profile_obj.valid_email_check("arslan@gmail");
		
		Thread.sleep(4000);
		
		profile_obj.valid_email_check("arslan.com");
		
		driver.quit();
		
	}
	
	
	
	@Test(enabled = false)

	public void test_case_23() throws MalformedURLException, InterruptedException { 
			
		
	}
	
	
//	@Test(priority = 15)
	@Test(enabled = false)

	public void test_case_25() throws MalformedURLException, InterruptedException {  // Test cases 25, 26: Valid Profile Pic check // skip for now
			
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		popups popup_obj = new popups(driver);
		home_page home_obj = new home_page(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		profile_page profile_obj = new profile_page(driver);

//		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);

		
		popup_obj.close_popups();
		login_obj.open_login_page();
		login_obj.login("3144209707", "0707");
		profile_obj.profile_pic_check();
		
		driver.quit();

		
	}
	
	
//	@Test(priority = 27)
	@Test(enabled = false)

	public void test_case_27() throws MalformedURLException, InterruptedException {  // Test cases 27: Valid Phone check in profile // Done
				
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		popups popup_obj = new popups(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		profile_page profile_obj = new profile_page(driver);

//		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
	
		popup_obj.close_popups();
		
		login_obj.open_login_page();
		
		login_obj.login("3144209707", "0707");	
		
		profile_obj.open_profile_page();

        Thread.sleep(3000);
		
		profile_obj.valid_phone_check("12345");
		driver.quit();
		
	}
	
	
//	@Test(priority = 28)
	@Test(enabled = false)

	public void test_case_28() throws MalformedURLException, InterruptedException {  // Test case 28: Add address // Done
			

		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		
		popups popup_obj = new popups(driver);
		home_page home_obj = new home_page(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		my_addresses address_obj = new my_addresses(driver);
		profile_page profile_obj = new profile_page(driver);
		
        popup_obj.close_popups();
		login_obj.open_login_page();
		login_obj.login("3144209707", "0707");
		
		Thread.sleep(4000);
		address_obj.open_address_page();
		Thread.sleep(4000);
		address_obj.add_address("test store", "Other");
		driver.quit();
		
	}
	
	
//	@Test(priority = 29)
	@Test(enabled = false)

	public void test_case_29() throws MalformedURLException, InterruptedException {  // Test case 29: Edit address // Done
			

		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		
		popups popup_obj = new popups(driver);
		home_page home_obj = new home_page(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		my_addresses address_obj = new my_addresses(driver);
		profile_page profile_obj = new profile_page(driver);
		
        popup_obj.close_popups();
		login_obj.open_login_page();
		login_obj.login("3144209707", "0707");
		
		Thread.sleep(4000);
		address_obj.open_address_page();
		Thread.sleep(4000);
		address_obj.edit_address("test store", "Office");
		address_obj.verify_edit_address_success();
		driver.quit();
	}
	
	
	
//	@Test(priority = 30)
	@Test(enabled = false)

	public void test_case_30() throws MalformedURLException, InterruptedException {  // Test case 30: Delete address // Done	

		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		
		popups popup_obj = new popups(driver);
		home_page home_obj = new home_page(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		my_addresses address_obj = new my_addresses(driver);
		profile_page profile_obj = new profile_page(driver);
		
        popup_obj.close_popups();
		login_obj.open_login_page();
		login_obj.login("3144209707", "0707");
		
		Thread.sleep(4000);
		address_obj.open_address_page();
		Thread.sleep(4000);
		address_obj.delete_address("3");
		driver.quit();
	}
	
	
//	@Test(priority = 31)
	@Test(enabled = false)

	public void test_case_31() throws MalformedURLException, InterruptedException {  // Test case 31: Set Address as default // Done
			

		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		
		popups popup_obj = new popups(driver);
		home_page home_obj = new home_page(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		my_addresses address_obj = new my_addresses(driver);
		profile_page profile_obj = new profile_page(driver);
		
        popup_obj.close_popups();
		login_obj.open_login_page();
		login_obj.login("3144209707", "0707");
		
		Thread.sleep(4000);
		address_obj.open_address_page();
		Thread.sleep(4000);
  	    address_obj.set_default("2");
  	    driver.quit();
		
	}
	
//	@Test(priority = 32)
	@Test(enabled = false)

	public void test_case_32() throws MalformedURLException, InterruptedException {  // Test case 32: Purchase item with new address // To Do
			

		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		
		popups popup_obj = new popups(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		my_addresses address_obj = new my_addresses(driver);	
		select_channel_popup channel_obj = new select_channel_popup(driver);
		cart_page cart_obj = new cart_page(driver);
		payment_methods payment_obj = new payment_methods(driver);
		
  	    popup_obj.close_popups();
		Thread.sleep(5000);
        login_obj.open_login_page();
        Thread.sleep(5000);
		login_obj.login("3144209707", "0707");
		Thread.sleep(5000);
		menu_obj.add_to_bucket();
		Thread.sleep(5000);

		channel_obj.add_another_address("Rhc Jamke Cheema", "QA House","QA Block","QA Area"); // add input parameters
		
		Thread.sleep(5000);
		menu_obj.view_bucket_link_310();
		Thread.sleep(3000);
		cart_obj.check_out_361();
		Thread.sleep(3000);
		payment_obj.cash_payment_function();
		Thread.sleep(6000);
		
	}
	
	
//	@Test(priority = 33)
	@Test(enabled = false)

	public void test_case_33() throws MalformedURLException, InterruptedException {  // Test case 33: Verify that Add/Remove to favorites working fine // Done
			
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		popups popup_obj = new popups(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		my_favorites fav_obj = new my_favorites(driver);
	
//		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
		
		 popup_obj.close_popups();
			
		 login_obj.open_login_page();
			
		 login_obj.login("3144209707", "0707");
		 
		 menu_obj.open_menu_page();
		 
		 Thread.sleep(6000);
		 
		 fav_obj.add_to_favorites();
		 
		 fav_obj.back_link_click();
		 
		 Thread.sleep(4000);
		 
		 fav_obj.remove_from_favorites();
		 
	}
	
	
	
//	@Test(priority = 34)
	@Test(enabled = false)

	public void test_case_34() throws MalformedURLException, InterruptedException {  // Test case 34: Track order form checks // Done
			
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		popups popup_obj = new popups(driver);
		home_page home_obj = new home_page(driver);
		login_page login_obj = new login_page(driver);	
		track_order track_obj = new track_order(driver);
		
		 popup_obj.close_popups();
		 login_obj.open_login_page();
		 login_obj.login("3144209707", "0707");
		 Thread.sleep(5000);
		 
		 track_obj.track_order_page();
		 
		 track_obj.required_fields_check();
		 
		 track_obj.reopen_track_order_page();
		 
		 track_obj.wrong_order_no_check();
		 
	}
	
	
//	@Test(priority = 35)
	@Test(enabled = false)

	public void test_case_35() throws MalformedURLException, InterruptedException {  // Test case 35: Track order happy flow // Done
			
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		popups popup_obj = new popups(driver);
		home_page home_obj = new home_page(driver);
		login_page login_obj = new login_page(driver);	
		track_order track_obj = new track_order(driver);
		menu_page menu_obj = new menu_page(driver);
		cart_page cart_obj = new cart_page(driver);
		payment_methods payment_obj = new payment_methods(driver);
		select_channel_popup channel_obj = new select_channel_popup(driver);

		
		popup_obj.close_popups();
		login_obj.open_login_page();
		login_obj.login("3144209707", "0707");
		Thread.sleep(5000);
		menu_obj.add_to_bucket();
		Thread.sleep(5000);
		channel_obj.select_delivery();
		Thread.sleep(5000);
		menu_obj.view_bucket_link_310();
		Thread.sleep(3000);
		cart_obj.check_out_361();
		Thread.sleep(3000);
		payment_obj.cash_payment_function();
		Thread.sleep(6000);
		
		track_obj.track_order_link();
		
		track_obj.track_the_order();
		
		
		
	}
	
	
	
//	@Test(priority = 36)
	@Test(enabled = false)

	public void test_case_36() throws MalformedURLException, InterruptedException {  // Test case 36: Donation functionality // Done
			
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		popups popup_obj = new popups(driver);	
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		cart_page cart_obj = new cart_page(driver);
		payment_methods payment_obj = new payment_methods(driver);
		select_channel_popup channel_obj = new select_channel_popup(driver);

		 popup_obj.close_popups();
		 login_obj.open_login_page();
		 login_obj.login("3144209707", "0707");
		 Thread.sleep(5000);
		 menu_obj.add_to_bucket();
		 Thread.sleep(5000);
		 channel_obj.select_delivery();
		 Thread.sleep(5000);
		 menu_obj.view_bucket_link_310();
		 Thread.sleep(3000);
		 
		 cart_obj.give_donation();	 
		 cart_obj.verify_donation_success();
		 cart_obj.verify_donation_amount();
//		 cart_obj.check_out_361();
		 
//		 Thread.sleep(3000);
//		 payment_obj.cash_payment_function();
//		 Thread.sleep(6000);
		 
	}
	
	
//	@Test(priority = 37)
	@Test(enabled = false)

	public void test_case_37() throws MalformedURLException, InterruptedException {  // Test case 37: Careers form
			
		
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		popups popup_obj = new popups(driver);
		home_page home_obj = new home_page(driver);
		login_page login_obj = new login_page(driver);
		menu_page menu_obj = new menu_page(driver);
		careers_page careers_obj = new careers_page(driver);
		
		popup_obj.close_popups();
		Thread.sleep(4000);
		careers_obj.open_careers_page();
		Thread.sleep(5000);
		careers_obj.submit_careers_form();
	
	}
	
	
//	@Test(priority = 40)
	@Test(enabled = false)

	public void test_case_40() throws MalformedURLException, InterruptedException {  // Test case 40: Logout functionality //
			
		
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		popups popup_obj = new popups(driver);
	
		login_page login_obj = new login_page(driver);
        logout logout_obj = new logout(driver);
		
		popup_obj.close_popups();
		Thread.sleep(4000);
		
		login_obj.open_login_page();
		login_obj.login("3144209707", "0707");
		Thread.sleep(5000);
		
		logout_obj.logout_user();
		
		Thread.sleep(3000);
		
		logout_obj.verify_logout_success();
		
	}

	
}







