package Pages;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class tour27_schedules{


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


public AndroidDriver driver;

  public tour27_schedules(AndroidDriver driver){

    this.driver = driver;

}

  public void schedules_tab(){
	
	  driver.findElement(schedules).click();
}



}