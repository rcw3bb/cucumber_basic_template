package gradle.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
        glue = "gradle.cucumber.step",
        features = "src/test/resources/features")
public class CucumberRunner {
}
