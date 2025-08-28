package kfc_pakistan.kfc_pakistan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class track_order {

	WebDriver driver;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	By order_id = By.xpath("");
	By track_button = By.xpath("");

	public track_order(WebDriver driver) {

		this.driver = driver;

	}

	public void track_order(String order_id_value) {

		driver.findElement(order_id).sendKeys();

		driver.findElement(order_id).sendKeys();

		driver.findElement(track_button).click();

	}

}