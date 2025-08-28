package kfc_pakistan.kfc_pakistan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class store_locator { 

	WebDriver driver;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	By search_input = By.xpath("//*[@id='root']/div[2]/div[3]/div/div/div[2]/div[1]/div/div[1]/div[1]/form/div/input");

	By select_city = By.xpath("//*[@id='root']/div[2]/div[3]/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div/input");
	
	
	public store_locator(WebDriver driver){

		this.driver = driver;

	}

	public void locate_store( String search_text, String city){
			
	
		driver.findElement(search_input).sendKeys(search_text);
		driver.findElement(select_city).click();


	}



}