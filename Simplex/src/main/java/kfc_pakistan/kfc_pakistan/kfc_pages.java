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

public class kfc_pages {

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

	
	
	// Profile Page

	By user_name = By.xpath("//android.widget.ImageView[@content-desc='Arslan Ali\nNight\nDay']");

	// android.widget.ImageView[@content-desc='KFC
	// 3.2.6']/android.view.View[1]/android.widget.Button");

	// elementId= 00000000-0000-086b-0000-000a00000004

	By edit_profile = By.xpath("//android.view.View[@content-desc='Edit Profile']");

	
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

	By my_favorites = By.xpath("//android.widget.Button[@content-desc='My Favorites']");

	By my_addresses = By.xpath("//android.widget.Button[@content-desc='My Addresses']");

	By my_orders = By.xpath("//android.widget.Button[@content-desc='My Orders']");

	By my_cards = By.xpath("//android.widget.Button[@content-desc='My Cards']");

	By logout_link = By.xpath("//android.widget.Button[@content-desc='Logout']");

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	// Home page

	By reorder_button = By.xpath("//android.widget.Button[@content-desc='REORDER']");

	By view_all = By.xpath("//android.view.View[@content-desc='VIEW ALL']");

	By first_item_add = By.xpath("(//android.widget.Button[@content-desc='ADD TO BUCKET'])[1]");

	By first_item_like = By.xpath(
			"//android.view.View[@content-desc= 'Kfc Krunch Burger Krunch fillet, spicy mayo, lettuce, sandwiched between a sesame seed bun CUSTOMIZE Rs 310']/android.widget.Button[1]");

//	By my_favorites = By.xpath("//android.widget.Button[@content-desc='My Favorites']");
	
//	By my_addresses = By.xpath("//android.widget.Button[@content-desc='My Addresses']");
	
//	By my_orders = By.xpath("//android.widget.Button[@content-desc='My Orders']");
	
	By store_locator = By.xpath("//android.widget.Button[@content-desc='Store Locator']");
	
//	By track_order = By.xpath("//android.widget.Button[@content-desc='Track Order']");
	
	By explore_menu = By.xpath("//android.widget.Button[@content-desc='Explore Menu']");
	
	By about_us = By.xpath("//android.widget.Button[@content-desc='About Us']");
	
	By feedback_link = By.xpath("//android.widget.Button[@content-desc='Feedback']");
	
	By terms_conditions = By.xpath("//android.widget.Button[@content-desc='Terms & Conditions']");
	
	By privacy_policy = By.xpath("//android.widget.Button[@content-desc='Privacy Policy']");
	
	
	
	// Address

	By delivery_link = By.xpath("//android.widget.ImageView[@content-desc='Delivery']");

	By pickup_link = By.xpath("//android.widget.ImageView[@content-desc='Pickup']");
	
	By pickup_search = By.xpath("//android.widget.EditText");
	
	
	By johar_town_option = By.xpath("//android.view.View[@content-desc='Johar town Expo\n403-404 J block Main boulevard Johar town Near Expo Center Lahore\n12:00 PM - 3:00 AM\nDistance to store: 1.54 Km']");
	
	By emporium_mall_option = By.xpath("//android.view.View[@content-desc='Emporium Mall Lahore\nFood Court Emporium Mall Johar Town Lahore\n5:00 PM - 11:00 PM\nDistance to store: 1.84 Km']");
	
	By thokar_option = By.xpath("//android.view.View[@content-desc='Thoker Niaz Baig\n14KM Multan road Near Metro Cash & Carry\n12:00 PM - 3:00 AM\nDistance to store: 1.92 Km']");
	
	
	By kfc_option = By.xpath("//android.view.View[@content-desc='KFC Store Lahore 8:00 AM - 7:55 AM Distance to store: 13.15 Km']");
	
	By pickup_close = By.xpath("//android.widget.EditText/android.widget.Button[1]");
	
	By start_order = By.xpath("//android.widget.Button[@content-desc='START YOUR ORDER']");

	
	By channel_popup_close = By.xpath("//android.widget.Button");

	By address_input = By.xpath("//android.widget.EditText"); // Edit it


