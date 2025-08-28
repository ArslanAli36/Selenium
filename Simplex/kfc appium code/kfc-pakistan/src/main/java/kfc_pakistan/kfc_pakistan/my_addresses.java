package kfc_pakistan.kfc_pakistan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class my_addresses { 

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	By close_popup_link = By.xpath("");
	By menu_icon = By.xpath("");
	By login_link = By.xpath("");
	By phone_input = By.xpath("");
	By otp_button = By.xpath("");
	By otp_verification_close = By.xpath("");
	By otp_input = By.xpath("");
	By validate_otp_button = By.xpath("");
	
	

	public my_addresses(WebDriver driver){

		this.driver = driver;

	}

	public void close_popup(){
	
		driver.findElement(close_popup_link).click();

	}


}