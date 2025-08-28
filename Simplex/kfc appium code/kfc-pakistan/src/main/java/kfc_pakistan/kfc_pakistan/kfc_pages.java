package kfc_pakistan.kfc_pakistan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.*;
import io.appium.java_client.remote.options.BaseOptions;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.MobileElement;
//import kfc_pakistan.kfc_pakistan.kfc_setup;

public class kfc_pages {

//	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	By access_to_location = By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']");

	By close_popup_link = By.xpath("//android.widget.Button");
	
	By menu_icon = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	By login_link = By
			.xpath("//android.widget.ImageView[@content-desc='KFC 3.2.6']/android.view.View[1]/android.widget.Button");

	By phone_input = By.className("android.widget.EditText"); //
	
	//android.widget.EditText[@text="6857596685"]
	
	By otp_button = By.xpath("//android.widget.Button[@content-desc='Send OTP']");
	
	By otp_verification_close = By.xpath(
			"//android.view.View[@content-desc='OTP Verification Please enter the OTP sent to you mobile number 01:24 Didn't receive OTP']/android.widget.Button[1]");
	
	By otp_input = By.className("android.widget.EditText");
	
	By validate_otp_button = By.xpath("//android.widget.Button[@content-desc='Validate OTP']");
	
	By reorder_button = By.xpath("//android.widget.Button[@content-desc='REORDER']");
	
	By view_all = By.xpath("//android.view.View[@content-desc='VIEW ALL']");
	
	By first_element = By.xpath("(//android.widget.Button[@content-desc='ADD TO BUCKET'])[1]");
	
	By first_element_heart_link = By.xpath("//android.view.View[@content-desc= 'Kfc Krunch Burger Krunch fillet, spicy mayo, lettuce, sandwiched between a sesame seed bun CUSTOMIZE Rs 310']/android.widget.Button[1]");
	
	// Address
	
	By delivery_link = By.xpath("//android.widget.ImageView[@content-desc='Delivery']");
	
	By pick_link = By.xpath("//android.widget.ImageView[@content-desc='Pickup']");
	
	By channel_popup_close = By.xpath("//android.widget.Button");
	
	By address_input = By.xpath("//android.widget.EditText"); // giving error
	
	//android.widget.EditText[@text="6857596685"]
	
	By first_dropdown_option = By.xpath(
			"//android.widget.Button[@content-desc='Rhc Jamke Cheema Jamke Punjab, Rhc Jamke Cheema, Jamke, Punjab']");
	
	By confirm_location = By.xpath("//android.widget.Button[@content-desc='Confirm Location']");
	
	By house_input = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[2]");
	
	By block_input = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[3]");
	
	By main_area_input = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[4]");
	
	// By confirm_location = By.xpath("//android.widget.Button[@content-desc='Confirm Location']")
 
	By view_bucket = By.xpath("//android.view.View[@content-desc='Rs 310 View Bucket']");
	
	// Cart
	
	By delete_item = By.xpath("//android.view.View[@content-desc='Krunch Burger Kfc (Krunch Burger) Rs 310 1']/android.view.View[1]");
		
	By increase_item = By.xpath("//android.view.View[@content-desc='Krunch Burger Kfc (Krunch Burger) Rs 310 1']/android.view.View[2]");
		
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
	
	//Payment Method
	
	By select_payment_mode = By.xpath("//android.widget.Button[@content-desc='SELECT PAYMENT MODE']");
	
	By payment_mode_close = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button");
	
	By cash_payment = By.xpath("//android.widget.ImageView[@content-desc='Cash Payment']");
	
	By online_payment = By.xpath("//android.widget.ImageView[@content-desc='Online Payment']");
	
	By jazz_cash_payment = By.xpath("//android.widget.ImageView[@content-desc='Jazz Cash Wallet']");
	
	By another_phone_radio = By.xpath("//android.view.View[@content-desc='Another Phone Number']");
	
	By phone_input_field = By.className("//android.view.View");
	
	By card_payment = By.xpath("//android.widget.ImageView[@content-desc='Card On Delivery']");
	
	By proceed_button = By.xpath("//android.widget.Button[@content-desc='PROCEED']");
	
	By back_button = By.xpath("//android.widget.Button[@content-desc='BACK']");
	
	By confirm_payment_mode_close = By.xpath("//android.view.View[@content-desc='Confirm Payment Mode Are you sure you want to continue with Card On Delivery ?']/android.widget.Button[1]");
	
	By confirm_payment_mode_yes = By.xpath("//android.widget.Button[@content-desc='No']");
	
	By confirm_payment_mode_no = By.xpath("//android.widget.Button[@content-desc='Yes']");
	
	By success_message = By.className("android.view.View");
	
	By track_order = By.xpath("//android.widget.Button[@content-desc='TRACK ORDER']");
	
	
	// Track Order page
	
	By phone_number = By.className("android.widget.EditText");
	
	By order_id = By.className("android.widget.EditText");
	
	By track_order_button = By.className("//android.widget.Button[@content-desc='Track Order']");
	
	By order_details = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[2]");
	
	By previous_screen_link = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
	
	
	public AndroidDriver driver;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public kfc_pages(AndroidDriver driver) {

		this.driver = driver;

	}

	
	public void close_popup() {

		// driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		System.out.println("Inside close popup function");
		
		WebElement location_link = wait.until(ExpectedConditions.visibilityOfElementLocated(access_to_location));
		
		location_link.click();
		
		WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button")));

		button.click();
		
	}

//	public void login(String num, String OTP) {
		
		public void login() {	
		

		System.out.println("Inside login function");
		
		WebElement location_link = wait.until(ExpectedConditions.visibilityOfElementLocated(access_to_location));
		
		location_link.click();
		
		WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button")));

		button.click();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver.findElement(access_to_location).click();
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver.findElement(close_popup_link).click();
		
		driver.findElement(menu_icon).click();

		driver.findElement(login_link).click();
		
		
		driver.findElement(phone_input).click();
		
	//	WebElement editText = driver.findElement(By.className("android.widget.EditText"));
		
	//	editText.sendKeys("3144209707");
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.findElement(phone_input).sendKeys("3144209707");
		
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
		
	//	js.executeScript("document.getElementsByClassName('android.widget.EditText')[0].setAttribute('text', '3144209707')");
		
		//android.widget.EditText[@text="6857596685"]
		
		driver.findElement(otp_button).click();

	//	js.executeScript("document.getElementsByClassName('android.widget.EditText')[0].setAttribute('text', '0707')");
		
	
		driver.findElement(otp_input).click();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		driver.findElement(otp_input).sendKeys("0707");
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		driver.findElement(validate_otp_button).click();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

	}

	public void add_to_bucket() {

		System.out.println("inside add to bucket function");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(access_to_location).click();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		driver.findElement(close_popup_link).click();
		
		driver.findElement(view_all).click();
		
		driver.findElement(first_element).click();
		
		driver.findElement(delivery_link).click();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		driver.findElement(address_input).sendKeys("Rhc Jamke cheema Daska"); // Giving error
		
	//	js.executeScript("document.getElementsByClassName('android.widget.EditText')[0].setAttribute('text', 'Rhc Jamke cheema Daska')");
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		driver.findElement(first_dropdown_option).click();
		
		driver.findElement(confirm_location).click();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		driver.findElement(house_input).click();
		
		driver.findElement(house_input).sendKeys("Test House");
		
		driver.findElement(block_input).sendKeys("Test Block");
		
		driver.findElement(main_area_input).sendKeys("Test Area");
		
		driver.findElement(confirm_location).click();
		
		
		
		
		
		

	}

}