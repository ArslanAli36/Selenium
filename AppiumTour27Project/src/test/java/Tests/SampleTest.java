package Tests;
import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import org.junit.*;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;

public class SampleTest {

//  public AndroidDriver driver;
  

 // @BeforeEach
  public void setUp() {
    BaseOptions options = new BaseOptions()
      .amend("appium:deviceName", "Galaxy A05")
      .amend("platformName", "Android")
      .amend("appium:platformVersion", "14")
      .amend("appium:udid", "R9VX30004XZ")
      .amend("appium:automationName", "UiAutomator2")
      .amend("appium:appPackage", "com.tour27")
      .amend("appium:appActivity", "com.tour27.MainActivity")
      .amend("appium:ensureWebviewsHavePages", true)
      .amend("appium:nativeWebScreenshot", true)
      .amend("appium:newCommandTimeout", 3600)
      .amend("appium:connectHardwareKeyboard", true);


    AndroidDriver driver = new AndroidDriver(options);
  }

  @Test
  public void sampleTest() {

  }

 // @AfterEach
//  public void tearDown() {
//    driver.quit();
//  }
}