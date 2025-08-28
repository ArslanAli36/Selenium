package kfc_pakistan.kfc_pakistan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class App { 

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	By not_today = By.xpath("//*[@id='button-1']");
//	By count_me_in = By.xpath("//*[@id='button-2']");
	By leg_piece_bucket = By.xpath("/html/body/div[3]/div/div/div[1]/button");
	By login_link = By.xpath("//*[@id='root']/div[2]/div[1]/nav/div/div[3]/div[2]/div/a");
	By number_input = By.xpath("//*[@id='outlined-number']");
	By login_button = By.xpath("//*[@id='root']/div[2]/div[2]/div[2]/div[2]/div/div[4]/button");
	By google_login = By.xpath("//*[@id='root']/div[2]/div[2]/div[2]/div[2]/div/button");	
	
	By first_name_focus = By.xpath("/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div");
	By first_name = By.xpath("/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div/input");
	
	By last_name_focus = By.xpath("/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/div/div"); 
	By last_name = By.xpath("/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/div/div/input");
	
	By email_address_focus = By.xpath("/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[2]/div/div"); 
	By email_address = By.xpath("/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[2]/div/div/input");
	
	By birth_focus = By.xpath("/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[3]/div/div");
	
	By date_of_birth = By.xpath("/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[3]/div/div/input");
	
	By male_gender = By.xpath("/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[4]/div/label[1]/span[1]/input");
	By female_gender = By.xpath("/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[4]/div/label[2]/span[1]/input");
	By other_gender = By.xpath("/html/body/div[3]/div/div/div[3]/div[1]/div/div/div/div/div/div/div/div[4]/div/label[3]/span[1]/input");
	
	
	By submit = By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/button");
	
	By close_window = By.xpath("/html/body/div[3]/div/div/div[2]/button");
	
	By profile_link = By.xpath("//*[@id='root']/div[2]/div[1]/nav/div/div[3]/div[2]/div/div/button");
	
	By user_name = By.xpath("//*[@id='root']/div[2]/div[1]/nav/div/div[3]/div[2]/div/div/button/div/text()");
	
	By profile_edit = By.xpath("/html/body/div[3]/div/div/div[3]/div/a");
	
	By logout_link = By.xpath("/html/body/div[3]/div/div/div[3]/ul/button");
	
	

	public App(WebDriver driver){

		this.driver = driver;

	}

	public void popups(){
	
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(not_today).click();
	//	driver.findElement(count_me_in).click();
		driver.findElement(leg_piece_bucket).click();

	}


	public void login(String num){

		driver.findElement(login_link).click();   
		driver.findElement(number_input).sendKeys(num);
	    driver.findElement(login_button).click();  
		//    driver.findElement(google_login).click();  
	}
	
	public void add_your_details(String f_name, String l_name, String email, String day, String month, String year, String gender ) throws InterruptedException{

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(first_name_focus).click();
		
		driver.findElement(first_name).sendKeys(f_name);
		
		driver.findElement(last_name_focus).click();
		
		driver.findElement(last_name).sendKeys(l_name);
		
		driver.findElement(email_address_focus).click();
	    
		driver.findElement(email_address).sendKeys(email);  
		
		driver.findElement(birth_focus).click();
		
       
	//	js.executeScript("document.getElementsByName('dateofbirth')[0].setAttribute('value', '1988-02-05')");
	//	js.executeScript("document.getElementsByClassName('MuiInputBase-input MuiFilledInput-input css-2bxn45')[0].setAttribute('value', '1988-02-05')");
		
	    
		driver.findElement(date_of_birth).sendKeys(day);
		Thread.sleep(2000);
		driver.findElement(date_of_birth).sendKeys(month);
		Thread.sleep(2000);
		driver.findElement(date_of_birth).sendKeys(year);
		
	    if (gender == "Male") { driver.findElement(male_gender).click();}
	    
	    else if(gender == "Female"){driver.findElement(female_gender).click();}
	    
	    else if(gender == "Other"){driver.findElement(other_gender).click();}
	
	    //    driver.findElement(submit).click();
	    
	    //   driver.findElement(close_window).click();
	}


	public String get_Title(){

		return driver.getTitle();

	}

}