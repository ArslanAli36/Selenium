package test.java.parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.junit.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
				}, 
		monochrome = true,
		glue = { "parallel" },
		features = { "src/test/resources/parallel" }  // needs editing
	//	features = "D://eclipse//eclipse-workspace//Nakisa_excel//src//test//resources//parallel"
)

public class ParallelRun extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}