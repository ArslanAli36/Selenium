package Day1;

//public class guru99_1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
// package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

//public class Guru99HomePage {

public class guru99_1 {

    WebDriver driver;

    By homePageUserName = By.xpath("//table//tr[@class='heading3']");

    

 //   public Guru99HomePage(WebDriver driver){
    public guru99_1(WebDriver driver){
 
    this.driver = driver;

    }

    //Get the User name from Home Page

        public String getHomePageDashboardUserName(){

         return driver.findElement(homePageUserName).getText();

        }

}