package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondSeleniumScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver_win32\\chromedriver.exe");	
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.jotform.com/build/210364764713455#preview");
   
      System.out.println(driver.getTitle());
      driver.findElement(By.id("first_4")).sendKeys("Arslan");
      driver.findElement(By.id("last_4")).sendKeys("Ali");
      driver.findElement(By.id("input_10")).sendKeys("arslanali_3@hotmail.com");
      driver.findElement(By.id("input_11_addr_line1")).sendKeys("7-A Tech Society");
      driver.findElement(By.id("input_11_addr_line2")).sendKeys("Canal Bank");
      driver.findElement(By.id("input_11_city")).sendKeys("Lahore");
      driver.findElement(By.id("input_11_state")).sendKeys("Punjab");
      driver.findElement(By.id("input_11_postal")).sendKeys("54200");
      driver.findElement(By.id("input_6_area")).sendKeys("042");
      driver.findElement(By.id("input_6_phone")).sendKeys("3334341835");
      driver.findElement(By.id("lite_mode_12")).sendKeys("02-17-1988");
    //  driver.findElement(By.id("label_13")).click();
    //  WebElement gender1 = driver.findElement(By.id("input_13_0"));
    //  gender1.click();
      driver.findElement(By.id("input_5")).sendKeys("Granjur Technologies");
      driver.findElement(By.id("input_7")).sendKeys("letter content");
      driver.findElement(By.id("input_8")).sendKeys("D:\\Eclipse\\Arslan Ali CV.docx");
      
      // System.out.println("hehhehe");
     // driver.quit();
	}

}
