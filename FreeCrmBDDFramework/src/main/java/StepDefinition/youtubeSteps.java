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
import Pages.youtube_page;

public class youtubeSteps extends TestBase{   // do not change

	
	 youtube_page youtube_page = new youtube_page();
	 
	 @Given("^user opens chrome browser$")          // do not change
	 public void user_opens_chrome_browser(){
	
		 TestBase.initialization();
	 }
	 
	 @When("^user enter youtube URL$")
	 public void user_enter_youtube_URL() throws Throwable {
		
		youtube_page youtube_page = new youtube_page();
	    
		youtube_page.enterURL("www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	 }
	
	 @Then("^youtube page opens$")
	 public void youtube_page_opens(){		
	
		 youtube_page youtube_page = new youtube_page();
		 String title = youtube_page.HomePageTitle();
		 System.out.println(title);
		 Assert.assertEquals("YouTube", title); 
	 }
	
	 @When("^enter search value and click search button$")
	 public void search_value_and_click(){
		 
		 youtube_page youtube_page = new youtube_page();
		 youtube_page.enterSearchData("");
		 youtube_page.clickOnSearch();
		 System.out.println("uptil here");
		 
	 }

	 @Then("^youtube search shows results$")
	 public void youtube_results(){
		 youtube_page youtube_page = new youtube_page();
		 System.out.println("search results");
	 }
	 
	 @Then("^click the first link$")
	 public void first_link(){
		 youtube_page youtube_page = new youtube_page(); 
		 youtube_page.clickOnFirstLink();
		 
		 System.out.println("first link");
	 }
	 
	 
}
