package Droidor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;


public class careers_page {

	// All WebElements are identified by @FindBy annotation

	WebDriver driver;

	@FindBy(xpath="//*[@id='comp-knob0xng']/div")

	WebElement apply_here_form;
	
	
	@FindBy(xpath="//*[@id='input_comp-knob0xp6']")

	WebElement first_name;

	@FindBy(xpath="//*[@id='input_comp-knob0xpe']")

	WebElement last_name;    

	@FindBy(xpath="//*[@id='input_comp-knob0xpg1']")

	WebElement email;

	@FindBy(xpath="//*[@id='input_comp-knob0xpo1']")

	WebElement phone;
	
	@FindBy(xpath="//*[@id='comp-knob0xpr']/div")

	WebElement position_dropdown;
	
	@FindBy(xpath="//*[@id='menuitem-0']")

	WebElement android_native_developer;
	
	@FindBy(xpath="//*[@id='menuitem-1']")

	WebElement senior_react_developer;
	
	@FindBy(xpath="//*[@id='menuitem-2']")

	WebElement react_native_developer;
	
	
	
	@FindBy(xpath="//*[@id='comp-knob0xq12']/div/div/button")

	WebElement open_calendar;
	
	@FindBy(xpath="//*[@id='portal-comp-knob0xq12']/div[2]/div[2]/table/tbody/tr[5]/td[3]")

	WebElement start_date;
	
	@FindBy(xpath="//*[@id='input_comp-knob0xq9']")

	WebElement resume_link;
	
	
	@FindBy(xpath="//*[@id='comp-knob0xqb1']/button")

	WebElement submit_button;
	

	public careers_page(WebDriver driver){

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}


	public void job_apply(String first_name_value,String last_name_value, String email_value, String phone_value, String job_title, String date_value, String resume_url){

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		first_name.sendKeys(first_name_value);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    last_name.sendKeys(last_name_value);

	    email.sendKeys(email_value);
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    phone.sendKeys(phone_value);
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    position_dropdown.click();
	    
	    if (job_title == "Android Native Developer") {
	    	
	    	android_native_developer.click();
	    	
	    }
	    
	    else if (job_title == "Senior React.js Developer") {
	    	
	    	senior_react_developer.click();
	    	
	    	
	    }
	    
        else if (job_title == "React Native Developer") {
	    	
	    	react_native_developer.click();
	    	
	    	
	    }
	    
	    open_calendar.click();
	    
	    start_date.click();
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    resume_link.sendKeys(resume_url);
	    
	    submit_button.click();

	}

}
















