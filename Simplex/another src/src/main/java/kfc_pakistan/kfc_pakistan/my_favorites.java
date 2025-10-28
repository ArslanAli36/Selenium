package kfc_pakistan.kfc_pakistan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class my_favorites { 

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	By menu_icon = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	
	By my_favorites = By.xpath("//android.widget.Button[@content-desc='My Favorites']");
	
	By explore_menu_link = By.xpath("//android.widget.Button[@content-desc=\"EXPLORE MENU\"]");
	
	By first_item_heart = By.xpath("//android.view.View[@content-desc='Kfc\nKrunch Burger\nKrunch fillet, spicy mayo, lettuce, sandwiched between a sesame seed bun\nCUSTOMIZE\nRs 310']/android.widget.Button[1]");
	
	By second_item_heart = By.xpath("//android.view.View[@content-desc=\"Kfc\r\n"
			+ "Garlic Mayo Zingeratha\r\n"
			+ "Crispy boneless strips, sliced onions, and creamy garlic mayo wrapped in a soft paratha\r\n"
			+ "CUSTOMIZE\r\n"
			+ "Rs 390\"]/android.widget.Button[1]");
	
	By third_item_heart = By.xpath("//android.widget.ImageView[@content-desc=\"Zingeratha\r\n"
			+ "Tender boneless strips, sliced onions, tangy imli chutney, mint mayo, wrapped in a soft paratha\r\n"
			+ "CUSTOMIZE\r\n"
			+ "Rs 390\"]/android.widget.Button[1]");
	
	By fourth_item_heart = By.xpath("//android.widget.ImageView[@content-desc=\"Rice & Spice\r\n"
			+ "Spiced and buttery rice with 6 pcs of Hot Shots topped with our signature Vietnamese sauce\r\n"
			+ "CUSTOMIZE\r\n"
			+ "Rs 399\"]/android.widget.Button[1]");
	
	By item_added_to_favorites = By.xpath("//android.widget.Toast[@text=\"Item added to favorites.\"]");
	
    By first_item_popup = By.xpath("//android.widget.ImageView[@content-desc=\"Rice & Spice\r\n"
    		+ "Spiced and buttery rice with 6 pcs of Hot Shots topped with our signature Vietnamese sauce\r\n"
    		+ "CUSTOMIZE\r\n"
    		+ "399\"]");
	
	By second_item_popup = By.xpath("//android.widget.ImageView[@content-desc=\"Zingeratha\r\n"
			+ "Tender boneless strips, sliced onions, tangy imli chutney, mint mayo, wrapped in a soft paratha\r\n"
			+ "CUSTOMIZE\r\n"
			+ "390\"]");
	
    By first_item_name = By.xpath("");
	
	By second_item_name = By.xpath("");
	
	By third_item_name = By.xpath("");
	
	By first_item_remove = By.xpath("//android.view.View[@content-desc='Krunch Burger\nKrunch fillet, spicy mayo, lettuce, sandwiched between a sesame seed bun\nCUSTOMIZE\n310\nKfc']/android.view.View");
	
	By second_item_remove = By.xpath("");
	
	By third_item_remove = By.xpath("");
	
	By fourth_item_remove = By.xpath("");
	
	By back_link = By.xpath("//android.widget.Button");
	

	
		public my_favorites(WebDriver driver){

		     this.driver = driver;

	    }
		
		public void my_favorites_page(){
				
			driver.findElement(menu_icon).click();
			
	        driver.findElement(my_favorites).click();
			
		}
		
		
        public void add_to_favorites(){
			
	        driver.findElement(first_item_heart).click();
			
		}
        
        
        public void remove_from_favorites(){
			
			driver.findElement(first_item_remove).click();
			
		}
        
        public void back_link_click(){
			
			driver.findElement(back_link).click();
			
			driver.findElement(my_favorites).click();
			
			
		}
		


}