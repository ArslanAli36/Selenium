package test.java.testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
	
		features = {"src/test/resources/AppFeatures"},
		
		glue = {"stepdefinitions", "AppHooks"},
		
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"

				
		}
		
		)

public class MyTestRunner {

}
