package cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        plugin = {"progress", "html:target/cucumber/report.html",
                "message:https://b1f2yk58d8.execute-api.eu-west-3.amazonaws.com/api/repository/232ee238-cddf-4f94-ad90-52ab98b3ab43"},
        strict = true)
public class CC_CucumberRunner {

}
