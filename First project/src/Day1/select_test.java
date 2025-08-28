package Day1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Day1.youtube_pom;
import org.openqa.selenium.support.ui.Select;

public class select_test{
	

    String driverPath = "D:\\eclipse\\chromedriver_win32\\chromedriver.exe";
    
    WebDriver driver;

    select_pom obj_select;

    @BeforeTest

    public void setup(){

	System.setProperty("webdriver.chrome.driver", driverPath);
        
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        
    }

    @Test(priority=0)
    public void select(){

    //  obj_youtube = new youtube_pom(driver);
    	obj_select = new select_pom(driver);	
    	obj_select.country_select("Pakistan");
    //	System.out.println("c_name");
    //  String loginPageTitle = obj_youtube.get_Title();
   //   System.out.println(loginPageTitle);
   //   System.out.println("here");
   
    
      }
    }    
        
        