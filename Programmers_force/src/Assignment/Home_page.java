// 2. Click on Each Header and Open in the new Tab and Take Screenshot.

package Assignment;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.ArrayList;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Home_page {

	public void main(String[] args) throws Exception{
			
	//	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver-win32\\chromedriver.exe");
	//	WebDriver driver= new ChromeDriver();
	
		System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://pf.com.pk/");
		driver.manage().window().maximize();
	
	//	((JavascriptExecutor)driver).executeScript("window.open()");
	//	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	//	driver.switchTo().window(tabs.get(1));	
		
		String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);

		
	//	driver.findElement(By.linkText("About Us")).sendKeys(clicklnk);
	//	this.takeSnapShot(driver, "C:\\Users\\HP\\Downloads\\test.png") ; 

	//	driver.findElement(By.linkText("Careers")).click();
	//	driver.findElement(By.linkText("Open Positions")).sendKeys(clicklnk);
	//	this.takeSnapShot(driver, "C:\\Users\\HP\\Downloads\\test.png") ; 
		
	//	driver.findElement(By.linkText("Send Resume")).sendKeys(clicklnk);
		
	//	driver.findElement(By.linkText("Life at PF")).sendKeys(clicklnk);
	//	this.takeSnapShot(driver, "C:\\Users\\HP\\Downloads\\test.png") ; 
	
	//	driver.findElement(By.linkText("Expertise")).sendKeys(clicklnk);
	//	this.takeSnapShot(driver, "C:\\Users\\HP\\Downloads\\test.png") ; 
	
	//	driver.findElement(By.linkText("Resources")).click();
		
	//	driver.findElement(By.linkText("Blogs")).sendKeys(clicklnk);
	//	driver.findElement(By.linkText("News")).sendKeys(clicklnk);
	//	this.takeSnapShot(driver, "C:\\Users\\HP\\Downloads\\test.png") ; 
		
		
		driver.findElement(By.linkText("Graduate Gateway Program")).sendKeys(clicklnk);
		this.takeSnapShot(driver, "C:\\Users\\HP\\Downloads\\test.png") ; 
		
	}
		
        public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception{
			
			TakesScreenshot scrShot =((TakesScreenshot)webdriver);
			
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE); 
			
			File DestFile= new File(fileWithPath);
			
			FileUtils.copyFile(SrcFile, DestFile); 
			
        }
	

}
