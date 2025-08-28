package kfc_pakistan.kfc_pakistan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class bucket_page { 

	WebDriver driver;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	By explore_menu = By.xpath("//*[@id='root']/div[2]/div[3]/div/div/div[1]/div[1]/div[2]/div/a");
	By add_to_bucket = By.xpath("//*[@id='root']/div[2]/div[3]/div/div/div[1]/div[2]/div/div[1]/div/div/div/div/button[1]");
	                             //*[@id="root"]/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/button[1]
	
	By special_instructions = By.xpath("//*[@id='exampleFormControlTextarea1']");
	
	By alt_number = By.xpath("//*[@id='outlined-number']");
	
	By back_to_menu = By.xpath("//*[@id='root']/div[2]/div[3]/div/div/div[1]/div[1]/div[1]/h5/div/a");
    
    By price_value = By.xpath("//*[@id='EverydayValue']/div[1]/div/div/div/h4");
                               //*[@id="EverydayValue"]/div[2]/div/div/div/h4
                               //*[@id="EverydayValue"]/div[3]/div/div/div/h4
	 
    By checkout = By.xpath("");
    
    
	public bucket_page(WebDriver driver){

		this.driver = driver;

	}

	public void add_to_bucket(String food_title){
			
	
		driver.findElement(checkout).click();
	

	}



}