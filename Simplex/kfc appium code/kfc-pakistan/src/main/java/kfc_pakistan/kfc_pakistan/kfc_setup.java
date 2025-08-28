package kfc_pakistan.kfc_pakistan;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.*;
import io.appium.java_client.remote.options.BaseOptions;
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.MobileElement;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.net.URL;
import java.util.List;
import java.util.function.Function;


public class kfc_setup {


	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		BaseOptions options = new BaseOptions().amend("appium:deviceName", "Galaxy A03s")
				// .amend("appium:deviceName", "Galaxy A05")
				.amend("platformName", "Android").amend("appium:platformVersion", "11")
				// .amend("appium:platformVersion", "14")
				.amend("appium:udid", "R9YRB0HB9WH").amend("appium:automationName", "UiAutomator2")
				.amend("appium:appPackage", "com.google.android.packageinstaller")
				.amend("appium:appActivity", "io.bramerz.kfc.MainActivity")
				.amend("appium:ensureWebviewsHavePages", true).amend("appium:nativeWebScreenshot", true)
				.amend("appium:newCommandTimeout", 3600).amend("appium:connectHardwareKeyboard", true);

		URL url = new URL("http://127.0.0.1:4723:wd/hub");

		AndroidDriver driver = new AndroidDriver(url, options);
	}

	
}
