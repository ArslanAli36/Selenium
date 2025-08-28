package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class LNE_login{

	WebDriver driver;
	
//	@FindBy(css ="svg#Calque_1.loginIcon")
    
//	WebElement user_icon;
	
	@FindBy(id="clientType-tab-connexion")
    WebElement login_tab;
	
	
//	@FindBy(xpath="/html/body/div/div[2]/main/div/div[2]/div/div/div[1]/div/div/form/div[1]/div[1]/input") // not working
	@FindBy(xpath="//*[@id=\"clientType-tabpane-connexion\"]/div/div/form/div[1]/div[1]/input") // not working
//	@FindBy(name="email")  // not working
//	@FindBy(className ="")  // not working
//	@FindBy(id ="")  // id not present
//	@FindBy(css ="input.undefined.emailInput.form-control") // not working
	WebElement user_email;
	
    @FindBy(name="password")
    WebElement user_password;    

    @FindBy(xpath="/html/body/div/div[2]/main/div/div[2]/div/div/div[1]/div/h2")
    WebElement titleText;

    @FindBy(xpath ="/html/body/div/div[2]/main/div/div[2]/div/div/div[1]/div/div/form/div[4]/button")
    WebElement login_button;
     
    @FindBy(xpath ="/html/body/div/div[2]/main/div/div[2]/div/div/div[1]/div/div/form/div[2]/div/a")
    WebElement forgot_password;
    
    @FindBy(xpath="/html/body/div/div[2]/div/div[1]/div/div/div[3]/ul/li[2]/div/div[1]/h3")   // user name on home page after login
    WebElement user_name; 
    
    public LNE_login(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver, this);  //This initElements method will create all WebElements

    }
   
    public void click_user(){

   // 	user_icon.click();

      } 
    
     
    public void clickLogin(){

        login_tab.click();

    } 
    
    
    public void loginToLNE(String strEmail, String strPassword){

       
       user_email.sendKeys(strEmail);
       user_password.sendKeys(strPassword);
   
    
    }
    

    public void Login(){       //Click on login button

        login_button.click();

    }
    
    public void click_forgot(){  //Click on forgot password link

    	forgot_password.click();

    } 

    public String user_name(){

        return user_name.getText();  

    }
    
    
    
    
}


