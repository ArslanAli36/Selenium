package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import cucumber.api.junit.Cucumber;
import io.cucumber.*;
import io.cucumber.testng.*;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "/FreeCrmBDDFramework/src/main/java/Features/home.feature", // the path of the feature files
		
		glue= {"StepDefinition/googleSteps"}, // package names of step definition
		
		plugin = {"pretty", "cpm.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"+
				"timeline:test-output-thread/" }
		
		)
 

public class ParallelRun extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		
		return super.scenarios();
	}
	
	

}
