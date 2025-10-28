package tour27.tour27;
import java.net.URL;
import java.util.List;
import java.util.function.Function;
import java.net.MalformedURLException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.*;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//import org.testng.annotations.*;
//import Pages.tour27_pages;
//import Pages.tour27_tours;
//import Pages.tour27_menu;
//import Pages.tour27_schedules;
//import Pages.tour27_messages;

public class tour27_test {
	
	
//	WebDriver driver;
	static AndroidDriver driver;
//	static AppiumDriver<MobileElement> driver;
	
	
public static void main(String[] args) throws Exception{
		
		try {
			open_tour27();
		}
		
		catch(Exception exp ){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	
}
    public static void open_tour27() throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();
    
        cap.setCapability("deviceName", "Galaxy A05");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "14");
        cap.setCapability("appPackage", "com.tour27"); // Apk info app)
        cap.setCapability("appActivity","com.tour27.MainActivity"); // Apk info app)
        cap.setCapability("noReset", "false");
        cap.setCapability("udid","R9VX30004XZ");
        cap.setCapability("browserName","chrome");
     //   caps.setCapability("NEW_COMMAND_TIMEOUT", 60);
            cap.setCapability("automationName", "UiAutomator2");
        //   caps.setCapability("project", "");
        //   caps.setCapability("build", "");
        //   caps.setCapability("name", "first_test");

       URL url = new URL("http://127.0.0.1:4723/wd/hub");
  
       // driver = new AppiumDriver<MobileElement>(url, cap);
       
       AndroidDriver driver = new AndroidDriver(url, cap);
        
        System.out.println("Application started...");

//    tour27_pages tour27_object = new tour27_pages(driver);
//    tour27_object.setCountry("Pakistan");
//    tour27_object.setPhoneNumber("03281427144");
//    tour27_object.setPassword("Yakman@15");
//    tour27_object.click_login();
 // tour27_pages.f_password();
 // tour27_pages.signup();


//    driver.quit();

    }
    
}
	
