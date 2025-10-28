package kfc_pakistan.kfc_pakistan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class home_page {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	// Home page

		By reorder_button = By.xpath("//android.widget.Button[@content-desc='REORDER']");

		By view_all = By.xpath("//android.view.View[@content-desc='VIEW ALL']");
		
		By menu_icon = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
		
		By cart_icon = By.xpath("");
		
		

		By first_item_add = By.xpath("(//android.widget.Button[@content-desc='ADD TO BUCKET'])[1]");

		By first_item_like = By.xpath(
				"//android.view.View[@content-desc= 'Kfc Krunch Burger Krunch fillet, spicy mayo, lettuce, sandwiched between a sesame seed bun CUSTOMIZE Rs 310']/android.widget.Button[1]");

		By my_favorites = By.xpath("//android.widget.Button[@content-desc='My Favorites']");
		
		By my_addresses = By.xpath("//android.widget.Button[@content-desc='My Addresses']");
		
		By my_orders = By.xpath("//android.widget.Button[@content-desc='My Orders']");
		
		By store_locator = By.xpath("//android.widget.Button[@content-desc='Store Locator']");
		
		By track_order = By.xpath("//android.widget.Button[@content-desc='Track Order']");
		
		By explore_menu = By.xpath("//android.widget.Button[@content-desc='Explore Menu']");
		
		By about_us = By.xpath("//android.widget.Button[@content-desc='About Us']");
		
		By feedback_link = By.xpath("//android.widget.Button[@content-desc='Feedback']");
		
		By terms_conditions = By.xpath("//android.widget.Button[@content-desc='Terms & Conditions']");
		
		By privacy_policy = By.xpath("//android.widget.Button[@content-desc='Privacy Policy']");
		
		
		

	public home_page(WebDriver driver) {

		this.driver = driver;

	}
	
	
	public void cart_icon_click(){

        driver.findElement(cart_icon).click();
		
  
	}
	
	public void explore_menu_click(){

        driver.findElement(explore_menu).click();
		
  
	}
	
	public void my_favorites_page(){

        driver.findElement(my_favorites).click();
		
  
	}
	
	

	
}