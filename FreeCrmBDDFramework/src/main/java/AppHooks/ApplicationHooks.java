package AppHooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.AfterStep;

public class ApplicationHooks {

	@Before("@google")
	public void before_google() {
		
		System.out.println("before google");
		
		
	}
		
	@Before("@youtube")
	public void before_youtube() {
		System.out.println("before youtube");
			
	}
	
	@After("@google")
	public void after_google() {
		System.out.println("after google");
			
	}
	
	@After("@youtube")
	public void after_youtube() {
		
		System.out.println("after youtube");
			
	}
	
	
}

















