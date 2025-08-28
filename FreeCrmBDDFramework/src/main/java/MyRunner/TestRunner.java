package MyRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.*;
import io.cucumber.testng.*;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.*;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features = "src/main/java/Features/login.feature", //the path of the feature files
			
			glue={"StepDefinition/loginpageStep"}, //the path of the step definition files
			
			monochrome = true, //display the console output in a proper readable format
			
		//	strict = true, //it will check if any step is not defined in step definition file
			
			dryRun = false //to check the mapping is proper between feature file and step def file
					
			)
	 
	public class TestRunner {
	 
	}
	
	
