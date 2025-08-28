package Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import Pages.LNE_homepage;
import Pages.LNE_login;

public class login {
	@Test
	
	public void main() {

    String driverPath = "C:\\Users\\ABCD\\chromedriver_win\\chromedriver.exe";
    
    System.setProperty("webdriver.chrome.driver", driverPath);
    
    WebDriver driver;
    
    driver = new ChromeDriver();
    
    LNE_login objLogin;
    LNE_homepage objHome;
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("https://lne21-git-master-nse.vercel.app");
  //  driver.get("https://lne21-git-master-nse.vercel.app/auth/connexion");
 
    driver.manage().window().maximize();
    
    try {
		Thread.sleep(12000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
 
  
    objHome = new LNE_homepage(driver);  // Create Home Page object
    
    
    objHome.user_header();
  
	//   objLogin.click_user();
  //  objLogin.clickLogin();
     
    try {
		Thread.sleep(12000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
    
    objLogin = new LNE_login(driver);  // Create Login Page object
	
    js.executeScript("window.scrollBy(0,400)");
    
 
    
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

   
	objLogin.loginToLNE("arslanapple27+1@gmail.com", "Arslanali123@");
	
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	objLogin.Login();
	
    try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
    
    
    WebElement user_icon_1 = driver.findElement(By.xpath("//*[@id=\"Calque_1\"]"));
    
    Actions action = new Actions(driver);
    action.moveToElement(user_icon_1).perform();
    
    String name = objHome.get_user_name();
    
    System.out.println(name);

    
    }

}

