package kfc_pakistan.kfc_pakistan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class logout { 

	WebDriver driver;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	
	    By menu_icon = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	
	    By user_name = By.xpath("//android.widget.ImageView[@content-desc='Arslan Ali\nNight\nDay']");
	    
	    By logout_link = By.xpath("//android.widget.Button[@content-desc='Logout']");
	    
	    By verification_popup_close = By.xpath("//android.view.View[@content-desc='Log Out Are You Sure?']/android.widget.Button[1]");
	    
	    By logout_yes = By.xpath("//android.widget.Button[@content-desc='Yes']");
	    
	    By logout_no = By.xpath("//android.widget.Button[@content-desc='No']");
	    
	    By user_name_login_text = By.xpath("//android.widget.Button[@content-desc='Login to unlock exclusive\nOffers and Discounts\nNight\nDay']");
	

	
		public logout(WebDriver driver){

		this.driver = driver;

	    }
		
		
		public void logout_user() throws InterruptedException{
			
			driver.findElement(menu_icon).click();
			
			Thread.sleep(4000);
			
			driver.findElement(user_name).click();
			
			driver.findElement(logout_link).click();
			
			driver.findElement(logout_yes).click();
		

		}
		
  
        public void verify_logout_success() throws InterruptedException{   // assert the user name login text
			
			driver.findElement(menu_icon).click();
			
			Thread.sleep(4000);
		
	    	WebElement login_text = driver.findElement(user_name_login_text);
			
			String actual_text = login_text.getAttribute("content-desc");
			
			String expected_text = "Login to unlock exclusive\r\n"
					+ "Offers and Discounts\r\n"
					+ "Night\r\n"
					+ "Day";
			
			Assert.assertEquals(actual_text, expected_text, "User is still logged in!");

		}
        
   

}








