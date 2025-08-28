package Pages;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class tour27_pages{

	By permission = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
	By country_dropdown= By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView");
	By country_input = By.xpath("//android.widget.EditText[@resource-id=\"text-input-country-filter\"]");
	By country_select = By.xpath("//android.widget.ScrollView[@resource-id=\"list-countries\"]/android.view.ViewGroup/android.view.ViewGroup");
	By phone_number = By.xpath("//android.widget.EditText[@text=\"Phone Number\"]");
	By password = By.xpath("//android.widget.EditText[@text=\"Password\"]");
	By live_button = By.xpath("//android.widget.TextView[@text=\"GO LIVE\"]");
	By switch_live = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
	By login_button = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[4]");
	By f_password_link = By.xpath("//android.widget.TextView[@text=\"Forget Password?\"]");
	By enter_number = By.xpath("//android.widget.EditText[@text=\"Phone Number\"]");
	By send_button = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]");
	By back_to_login = By.xpath("//android.widget.TextView[@text=\"Back to login\"]");

	By signup_link = By.xpath("//android.widget.TextView[@text=\"Signup\"]");
	By platform_avail = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
	By phone_num = By.xpath("//android.widget.EditText[@text=\"Phone Number\"]");
	By go_live_button = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]");
	By switch_live_2 = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
	By continue_button = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]");

	By popup = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]");
	By get_started = By.xpath("//android.widget.TextView[@text=\"Get Started\"]");
	By skip_later = By.xpath("//android.widget.TextView[@text=\"Skip for later\"]");

	By home = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[1]");
	By tours = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[2]");
	By tours_plus = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup[2]");
	By location_accuracy = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
	By tours_next = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup");
	By tour_pic = By.xpath("//android.widget.ImageView");
	By gallery_link = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");
	By image_check = By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_check\"])[1]");
	By image_add = By.xpath("//android.widget.Button[@resource-id=\"com.google.android.providers.media.module:id/button_add\"]");
	By tour_title = By.xpath("//android.widget.EditText[@text=\"Tour Title\"]");
	By tour_landmark = By.xpath("//android.widget.EditText[@text=\"Landmark Name\"]");
	By price_per_tour = By.xpath("//android.widget.EditText[@text=\"Price Per Tour\"]");
	By tour_description = By.xpath("//android.widget.EditText[@text=\"Description\"]");
	By create_tour = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[5]");
	By skip_link = By.xpath("//android.widget.TextView[@text=\"Skip\"]");
	By next_link = By.xpath("//android.widget.TextView[@text=\"Next\"]");

	By schedules = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[3]");
	By select_latest_tour = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
	By schedule = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");
	By select_date = By.xpath("");
	By start_time = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.view.ViewGroup");
	By start_time_hr = By.xpath("//android.widget.EditText[@resource-id=\"android:id/numberpicker_input\" and @text=\"14\"]");
	By start_time_min = By.xpath("//android.widget.EditText[@resource-id=\"android:id/numberpicker_input\" and @text=\"30\"]");
	By confirm__start_time = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
	By end_time = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]");
	By end_time_hr = By.xpath("//android.widget.EditText[@resource-id=\"android:id/numberpicker_input\" and @text=\"14\"]");
	By end_time_min = By.xpath("//android.widget.EditText[@resource-id=\"android:id/numberpicker_input\" and @text=\"35\"]");
	By confirm_end_time = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
	By booking_status = By.xpath("");
	By max_participants = By.xpath("//android.widget.EditText[@text=\"Maximum Participants\"]");
	By price_per_tour_2 = By.xpath("//android.widget.EditText[@text=\"Price per tour\"]");
	By coupon_code = By.xpath("");
	By create_schedule = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]");

	By messages_tab = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[4]");
	By select_chat = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]");
	By select_chat_2 = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]");
	By write_message = By.xpath("//android.widget.EditText[@text=\"Type a message\"]");
	By send_message = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]");

	By menu = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
	By account = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]");
	By go_back = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup");
	
	By logout = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[13]");
	By profile = By.xpath("(//android.widget.TextView[@text=\"\"])[1]");
	By social_links = By.xpath("(//android.widget.TextView[@text=\"\"])[2]");
	By edit_profile = By.xpath("(//android.widget.TextView[@text=\"\"])[3]");
	By documents = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup[2]");
	By payment_method = By.xpath("(//android.widget.TextView[@text=\"\"])[5]");
	By earnings = By.xpath("(//android.widget.TextView[@text=\"\"])[6]");
	By tour_history = By.xpath("(//android.widget.TextView[@text=\"\"])[7]");
	By google_account = By.xpath("");
	By delete_account = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[9]");
	By deactivate_account = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[10]");

	public AndroidDriver driver;

	public tour27_pages(AndroidDriver driver){

		this.driver = driver;

	}

	
	public void notification_permission(){

		driver.findElement(permission).click();
	
	}
	
	
	public void setCountry(String country_value){

		driver.findElement(country_dropdown).click();
		driver.findElement(country_input).sendKeys(country_value);
		driver.findElement(country_select).click();
	}


	public void setPhoneNumber(String phone_value){

		driver.findElement(phone_number).sendKeys(phone_value);
	}

	public void setPassword(String password_value){

		driver.findElement(password).sendKeys(password_value);
	}

	public void go_live(){

		if(driver.findElements(live_button).size() != 0) { // driver.findElements(live_button).isEmpty()

			driver.findElement(live_button).click();
			driver.findElement(switch_live).click();
		}
	}

	public void click_login(){

		driver.findElement(login_button).click();
	}

	public void forgot_password(String number){

		driver.findElement(f_password_link).click();
		driver.findElement(enter_number).sendKeys(number);
		driver.findElement(send_button).click();
		//	driver.findElement(back_to_login).click();
	}

	public void sign_up(String number){

		driver.findElement(signup_link).click();
		driver.findElement(platform_avail).click();
		driver.findElement(phone_num).sendKeys(number);
		driver.findElement(go_live_button).click();
		driver.findElement(switch_live_2).click();
		driver.findElement(continue_button).click();
	}


	public void start(){

		driver.findElement(popup).click();
		driver.findElement(skip_later).click();
	}

	public void view_account(){

		driver.findElement(menu).click();
		driver.findElement(account).click();
		driver.findElement(go_back).click();
	}


	public void create_tour(String title, String landmark, String price, String description){

		driver.findElement(tours).click();
		driver.findElement(tours_plus).click();
		driver.findElement(location_accuracy).click();
		driver.findElement(tour_pic).click();
		driver.findElement(gallery_link).click();
		driver.findElement(image_check).click();
		driver.findElement(image_add).click();
		driver.findElement(tour_title).sendKeys(title);
		driver.findElement(tour_landmark).sendKeys(landmark);
		driver.findElement(price_per_tour).sendKeys(price);
		driver.findElement(tour_description).sendKeys(description);
		driver.findElement(create_tour).click();
		driver.findElement(skip_link).click();
		//	driver.findElement(next_link).click();
	}

	public void create_schedule(String max_tourists, String tour_price){

		driver.findElement(select_latest_tour).click();
		driver.findElement(schedule).click();
			driver.findElement(select_latest_tour).click();
			driver.findElement(schedule).click();
			driver.findElement(start_time).click();
			driver.findElement(start_time_hr).click();
			driver.findElement(start_time_min).click();
			driver.findElement(confirm__start_time).click();
			driver.findElement(end_time).click();
			driver.findElement(end_time_hr).click();
			driver.findElement(end_time_min).click();
			driver.findElement(confirm_end_time).click();
			
			driver.findElement(max_participants).sendKeys(max_tourists);
			driver.findElement(price_per_tour_2).sendKeys(tour_price);
			driver.findElement(create_schedule).click();
			
		
			
	}

	public void send_message(String message){

		driver.findElement(messages_tab).click();
		driver.findElement(select_chat).click();
		//	WebElement Element = driver.findElement();   	
		//	js.executeScript("arguments[0].scrollIntoView();", Element);
		driver.findElement(write_message).sendKeys(message);
		driver.findElement(send_message).click();

	}

	public void logout(){

		driver.findElement(menu).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(logout);   	
		js.executeScript("arguments[0].scrollIntoView();", Element);
		driver.findElement(logout).click();
	}



}