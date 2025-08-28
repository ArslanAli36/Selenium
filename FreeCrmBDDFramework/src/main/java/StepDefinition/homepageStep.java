package StepDefinition;
import Pages.loginpage;
import Pages.TestBase;
import Pages.homepage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.eclipse.jetty.util.annotation.*;

public class homepageStep extends TestBase{
	
	loginpage loginpage = new loginpage();
	homepage homepage;
	
   @Given("^user opens browser$")
   public void user_opens_browser() throws Throwable{
	   TestBase.initialization();
	      
   }
   
   @Then("^user is on login page$")
   public void user_is_on_login_page() throws Throwable{
	   String title = loginpage.validateLoginPageTitle();
	   Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
	   
	    }
   
   @Then("^user clicks signup button$")  ///new
   public void user_clicks_signup_button() throws Throwable{
	   homepage homepage= new homepage();
	   homepage.sign_up();
	   
	   
	    }
   
   @Then("^user signup into website$")  ///new
   public void user_signup_into_website() throws Throwable{
	   homepage homepage= new homepage();
	   homepage.signup_form(prop.getProperty("email"), prop.getProperty("c_code"), prop.getProperty("phone"));
	   
	    }
   @Then("^user clicks login button$")  ///new
   public void user_clicks_login_button() throws Throwable{
	   homepage homepage= new homepage();
	   homepage.login();
	   
	    }
   
   @Then("^user logs into website$")
      
   public void user_enters_username_and_password() throws Throwable{
	   loginpage loginpage = new loginpage();
	   Thread.sleep(6000);
	   loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	   
	    }
   @Then("^validate home page title$")
   public void validate_home_page_title() throws Throwable{
	   String homeTitle= homepage.verifyHomePageTitle();
	   Assert.assertEquals("crMPro",homeTitle);
	    }
   
   @Then("^validate logged in username$")
   public void validate_logged_in_username() throws Throwable{
	   boolean flag = homepage.verifyCorrectUserName();
	   Assert.assertTrue(flag);
	   
	   
   }
}
