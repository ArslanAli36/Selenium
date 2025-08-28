package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class LNE_formations{

    WebDriver driver;

    @FindBy(xpath="//*[@id=\"basic-navbar-nav\"]/div/div[6]/div/div/div/div/div[2]/div/div[1]/div/ul/li/a")

    WebElement upcoming_trainings;

    

    public LNE_formations(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    //Set user name in textbox

    public void selectTrainings(){

        upcoming_trainings.click();     
    }

    //Set password in password textbox

    public void setPassword(String strPassword){

//    user_password.sendKeys(strPassword);

    }

    //Click on login button

    public void clickLogin(){

//            login.click();

    }  

    //Get the title of Login Page

    public String getFormationsTitle(){

    	return "here";
   
   //     return titleText.getText();

    }


}
