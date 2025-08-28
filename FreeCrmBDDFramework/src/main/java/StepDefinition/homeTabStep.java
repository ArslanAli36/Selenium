package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;
import Pages.TestBase;
import Pages.homeTab;

public class homeTabStep extends TestBase{   // do not change

	
	 homeTab homeTab = new homeTab();
	 
	 @Given("^user opens chrome browser$")          // do not change
	 public void user_opens_chrome_browser(){
		 TestBase.initialization();
	 }
	 
	 @When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void user_enter_and(String username, String password) throws Throwable {
		homeTab homeTab = new homeTab();
	    System.out.println("yooooo");
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    homeTab.login(prop.getProperty("username"), prop.getProperty("password"));	
	 //   homeTab.login(username, password);
	 }
	
	 @Then("^user comes on home Tab$")
	 public void user_on_home_Tab(){		
	//	 TestBase.initialization();
		 String title = homeTab.get_Title();
		 System.out.println(title);
		 Assert.assertEquals("Cogmento CRM", title); 
	 }
	
	 @When("^user clicks on refresh icon$")
	 public void user_clicks_on_refresh_icon(){
		 homeTab homeTab = new homeTab();
		 System.out.println("uptil here");
		 homeTab.refresh_CAS();
	 }

	 @Then("^nothing happens$")
	 public void nothing_happens(){
		 System.out.println("nothing here");
	 }
	 
	 @When("^user clicks on settings icon$")
	 public void user_clicks_on_settings_icon(){
		 homeTab homeTab = new homeTab();
		 homeTab.settings_CAS();
	 }
	 
	 @Then("^placeholder Show activity stream for is displayed$")
	 public void placeholder_is_displayed(){
	  homeTab homeTab = new homeTab();
	  String text = homeTab.settings_placeholder();
	 System.out.println(text);
	 Assert.assertEquals("Show activity stream for", text);
	 }
 
	 @When("^user clicks on about icon$")
	 public void user_clicks_on_about_icon(){
		 homeTab homeTab = new homeTab();
		 homeTab.about_CAS();
	 }
	 
	 @Then("^activity_help is displayed$")
	 public void activity_help_is_displayed(){
	 homeTab homeTab = new homeTab();
     String text = homeTab.about_text();
	 System.out.println(text);
	 Assert.assertEquals("activity_help", text);
	 }

	 @Then("^user makes different interactions with website$")
	 public void user_makes_different_interactions_with_website(){
	 homeTab homeTab = new homeTab();
	// homeTab.settings_dropdown();
	// homeTab.calendar();
	// homeTab.twitter();
	 homeTab.exchange_rates();
	 System.out.println("interactions");
	 
	 }
	 
	 
	 
	 
	 
	 
	 
}
