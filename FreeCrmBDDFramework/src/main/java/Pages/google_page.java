package Pages;
import org.openqa.selenium.support.PageFactory;
import org.eclipse.jetty.util.annotation.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Pages.TestBase;

public class google_page extends TestBase{
	

	@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
	WebElement text_input;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
	WebElement search_button;
	
	@FindBy(xpath="//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a")
	WebElement first_link;
	
	
	public google_page() {                       // constructor
		PageFactory.initElements(driver,this);
		
	}
	
	
    public void enterURL(String url){  
		
		driver.get(url);
	}
	
public String HomePageTitle() {  
		
		return driver.getTitle();
	}

	public void enterSearchData(String text ) {
			
		text_input.sendKeys(text);
	}
	
	public void clickOnSearch() {
		
		search_button.click();
		
	}
	
       public void clickOnFirstLink() {
		
	   first_link.click();
       
       }
	
      
	
}
