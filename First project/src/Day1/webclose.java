package Day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class webclose {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	
	driver.quit();
}
}