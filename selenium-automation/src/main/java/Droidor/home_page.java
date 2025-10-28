package Droidor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;


public class home_page {

	// All WebElements are identified by @FindBy annotation

	WebDriver driver;

	@FindBy(xpath="//*[@id='comp-knebed6b6']/a")

	WebElement header_careers;

	@FindBy(xpath="//*[@id='comp-knd86aci']/a")

	WebElement header_contact_us;    


	public home_page(WebDriver driver){

		this.driver = driver;

		//This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}

	// open careers page

	public void open_careers_page(){

		header_careers.click();     
	}

	// open contact us page

	public void open_contact_us_page(){

		header_contact_us.click();

	}


}