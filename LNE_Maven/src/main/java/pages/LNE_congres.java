package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class LNE_congres{

    WebDriver driver;

    @FindBy(xpath="//*[@id=\"basic-navbar-nav\"]/div/div[4]/div/div/div/div/div[2]/div/div[1]/div/ul/li[1]/a")

    WebElement purchase_pins;

    @FindBy(xpath="//*[@id=\"basic-navbar-nav\"]/div/div[4]/div/div/div/div/div[2]/div/div[1]/div/ul/li[2]/a")

    WebElement advertise_exhibit;    

    @FindBy(className="")

    WebElement c;

    @FindBy(xpath ="")

    WebElement d;

    public LNE_congres(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    //Set user name in textbox

    public void selectPurchase(){

        purchase_pins.click();     
    }
  
    // Set password in password textbox

    public void selectAdvert(){

    	advertise_exhibit.click();

    }


    // Get the title of Congress Page

    public String getCongresTitle(){

    	return "here";
   
   //     return titleText.getText();

    }


}
