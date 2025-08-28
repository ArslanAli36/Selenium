package kfc_pakistan.kfc_pakistan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class home_page {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	By menu_icon = By.xpath("");
	By night_day = By.xpath("");
	By profile_link = By.xpath("");
	By my_favorites = By.xpath("");
	By my_addresses = By.xpath("");
	By my_orders = By.xpath("");
	By store_locator = By.xpath("");
	By track_order = By.xpath("");
	By explore_menu = By.xpath("");
	By about_us = By.xpath("");
	By feedback = By.xpath("");
	By terms_conditions = By.xpath("");
	By privacy_policy = By.xpath("");

	By delivery_link = By.xpath("");
	By pickup_link = By.xpath("");
	By reorder_button = By.xpath("");
	By bucket_icon = By.xpath("");
	By explore_menu_view_all = By.xpath("");

	public home_page(WebDriver driver) {

		this.driver = driver;

	}

	public void reorder() {

	}

}