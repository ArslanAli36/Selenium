package Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test_4 {

	@Test
	public void main() {

    String driverPath = "C:\\Users\\ABCD\\chromedriver_win\\chromedriver.exe";
    
    System.setProperty("webdriver.chrome.driver", driverPath);
    
    WebDriver driver;
    
    driver = new ChromeDriver();
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("https://lne21-git-master-nse.vercel.app/");
 
    driver.manage().window().maximize();
  
    try {
		Thread.sleep(12000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
 //   WebElement user_icon = driver.findElement(By.id("Calque_1")); // nothing happens
 //   WebElement user_icon = driver.findElement(By.className("loginIcon")); // nothing happens
    
      WebElement user_icon = driver.findElement(By.cssSelector("svg#Calque_1.loginIcon"));
  
      user_icon.click();
   
	}

}

