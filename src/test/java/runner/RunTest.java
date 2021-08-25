package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
       features = "classpath:Features",
        glue ="StepDefs",
        tags ="@Example",
        plugin = {"pretty",
        "html:target/cucumber-reports.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        dryRun = false
)
public class RunTest extends AbstractTestNGCucumberTests {

}
