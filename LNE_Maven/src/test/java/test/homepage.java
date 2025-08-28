package Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import Pages.LNE_homepage;
import Pages.LNE_login;


public class homepage {
	@Test
	
    public static void main(String[] args) {
	   
	    String driverPath = "C:\\Users\\ABCD\\chromedriver_win\\chromedriver.exe";
	    
	    System.setProperty("webdriver.chrome.driver", driverPath);
	    
	    WebDriver driver= new ChromeDriver();
	    
	    
	    
	//    LNE_login objLogin;

	    LNE_homepage objHomePage;
	    
	    objHomePage = new LNE_homepage(driver);  // Create Home page object

	    
	    try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	   
	//    System.out.println("here");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://lne21-git-master-nse.vercel.app/");

        driver.manage().window().maximize();
        
    //    objHomePage.black_link();
        objHomePage.close_strip();
        objHomePage.move_right();
        objHomePage.move_left();
     
    }
    
    
}
    
