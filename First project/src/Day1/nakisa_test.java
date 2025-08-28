package Day1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Day1.nakisa_pom;


public class nakisa_test{
	

    String driverPath = "D:\\eclipse\\chromedriver_win32\\chromedriver.exe";
    
    WebDriver driver;

//    Guru99Login objLogin;     
//    Guru99HomePage objHomePage;
      nakisa_pom obj_nakisa;

    @BeforeTest

    public void setup(){

	System.setProperty("webdriver.chrome.driver", driverPath);
        
        driver = new ChromeDriver();

     //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //    driver.get("https://www.nakisa.com/");
        driver.get("https://www.nakisa.com/contact-us");
        driver.manage().window().maximize();
    
    }

    
    @Test(priority=0)

    public void nakisa(){

        //Create Login Page object

    obj_nakisa = new nakisa_pom(driver);

    

    String loginPageTitle = obj_nakisa.get_Title();
    System.out.println(loginPageTitle);
    System.out.println("here");
    
 //   Assert.assertTrue(loginPageTitle.contains("Nakisa Lease Administration"));
 //   driver.navigate().to("https://www.nakisa.com/contact-us");
    obj_nakisa.fill_form("arslan", "ali", "arslanali_3@hotmail.com", "nakisa", "SQA Engineer","0333-4341835","Selenium testing");
   

    obj_nakisa.clickSubmit();

    // go the next page

  //  obj_nakisa = new nakisa_pom(driver);

    //Verify home page

 //   Assert.assertTrue(obj_nakisa.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));

    }
    
}
