package kfc_pakistan.kfc_pakistan;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.*;
import io.appium.java_client.remote.options.BaseOptions;
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.MobileElement;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import org.junit.*;
import org.junit.Test;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.testng.annotations.*;
import kfc_pakistan.kfc_pakistan.kfc_pages;
import kfc_pakistan.kfc_pakistan.menu_page;
import kfc_pakistan.kfc_pakistan.profile_page;
import kfc_pakistan.kfc_pakistan.my_addresses;
import kfc_pakistan.kfc_pakistan.my_orders;
import kfc_pakistan.kfc_pakistan.profile_page;
import kfc_pakistan.kfc_pakistan.store_locator;
import kfc_pakistan.kfc_pakistan.track_order;
import kfc_pakistan.kfc_pakistan.bucket_page;

public class kfc_test_cases {


	public static void main(String[] args) throws Exception {

		
		BaseOptions options = new BaseOptions()
				.amend("appium:deviceName", "Galaxy A03")
			 // .amend("appium:deviceName", "Galaxy A05")
				.amend("platformName", "Android")
				.amend("appium:platformVersion", "11")
			 // .amend("appium:platformVersion", "14")
				.amend("appium:udid", "R9YRB0HB9WH")
			 // .amend("appium:udid", "R9VX30004XZ")
				.amend("appium:automationName", "UiAutomator2")
				.amend("appium:appPackage", "io.bramerz.kfc")
				.amend("appium:appActivity", "io.bramerz.kfc.MainActivity");
			//	.amend("appium:ensureWebviewsHavePages", true)
			//	.amend("appium:nativeWebScreenshot", true)
			//	.amend("appium:newCommandTimeout", 3600)
			//	.amend("appium:connectHardwareKeyboard", true);

		URL url = new URL("http://127.0.0.1:4723/");
		

		AndroidDriver driver = new AndroidDriver(url, options);
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS); 
	
		kfc_pages page_obj = new kfc_pages(driver);
		
	//	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);  
		
	//	login_obj.close_popup();
    
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);  
	
	//	login_obj.login("3144209707", "0707");
		
		page_obj.login();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		page_obj.add_to_bucket();
		
	}
}







