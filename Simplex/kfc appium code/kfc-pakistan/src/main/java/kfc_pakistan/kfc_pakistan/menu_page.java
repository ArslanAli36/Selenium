package kfc_pakistan.kfc_pakistan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class menu_page { 

	WebDriver driver;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	By Everyday_value = By.xpath("//*[@id='root']/div[2]/div[3]/div[1]/div/a[1]");
	By Ala_combos = By.xpath("//*[@id='root']/div[2]/div[3]/div[1]/div/a[2]");
	By Promotion = By.xpath("//*[@id='root']/div[2]/div[3]/div[1]/div/a[3]");
	By Signature_boxes = By.xpath("//*[@id='root']/div[2]/div[3]/div[1]/div/a[4]");
	By Sharing = By.xpath("//*[@id='root']/div[2]/div[3]/div[1]/div/a[5]");
	By Snack = By.xpath("//*[@id='root']/div[2]/div[3]/div[1]/div/a[6]");
	By Midnight = By.xpath("//*[@id='root']/div[2]/div[3]/div[1]/div/a[7]");
	
	
	By food_title = By.xpath("//*[@id='EverydayValue']/div[1]/div/div/div/div[1]/h5");
	
	                          //*[@id="EverydayValue"]/div[2]/div/div/div/div[1]/h5
	
	By add_to_bucket = By.xpath("//*[@id='EverydayValue']/div[1]/div/div/div/div[2]/div/button[1]");
	                             //*[@id="EverydayValue"]/div[2]/div/div/div/div[2]/div/button[1]
	                             //*[@id="EverydayValue"]/div[2]/div/div/div/div[2]/div/button[1]
	                             //*[@id="EverydayValue"]/div[4]/div/div/div/div[2]/div/button[1]
	
	By heart_link = By.xpath("//*[@id='EverydayValue']/div[1]/div/div/div/div[1]/span/div/button");
	                          //*[@id="EverydayValue"]/div[2]/div/div/div/div[1]/span/div/button 
	                          //*[@id="EverydayValue"]/div[3]/div/div/div/div[1]/span/div/button
	
	By delivery_link = By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/button");
    By pickup_link = By.xpath("/html/body/div[3]/div/div/div[3]/div/div[2]/button");
	By close_channel_popup = By.xpath("/html/body/div[3]/div/div/div[2]/button");
	
	By enter_address = By.xpath("//*[@id='simplex-maps-search-input']");
	By confirm_location = By.xpath("/html/body/div[5]/div/div/div[3]/div/div/div/div/div[2]/div[3]/button");
	By save_address = By.xpath("/html/body/div[5]/div/div/div[3]/div/div/div/div/div[2]/div[4]/label/span[1]/input");
	By start_order = By.xpath("/html/body/div[5]/div/div/div[3]/button");
    By close_location = By.xpath("/html/body/div[5]/div/div/div[2]/button");
    
    By pickup_input = By.xpath("//*[@id=\"exampleInputEmail1\"]");
    
    By start_order_2 = By.xpath("/html/body/div[5]/div/div/div[3]/button");
    
    By view_bucket = By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div/div/div[2]/div/a");
    
    By checkout = By.xpath("");
    
    By price_value = By.xpath("//*[@id='EverydayValue']/div[1]/div/div/div/h4");
                               //*[@id="EverydayValue"]/div[2]/div/div/div/h4
                               //*[@id="EverydayValue"]/div[3]/div/div/div/h4
    
	public menu_page(WebDriver driver){

		this.driver = driver;

	}

	public void add_to_bucket(String food_title){
			
	
		driver.findElement(add_to_bucket).click();
		driver.findElement(delivery_link).click();
		driver.findElement(pickup_link).click();

	}


	public void add_to_favorites(String food_title){

		driver.findElement(heart_link).click();   

	}
	

}