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

public class menu_page {
	
	
    WebDriver driver;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	

	By access_to_location = By.xpath(
			"//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']");

	By close_popup_link = By.xpath("//android.widget.Button");

	By menu_icon = By.xpath(
			"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");

	By user_name = By.xpath("//android.widget.ImageView[@content-desc='Arslan Ali\nNight\nDay']");
	
	By explore_menu = By.xpath("//android.widget.Button[@content-desc='Explore Menu']");

	By first_item_add = By.xpath("(//android.widget.Button[@content-desc='ADD TO BUCKET'])[1]");

	By first_item_like = By.xpath(
			"//android.view.View[@content-desc='Kfc Krunch Burger Krunch fillet, spicy mayo, lettuce, sandwiched between a sesame seed bun CUSTOMIZE Rs 310']/android.widget.Button[1]");

	
	
	By first_item_popup = By.xpath("//android.view.View[@content-desc='Kfc\nKrunch Burger\nKrunch fillet, spicy mayo, lettuce, sandwiched between a sesame seed bun\nCUSTOMIZE\nRs 310']");
	
	By popup_scroll = By.xpath("//android.widget.ScrollView");
	
	By choose_an_option = By.xpath("//android.widget.RadioButton");
	
	
	By drinks_section = By.xpath("//android.view.View[@content-desc='Drink Optional']");
	
	By add_drink_1 = By.xpath("(//android.widget.Button[@content-desc='ADD'])[1]");
	
	By add_drink_2 = By.xpath("(//android.widget.Button[@content-desc='ADD'])[2]");
	
	By add_drink_3 = By.xpath("(//android.widget.Button[@content-desc='ADD'])[3]");

	
	By adds_on_section = By.xpath("//android.view.View[@content-desc='Add Ons Optional']");
	
	By add_adds_on_1 = By.xpath("(//android.widget.Button[@content-desc='ADD'])[5]"); // error
	
	By add_adds_on_2 = By.xpath("(//android.widget.Button[@content-desc='ADD'])[6]");
	
	By add_adds_on_3 = By.xpath("(//android.widget.Button[@content-desc='ADD'])[7]");
	
	By add_adds_on_4 = By.xpath("(//android.widget.Button[@content-desc='ADD'])[8]");
	
	By increase_quantity = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button[2]");
	
	By quantity_value = By.xpath("//android.view.View[@content-desc='1']"); // content-desc value will change according to quantity

	
	By decrease_quantity = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button[1]");
	
	By add_to_bucket_800 = By.xpath("//android.view.View[@content-desc='Rs 800\nADD TO BUCKET']");
	
	
	By second_item_add = By.xpath("(//android.widget.Button[@content-desc='ADD TO BUCKET'])[2]");

	By second_item_like = By.xpath("//android.view.View[@content-desc='Kfc Garlic Mayo Zingeratha Crispy boneless strips, sliced onions, and creamy garlic mayo wrapped in a soft paratha CUSTOMIZE Rs 390']/android.widget.Button[1]");
	
	By second_item_popup = By.xpath("//android.view.View[@content-desc='Kfc Garlic Mayo Zingeratha Crispy boneless strips, sliced onions, and creamy garlic mayo wrapped in a soft paratha CUSTOMIZE Rs 390']");	
	
	By cart_success = By.xpath("//android.widget.Toast[@text='Item added to cart.']");
	
	By view_bucket_310 = By.xpath("//android.view.View[@content-desc='Rs 310\nView Bucket']");
	
	
	
	By view_bucket_800 = By.xpath("//android.view.View[@content-desc='Rs 800\nView Bucket']");
	
	By checkout_link_361 = By.xpath("//android.view.View[@content-desc='Rs 361\nCheckout']");
	
	By checkout_link_800 = By.xpath("//android.view.View[@content-desc='Rs 800\nCheckout']");
	
	By select_payment_mode = By.xpath("//android.widget.Button[@content-desc='SELECT PAYMENT MODE']");
	
	By cash_payment = By.xpath("//android.widget.ImageView[@content-desc='Cash Payment']");
	
	By cash_yes = By.xpath("//android.widget.Button[@content-desc='Yes']");
	
	By cash_no = By.xpath("//android.widget.Button[@content-desc='No']");
	
	By proceed_link = By.xpath("//android.widget.Button[@content-desc='PROCEED']");
	
	
	public menu_page(WebDriver driver){

		this.driver = driver;

	}
	
   public void open_menu_page() throws InterruptedException{
		
		driver.findElement(menu_icon).click();
		
		driver.findElement(explore_menu).click();

	}
	
	
	
	
	public void add_to_bucket() throws InterruptedException {
		
		driver.findElement(menu_icon).click();
		driver.findElement(explore_menu).click();
		Thread.sleep(5000);
		driver.findElement(first_item_add).click();
		
	}
	
	
   public void item_popup_add() throws InterruptedException {
			
		driver.findElement(first_item_popup).click();
		
		driver.findElement(add_drink_1).click();
		
		// WebElement Element = driver.findElement(By.xpath("(//android.widget.Button[@content-desc='ADD'])[5]"));	
		// xpath = //android.widget.ScrollView
		// js.executeScript("arguments[0].scrollIntoView();", Element);
		// js.executeScript("window.scrollBy(0,350)", "");
		// driver.findElement(add_adds_on_1).click(); // error coming scroll issue
		
		driver.findElement(increase_quantity).click();
		
		driver.findElement(add_to_bucket_800).click();  // add_to_bucket locator has fixed xpath
		
		
	}
   
   
   public void select_drink() throws InterruptedException {
	   
	   
       driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.View\").instance(8)).scrollIntoView(new UiSelector().description(\"Careers\"))"));

//	   driver.findElement().click();
		
	}
   
  
   public void select_add_on() throws InterruptedException {
	   
	   
       driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.View\").instance(8)).scrollIntoView(new UiSelector().description(\"Careers\"))"));
	
//	   driver.findElement().click();
		
	}
   
   public void set_quantity() throws InterruptedException {
		
		
	    WebElement item_quantity = driver.findElement(quantity_value);
	    
	    
	   
	    driver.findElement(increase_quantity).click();
		
		driver.findElement(decrease_quantity).click();
		
		
		
	}
    
    
   public void verify_popup_msg() throws InterruptedException {
    	  	 
    	Assert.assertEquals("", cart_success, "Assertion Failed");
  		
  	}
    
    
   public void view_bucket_link_800() throws InterruptedException {
   	
   	driver.findElement(view_bucket_800).click();
 		
 	}
   
    
    public void view_bucket_link_310() throws InterruptedException {
    	
    	driver.findElement(view_bucket_310).click();
  		
  	}
    
    

	
}







