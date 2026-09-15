package cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/cucumber",
    glue = "rahulshettyacademy.stepDefinitions",
    monochrome = true,
    plugin = {"html:target/cucumber.html"}
)
public class CucumberTestRunner {
}
