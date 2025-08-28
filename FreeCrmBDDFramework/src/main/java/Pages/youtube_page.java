package Pages;
import org.openqa.selenium.support.PageFactory;
import org.eclipse.jetty.util.annotation.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Pages.TestBase;

public class youtube_page extends TestBase{
	
	
	@FindBy(xpath="//*[@id=\"search\"]")
	WebElement text_input;
	
	@FindBy(xpath="//*[@id=\"search-icon-legacy\"]")
	WebElement search_button;
	
	@FindBy(xpath="//*[@id=\"video-title\"]")
	WebElement first_link;
	
	
	public youtube_page() {                       // constructor
	
		PageFactory.initElements(driver,this);
		
	}
	
	public String HomePageTitle() {  
		
		return driver.getTitle();
	}
	
    public void enterURL(String url){  
		
		driver.get(url);
	}
	
	
	public void enterSearchData(String text) {
		
		text_input.sendKeys(text);
		
	}
	
	public void clickOnSearch() {
		
		search_button.click();
	}
	
       public void clickOnFirstLink() {
		
    	   first_link.click();
	}
	
	
}
