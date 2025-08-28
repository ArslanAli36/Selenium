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

public class tour27_tours{

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


public AndroidDriver driver;

  public tour27_tours(AndroidDriver driver){

    this.driver = driver;

}

  public void tours_tab(){
	
	  driver.findElement(tours).click();
}



}