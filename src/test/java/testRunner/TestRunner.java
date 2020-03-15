package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features//OrangeHRMLoginPage.feature",
                 glue = "stepDefinitions",
                 plugin = {"pretty", "html:test-output","json:target/cucumber/cucumber.json"}
        )
public class TestRunner {
}
