package Pages;
import org.openqa.selenium.support.PageFactory;
import org.eclipse.jetty.util.annotation.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Pages.TestBase;

public class homepage extends TestBase{
	
	
	@FindBy(xpath="//td[contains(text(), 'User: Naveen K')]")
	//@CasheLookup
	WebElement userNameLabel;

	@FindBy(xpath="//a[contains(text(), 'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(), 'New Contact')]")
	WebElement newContactLink;
	
	@FindBy(xpath="//a[contains(text(), 'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(), 'Tasks')]")
	WebElement tasksLink;
	
	@FindBy(xpath="//a[@href = 'https://register.freecrm.com/register/']")  //new
	WebElement signup_link;
	
	@FindBy(xpath="//a[@href = 'https://ui.cogmento.com']")  //new
	WebElement login_link;
	
	@FindBy(xpath="//input[@name = 'email']")  //new
	WebElement email_address;
	@FindBy(xpath="//*[@id= 'countryValue']")////*[@id="countryValue"]
	WebElement country_code;
	@FindBy(xpath="//input[@name = 'phone']")  //new
	WebElement phone_no;
	@FindBy(xpath="//input[@name = 'terms' and @type = 'checkbox']")  //new
	WebElement terms;
	@FindBy(xpath="//button[@type = 'submit' and @name ='action']")  //new
	WebElement signup_button;
	
	
	
	public homepage() {                       // constructor
		PageFactory.initElements(driver,this);
		
	}
	
	public String verifyHomePageTitle() {  
		
		return driver.getTitle();
	}
	public boolean verifyCorrectUserName() {
		
		return userNameLabel.isDisplayed();
		
	}
	
	public void clickOnNewContactList() {
		
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform(); 
		newContactLink.click();
	}
	
       public void sign_up() {
		
	    signup_link.click();
	 //   System.out.println("yooo");
	}
	
       public void login() {
	
	    login_link.click();
    }
	
       public void signup_form(String email, String c_code, String phone) {
    		
   	    email_address.sendKeys(email);
   	   // country_code.sendKeys(c_code);
   	   // Select drpCountry = new Select(country_code); // error
   	   // drpCountry.selectByValue(c_code);
   	    phone_no.sendKeys(phone);
   	    terms.click();
   	    signup_button.click();
   	    
       }
	
	
}
