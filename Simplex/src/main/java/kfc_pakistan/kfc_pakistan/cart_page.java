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
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class cart_page {

	WebDriver driver;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	// Cart
	
	By bucket_icon_homepage = By.xpath("//android.widget.ImageView[@content-desc='0']");

	By delete_item = By.xpath(
			"//android.view.View[@content-desc='Krunch Burger Kfc (Krunch Burger) Rs 310 1']/android.view.View[1]");

	By increase_item = By.xpath(
			"//android.view.View[@content-desc='Krunch Burger Kfc (Krunch Burger) Rs 310 1']/android.view.View[2]");

	By delivery_instr = By.xpath("//android.widget.ScrollView/android.widget.EditText[1]");

	By alt_number = By.xpath("//android.widget.ScrollView/android.widget.EditText[2]");

	By explore_menu_link = By.xpath("//android.view.View[@content-desc='Explore Menu Add more items in your bucket']");

	By sub_total_value = By.xpath("//android.view.View[4]");
	
	By gst_value = By.xpath("//android.view.View[6]");
	
	
	By sales_text = By.xpath("//android.view.View[@content-desc='Rs 40']");

	By delivery_fee = By.xpath("//android.view.View[@content-desc='Rs 50']");

	By total_bill = By.xpath("//android.view.View[@content-desc='Rs 360']");

	By donate_now_1 = By.xpath("(//android.widget.Button[@content-desc='Donate Now'])[1]");

	By donate_now_2 = By.xpath("(//android.widget.Button[@content-desc='Donate Now'])[2]");

	By donation_amount = By.xpath("//android.widget.EditText");

	By donate_now_3 = By.xpath("(//android.widget.Button[@content-desc='Donate Now'])[3]");
	
	By donation_success_popup = By.xpath("//android.widget.Toast[@text='Donation added to cart.']");

	By also_like_1 = By.xpath("(//android.widget.Button[@content-desc='ADD TO BUCKET'])[1]");

	By also_like_2 = By.xpath("(//android.widget.Button[@content-desc='ADD TO BUCKET'])[2]");

	By also_like_3 = By.xpath("(//android.widget.Button[@content-desc='ADD TO BUCKET'])[3]");
	
	By checkout_link_311 = By.xpath("//android.view.View[@content-desc='Rs 311\nCheckout']");
	
	By checkout_link_361 = By.xpath("//android.view.View[@content-desc='Rs 361\nCheckout']");

	By checkout_link_851 = By.xpath("//android.view.View[@content-desc='Rs 851\nCheckout']");
	
	By donation_checkout_link = By.xpath("//android.view.View[@content-desc='Rs 531\nCheckout']");

	
	public cart_page(WebDriver driver) {

		this.driver = driver;

	}

    public void check_out_311() throws InterruptedException {  // Click checkout link

		
		driver.findElement(checkout_link_311).click();  // this locator is fixed/constant


	}
	
	public void check_out_361() throws InterruptedException {  // Click checkout link

		
		driver.findElement(checkout_link_361).click();  // this locator is fixed/constant


	}
	
	public void check_out_851() throws InterruptedException {  // Click checkout link

		
		driver.findElement(checkout_link_851).click();  // this locator is fixed/constant


	}
	
    public void give_donation() throws InterruptedException {  // Donation

		
		driver.findElement(donate_now_1).click();
		
		driver.findElement(donate_now_2).click();
		
		driver.findElement(donation_amount).click();
		
		driver.findElement(donation_amount).sendKeys("100");
		
		driver.findElement(donate_now_3).click();


	}
    
    public void verify_donation_success() throws InterruptedException {  // Donation

		
		WebElement popup_text = driver.findElement(donation_success_popup);

		String actual_text = popup_text.getAttribute("Text");

		String expected_text = "Donation added to cart.";

		Assert.assertEquals(actual_text, expected_text, "Test case failed");
		
    }
    
    public void verify_donation_amount() throws InterruptedException {  // Donation

		
		WebElement amount_element = driver.findElement(donation_checkout_link);

		String actual_amount = amount_element.getAttribute("content-desc");

		String expected_amount = "Rs 531\nCheckout";

		Assert.assertEquals(actual_amount, expected_amount, "Test case failed");
		
    }
	
	
	
    public void verify_total_bill(String bill_amount){  // Click checkout link

		
	//	assert total bill value
    	
    	WebElement bill_value = driver.findElement(By.xpath("//android.view.View[@content-desc='Rs "+bill_amount+"']"));
    	
    	System.out.println(bill_value);
    	
    //	Assert.assertEquals(bill_amount, bill_value, "Assertion Failed");
		

	}
    
    
    public void verify_gst_value(){

    	
    	    WebElement sub_total = driver.findElement(sub_total_value);
    	    
    	    String item_price = sub_total.getAttribute("content-desc");
    	    
//    	    System.out.println(item_price);
    	    
    	    String[] item_price_2 = item_price.split(" ");
    	    
    	    System.out.println(item_price_2[1]);
    	    
    	    Double item_price_double = Double.valueOf(item_price_2[1]);
    	
    	    Double expected_gst_value = item_price_double * 0.15;
        	
        	WebElement gst_value_1 = driver.findElement(gst_value);
        	
        	String actual_gst_value = gst_value_1.getAttribute("content-desc");
        	
 //       	System.out.println(actual_gst_value);
        	
        	 String[] actual_gst_value_2 = actual_gst_value.split(" ");
     	    
     	    System.out.println(actual_gst_value_2[1]);
        	
        	Assert.assertEquals(actual_gst_value, expected_gst_value, "GST value is not correct!");
    		

    	}
    


}





