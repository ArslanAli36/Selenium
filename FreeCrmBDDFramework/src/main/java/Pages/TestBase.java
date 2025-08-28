package Pages;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("D:/eclipse/eclipse-workspace/FreeCrmBDDFramework/src/main/java/config/config.properties");
			prop.load(fis);
		}
		catch(IOException e){
			
			e.getMessage();
			
		}
			
	}

  public static void initialization() {
	  
	  String browserName = prop.getProperty("browser");
	  
	  if(browserName.equals("chrome")) {
		  
		  System.setProperty("webdriver.chrome.driver", "D:/eclipse/chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	  
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.get(prop.getProperty("url"));
 }
}









