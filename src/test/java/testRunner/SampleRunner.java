package testRunner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
		
		features = {"/src/test/java/featureFiles"},
		glue = {"stepDefinitions","/src/test/java"},
		tags = {"@Smoke"},
		
		monochrome = true,
		strict = true,
		plugin = {"preety"}
			
		)

public class SampleRunner{
	
}
