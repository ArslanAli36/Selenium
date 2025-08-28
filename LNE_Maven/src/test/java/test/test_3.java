package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String driverPath = "D:\\eclipse\\geckodriver-v0.30.0-win64\\geckodriver.exe";
	    
	    System.setProperty("webdriver.gecko.driver", driverPath);
	    
	    WebDriver driver;
	    
	    driver = new FirefoxDriver();

	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    driver.get("https://lne21-git-master-nse.vercel.app");
	    driver.manage().window().maximize();
	  //  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     js.executeScript("window.scrollBy(0,1000)");
	    
	    WebElement element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[1]/nav/div/div/div[2]/a"));
	    element.click();
	}

}
