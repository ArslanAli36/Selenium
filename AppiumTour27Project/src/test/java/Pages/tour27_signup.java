package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class tour27_signup {

	
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

	
	public AndroidDriver driver;

	public tour27_signup(AndroidDriver driver){

		this.driver = driver;

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
}
