package Day1;

//public class guru99_test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

// package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

//import pages.Guru99HomePage;
import Day1.guru99;
//import pages.Guru99Login;
import Day1.guru99_1;
//public class Test99GuruLogin {

public class guru99_test{
	

    String driverPath = "D:\\eclipse\\chromedriver_win32\\chromedriver.exe";
    
    WebDriver driver;

//    Guru99Login objLogin;
      guru99 objLogin;   
//    Guru99HomePage objHomePage;
      guru99_1 objHomePage;

    @BeforeTest

    public void setup(){

	System.setProperty("webdriver.chrome.driver", driverPath);
        
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/V4/");

    }

    /**

     * This test case will login in http://demo.guru99.com/V4/

     * Verify login page title as guru99 bank

     * Login to application

     * Verify the home page using Dashboard message

     */

    @Test(priority=0)

    public void test_Home_Page_Appear_Correct(){

        //Create Login Page object

    objLogin = new guru99(driver);

    //Verify login page title

    String loginPageTitle = objLogin.getLoginTitle();

    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

    //login to application

    objLogin.loginToGuru99("mgr123", "mgr!23");

    // go the next page

    objHomePage = new guru99_1(driver);

    //Verify home page

    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));

    }
    
}
