//3. Click on Apply Now Button and Fill Form for One Position in Available Jobs.

package Assignment;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class Apply_now {

	public static void main(String[] args) throws InterruptedException {
		
		
	//	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver-win32\\chromedriver.exe");
	//	WebDriver driver= new ChromeDriver();
	
		System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://pf.com.pk/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("applynow_btn")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    
		WebElement element_1 = driver.findElement(By.xpath("/html/body/div[5]/div/div/div/main/article/div/div[3]/div/div/div/div[9]/div[10]/a/p"));
	    js.executeScript( "arguments[0].scrollIntoView(true);", element_1);
  
	    driver.findElement(By.xpath("/html/body/div[5]/div/div/div/main/article/div/div[3]/div/div/div/div[9]/div[10]/a/p")).click();
	    
	    WebElement element_2 = driver.findElement(By.xpath("//*[text() = 'Apply as Mid Level SQA Engineer']"));
		js.executeScript("arguments[0].scrollIntoView(true);", element_2);
	    
	    
	    driver.findElement(By.cssSelector("input[value='Male']")).click();
	    driver.findElement(By.id("dob")).sendKeys("1995-05-15");   ///
	    driver.findElement(By.id("name")).sendKeys("Sample User");
	    driver.findElement(By.id("email")).sendKeys("arslan.ali.sqa@gmail.com");
	    driver.findElement(By.id("cnic")).sendKeys("3520290786752");
	    driver.findElement(By.id("phone")).sendKeys("03281427144");
	    driver.findElement(By.id("address")).sendKeys("7-A Tech Society Canal Bank Lahore");
	    driver.findElement(By.id("city")).sendKeys("Lahore");
	    driver.findElement(By.id("qualification")).click();
	    driver.findElement(By.cssSelector("option[value='BSCS']")).click();
	    driver.findElement(By.id("yr-of-comp")).click();
	    driver.findElement(By.cssSelector("option[value='2017']")).click();
	    driver.findElement(By.id("university")).sendKeys("National University of Computer and Emerging Sciences");
	    driver.findElement(By.id("cgpa_cd")).sendKeys("3.09");
	    driver.findElement(By.cssSelector("input[name='cur-working'][value ='Yes']")).click();
	    driver.findElement(By.cssSelector("input[name='current-salry']")).sendKeys("20000");
	    driver.findElement(By.id("salry-expt")).sendKeys("100000");
	    driver.findElement(By.id("doj")).sendKeys("2024-07-17"); ///
	    driver.findElement(By.cssSelector("input[name='hear-about-us']")).sendKeys("LinkedIn");
	    driver.findElement(By.id("experiance")).click();
	    driver.findElement(By.cssSelector("option[value='2 Years']")).click();
	    
	    WebElement fileInput = driver.findElement(By.cssSelector("input[id='resume']"));
	    fileInput.sendKeys("C:\\Users\\HP\\Downloads\\Programmers force\\SQA Assessment.pdf");
	    
	    driver.findElement(By.cssSelector("input[id='submit-btn']")).click();
	    
        WebElement success_msg = driver.findElement(By.xpath("span[class = 'color-change']"));
	        
	    String Actual_Text = success_msg.getText();
	    String Expected_Text = "Applying";
	    Assert.assertEquals(Expected_Text, Actual_Text);
	        
	}

}






