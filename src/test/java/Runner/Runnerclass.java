package Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/Features"},
		glue= {"src/test/java/stepdefinitions"},
		format= {"pretty","html:report"},
		monochrome=true,
		tags= {"@google"}
		)
public class Runnerclass {
	@AfterClass
	public static void empltyclass() {
		
	}

}
