package Pages;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.eclipse.jetty.util.annotation.*;
import Pages.TestBase;

public class homeTab extends TestBase{
	
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")
	WebElement username_element;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")// error
	WebElement password_element;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")	
	WebElement login_button;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[1]/div/div[1]/a[3]/i")
	WebElement refresh;

	@FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[1]/div/div[1]/a[2]/i")
	WebElement settings;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[1]/div/div[1]/a[1]/i")
	WebElement about;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[1]/div/div[2]/div/form/div/div/div[1]")
	WebElement settings_placeholder;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[1]/div/div[2]/div")
	WebElement about_text;
	
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[1]/div/div[2]/div/form/div/div/div[2]/div[1]")
	WebElement settings_option1;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[1]/div/div[2]/div/form/div/div/div[2]/div[2]")
	WebElement settings_option2;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[1]/div/div[2]/div/form/div/div/div[2]/div[3]")
	WebElement settings_option3;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/div[2]/a/i")
	WebElement hover_icon;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/div[2]/a")
	WebElement calendar;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/div[2]/button")
	WebElement add_calendar;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[5]/div/div[1]/a[2]/i")
	WebElement twitter_settings;
	
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[5]/div/div[2]/div/form/div[1]/div")
    WebElement twitter_dropdown;	
	
    @FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[5]/div/div[2]/div/form/div[1]/div/div[2]/div[3]")
	//@FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[5]/div/div[2]/div/form/div[1]/div/div[2]/div[3]/span") // also working
	WebElement twitter_dropdown_value;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[6]/div/div[1]/a[2]/i")
	WebElement exchange_settings;
    
    @FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[6]/div/div[2]/div/form/div[1]/div")
  	WebElement currency_one;
    
    @FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[6]/div/div[2]/div/form/div[1]/div/div[2]/div[7]/span")
  	WebElement currency_one_drp;
    
    @FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[6]/div/div[2]/div/form/div[2]/div")
  	WebElement currency_two;
    
    @FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[6]/div/div[2]/div/form/div[2]/div/div/div[1]")
  	WebElement currency_two_select;
    
    @FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[6]/div/div[2]/div/form/div[2]/div/a/i")
  	WebElement currency_two_delete;
    
	public homeTab() {
		
		PageFactory.initElements(driver,this); // see line 2
		
	}
	
	public void login(String username, String password) {
		
		username_element.sendKeys(username);
		password_element.sendKeys(password);
		login_button.click();
	}
	
	public String get_Title() {
		
		return driver.getTitle();
	} 
	
	public void refresh_CAS() {  
		
		refresh.click();
	}
	
	public void settings_CAS() {
		
		settings.click();
		
	}
   
    
	public String settings_placeholder() {
			
		return settings_placeholder.getText();
	}
	
	public void about_CAS() {
			
		about.click();
		
    }
		
	public String about_text() {
		
		return about_text.getText();
		
	}

	public void settings_dropdown() {
			
		settings_option1.click();
	//	settings_option2.click();
	//	settings_option3.click();
		
    }

public void calendar() {
		
	//	calendar.click();
		
	Actions action = new Actions(driver); //Creating object of an Actions class

	action.moveToElement(hover_icon).perform(); //Performing the mouse hover action on the target element.
	
	add_calendar.click();
			
    }

public void twitter() {
	
	twitter_settings.click();
	twitter_dropdown.click();
	twitter_dropdown_value.click();
	
	System.out.println("twitter funtion");
    }

public void exchange_rates() {
	
	exchange_settings.click();
	currency_one_drp.click();
	currency_one.click();
	currency_two.click();
	currency_two_select.click();
	currency_two_delete.click();
	System.out.println("exchange rates");
    }


}






