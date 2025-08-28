package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import Pages.LNE_magazines;


public class magazines_cart {
@Test

	public void main() {
		// TODO Auto-generated method stub
    
		String driverPath = "C:\\Users\\ABCD\\chromedriver_win\\chromedriver.exe";
	    
	    System.setProperty("webdriver.chrome.driver", driverPath);
	    
	    WebDriver driver;
	    
	    driver = new ChromeDriver();
	   
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    driver.get("https://lne21-git-master-nse.vercel.app"); 
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    

	    LNE_magazines objMag;

	    // Create Login Page object

	    objMag = new LNE_magazines(driver);
	    
	    objMag.selectMagazines();
	    
	    
	    
	    objMag.select_published_magazines();
	    
	  //  objMag.selectSubscribe();
	    
	    objMag.selectTab("The New Aesthetics");
	    
	    try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	    js.executeScript("window.scrollBy(0,520)");
	    
	    objMag.selectYear(driver, "2022");
	    
	    try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	 //   objMag.view_magazine();
	    
	 //   objMag.selectFormat(driver, "Digital");
	    
	    objMag.add_to_cart();
	    
	  //  objMag.continue_shopping();
	    
	    objMag.see_basket();
	   
	    try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	    js.executeScript("window.scrollBy(0,400)");
	    
	  //  objMag.delete_cart_item();
	    
	  
	  //  objMag.change_quantity("3");
	    
	  //  objMag.promo_code("123456");
	    
	  //  objMag.promo_apply();
	   
	    try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	      objMag.validate_basket();
	    
	    
	
	}

}





