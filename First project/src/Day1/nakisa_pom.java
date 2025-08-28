package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class nakisa_pom { 
    
	WebDriver driver;

    By first_name = By.name("First Name");
    By last_name = By.name("Last Name");
    By b_email = By.name("Email");
    By c_name = By.name("Company Name");
    By j_title = By.name("Job Title");
    By phone = By.name("Phone");
    By message = By.name("Lead Notes");
 //   By no_robot = By.className("recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-expired recaptcha-checkbox-hover");
  By no_robo = By.xpath("//*[@id='block-b1582317304266']");
    
    //   By titleText = By.tagName("title");

    By submit = By.className("ao-form-submit");

    	
      public nakisa_pom(WebDriver driver){

        this.driver = driver;

    }

    //Set user name in textbox

    public void setUserName(String strUserName){

  //      driver.findElement().sendKeys(strUserName);

    }

    //Set password in password textbox

    public void setPassword(String strPassword){

   //      driver.findElement().sendKeys(strPassword);

    }

    //Click on submit button

    public void clickSubmit(){

            driver.findElement(submit).click();

    }


    public String get_Title(){

    	return driver.getTitle();

    }

    public void fill_form(String info_1, String info_2, String info_3, String info_4, String info_5, String info_6, String info_7){

    	driver.findElement(first_name).sendKeys(info_1);
    	driver.findElement(last_name).sendKeys(info_2);
    	driver.findElement(b_email).sendKeys(info_3);
    	driver.findElement(c_name).sendKeys(info_4);
    	driver.findElement(j_title).sendKeys(info_5);
    	driver.findElement(phone).sendKeys(info_6);
    	driver.findElement(message).sendKeys(info_7);
    //	new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]"))); 

   // 	new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click();
    	driver.findElement(no_robo).click(); 
    	
    	 }

}