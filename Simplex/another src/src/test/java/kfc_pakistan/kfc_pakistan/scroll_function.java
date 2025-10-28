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
import io.appium.java_client.AppiumBy;
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
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.android.AndroidDriver;

public class scroll_function extends appium_setup {
	
		
	@Test

	public void test_case_37() throws MalformedURLException, InterruptedException {  // Test case 37: Careers form // In progress
			
		
		appium_setup a_setup = new appium_setup();
		BaseOptions options = a_setup.setup();
		URL url = new URL("http://127.0.0.1:4723/");	 
		AppiumDriver driver = new AndroidDriver(url, options);
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
	
}







