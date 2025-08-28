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

public class login_page {

//	JavascriptExecutor js = (JavascriptExecutor) driver;

	By access_to_location = By.xpath(
			"//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']");

	By close_popup_link = By.xpath("//android.widget.Button");

	By menu_icon = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");

	
	// Login Page
	
	By login_link = By
			.xpath("//android.widget.ImageView[@content-desc='KFC 3.2.6']/android.view.View[1]/android.widget.Button");

	By phone_input = By.xpath("//android.widget.EditText");


	By otp_button = By.xpath("//android.widget.Button[@content-desc='Send OTP']");

	By invalid_no_error = By.xpath("//android.view.View[@content-desc='Please Enter Valid Phone Number']");

	By otp_verification_close = By.xpath(
			"//android.view.View[@content-desc='OTP Verification Please enter the OTP sent to you mobile number 01:24 Didn't receive OTP']/android.widget.Button[1]");

	By otp_input = By.xpath("//android.widget.EditText"); // giving error

	By wrong_otp = By.xpath("//android.widget.Toast[@text='OTP is not correct']");

	By expired_otp = By.xpath("");

	By validate_otp_button = By.xpath("//android.widget.Button[@content-desc='Validate OTP']");
	
	By user_name_link = By.xpath("//android.widget.ImageView[@content-desc='Arslan Ali\nNight\nDay']");
	
	By logout_link = By.xpath("//android.widget.Button[@content-desc='Logout']");
	
	By confirm_logout = By.xpath("//android.widget.Button[@content-desc='Yes']");

	
	public WebDriver driver;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	
	public login_page(WebDriver driver) {

		this.driver = driver;

	}
	
	
	public void open_login_page() {


		driver.findElement(menu_icon).click();

		driver.findElement(login_link).click();

	}	
	
	
	public void login(String num, String otp) throws InterruptedException {


		driver.findElement(phone_input).click();

		// WebElement phone_input_field =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(phone_input));
		// phone_input_field.sendKeys(num);

		driver.findElement(phone_input).sendKeys(num);

		driver.findElement(otp_button).click();

		Thread.sleep(7000);

		driver.findElement(otp_input).sendKeys(otp);


	}



	public void invalid_no(String num) throws InterruptedException {


		driver.findElement(menu_icon).click();

		driver.findElement(login_link).click();

		driver.findElement(phone_input).click();

		driver.findElement(phone_input).sendKeys(num);
		
		Thread.sleep(4000);

		driver.findElement(otp_button).click();
		
		Thread.sleep(4000);

		WebElement error_element = driver.findElement(invalid_no_error);

		String actual_error = error_element.getAttribute("content-desc");

		String expected_error = "Please Enter Valid Phone Number";

		Assert.assertEquals(actual_error, expected_error, "Test case failed");

	}

	public void wrong_otp(String num, String otp) throws InterruptedException {


		driver.findElement(menu_icon).click();

		driver.findElement(login_link).click();

		driver.findElement(phone_input).click();

		driver.findElement(phone_input).sendKeys(num);
		
		driver.findElement(otp_button).click();

		driver.findElement(otp_input).sendKeys(otp);

		WebElement wrong_otp_error = driver.findElement(wrong_otp);

		String actual_error = wrong_otp_error.getAttribute("Text");

		String expected_error = "OTP is not correct";

		Assert.assertEquals(actual_error, expected_error, "Test case failed");

	}
	

	public void expired_otp(String num, String otp) throws InterruptedException {


		driver.findElement(menu_icon).click();

		driver.findElement(login_link).click();

		driver.findElement(phone_input).click();

		WebElement phone_input_field = wait.until(ExpectedConditions.visibilityOfElementLocated(phone_input));

		phone_input_field.sendKeys(num);

		driver.findElement(otp_button).click();

		Thread.sleep(92000);

		driver.findElement(otp_input).sendKeys(otp);

		WebElement expired_otp_error = driver.findElement(expired_otp);

		String actual_error = expired_otp_error.getText();

		String expected_error = "";

		assertEquals(actual_error, expected_error, "Test case passed");

	}
	
	
	public void logout(String num, String otp) {


		driver.findElement(menu_icon).click();

		driver.findElement(user_name_link).click();

		driver.findElement(logout_link).click();
		
		driver.findElement(confirm_logout).click();
		

	}


}






