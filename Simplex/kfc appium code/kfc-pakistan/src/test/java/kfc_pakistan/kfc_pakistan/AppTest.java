//package kfc_pakistan.kfc_pakistan;
//
//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.*;
//import kfc_pakistan.kfc_pakistan.App;
//import kfc_pakistan.kfc_pakistan.explore_menu;
//import org.openqa.selenium.JavascriptExecutor;
//
//public class AppTest{
//
//
//	public static void main(String[] args) throws InterruptedException {
//
//		String driverPath = "C:\\Users\\asa10076\\Downloads\\chromedriver-win64\\chromedriver.exe";
//
//		WebDriver driver;
//		
//		App obj_kfc;
//		explore_menu obj_order;
//
//		System.setProperty("webdriver.chrome.driver", driverPath);
//
//		driver = new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//
//		driver.get("https://www.kfcpakistan.com/");
//		
//		driver.manage().window().maximize();
//
//		obj_kfc = new App(driver);
//		obj_order = new explore_menu(driver);
//
//		String loginPageTitle = obj_kfc.get_Title();
//		
//		System.out.println(loginPageTitle);
//
//		obj_kfc.popups();
//
//		obj_kfc.login("3334341835");
//		
//		obj_kfc.add_your_details("Arslan", "Ali", "arslanali_3@hotmail.com", "12", "02", "1988", "Female");
//
//
//	}
//
//}
//
