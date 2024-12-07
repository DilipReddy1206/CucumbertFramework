package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\java\\Features\\Search.feature"},glue = {"StepDefinition"},plugin = {"pretty","html:target/htmlreports/htmlreport.html"})
public class RunSearch extends AbstractTestNGCucumberTests {
}
