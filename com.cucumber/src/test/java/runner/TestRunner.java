package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//commands
@RunWith(Cucumber.class)
@CucumberOptions(features={"features"},glue={"stepDefinition"})
public class TestRunner
{

}
