package Day1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Day1.youtube_pom;


public class youtube_test{
	

    String driverPath = "D:\\eclipse\\chromedriver_win32\\chromedriver.exe";
    
    WebDriver driver;

//    Guru99Login objLogin;     
//    Guru99HomePage objHomePage;
      youtube_pom obj_youtube;

    @BeforeTest

    public void setup(){

	System.setProperty("webdriver.chrome.driver", driverPath);
        
        driver = new ChromeDriver();

      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        
    }

    @Test(priority=0)
    public void youtube(){

    obj_youtube = new youtube_pom(driver);

    String loginPageTitle = obj_youtube.get_Title();
    System.out.println(loginPageTitle);
 //   System.out.println("here");
    obj_youtube.video_search("lahore");
    obj_youtube.flash_player();
      }
    }    
        
        
        