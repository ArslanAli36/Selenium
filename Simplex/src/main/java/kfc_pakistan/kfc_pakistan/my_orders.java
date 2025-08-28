package kfc_pakistan.kfc_pakistan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class my_orders { 

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	By menu_icon = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	
	By my_orders = By.xpath("//android.widget.Button[@content-desc='My Orders']");
	
	By order_no_date_bill = By.xpath("//android.widget.ImageView[@content-desc='Order # 10263053\nJune 12, 2025\nRs 361']");
	
//	By order_no_1 = By.xpath("(//android.widget.ImageView)[0]");  // error
	
//	By order_no_1 = By.className("android.widget.ImageView"); // 
	
	By order_no_1 = By.xpath("//android.widget.ImageView"); // 
	
	By order_date_1 = By.xpath("");
	
	By order_bill_1 = By.xpath("");
	
	
	By re_order_1 = By.xpath("(//android.widget.Button[@content-desc='REORDER'])[1]");
	
	By item_added_to_cart_popup = By.xpath("");
	
	By view_info_1 = By.xpath("(//android.widget.Button[@content-desc='VIEW INFO'])[1]");
	
	By view_info_popup_close = By.xpath("//android.widget.Button");
	
	By your_order_info = By.xpath("//android.view.View[@content-desc='Your Order\nOrder Number:\n10263053\n"
			+ "Order Channel: Delivery Store: KFC Store\n"
			+ "Delivery Address: Test House / Test Block / Test Area / Jamke Cheema, واجدآباد, جامکے روڈ, Punjab\n"
			+ "Sub Total\nRs 310\nDelivery Fee\nRs 50\nPOS Fee:\nRs 1\nTotal Rs 361\nPaid With Cash\nRs 361']");
	
	By order_no = By.xpath("");
	
	By order_channel = By.xpath("");
	
	By item_name_price = By.xpath("//android.view.View[@content-desc='Krunch Burger X 1\nRs 310']");
	
	By item_price = By.xpath("");
	
	By total_bill = By.xpath("");
	
	By feedback_1 = By.xpath("(//android.widget.Button[@content-desc='Feedback'])[1]");
	By select_feedback_type = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[7]");	
	By feedback_comments = By.xpath("//android.widget.Button[@content-desc='Comments']");
	By feedback_suggestions = By.xpath("//android.widget.Button[@content-desc='Suggestions']");
	By feedback_questions = By.xpath("//android.widget.Button[@content-desc='Questions']");
	By feedback_type_popup_close = By.xpath("//android.view.View[@content-desc='Select Feedback Type']/android.widget.Button");
	
	By feedback_category = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[8]");
	By product_quality = By.xpath("//android.widget.Button[@content-desc='Product Quality']");
	By accuracy = By.xpath("//android.widget.Button[@content-desc='Accuracy']");
	By late_order = By.xpath("//android.widget.Button[@content-desc='Late Order ']");
	By category_type_popup_close = By.xpath("//android.view.View[@content-desc='Select Category Type']/android.widget.Button");
	
	By feedback_text = By.xpath("//android.widget.EditText");
	
	By feedback_submit = By.xpath("//android.widget.Button[@content-desc='SUBMIT']");
	
	
	By re_order_2 = By.xpath("(//android.widget.Button[@content-desc='REORDER'])[2]");
	
    By view_info_2 = By.xpath("(//android.widget.Button[@content-desc='VIEW INFO'])[2]");
	
	By feedback_2 = By.xpath("(//android.widget.Button[@content-desc='Feedback'])[2]");
	
	By back_link = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
	
	
	public my_orders(WebDriver driver){

		this.driver = driver;

	}
	
	
	public void my_orders_page() throws InterruptedException{

        driver.findElement(menu_icon).click();
		
		driver.findElement(my_orders).click();
   	
	    Thread.sleep(7000);

	}
	
	
	public void my_orders_page_2() throws InterruptedException{

		
		driver.findElement(my_orders).click();
   	

	}
	
	
	public void order_history_info() throws InterruptedException{

//        driver.findElement(order_no_date_bill); // apply assertion here
		

	}
	
	public void submit_feedback() throws InterruptedException{

        driver.findElement(feedback_1).click();
		
		driver.findElement(select_feedback_type).click();
    	
	    driver.findElement(feedback_comments).click();

	    driver.findElement(feedback_category).click();
	    
	    driver.findElement(product_quality).click();
	    
	    driver.findElement(feedback_text).click();
	    
	    driver.findElement(feedback_text).sendKeys("Sample feedback");
	    
	    Thread.sleep(4000);
	    
	    driver.findElement(feedback_submit).click();
	    
	    // add feedback submitted assertion here for popup message
	    
	}

	public void reorder_item(){

        driver.findElement(re_order_1).click();
		
//		driver.findElement(item_added_to_cart_popup); // add assertion code here for popup message text

	}
	
	public void view_info(){
		

        driver.findElement(view_info_1).click();
        
		WebElement order_info = driver.findElement(By.xpath("//android.view.View[2]"));
        
        String order_info_text = order_info.getAttribute("content-desc");
        
        System.out.println(order_info_text);  


	}

	public void back_link_click(){

        driver.findElement(back_link).click();


	}
	
	
	public void verify_latest_order_id(String tracking_id) throws InterruptedException{   // Incorrect output
		
        
		driver.findElement(view_info_1).click();
		
		Thread.sleep(4000);
		
		WebElement order_info = driver.findElement(By.xpath("//android.view.View[2]"));
        
        String order_info_text = order_info.getAttribute("content-desc");
        
        System.out.println(order_info_text);
        
 //     String[] expected_order_no = content_string.split(" ");
        
 //     String expected_order_no_1 = expected_order_no.toCharArray();
      
 //     System.out.println(expected_order_no);
        
 //     String actual_order_no = tracking_id;
        
 //     Assert.assertEquals(expected_order_no, actual_order_no, "Order History Page is not showing latest order!");


	}
	
	

}