	By first_dropdown_option = By.xpath("//android.widget.Button[@content-desc='Rhc Jamke Cheema, Daska, Punjab, 3 4 D Good To Go']");


	By house_input = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[2]");

	By block_input = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[3]");

	By main_area_input = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[4]");

	By confirm_location = By.xpath("//android.widget.Button[@content-desc='Confirm Location']");

	By view_bucket = By.xpath("//android.view.View[@content-desc='Rs 310 View Bucket']");

	
	// Cart

	By delete_item = By.xpath(
			"//android.view.View[@content-desc='Krunch Burger Kfc (Krunch Burger) Rs 310 1']/android.view.View[1]");

	By increase_item = By.xpath(
			"//android.view.View[@content-desc='Krunch Burger Kfc (Krunch Burger) Rs 310 1']/android.view.View[2]");

	By delivery_instr = By.xpath("//android.widget.ScrollView/android.widget.EditText[1]");

	By alt_number = By.xpath("//android.widget.ScrollView/android.widget.EditText[2]");

	By explore_menu_link = By.xpath("//android.view.View[@content-desc='Explore Menu Add more items in your bucket']");

	By sales_text = By.xpath("//android.view.View[@content-desc='Rs 40']");

	By delivery_fee = By.xpath("//android.view.View[@content-desc='Rs 50']");

	By total_bill = By.xpath("//android.view.View[@content-desc='Rs 360']");

	By donate_now_1 = By.xpath("(//android.widget.Button[@content-desc='Donate Now'])[1]");

	By donate_now_2 = By.xpath("(//android.widget.Button[@content-desc='Donate Now'])[2]");

	By donation_amount = By.xpath("//android.widget.EditText");

	By donate_now_3 = By.xpath("(//android.widget.Button[@content-desc='Donate Now'])[3]");

	By also_like_1 = By.xpath("(//android.widget.Button[@content-desc='ADD TO BUCKET'])[1]");

	By also_like_2 = By.xpath("(//android.widget.Button[@content-desc='ADD TO BUCKET'])[2]");

	By also_like_3 = By.xpath("(//android.widget.Button[@content-desc='ADD TO BUCKET'])[3]");

	By check_out_link = By.xpath("//android.view.View[@content-desc= 'Rs 360 Checkout']");

	
	// Payment Methods

	By select_payment_mode = By.xpath("//android.widget.Button[@content-desc='SELECT PAYMENT MODE']");

	By payment_mode_close = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button");

	By cash_payment = By.xpath("//android.widget.ImageView[@content-desc='Cash Payment']");

	By online_payment = By.xpath("//android.widget.ImageView[@content-desc='Online Payment']");

	By jazz_cash_payment = By.xpath("//android.widget.ImageView[@content-desc='Jazz Cash Wallet']");

	By another_phone_radio = By.xpath("//android.view.View[@content-desc='Another Phone Number']");

	By phone_input_field = By.className("//android.view.View");

	By card_payment = By.xpath("//android.widget.ImageView[@content-desc='Card On Delivery']");

	By proceed_button = By.xpath("//android.widget.Button[@content-desc='PROCEED']");

	By back_button = By.xpath("//android.widget.Button[@content-desc='BACK']");

	By confirm_payment_mode_close = By.xpath(
			"//android.view.View[@content-desc='Confirm Payment Mode Are you sure you want to continue with Card On Delivery ?']/android.widget.Button[1]");

	By confirm_payment_mode_yes = By.xpath("//android.widget.Button[@content-desc='No']");

	By confirm_payment_mode_no = By.xpath("//android.widget.Button[@content-desc='Yes']");

	By success_message = By.className("android.view.View");

	By track_order = By.xpath("//android.widget.Button[@content-desc='TRACK ORDER']");
	
	
	// Online Payment form
	
	By card_number = By.xpath("");
	
	By expiry_month = By.xpath("");
	
	By expiry_year = By.xpath("");
	
	By card_cvc = By.xpath("");
	
	By make_payment = By.xpath("");
	
	
	// Jazz cash payment form
	
	// Card on Delivery payment
	
	// Track Order page

	By phone_number = By.className("android.widget.EditText"); // Edit it

