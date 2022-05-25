package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.ClassRule;
import org.junit.runner.RunWith;
import util.TestRule;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",
        tags = "@run1",
        glue = {"steps"},
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber-reports.html",
                "json:target/cucumber-reports/cucumber-reports.json"
        },
        monochrome = true
)
public class RunTest {

    @ClassRule
    public static TestRule testRule = new TestRule();

}
