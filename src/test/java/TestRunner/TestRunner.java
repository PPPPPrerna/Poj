package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "src\\test\\java\\feature" ,
		
		glue = "stepdefination"
		
		
		
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}