	By order_id = By.className("android.widget.EditText"); // Edit it

	// By track_order_button = By.className("//android.widget.Button[@content-desc='Track Order']"); // Edit it

	By order_details = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[2]");

	By previous_screen_link = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	
	public AndroidDriver driver;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public kfc_pages(AndroidDriver driver) {

		this.driver = driver;

	}

	public void close_popup() {

		// driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		System.out.println("Inside close popup function");

		WebElement location_link = wait.until(ExpectedConditions.visibilityOfElementLocated(access_to_location));

		location_link.click();

		WebElement button = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button")));

		button.click();

	}

	//

	public void invalid_no(String num) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement location_link = wait.until(ExpectedConditions.visibilityOfElementLocated(access_to_location));

		location_link.click();

		WebElement popup_close = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button")));

		popup_close.click();

		driver.findElement(menu_icon).click();

		driver.findElement(login_link).click();

		driver.findElement(phone_input).click();

		WebElement phone_input_field = wait.until(ExpectedConditions.visibilityOfElementLocated(phone_input));

		phone_input_field.sendKeys(num);

		driver.findElement(otp_button).click();

		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// WebElement error_element =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(invalid_no_error));

		WebElement error_element = driver.findElement(invalid_no_error);

		String actual_error = error_element.getAttribute("content-desc");

		String expected_error = "Please Enter Valid Phone Number";

