package Test;

import java.util.concurrent.TimeUnit;
import java.io.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import org.testng.annotations.AfterTest;

import Pages.LNE_homepage;

import Pages.LNE_login;

public class test_1 {


	public static void main(String[] args) {

	 	//	String driverPath = "C:\\Users\\ABCD\\geckodriver-v0.30.0-win64\\geckodriver.exe";

     		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ABCD\\geckodriver-v0.30.0-win64\\geckodriver.exe");	
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABCD\\chromedriver_win32\\chromedriver.exe");

	    	WebDriver driver= new FirefoxDriver();
		//  WebDriver driver = new ChromeDriver();
		
			LNE_login objLogin;

		    LNE_homepage objHomePage;


		     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		     driver.get("https://lne21-git-master-nse.vercel.app/");
		
		     System.out.println("here");
		
		   

		    objHomePage = new LNE_homepage(driver);

		    String username = objHomePage.get_user_name();

		    System.out.println(username);

		  

	  }

}

