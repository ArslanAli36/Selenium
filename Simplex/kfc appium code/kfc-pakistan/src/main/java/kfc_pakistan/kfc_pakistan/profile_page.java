package kfc_pakistan.kfc_pakistan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class profile_page {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	By close_popup_link = By.xpath("");
	By menu_icon = By.xpath("");
	By profile_link = By.xpath("");
	By edit_profile_link = By.xpath("");
	By first_name = By.xpath("");
	By last_name = By.xpath("");
	By phone_no = By.xpath("");
	By email_address = By.xpath("");
	By gender = By.xpath("");
	By male_gender = By.xpath("");
	By female_gender = By.xpath("");
	By other_gender = By.xpath("");
	
	
	By date_of_birth = By.xpath("");
	By save_button = By.xpath("");

	public profile_page(WebDriver driver) {

		this.driver = driver;

	}

	public void edit_profile(String f_name, String l_name, String phone, String email, String day, String month,
			String year, String gender) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// driver.findElement(first_name_focus).click();

		driver.findElement(first_name).sendKeys(f_name);

		// driver.findElement(last_name_focus).click();

		driver.findElement(last_name).sendKeys(l_name);

		// driver.findElement(phone).click();

		driver.findElement(phone_no).sendKeys(phone);

		// driver.findElement(email_address).click();

		driver.findElement(email_address).sendKeys(email);

		// js.executeScript("document.getElementsByName('dateofbirth')[0].setAttribute('value',
		// '1988-02-05')");
		// js.executeScript("document.getElementsByClassName('MuiInputBase-input
		// MuiFilledInput-input css-2bxn45')[0].setAttribute('value', '1988-02-05')");

		if (gender == "Male") {
			driver.findElement(male_gender).click();
		}

		else if (gender == "Female") {
			driver.findElement(female_gender).click();
		}

		else if (gender == "Other") {
			driver.findElement(other_gender).click();
		}

		driver.findElement(date_of_birth).click();

		driver.findElement(date_of_birth).sendKeys(day);
		Thread.sleep(2000);
		driver.findElement(date_of_birth).sendKeys(month);
		Thread.sleep(2000);
		driver.findElement(date_of_birth).sendKeys(year);

		driver.findElement(save_button).click();

		// driver.findElement(close_window).click();
	}

}