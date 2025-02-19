package cucumber_BDD_Tests.hooks;

import com.chromatech.automation.utils.CucumberLogUtils;
import com.chromatech.automation.utils.WebDriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void start(Scenario scenario) {
        CucumberLogUtils.scenario = scenario;
        WebDriverUtils.setUp();

    }

    @After
    public void stop() {
   WebDriverUtils.driver.quit();

   }

}
