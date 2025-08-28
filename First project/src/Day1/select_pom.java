package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class select_pom {

	WebDriver driver;
    String country_name;
    String country;
    By name = By.name("country");
    
    public select_pom(WebDriver driver){

        this.driver = driver;

    }
    
      public void country_select(String country){

    	  Select drpCountry = new Select(driver.findElement(name));  
    	  drpCountry.selectByVisibleText("country");
    	//  drpCountry.selectByIndex(1);
    	  //  driver.findElement(search_button).click();
    	          
    	    }
   
    
    public String get_Title(){

    	return driver.getTitle();

    }
}
