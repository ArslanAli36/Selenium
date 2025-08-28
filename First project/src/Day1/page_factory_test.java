package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

//import Day1.Guru99HomePage;
//import Day1.Guru99Login;

import Day1.page_factory_pom;


public class page_factory_test {

    String driverPath = "C:\\geckodriver.exe";
    
    WebDriver driver;

    page_factory_pom objLogin;

    @BeforeTest

    public void setup(){

        System.setProperty("webdriver.gecko.driver", driverPath);
        
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/V4/");

    }

    @Test(priority=0)

    public void test_Home_Page_Appear_Correct(){

    // Create Login Page object

    objLogin = new page_factory_pom(driver);

    // Verify login page title

    String loginPageTitle = objLogin.getLoginTitle(); // see line 73 of page_factory_pom

    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

    // login to application

    objLogin.loginToGuru99("mgr123", "mgr!23"); // see line 91

    // go the next page

    // objHomePage = new Guru99HomePage(driver);

    // Verify home page

    // Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));

    }

}