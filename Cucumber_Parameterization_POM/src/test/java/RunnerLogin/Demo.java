package RunnerLogin;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature", glue = { "StepDefinitions" }, monochrome = true, plugin = {
		"pretty", "html:target/Reports" })

public class Demo {

}
