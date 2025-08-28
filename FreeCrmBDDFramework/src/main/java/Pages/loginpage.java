package Pages;
import Pages.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.eclipse.jetty.util.annotation.*;

public class loginpage extends TestBase{

	
	@FindBy(xpath="//input[@name= 'email']")  ////*[@id="ui"]/div/div/form/div/div[1]/div/input
	
	WebElement email;
	
	@FindBy(xpath="//input[@name= 'password' and @placeholder='Password' and @type='password' ]")
	
	WebElement password;
	
	@FindBy(xpath="//*[text()= 'Login']")
	
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(), 'Sign Up')]")
	
	WebElement signUpBtn;
	
    @FindBy(xpath="//img[contains(@class, 'img-responsive')]")
	
	WebElement crmLogo;

	public loginpage() {       ///////constructor
		PageFactory.initElements(driver, this);
	}

   public String validateLoginPageTitle() { 
      return driver.getTitle();
   }

   public boolean validateCRMImage() { 
      return crmLogo.isDisplayed();
   }

   public void login(String un, String pwd ) {
	   
	   email.sendKeys(un);       // error
	   password.sendKeys(pwd);
	   loginBtn.click();
	 //  JavascriptExecutor js = (JavascriptExecutor) driver;

    //   js.executeScript("arguments[0].click();", loginBtn);
     
   }

}
