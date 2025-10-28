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

public class select_channel_popup {

	WebDriver driver;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	// Channel popup
	
	By channel_popup_close = By.xpath("//android.widget.Button");

	// Delivery

	By delivery_link = By.xpath("//android.widget.ImageView[@content-desc='Delivery']");

	By first_option = By.xpath(
			"//android.widget.RadioButton[@content-desc='other\nTest House/Test Block/Test Area/Jamke Cheema, واجدآباد, جامکے روڈ, Punjab']");

	By second_option = By
			.xpath("//android.widget.RadioButton[@content-desc='office\nTest/Office/Address/Jamke Cheema, Punjab']");

	By third_option = By.xpath(
			"//android.widget.RadioButton[@content-desc='home\nTest/Home/Address/Jamke Cheema, واجدآباد, جامکے روڈ, Punjab']");

	By add_another_address = By.xpath("//android.widget.Button[@content-desc='+ ADD ANOTHER ADDRESS']");

	By start_your_order = By.xpath("//android.widget.Button[@content-desc='START YOUR ORDER']");

	By select_location_popup_close = By.xpath(
			"//android.view.View[@content-desc='Dismiss']/android.view.View/android.view.View/android.view.View/android.widget.Button[1]");

	// Delivery without login

	
	By search_address = By.xpath("//android.widget.EditText");
	
	By first_suggestion = By.xpath("//android.widget.Button[@content-desc='Rhc Jamke Cheema Jamke Punjab, Rhc Jamke Cheema, Jamke, Punjab']");

	By confirm_location = By.xpath("//android.widget.Button[@content-desc='Confirm Location']");
	
	

	By house_input = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[2]");

	By house_input_text = By.xpath("//android.widget.ScrollView/android.widget.EditText[2]");
	
	By block_input = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[3]");

	By block_input_text = By.xpath("//android.widget.ScrollView/android.widget.EditText[3]");
	
	By area_input = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[4]");

	 By area_input_text = By.xpath("//android.widget.ScrollView/android.widget.EditText[4]");
	
	// Pickup

	By pickup_link = By.xpath("//android.widget.ImageView[@content-desc='Pickup']");

	By pickup_link_input = By.xpath("//android.widget.EditText");

//	By pickup_link = By.xpath("// android.widget.Button[@content-desc='Rhc Jamke Cheema Jamke Punjab, Rhc Jamke Cheema, Jamke, Punjab']");

	By store_name = By.xpath("//android.widget.EditText[@text='Kfc']");

	By test_store = By.xpath("//android.view.View[@content-desc='KFC Store\nLahore\n8:00 AM - 7:55 AM\nDistance to store:  Km']");
	
	By first_store = By.xpath("//android.view.View[@content-desc='Millennium Mall W428+F5M, Gulistan-e-Johar, Karachi, Karachi City, Sindh, Pakistan 12:00 PM - 3:00 AM Distance to store:  Km']");

	By second_store = By.xpath("//android.view.View[@content-desc='Malir Cantt\nMalir Cantonment, Karachi, Karachi City, Sindh, Pakistan\n12:00 PM - 12:30 AM\nDistance to store:  Km']");
	
	By third_store = By.xpath("//android.view.View[@content-desc='Johar town Expo\n403-404 J block Main boulevard Johar town Near Expo Center Lahore\n12:00 PM - 3:00 AM\nDistance to store: 1.53 Km']");
	
	By fourth_store = By.xpath("//android.view.View[@content-desc='Emporium Mall Lahore\nFood Court Emporium Mall Johar Town Lahore\n5:00 PM - 11:00 PM\nDistance to store: 1.84 Km']");	
	
	By fifth_store = By.xpath("//android.view.View[@content-desc='Thoker Niaz Baig\n14KM Multan road Near Metro Cash & Carry\n12:00 PM - 3:00 AM\nDistance to store: 1.92 Km']");
	
	By store_close_popup = By.xpath("");
	
	
	////////////////////////////////////////////////////////////////////////////////////////////

	public select_channel_popup(WebDriver driver) {

		this.driver = driver;

	}
	
	
	// is_displayed()
	
	// if len() > 0:

