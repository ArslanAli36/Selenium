// 1. Scroll the page Top to bottom and assert the logo.

package Assignment;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll_logo {

	public static void main(String[] args) throws InterruptedException {
		

		
			System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\geckodriver-v0.34.0-win32\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();

			driver.get("https://pf.com.pk");
			driver.manage().window().maximize();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
		
		    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
		
		    WebElement logo_element = driver.findElement(By.cssSelector("img[alt = 'footer-logo']"));
		    
	    	// First Assertion for Logo
		    String Logo_Text = logo_element.getAttribute("alt");
		    System.out.println(Logo_Text);
		    String Expected_Alt_Value = "footer-logo";
		    Assert.assertEquals(Expected_Alt_Value, Logo_Text);
		    
		    // Second Assertion for Logo
		    String data_src = logo_element.getAttribute("data-src");
		    System.out.println(data_src);
		    String Expected_data_src = "https://pf.com.pk/wp-content/uploads/2022/01/programmer-blue.svg";
		    Assert.assertEquals(Expected_data_src, data_src);		

	}

}
