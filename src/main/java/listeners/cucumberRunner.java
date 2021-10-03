package listeners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = { "stepDefinitions", "core"},
        monochrome = true,
        tags = "@Smoke",
        plugin = {"pretty", "html:target/cucumber/", "json:target/report/cucumber.json",
                "junit:target/report/cucumber.xml, io.testproject.sdk.internal.reporting.extensions.cucumber.CucumberReporter"}
        )

public class cucumberRunner {

}

