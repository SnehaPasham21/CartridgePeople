package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report.html"}
						  		  , tags="@run"
								  , glue= {"StepDefinitions", "Utilities"}
								  , features="src/test/resources"
								)
//pretty is a reporting tool


public class Runnerclass {

}
