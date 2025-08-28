package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class b4u {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver_win32\\chromedriver.exe");	
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.b4uglobal.com/");
	   
	  //  driver.findElement(By.id("")).click();
        
      //  driver.findElement(By.linkText("About")).click();
     //   driver.findElement(By.linkText("TOS")).click();
     //   driver.findElement(By.linkText("Privacy Policy")).click();
      //  driver.findElement(By.className("callbacks1_s1")).click();
     //   driver.findElement(By.className("callbacks1_s2")).click();
     //   driver.findElement(By.className("callbacks1_s3")).click();
      //  driver.findElement(By.className("mouse")).click();
	  //  driver.findElement(By.id("lhc_need_help_main_title")).click();
	  
	    //  driver.findElement(By.className("status-icon online-status-icon")).click();
	    //  driver.findElement(By.id("lhc_status-icon-online")).click();
	  
	    //  driver.wait(1000);
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  driver.close();
      //  driver.quit();
	}

}
