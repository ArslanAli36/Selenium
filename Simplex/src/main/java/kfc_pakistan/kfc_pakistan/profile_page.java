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

public class profile_page {
	

//	JavascriptExecutor js = (JavascriptExecutor) driver;

	By access_to_location = By.xpath(
			"//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']");

	By close_popup_link = By.xpath("//android.widget.Button");

	
	// Side bar menu
	
	By menu_icon = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");


	By user_name = By.xpath("//android.widget.ImageView[@content-desc='Arslan Ali\nNight\nDay']");

	//android.widget.ImageView[@content-desc='KFC 3.2.6']/android.view.View[1]/android.widget.Button;


	
	// My Profile
	
	By edit_profile = By.xpath("//android.view.View[@content-desc='Edit Profile']");

	By my_favorites = By.xpath("//android.widget.Button[@content-desc='My Favorites']");

	By my_addresses = By.xpath("//android.widget.Button[@content-desc='My Addresses']");

	By my_orders = By.xpath("//android.widget.Button[@content-desc='My Orders']");

	By my_cards = By.xpath("//android.widget.Button[@content-desc='My Cards']");

	By logout_link = By.xpath("//android.widget.Button[@content-desc='Logout']");
	
	
	// Profile page
	
	By profile_pic = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView");
			
	By first_name = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");

	By first_name_new = By
			.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.EditText[1]");

	By first_name_error = By.xpath("//android.view.View[@content-desc='First Name is required']");

	By last_name = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");

	By last_name_error = By.xpath("//android.view.View[@content-desc='Last Name is required']");

	By phone_no = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]");

	By phone_error = By.xpath("//android.view.View[@content-desc='Please Enter Valid Phone Number']");

	By email_address = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[4]");

	By email_required_error = By.xpath("//android.view.View[@content-desc='Email is required']");

	By email_format_error = By.xpath("//android.view.View[@content-desc='Enter a valid email address']");
	
	By gender_dropdown = By.xpath("//android.view.View[@text='Male']");
	
	By gender_popup_close = By.xpath("//android.view.View[@content-desc='Select Gender']/android.widget.Button");

	By date_of_birth = By.xpath("//android.view.View[@text='07/02/1988']");

	By save_button = By.xpath("//android.widget.Button[@content-desc='Save']");
	
	By back_link = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

	
	
	public AndroidDriver driver;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	
	public profile_page(AndroidDriver driver) {

		this.driver = driver;

	}

	public void open_profile_page() {

		driver.findElement(menu_icon).click();

		driver.findElement(user_name).click();
		
		driver.findElement(edit_profile).click();
		
	}
	
	
	
	public void profile_required_fields_checks() throws InterruptedException {

		Thread.sleep(4000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Actions action = new Actions(driver);

		WebElement profile_image = driver.findElement(By.xpath(
				"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView"));

		// android.widget.FrameLayout[@resource-id="android:id/content"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView

		WebElement first_name_edit = driver.findElement(By.xpath("//android.widget.EditText[@text='Arslan']"));

		WebElement last_name_edit = driver.findElement(By.xpath("//android.widget.EditText[@text='Ali']"));

		WebElement phone_no_edit = driver.findElement(By.xpath("//android.widget.EditText[@text='3144209707']"));

		WebElement email_edit = driver.findElement(By.xpath("//android.widget.EditText[@text='arslanapple27@gmail.com']"));

		WebElement gender_edit = driver.findElement(By.xpath("//android.view.View[@text='Male']"));		

//		WebElement dob_edit = driver.findElement(By.xpath("//android.view.View[@text='07/02/1988']"));
		
//		WebElement save_profile_button = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Save']"));

		first_name_edit.click();

		first_name_edit.clear();

		last_name_edit.click();

		last_name_edit.clear();

		phone_no_edit.click();

		phone_no_edit.clear();

		email_edit.click();

		email_edit.clear();
		
		gender_edit.click();
		
		driver.findElement(gender_popup_close).click();

		driver.findElement(save_button).click();
		
		Thread.sleep(5000);

		WebElement first_name_error_text = driver.findElement(first_name_error);
		String actual_error_1 = first_name_error_text.getAttribute("content-desc");
		String expected_error_1 = "First Name is required";
		Assert.assertEquals(actual_error_1, expected_error_1, "Test Case Failed");
		
		WebElement last_name_error_text = driver.findElement(last_name_error);
		String actual_error_2 = last_name_error_text.getAttribute("content-desc");
		String expected_error_2 = "Last Name is required";
		Assert.assertEquals(actual_error_2, expected_error_2, "Test Case Failed");
		
		WebElement phone_error_text = driver.findElement(phone_error);
		String actual_error_3 = phone_error_text.getAttribute("content-desc");
		String expected_error_3 = "Please Enter Valid Phone Number";
		Assert.assertEquals(actual_error_3, expected_error_3, "Test Case Failed");
		
		WebElement email_error_text = driver.findElement(email_required_error);
		String actual_error_4 = email_error_text.getAttribute("content-desc");
		String expected_error_4 = "Email is required";
		Assert.assertEquals(actual_error_4, expected_error_4, "Test Case Failed");

	}
	

	public void valid_phone_check(String num) {

		
		WebElement phone_field = driver.findElement(By.xpath("//android.widget.EditText[@text='3144209707']"));
		
		phone_field.click();

		phone_field.clear();

		phone_field.sendKeys(num);
		
		driver.findElement(gender_dropdown).click(); // these commands are used for hiding the phone popup keyboard
		
		driver.findElement(gender_popup_close).click();

		driver.findElement(save_button).click();

		WebElement phone_error_text = driver.findElement(phone_error);

		String actual_error = phone_error_text.getAttribute("content-desc");

		String expected_error = "Please Enter Valid Phone Number";

		assertEquals(actual_error, expected_error, "Test Case Failed");

	}
	

	public void valid_email_check(String email) throws InterruptedException {
		
		WebElement email_field = driver.findElement(By.xpath("//android.widget.EditText[@text='arslanapple27@gmail.com']"));
		
		email_field.click();

		email_field.clear();

		email_field.sendKeys(email);
		
        driver.findElement(gender_dropdown).click(); // these commands are used for hiding the phone popup keyboard
		
		driver.findElement(gender_popup_close).click();

		driver.findElement(save_button).click();

		WebElement email_error = driver.findElement(email_format_error);

		String actual_error = email_error.getAttribute("content-desc");

		String expected_error = "Enter a valid email address";

		assertEquals(actual_error, expected_error, "Test Case Failed");
		
		Thread.sleep(3000);
		
		driver.findElement(back_link).click();
		
		driver.findElement(edit_profile).click();
		
	}
	
	
    public void profile_pic_check() {
		
		
		WebElement profile_pic_input = driver.findElement(profile_pic);
		
		profile_pic_input.click();
		
		WebElement picture_file = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb'][1]"));

		// //android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb'][1]
		// //android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb'][3]
		picture_file.click();
		
		// driver.findElement(save_button).click();
		
		
		
  }
	
}






