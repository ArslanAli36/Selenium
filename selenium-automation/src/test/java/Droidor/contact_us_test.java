package Droidor;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.io.File;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Droidor.careers_page;
import Droidor.contact_us_page;
import Droidor.home_page;

public class contact_us_test {

	public static void main(String[] args) throws Exception{

		System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\geckodriver-v0.36.0-win32\\geckodriver.exe");

		FirefoxOptions options = new FirefoxOptions();

		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		WebDriver driver = new FirefoxDriver(options);

		driver.get("https://www.droidor.com");
		
		driver.manage().window().maximize();

		home_page home_page = new home_page(driver);

		contact_us_page contact_us_page = new contact_us_page(driver);

		home_page.open_contact_us_page();

		contact_us_page.submit_contact_form("Arslan", "Ali", "arslanali_3@hotmail.com", "Sample Message from Arslan Ali for Testing"); 

	//	driver.close();
	}

}
