package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features" , //features tell cucumber options where feature files are located
		glue = ("StepDefinitions"), // glue tells cucumber options where all step definitions are located.
		tags = ("@smoke"),// tags tell cucumber options which scenario, scenario outline, or feature to run.
		dryRun = false , // if dryRun sets to false it will scan steps in scenario and scenario outline to find associated
		                  // steps in Step Definition class. If steps are missing it will print out in console.
		monochrome = true, // makes the console output readable
		strict = false , // if set to false will fail the execution if there are pending steps
		format = {"pretty",
				"html:target/cucumber-reports/cucumber-pretty",
		        "json:target/cucumber-reports/CucumberTestReport.json",
		        "rerun:target/cucumber-reports/rerun.txt"
		},
		plugin = "json:target/cucumber-reports/CucumberTestReport.json"
		)
	
public class TestRunner {

}
