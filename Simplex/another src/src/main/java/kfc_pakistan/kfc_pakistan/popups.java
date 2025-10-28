package kfc_pakistan.kfc_pakistan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class popups {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	
	By access_to_location = By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']");

	By close_popup_link = By.xpath("//android.widget.Button");

		

	public popups(WebDriver driver) {

		this.driver = driver;

	}

	
	public void close_popups() throws InterruptedException {
		
		
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement location_link = wait.until(ExpectedConditions.visibilityOfElementLocated(access_to_location));

		location_link.click();

		WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button")));

		button.click();

	}
	
	
}