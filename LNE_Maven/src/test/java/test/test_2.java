package Test;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test_2 {

	public static void main(String[] args) {
		
		String driverPath = "C:\\Users\\ABCD\\geckodriver-v0.30.0-win64\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver",driverPath);
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
	//	driver = new ChromeDriver();
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://lne21-git-master-nse.vercel.app/");
		
		// TODO Auto-generated method stub
		
		System.out.println("here");
	}

}
