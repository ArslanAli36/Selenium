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
import Tests.tour27_test;

public class tour27_tours{


By tours = By.xpath("");

public AndroidDriver driver;

  public tour27_tours(AndroidDriver driver){

    this.driver = driver;

}

  public void tours_tab(){
	
	  driver.findElement(tours).click();
}



}