package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.ClassRule;
import org.junit.runner.RunWith;
import util.TestRule;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",
        tags = "@run1",
        glue = {"steps"},
        plugin = {"pretty",
                "json:target/jsonReports/cucumber-report.json",
               // "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        },
        monochrome = true
)
public class RunTest {

    @ClassRule
    public static TestRule testRule = new TestRule();


//    plugin = {"pretty",
//            "html:target/cucumber-reports/cucumber-reports.html",
//            "json:target/cucumber-reports/cucumber-reports.json"
//    },
//"com.automation.listeners.AzureTestPlansListener:target/azure",
//    @CucumberOptions(
//            features = "src/test/java/features",
//            glue = {"step"},
//            dryRun = false,
//            strict = true,
//            monochrome = true, "summary"
////		tags = "@AddPlace",
//            plugin = {"json:target/jsonReports/cucumber-report.json",
//                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
//            publish = false
//    )


}
