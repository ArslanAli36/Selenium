package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class tour27_login {
	
	By permission = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
	By country_dropdown= By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView");
	By country_input = By.xpath("//android.widget.EditText[@resource-id=\"text-input-country-filter\"]");
	By country_select = By.xpath("//android.widget.ScrollView[@resource-id=\"list-countries\"]/android.view.ViewGroup/android.view.ViewGroup");
	By phone_number = By.xpath("//android.widget.EditText[@text=\"Phone Number\"]");
	By password = By.xpath("//android.widget.EditText[@text=\"Password\"]");
	By live_button = By.xpath("//android.widget.TextView[@text=\"GO LIVE\"]");
	By switch_live = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
	By login_button = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[4]");
	By popup = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]");
	By get_started = By.xpath("//android.widget.TextView[@text=\"Get Started\"]");
	By skip_later = By.xpath("//android.widget.TextView[@text=\"Skip for later\"]");
	
	
	public AndroidDriver driver;

	  public tour27_login(AndroidDriver driver){

	    this.driver = driver;

	}

	  public void login(String country_value, String phone_value, String password_value){

			driver.findElement(permission).click();
			driver.findElement(country_dropdown).click();
			driver.findElement(country_input).sendKeys(country_value);
			driver.findElement(country_select).click();
			driver.findElement(phone_number).sendKeys(phone_value);
			driver.findElement(password).sendKeys(password_value);
			if(driver.findElements(live_button).size() != 0) { // driver.findElements(live_button).isEmpty()

				driver.findElement(live_button).click();
				driver.findElement(switch_live).click();
			}
			
			driver.findElement(login_button).click();
			
			driver.findElement(popup).click();
			driver.findElement(skip_later).click();
			
			
		}
	  



}
