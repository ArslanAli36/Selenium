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


public class Test_5 {

	@Test
	public void main() {

    String driverPath = "C:\\Users\\ABCD\\chromedriver_win\\chromedriver.exe";
    
    System.setProperty("webdriver.chrome.driver", driverPath);
    
    WebDriver driver;
    
    driver = new ChromeDriver();
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    
 //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("https://lne21-git-master-nse.vercel.app/auth/connexion");
 
    driver.manage().window().maximize();
    
    js.executeScript("window.scrollBy(0,400)");
  
//    try {
//		Thread.sleep(12000);
//	} catch (InterruptedException e) {
//		
//		e.printStackTrace();
//	}
   
    WebElement user_email = driver.findElement(By.xpath("//*[@id=\"clientType-tabpane-connexion\"]/div/div/form/div[1]/div[1]/input"));
	user_email.sendKeys("arslanapple27+1@gmail.com");
    
   
	}

}

