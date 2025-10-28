package Droidor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;


public class contact_us_page {

	// All WebElements are identified by @FindBy annotation

	WebDriver driver;

	@FindBy(xpath="//*[@id='input_comp-lksaohiq']")

	WebElement first_name;

	@FindBy(xpath="//*[@id='input_comp-lksaohiu2']")

	WebElement last_name;    

	@FindBy(xpath="//*[@id='input_comp-lksaohiy1']")

	WebElement email;

	@FindBy(xpath="//*[@id='textarea_comp-lksaohj22']")

	WebElement message;
	
	@FindBy(xpath="//*[@id='comp-lksaohj81']/button")

	WebElement send_button;
	
	

	public contact_us_page(WebDriver driver){

		this.driver = driver;

		//This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}



	public void submit_contact_form(String first_name_value,String last_name_value, String email_value, String message_value){
		
		
		 try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		first_name.sendKeys(first_name_value);

	    last_name.sendKeys(last_name_value);

	    email.sendKeys(email_value);
	    
	    message.sendKeys(message_value);
	    
	    send_button.click();
	    

	}

}


















