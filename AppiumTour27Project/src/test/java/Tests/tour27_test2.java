package Tests;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.List;
import java.util.function.Function;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.*;
//import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
import Pages.tour27_pages;
import Pages.tour27_login;
import Pages.tour27_tours;
import Pages.tour27_menu;
import Pages.tour27_schedules;
import Pages.tour27_messages;

public class tour27_test2 {

	
	static AndroidDriver driver;

	public static void main(String[] args) throws Exception{

		try {
			open_tour27();
		}

		catch(Exception exp ){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}

	}

	public static void open_tour27() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("appium:deviceName", "Galaxy A05");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:platformVersion", "14");
		cap.setCapability("appium:udid", "R9VX30004XZ");
		cap.setCapability("appium:automationName", "UiAutomator2");
		cap.setCapability("appium:appPackage", "com.tour27");
		cap.setCapability("appium:appActivity", "com.tour27.MainActivity");
		cap.setCapability("appium:ensureWebviewsHavePages", true);
		cap.setCapability("appium:nativeWebScreenshot", true);
		cap.setCapability("appium:newCommandTimeout", 3600);
		cap.setCapability("appium:connectHardwareKeyboard", true);
		cap.setCapability("appium:disableWindowAnimation", true);

		// chatgpt solution
//		Runtime.getRuntime().exec("adb shell settings put global window_animation_scale 0");
//		Runtime.getRuntime().exec("adb shell settings put global transition_animation_scale 0");
//		Runtime.getRuntime().exec("adb shell settings put global animator_duration_scale 0");
//
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login_button_id")));
//		loginButton.click();
		
		URL url = new URL("http://127.0.0.1:4723/");


		AndroidDriver driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Application started...");	 

		tour27_pages tour27_object = new tour27_pages(driver);
		tour27_tours tours_object = new tour27_tours(driver);
		tour27_schedules schedule_object = new tour27_schedules(driver);
		tour27_menu menu_object = new tour27_menu(driver);
		tour27_messages messages_object = new tour27_messages(driver);
		tour27_login login_object = new tour27_login(driver);
		login_object.login("Australia", "0450364907", "Yakman@15");
		messages_object.messages_tab();
		messages_object.send_message("Awais Tourist", "QA testing on 17 mar 2025" );
		driver.close();
		tour27_object.notification_permission();
	
		//	tour27_object.setCountry("Pakistan");
		tour27_object.setPhoneNumber("0450364907");
		tour27_object.setPassword("Yakman@15");
		tour27_object.go_live();
		tour27_object.click_login();
		//	tour27_object.forgot_password("0450364907");
		//	tour27_object.sign_up("0450364907");
		tour27_object.start();
		//	 tour27_object.f_password();
		//	 tour27_object.signup();

		tour27_object.view_account();
		tour27_object.create_tour("Test title","Test landmark","20","Test description");
	//	tour27_object.create_schedule("3", "20");
		tour27_object.send_message("QA testing by Arslan Ali");
		tour27_object.logout();


	}

}

