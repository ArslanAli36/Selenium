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

public class my_addresses { 

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	// My Address
	
	
	    By menu_icon = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	
	    By my_addresses = By.xpath("//android.widget.Button[@content-desc='My Addresses']");
	
	    By add_address_button = By.xpath("//android.widget.Button[@content-desc='ADD ADDRESSES']");
	    
	    By update_address_button = By.xpath("//android.widget.Button[@content-desc='Update Address']");
	    
	    By delete_address_1 = By.xpath("//android.view.View[@content-desc='Other\n(DEFAULT) Test House / Test Block  / Test Area\nJamke Cheema, واجدآباد, جامکے روڈ, Punjab']/android.view.View[1]");
	    
	    By edit_address_1 = By.xpath("//android.view.View[@content-desc='Other\n(DEFAULT) Test House / Test Block  / Test Area\nJamke Cheema, واجدآباد, جامکے روڈ, Punjab']/android.view.View[2]");
	    
	    By make_default_1 = By.xpath("//android.view.View[@content-desc='Other\n(DEFAULT) Test House / Test Block  / Test Area\nJamke Cheema, واجدآباد, جامکے روڈ, Punjab']/android.widget.Switch");
	    
	    By delete_address_2 = By.xpath("//android.view.View[@content-desc='Office\nTest / Office  / Address\nJamke Cheema, Punjab']/android.view.View[1]");
	    
	    By edit_address_2 = By.xpath("//android.view.View[@content-desc='Office\nTest / Office  / Address\nJamke Cheema, Punjab']/android.view.View[2]");
	    
	    By make_default_2 = By.xpath("//android.view.View[@content-desc='Home\nTest / Home  / Address\nJamke Cheema, واجدآباد, جامکے روڈ, Punjab']/android.widget.Switch");
	                                  //android.view.View[@content-desc='Home\nTest / Home  / Address\nJamke Cheema, واجدآباد, جامکے روڈ, Punjab']/android.widget.Switch
	    
	    By delete_address_3 = By.xpath("//android.view.View[@content-desc='Other\nEdited House / Edited Block  / Edited Area\nNiaz Baig, Lahore, Punjab']/android.view.View[1]");
	    
	    By edit_address_3 = By.xpath("//android.view.View[@content-desc='Other\nsample / QA  / address\nNiaz Baig, Lahore, Punjab']/android.view.View[2]");
	    
	    By make_default_3 = By.xpath("");

		By address_search_input = By.xpath("//android.widget.EditText"); // Edit it
		
		
		By test_store_dropdown = By.xpath("//android.widget.Button[@content-desc='Store Testing /Rhc Jamke Cheema, Daska, Punjab']");


		By first_dropdown_option = By.xpath("//android.widget.Button[@content-desc='Rhc Jamke Cheema, Daska, Punjab, 3 4 D Good To Go']");


		By house_input = By.xpath(
				"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[2]");

		By block_input = By.xpath(
				"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[3]");

		By main_area_input = By.xpath(
				"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[4]");

		By confirm_location = By.xpath("//android.widget.Button[@content-desc='Confirm Location']");

		By view_bucket = By.xpath("//android.view.View[@content-desc='Rs 310 View Bucket']");
			
		By add_search_input = By.xpath("//android.widget.EditText");
		
		
		By address_first_option = By.xpath("//android.widget.Button[@content-desc='Rhc Jamke Cheema Jamke Punjab, Rhc Jamke Cheema, Jamke, Punjab']");
				
		By home_address = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.RadioButton[1]");
		
		By office_address = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.RadioButton[2]");
		
		By other_address = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.RadioButton[3]");
		                            


	
		public my_addresses(WebDriver driver){

		this.driver = driver;

	    }
		
		public void open_address_page() throws InterruptedException{
			
			driver.findElement(menu_icon).click();
			
			driver.findElement(my_addresses).click();

		}
		
        public void add_address(String search_input, String address_type) throws InterruptedException{
			
			
        	driver.findElement(add_address_button).click();
			
			driver.findElement(address_search_input).click();
			
			driver.findElement(address_search_input).sendKeys(search_input);
			
			Thread.sleep(4000);
			
			driver.findElement(test_store_dropdown).click();
			
			Thread.sleep(4000);
			
			
			if (address_type == "Home") {
				
				driver.findElement(home_address).click();
				
				}
				
				else if (address_type == "Office") {
					
					driver.findElement(office_address).click();
				}
				
				else if (address_type == "Other") {
					
					driver.findElement(other_address).click();
				}
				
			driver.findElement(confirm_location).click();	
					
			driver.findElement(house_input).click();
			
			Thread.sleep(3000);
			
			driver.findElement(house_input).sendKeys("sample");
			
            driver.findElement(block_input).click();
            
            Thread.sleep(3000);
			
			driver.findElement(block_input).sendKeys("QA");
			
            driver.findElement(main_area_input).click();
            
            Thread.sleep(3000);
			
			driver.findElement(main_area_input).sendKeys("address");
			
			driver.findElement(confirm_location).click();
			

		}
        
        
        public void edit_address(String search_input, String address_type) throws InterruptedException{
        	
			
			driver.findElement(edit_address_3).click();
			
			Thread.sleep(4000);
			
	        driver.findElement(address_search_input).click();
			
			driver.findElement(address_search_input).sendKeys(search_input);
			
			Thread.sleep(4000);
			
			driver.findElement(test_store_dropdown).click();
					
			Thread.sleep(4000);
				
			
			if (address_type == "Home") {
				
				driver.findElement(home_address).click();
				
				}
				
			else if (address_type == "Office") {
					
					driver.findElement(office_address).click();
				}
				
			else if (address_type == "Other") {
					
					driver.findElement(other_address).click();
				}
			
					
            driver.findElement(house_input).click();
            
            Thread.sleep(3000);
            
            driver.findElement(house_input).clear();
			
			driver.findElement(house_input).sendKeys("Edited House");
			
            driver.findElement(block_input).click();
            
            Thread.sleep(3000);
            
            driver.findElement(block_input).clear();
			
			driver.findElement(block_input).sendKeys("Edited Block");
			
            driver.findElement(main_area_input).click();
            
            Thread.sleep(3000);
            
            driver.findElement(main_area_input).clear();
			
			driver.findElement(main_area_input).sendKeys("Edited Area");
			
			driver.findElement(update_address_button).click();
			

		}
        
        
        public void verify_edit_address_success() throws InterruptedException{
        	
        	WebElement edit_address_success_popup = driver.findElement(By.xpath("//android.widget.Toast[@text='Address edit successfully']"));

    		String actual_text = edit_address_success_popup.getAttribute("text");

    		String expected_text = "Address edit successfully";

    		Assert.assertEquals(actual_text, expected_text, "Test case failed");
        	
        	
        	
        	
        }
        
        
        public void delete_address(String address_no) throws InterruptedException{
			
			
        	if (address_no == "1") {
        		
        		driver.findElement(delete_address_1).click();
        		
        	}
        	
            if (address_no == "2") {
        		
        		driver.findElement(delete_address_2).click();
        		
        	}
			
            if (address_no == "3") {
        		
        		driver.findElement(delete_address_3).click();
        		
        	}

		}
        
        
        public void set_default(String address_no) throws InterruptedException{
        	
        	
             if (address_no == "1") {
        		
        		driver.findElement(make_default_1).click();
        		
        	}
        	
            if (address_no == "2") {
        		
        		driver.findElement(make_default_2).click();
        		
        	}
			
            if (address_no == "3") {
        		
        		driver.findElement(make_default_3).click();
        		
        	}
			

		}


}








