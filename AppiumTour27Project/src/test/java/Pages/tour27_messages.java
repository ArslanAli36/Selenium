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

public class tour27_messages{


	By messages_tab = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[4]");
	By select_chat = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]");
	By select_chat_2 = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]");
	By write_message = By.xpath("//android.widget.EditText[@text=\"Type a message\"]");
	By send_message = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]");


	public AndroidDriver driver;

	public tour27_messages(AndroidDriver driver){

		this.driver = driver;

	}

	public void messages_tab(){

		driver.findElement(messages_tab).click();
	}


	public void send_message(String user_name, String sms_text){


		//android.widget.TextView[@text="Saqib Tourist1"]
		//android.widget.TextView[@text="Faizan  NewTourist"]
		//android.widget.TextView[@text="Arslan Tourist"]
		//android.widget.TextView[@text="Awais Tourist"]

		driver.findElement(By.xpath("//android.widget.TextView[@text=\""+user_name+"\"]")).click(); //pass string parameter in Xpath
    	driver.findElement(write_message).sendKeys(sms_text);
		driver.findElement(send_message).click();


	}

}