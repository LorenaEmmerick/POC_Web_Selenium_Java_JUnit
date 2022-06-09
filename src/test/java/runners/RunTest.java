package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.*;
import org.junit.runner.RunWith;
import utils.TestRule;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",
        tags = "@run",
//        tags = "@run2",
        glue = {"steps"},
        plugin = { "summary", "pretty", "json:target/jsonReports/cucumber-report.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true
)
public class RunTest {

    @ClassRule
    public static TestRule testRule = new TestRule();

}
