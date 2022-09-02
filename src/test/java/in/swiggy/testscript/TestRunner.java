package in.swiggy.testscript;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Features"
				,glue ="in.swiggy.testscript"
				,plugin = {"progress", "html:target/Cucumber.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
