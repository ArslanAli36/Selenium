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
import Pages.google_page;
import Pages.youtube_page;

public class googleSteps extends TestBase{   // do not change

	
	 google_page google_page = new google_page();
	 
	 @Given("^user opens chrome$")          // do not change
	 public void user_opens_chrome(){
	
		 TestBase.initialization();
	 }
	 
	 @When("^user enter google URL$")
	 public void user_enter_google_URL() throws Throwable {
		
		google_page google_page = new google_page();
	    
		google_page.enterURL("www.google.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	 }
	
	 @Then("^google page opens$")
	 public void google_page_opens(){		
		 google_page google_page = new google_page();
		 String title = google_page.HomePageTitle();
		 System.out.println(title);
		 Assert.assertEquals("Google", title);
	 }
	
	 @When("^enter search value and click google search button$")
	 public void search_value_and_click(){
		
		 google_page google_page = new google_page();
		 google_page.enterSearchData("");
		 google_page.clickOnSearch(); 
		 System.out.println("uptil here");
		 
	 }

	 @Then("^google search shows results$")
	 public void google_results(){
		 
		 google_page google_page = new google_page();
		 System.out.println("search results");
	 }
	 
	 @Then("^clicks on first link$")
	 public void clicks_first_link(){
		 
		 google_page google_page = new google_page();
		 google_page.clickOnFirstLink();
		 System.out.println("first link");
	 }
	 
	 
}
