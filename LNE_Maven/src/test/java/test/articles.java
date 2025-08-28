package Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.LNE_articles;
import Pages.LNE_login;


public class articles {

	
	public static void main(String[] args) {

    String driverPath = "C:\\Users\\ABCD\\geckodriver-v0.30.0-win64\\geckodriver.exe";
    
    System.setProperty("webdriver.gecko.driver", driverPath);
    
    WebDriver driver;
    
    driver = new FirefoxDriver();
    
    driver.get("https://lne21-git-master-nse.vercel.app");
    
    driver.manage().window().maximize(); 
    
    LNE_articles objArticle = new LNE_articles(driver);
    
    objArticle.click_articles();
    
    objArticle.select_article(driver, 1); // 1, 27, 17, 22, 36, 37, 6, 38, 14, 15, 41, 39, 40 
    
    objArticle.select_theme(driver, "acitifs");
    
    
    
    
    
    
    
    
    
	}
	
}













