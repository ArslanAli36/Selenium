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
import io.appium.java_client.*;
//import io.appium.java_client.MobileBy;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class careers_page { 

//	WebDriver driver;
	
	AppiumDriver driver;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	// My Address
	
	    By menu_icon = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	
        By explore_menu = By.xpath("//android.widget.Button[@content-desc='Explore Menu']");
		
		By about_us = By.xpath("//android.widget.Button[@content-desc='About Us']");
		
		By feedback_link = By.xpath("//android.widget.Button[@content-desc='Feedback']");
		
		By terms_conditions = By.xpath("//android.widget.Button[@content-desc='Terms & Conditions']");
		
		By privacy_policy = By.xpath("//android.widget.Button[@content-desc='Privacy Policy']");
		
		By contact_us = By.xpath("//android.widget.Button[@content-desc='Contact Us']");
		
		By mitao_bhook = By.xpath("//android.widget.Button[@content-desc='Mitao Bhook']");
	    
	    
	    By careers_link = By.xpath("//android.widget.Button[@content-desc='Careers']");
	
	    By name_input = By.xpath("//android.widget.ScrollView/android.widget.EditText[1]");
	    
	    By dob_input = By.xpath("//android.view.View[@text='06/05/2025']");
	    
	    By country_input_1 = By.xpath("//android.widget.EditText[@text='Pakistan']"); 
	    
	    By city_input_1 = By.xpath("//android.widget.ScrollView/android.widget.EditText[3]");
	    
	    By cnic_input = By.xpath("//android.widget.ScrollView/android.widget.EditText[4]");
	    
	    By cnic_expiry_input = By.xpath("//android.view.View[@text='06/16/2025']");
	    
	    By martial_status_input = By.xpath("//android.widget.Button[@content-desc='Status']");
	    
	    By martial_status_single = By.xpath("//android.widget.Button[@content-desc='Single']");
	    
	    By martial_status_married = By.xpath("//android.widget.Button[@content-desc='Married']");
	    
	    
	    By gender_input = By.xpath("//android.widget.Button[@content-desc='Gender']");
	    
	    By gender_input_male = By.xpath("//android.widget.Button[@content-desc='Male']");
	    
	    By gender_input_female = By.xpath("//android.widget.Button[@content-desc='Female']");
	    
	    By gender_input_other = By.xpath("//android.widget.Button[@content-desc='Other']");
	    
	    
	    By religion_input = By.xpath("//android.widget.ScrollView/android.widget.EditText[5]"); // error
	    
	    By disability_input = By.xpath("//android.widget.ScrollView/android.widget.EditText[6]"); // error
	    
	    By phone_input = By.xpath("//android.widget.ScrollView/android.widget.EditText[7]");
	    
	    By address_input = By.xpath("//android.widget.ScrollView/android.widget.EditText[8]");
	    
        By country_input_2 = By.xpath("//android.widget.EditText[@text='Pakistan']"); 

        By state_input = By.xpath("//android.widget.ScrollView/android.widget.EditText[10]");
	    
	    By city_input_2 = By.xpath("//android.widget.ScrollView/android.widget.EditText[11]"); 
	    
	    By referral_input = By.xpath("//android.widget.ScrollView/android.widget.EditText[12]");
	    
	    By job_city_input = By.xpath("//android.widget.ScrollView/android.widget.EditText[13]");
	    
	    By job_position_input = By.xpath("//android.widget.ScrollView/android.widget.EditText[14]");
	    
	    By job_shift_input = By.xpath("//android.widget.ScrollView/android.widget.EditText[15]");
	    
	    By employment_type_input = By.xpath("//android.widget.ScrollView/android.widget.EditText[16]");
	    
	    By degree_input = By.xpath("//android.widget.ScrollView/android.widget.EditText[17]");
	    
	    By major_input = By.xpath("//android.widget.ScrollView/android.widget.EditText[18]");
	    
	    By qualification_year = By.xpath("//android.widget.ScrollView/android.widget.EditText[19]");
	    
	    By place_of_tuition = By.xpath("//android.widget.ScrollView/android.widget.EditText[20]");
	    
	    By total_experience = By.xpath("//android.widget.ScrollView/android.widget.EditText[21]");
	    
	    By recent_position = By.xpath("//android.widget.ScrollView/android.widget.EditText[22]");
	    
	    By recent_company = By.xpath("//android.widget.ScrollView/android.widget.EditText[23]");
	    
	    By agree_checkbox = By.xpath("//android.widget.CheckBox");
	    
	    By apply_button = By.xpath("//android.widget.Button[@content-desc='APPLY']");
	    
	    By user_already_applied_popup = By.xpath("");
	    
	    
	
		public careers_page(AppiumDriver driver){

		this.driver = driver;

	    }
		
		
        public void open_careers_page() throws InterruptedException{
			
			driver.findElement(menu_icon).click();
			
			Thread.sleep(3000);

			
	        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.View\").instance(8)).scrollIntoView(new UiSelector().description(\"Careers\"))"));
	
           //  new UiSelector().className(\"android.view.View\").instance(8);

           //  new UiSelector().description(\"Careers\")
	
 	       Thread.sleep(3000);
	
	       driver.findElement(careers_link).click();
		 
}

		
		public void submit_careers_form() throws InterruptedException{
			
			
	        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollIntoView(new UiSelector().className(\"android.widget.EditText\").instance(0))"));

	        // new UiSelector().className(\"android.widget.ScrollView\")
	        // new UiSelector().className(\"android.widget.EditText\").instance(0)
	        
			driver.findElement(name_input).click();	
			
			driver.findElement(name_input).sendKeys("Sample User");
			
		//	driver.findElement(dob_input).click();
			
		//	driver.findElement(dob_input).sendKeys("");
			
        //  driver.findElement(country_input_1).click();
			
		//	driver.findElement(country_input_1).clear();
			
		//	driver.findElement(country_input_1).sendKeys();
			
            driver.findElement(city_input_1).click();
			
			driver.findElement(city_input_1).sendKeys("Lahore");
			
            driver.findElement(cnic_input).click();
			
			driver.findElement(cnic_input).sendKeys("3520290786751");
			
      //    driver.findElement(cnic_expiry_input).click();
			
	 //		driver.findElement(cnic_expiry_input).sendKeys("");
			
			Thread.sleep(4000);
			
            driver.findElement(martial_status_input).click();
			
            driver.findElement(martial_status_single).click();
			
            driver.findElement(gender_input).click();
			
			driver.findElement(gender_input_male).click();
			
            driver.findElement(religion_input).click(); // issue
			
			driver.findElement(religion_input).sendKeys("Islam");
			
            driver.findElement(disability_input).click();
			
			driver.findElement(disability_input).sendKeys("None");
			
            driver.findElement(phone_input).click();
			
			driver.findElement(phone_input).sendKeys("3334341835");
			
            driver.findElement(address_input).click();
			
			driver.findElement(address_input).sendKeys("7-A Tech Society");
			
      //    driver.findElement(country_input_2).click();
			
	//		driver.findElement(country_input_2).clear();
			
	//		driver.findElement(country_input_2).sendKeys("");
			
            driver.findElement(state_input).click();
			
			driver.findElement(state_input).sendKeys("Punjab");
			
            driver.findElement(city_input_2).click();
			
			driver.findElement(city_input_2).sendKeys("Lahore");
			
            driver.findElement(referral_input).click();
			
			driver.findElement(referral_input).sendKeys("Sample Referral");
			
            driver.findElement(job_city_input).click();
			
			driver.findElement(job_city_input).sendKeys("Lahore");
			
            driver.findElement(job_position_input).click();
			
			driver.findElement(job_position_input).sendKeys("Chef");
			
            driver.findElement(job_shift_input).click();
			
			driver.findElement(job_shift_input).sendKeys("Day");
			
            driver.findElement(employment_type_input).click();
			
			driver.findElement(employment_type_input).sendKeys("Sample QA");
			
            driver.findElement(degree_input).click();
			
			driver.findElement(degree_input).sendKeys("Bachelor");
			
            driver.findElement(major_input).click();
			
			driver.findElement(major_input).sendKeys("Commerce");
			
            driver.findElement(qualification_year).click();
			
			driver.findElement(qualification_year).sendKeys("2023");
			
            driver.findElement(place_of_tuition).click();
			
			driver.findElement(place_of_tuition).sendKeys("Sample College");
			
            driver.findElement(total_experience).click();
			
			driver.findElement(total_experience).sendKeys("3");
			
            driver.findElement(recent_position).click();
			
			driver.findElement(recent_position).sendKeys("Chef");
			
            driver.findElement(recent_company).click();
			
			driver.findElement(recent_company).sendKeys("Sample company");
			
            driver.findElement(agree_checkbox).click();
			
            driver.findElement(apply_button).click();
            
		}
		
    
	public void verify_success_message() throws InterruptedException{
			
	
//    	WebElement popup_message = driver.findElement();
//
//		String actual_message = popup_message.getAttribute("");
//
//		String expected_message = "";
//
//		Assert.assertEquals(actual_message, expected_message, "Test case failed");
			
     }
		
    
	public void verify_user_already_exist_message() throws InterruptedException{
		
//    	WebElement popup_message = driver.findElement();
//
//		String actual_message = popup_message.getAttribute("");
//
//		String expected_message = "";
//
//		Assert.assertEquals(actual_message, expected_message, "Test case failed");
		
    }	
		
		
}








