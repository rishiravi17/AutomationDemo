package cucumber.options;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"},
					glue = "stepdefinitions",
					strict = true, dryRun = false, monochrome = true,
					tags = { "@Smoke" },
					plugin = { "pretty", "html:target/cucumber", "json:target/cukes.json",	"junit:target/cukes.xml" })

public class TestRunner extends AbstractTestNGCucumberTests {
	

}
