package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features="src\\test\\resources\\Features\\login.feature",
			glue="stepDefinition",
			tags="@tag2",
			dryRun=false,
			monochrome=true
			)

public class runnerClass {
	
	

}
