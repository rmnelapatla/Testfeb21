package stepdef;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "E:\\Hari_training\\src\\main\\resources\\features"
        ,glue={"stepDefinition"}
)
public class Testrunner {

}
