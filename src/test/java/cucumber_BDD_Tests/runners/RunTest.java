package cucumber_BDD_Tests.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
features = "src/test/resources/features",
        glue = {"cucumber_BDD_Tests.stepDefinitions", "cucumber_BDD_Tests.hooks"},
        tags = "@Sample",
        dryRun = false,
        plugin = "html:target/cucumber-report/CTSMS-Test-Automation-Report.html"

)
public class RunTest extends AbstractTestNGCucumberTests {
}
