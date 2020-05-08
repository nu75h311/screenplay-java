package cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features" },
                 plugin = { "pretty", "html:target/cucumber/report.html" },
                 strict = true)
public class CC_CucumberRunner {
}
