package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

// Author : Bintu Dhillon 

@RunWith(Cucumber.class)

@CucumberOptions(tags = "@Regression", plugin = {"pretty","html:target/cucumber-html-report",
        "json:target/cucumber.json"
        }, glue = "com.test.bintudhillon.steps",
        features = "src/test/java/features/")
public class TestRunner {
}