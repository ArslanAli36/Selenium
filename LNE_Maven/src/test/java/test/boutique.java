package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import Pages.LNE_boutique;


public class boutique {

	public static void main(String[] args) {
	
	  String driverPath = "C:\\Users\\ABCD\\geckodriver-v0.30.0-win64\\geckodriver.exe";
	
      System.setProperty("webdriver.gecko.driver", driverPath);
    
      WebDriver driver;
    
      driver = new FirefoxDriver();
      
      JavascriptExecutor js = (JavascriptExecutor) driver;
    
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("https://lne21-git-master-nse.vercel.app/");
      
      driver.manage().window().maximize();

      LNE_boutique objBoutique;

      objBoutique = new LNE_boutique(driver);
      
      objBoutique.selectBoutique();
      
      objBoutique.selectDvds();
      
     // objBoutique.selectBooks();
      
   //   objBoutique.selectCategory(driver, "cd");
      
  //    objBoutique.selectTheme(driver, "37");     //  1, 27, 17, 22, 36, 37, 6, 38, 14, 15, 41, 39, 40
      
  //    objBoutique.sortBy(driver, "newest");
    
       js.executeScript("window.scrollBy(0,700)");
       
       try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
      
        objBoutique.selectFormat(driver, "42");  //  19, 42, 4, 15
      
     //  System.out.println(objBoutique.itemName());
           
      
     //  objBoutique.selectCart();
      
     //  objBoutique.extract();
      
     
      
    }

}




