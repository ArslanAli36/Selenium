package Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.LNE_homepage;
import Pages.LNE_signup;


public class signup {

@Test
	
public static void main(String[] args) {
	
	

    String driverPath = "C:\\Users\\ABCD\\chromedriver_win\\chromedriver.exe";
    
    System.setProperty("webdriver.chrome.driver", driverPath);
    
    WebDriver driver;
    
    driver = new ChromeDriver();
  
//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    JavascriptExecutor js = (JavascriptExecutor) driver;
    
    driver.get("https://lne21-git-master-nse.vercel.app"); 
    
    driver.manage().window().maximize();
    

    LNE_signup objSignup;

    LNE_homepage objHomePage; 

    
    
    
    objHomePage = new LNE_homepage(driver);  // Create Home page object

    
    try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
    
    
    objHomePage.user_header();  // click on user icon on home page header  // see line 136 of LNE_homepage.java file
    
   
    try {
		Thread.sleep(15000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
    
    objSignup = new LNE_signup(driver);       // Create Login Page object
    
    objSignup.clickSignup();   // see line 250 of LNE_signup.java file
    
    try {
		Thread.sleep(12000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
    
    js.executeScript("window.scrollBy(0,400)");
    
    try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}

    objSignup.signupToLNE("arslanapple27+7@gmail.com","arslanapple27+7@gmail.com" ,"Arslanali123@", "Arslanali123@");

    // Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
     
      
      try {
  		Thread.sleep(7000);
  	} catch (InterruptedException e) {
  		
  		e.printStackTrace();
  	}
      
      objSignup.select_gender("male");  
      objSignup.last_name("Ali");
      objSignup.first_name("Arslan");
      objSignup.date_of_birth("07021988");
      objSignup.field_activity(driver, "Spa");
      objSignup.select_function(driver, "Spa Manager");
      objSignup.main_activity(driver, "Spa urbain");
      objSignup.receive_articles_offers("104");
   // js.executeScript("window.scrollBy(0,400)");
      objSignup.my_interests("27");
      js.executeScript("window.scrollBy(0,300)");
      
      try {
  		Thread.sleep(3000);
  	} catch (InterruptedException e) {
  		
  		e.printStackTrace();
  	}
            
      objSignup.click_chase();
      
      try {
    		Thread.sleep(5000);
    	} catch (InterruptedException e) {
    		
    		e.printStackTrace();
    	}
      
 //   objSignup.delivery_checkbox();
 //   objSignup.delivery_company_name("Edraak");
 //   objSignup.delivery_company_tva("Edraak");
 //   objSignup.delivery_last_name("Ali");
 //   objSignup.delivery_first_name("Arslan");
  //  objSignup.delivery_gender("male");
      objSignup.delivery_address1("7-A tech society");
      objSignup.delivery_address2("canal bank");
      objSignup.delivery_code("54200");
      objSignup.delivery_city("Lahore");
      objSignup.delivery_country(driver, "Pakistan");
      objSignup.delivery_country_code(driver, "Pakistan");
      objSignup.delivery_phone("3334341835");
 //   objSignup.click_delivery_fact();
      
 //   objSignup.billing_checkbox();
 //   objSignup.billing_company_name("Edraak");
 //   objSignup.billing_company_tva("Edraak");
      objSignup.billing_last_name("Ali");
      objSignup.billing_first_name("Arslan");
 //   objSignup.billing_gender("male");
      objSignup.billing_address1("7-A tech society");
      objSignup.billing_address2("canal bank");
      objSignup.billing_code("54200");
      objSignup.billing_city("Lahore");
      objSignup.billing_country(driver, "Pakistan");
      objSignup.billing_country_code(driver, "Pakistan");
      objSignup.billing_phone("3334341835");
      
      js.executeScript("window.scrollBy(0,300)");
      
      try {
  		Thread.sleep(5000);
  	} catch (InterruptedException e) {
  		
  		e.printStackTrace();
  	}
      
      objSignup.click_to_receive();
      objSignup.click_account();
      objSignup.click_vaildate();
      
      js.executeScript("window.scroll(0,-700)");
      
}

}























