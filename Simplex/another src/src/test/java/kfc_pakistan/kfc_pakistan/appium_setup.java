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
import java.time.Duration;
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


public class appium_setup {

	public BaseOptions setup() {


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

		return options;

//		   public class AppiumConfig {
//
//		       private DesiredCapabilities capabilities;
//
//		       public AppiumConfig() {
//		           capabilities = new DesiredCapabilities();
//
//		           // Set desired capabilities
//		           capabilities.setCapability("platformName", "Android");
//		           capabilities.setCapability("deviceName", "emulator-5554");  // or real device name
//		           capabilities.setCapability("appPackage", "com.example.app"); // your app's package name
//		           capabilities.setCapability("appActivity", ".MainActivity"); // your app's main activity
//
//		           // Other capabilities can be added here as needed
//		           // For example, automationName: "UiAutomator2"
//
//		       }
//
//		       public DesiredCapabilities getCapabilities() {
//		           return capabilities;
//		       }
//
//		   }
		
	}
	
}
		
		