		Assert.assertEquals(actual_error, expected_error, "Test case failed");

	}

	public void wrong_otp(String num, String otp) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement location_link = wait.until(ExpectedConditions.visibilityOfElementLocated(access_to_location));

		location_link.click();

		WebElement popup_close = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button")));

		popup_close.click();

		driver.findElement(menu_icon).click();

		driver.findElement(login_link).click();

		driver.findElement(phone_input).click();

		WebElement phone_input_field = wait.until(ExpectedConditions.visibilityOfElementLocated(phone_input));

		phone_input_field.sendKeys(num);

		driver.findElement(otp_button).click();

		WebElement otp_input_field = wait.until(ExpectedConditions.visibilityOfElementLocated(otp_input));

		otp_input_field.sendKeys(otp);

		WebElement wrong_otp_error = driver.findElement(wrong_otp);

		String actual_error = wrong_otp_error.getAttribute("Text");

		String expected_error = "OTP is not correct";

		Assert.assertEquals(actual_error, expected_error, "Test case failed");

	}

	public void expired_otp(String num, String otp) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement location_link = wait.until(ExpectedConditions.visibilityOfElementLocated(access_to_location));

		location_link.click();

		WebElement popup_close = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button")));

		popup_close.click();

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

	public void login(String num, String otp) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// System.out.println("Inside login function");

		WebElement location_link = wait.until(ExpectedConditions.visibilityOfElementLocated(access_to_location));

		location_link.click();

		WebElement popup_close = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button")));

		popup_close.click();

		driver.findElement(menu_icon).click();

		driver.findElement(login_link).click();

		driver.findElement(phone_input).click();

		// WebElement phone_input_field =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(phone_input));

		// phone_input_field.sendKeys(num);

		driver.findElement(phone_input).sendKeys(num);

		driver.findElement(otp_button).click();

		Thread.sleep(4000);

		driver.findElement(otp_input).sendKeys(otp);

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}
	

	public void profile_required_fields_checks() throws InterruptedException {

		Thread.sleep(4000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Actions action = new Actions(driver);

		// action.moveToElement().click().perform();

		// action.doubleClick().perform();

		driver.findElement(menu_icon).click();

		Thread.sleep(5000);

		driver.findElement(user_name).click();

		driver.findElement(edit_profile).click();
//		Thread.sleep(5000);

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

		driver.findElement(menu_icon).click();

		driver.findElement(user_name).click();
		
		driver.findElement(edit_profile).click();
		
		WebElement phone_field = driver.findElement(By.xpath("//android.widget.EditText[@text='3144209707']"));
		
		phone_field.click();

		phone_field.clear();

		phone_field.sendKeys(num);
		
		driver.findElement(gender_dropdown).click();
		
		driver.findElement(gender_popup_close).click();

		driver.findElement(save_button).click();

		WebElement phone_error_text = driver.findElement(phone_error);

		String actual_error = phone_error_text.getAttribute("content-desc");

		String expected_error = "Please Enter Valid Phone Number";

		assertEquals(actual_error, expected_error, "Test Case Failed");

	}
	

	public void valid_email_check(String email) {
		

		driver.findElement(menu_icon).click();

		driver.findElement(user_name).click();
		
		driver.findElement(edit_profile).click();
		
		WebElement email_field = driver.findElement(By.xpath("//android.widget.EditText[@text='arslanapple27@gmail.com']"));
		
		email_field.click();

		email_field.clear();

		email_field.sendKeys(email);
		
        driver.findElement(gender_dropdown).click();
		
		driver.findElement(gender_popup_close).click();

		driver.findElement(save_button).click();

		WebElement email_error = driver.findElement(email_format_error);

		String actual_error = email_error.getAttribute("content-desc");

		String expected_error = "Enter a valid email address";

		assertEquals(actual_error, expected_error, "Test Case Failed");
		
	}
	
	
    public void profile_pic_check() {
		

		driver.findElement(menu_icon).click();

		driver.findElement(user_name).click();
		
		driver.findElement(edit_profile).click();
		
		WebElement profile_pic_input = driver.findElement(profile_pic);
		
		profile_pic_input.click();
		
		WebElement picture_file = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb'][1]"));

		// //android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb'][1]
		// //android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb'][3]
		picture_file.click();
		
		// driver.findElement(save_button).click();
		
		
		
}
	
    public void purchase_item() throws InterruptedException {  // After login, happy journey



		driver.findElement(view_all).click();

		driver.findElement(first_item_add).click();;

		driver.findElement(view_bucket).click();
		
		driver.findElement(check_out_link).click();
		
		driver.findElement(select_payment_mode).click();
		
		driver.findElement(online_payment).click();
		
	//	driver.findElement(jazz_cash_payment).click();
			
    }
    
	
	public void add_to_bucket() {


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement location_link = wait.until(ExpectedConditions.visibilityOfElementLocated(access_to_location));

		location_link.click();

		WebElement popup_close = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button")));

		popup_close.click();

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.findElement(view_all).click();

		driver.findElement(first_item_add).click();

		driver.findElement(delivery_link).click();

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.findElement(address_input).click();

		driver.findElement(address_input).sendKeys("Rhc Jamke cheema Daska"); // Giving error

		// js.executeScript("document.getElementsByClassName('android.widget.EditText')[0].setAttribute('text',
		// 'Rhc Jamke cheema Daska')");

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		// WebElement first_suggestion =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(first_dropdown_option));

		// first_suggestion.click();

		driver.findElement(first_dropdown_option).click();

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.findElement(confirm_location).click();

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.findElement(house_input).click();

		driver.findElement(house_input).sendKeys("Test House");

		// driver.findElement(block_input).click();

		// driver.findElement(block_input).sendKeys("Test Block");

		// driver.findElement(main_area_input).click();

		// driver.findElement(main_area_input).sendKeys("Test Area");

		// driver.findElement(confirm_location).click();

	}
	
	
	public void pickup_flow() throws InterruptedException {


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement location_link = wait.until(ExpectedConditions.visibilityOfElementLocated(access_to_location));

		location_link.click();

		WebElement popup_close = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button")));

		popup_close.click();
		
		driver.findElement(pickup_link).click();
		
		Thread.sleep(7000);
		
	//	JavascriptExecutor js = (JavascriptExecutor) driver;	
	//	js.executeScript("document.getElementsByClassName('android.widget.EditText')[0].setAttribute('text', 'Kfc')");
	//	js.executeScript("new UiSelector().className('android.widget.EditText').setAttribute('text', 'Kfc')");

		driver.findElement(johar_town_option).click();
		
	//	driver.findElement(emporium_mall_option).click();
		
	//	driver.findElement(thokar_option).click();
		
		driver.findElement(start_order).click();

	}
	
	
	public void item_popup() throws InterruptedException {
		
		
		
		
	}
	


}






