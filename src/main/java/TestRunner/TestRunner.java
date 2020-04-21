package TestRunner;



import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\jithe\\Desktop\\avali\\Demooooo\\POM_BDD_frame\\src\\main\\java\\Feature\\login.feature"
,glue={"StepDefinition"},
format= {"pretty","html:test-outout","json:json_output/cucumbr.json","junit:junit_xml/cucumber.xml"},
dryRun=false,
strict=true
//tags= {"~@End2End", "~@SmokeTest","@RegressionTest"}
)


public class TestRunner {

}