	public void select_delivery() throws InterruptedException {

		driver.findElement(delivery_link).click();

		Thread.sleep(5000);

		driver.findElement(first_option).click();

		driver.findElement(start_your_order).click();

	}

	public void select_pickup() throws InterruptedException {

		driver.findElement(pickup_link).click();

		
////		driver.findElement(pickup_link_input).click();
		
////		driver.findElement(pickup_link_input).sendKeys("kfc");
		
//		Thread.sleep(5000);
		
//		WebElement element_1 = driver.findElement(test_store);
//		
//		WebElement element_2 = driver.findElement(first_store);
//		
//		WebElement element_3 = driver.findElement(second_store);
		
//		WebElement element_4 = driver.findElement(third_store);
		
		WebElement element_5 = driver.findElement(fourth_store);
		element_5.click();

//		WebElement element_6 = driver.findElement(fifth_store);
		
//		if (element_1.isDisplayed()) { element_1.click();}
//		else if (element_2.isDisplayed()) { element_2.click();}			
//		else if (element_3.isDisplayed()) { element_3.click();}	
//		if (element_4.isDisplayed()) { element_4.click();}	
//		else if (element_5.isDisplayed()) { element_5.click();}	
//		else if (element_6.isDisplayed()) { element_6.click();}	
		
		driver.findElement(start_your_order).click();

	}

	public void new_location() throws InterruptedException { // add location without login
		
	//	WebDriver driver;
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(delivery_link).click();
		Thread.sleep(5000);
		driver.findElement(search_address).click();	
		driver.findElement(search_address).sendKeys("Rhc Jamke Cheema");
		driver.findElement(first_suggestion).click();
		driver.findElement(confirm_location).click();
		Thread.sleep(5000);
		driver.findElement(house_input).click();
		driver.findElement(house_input_text).sendKeys("Test House");
		Thread.sleep(5000);
		driver.findElement(block_input_text).click();
		Thread.sleep(4000);
		driver.findElement(block_input_text).sendKeys("Test Block");
		Thread.sleep(4000);
		// click hide keyboard popup manually
		
		driver.findElement(area_input).click();
		
		// click hide keyboard popup manually
		Thread.sleep(5000);
		driver.findElement(area_input).sendKeys("Test Area");
		Thread.sleep(5000);
		driver.findElement(confirm_location).click();

	}

	public void select_pickup_without_login() throws InterruptedException { // without login

		driver.findElement(pickup_link).click();

		Thread.sleep(5000);

//		driver.findElement(store_name).sendKeys("KFC");

//		WebElement element_1 = driver.findElement(test_store);
//		
		WebElement element_2 = driver.findElement(first_store);
		
		element_2.click();
//		
//		WebElement element_3 = driver.findElement(second_store);
		
//		WebElement element_4 = driver.findElement(third_store);
//		
//		WebElement element_5 = driver.findElement(fourth_store);
//		
//		WebElement element_6 = driver.findElement(fifth_store);
		
//		if (element_1.isDisplayed()) { element_1.click();}
//		else if (element_2.isDisplayed()) { element_2.click();}			
//		else if (element_3.isDisplayed()) { element_3.click();}	
//		if (element_4.isDisplayed()) { element_4.click();}	
//		else if (element_5.isDisplayed()) { element_5.click();}	
//		else if (element_6.isDisplayed()) { element_6.click();}	

		driver.findElement(start_your_order).click();

	}
	
	
	public void add_another_address(String search_input, String house, String block, String area) throws InterruptedException { // Purchase item with new address while Logged in

		
		driver.findElement(delivery_link).click();
		
		driver.findElement(add_another_address).click();
		
		driver.findElement(search_address).click();  // verify locator
		
		driver.findElement(search_address).sendKeys(search_input);
		
		driver.findElement(first_suggestion).click();
		
		driver.findElement(confirm_location).click();
		
		driver.findElement(house_input).click();
		
		driver.findElement(house_input).sendKeys(house);
		
		driver.findElement(block_input_text).click();
		
		driver.findElement(block_input_text).sendKeys(block);
		
		driver.findElement(area_input).click();
		
		driver.findElement(area_input_text).sendKeys(area);
		
		driver.findElement(confirm_location).click();
		
		
	}
	
	
	public void store_close_popup() throws InterruptedException { 

		driver.findElement(store_close_popup);

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
