package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesFile/yourlogo.feature",
					glue="stepdef")
public class yourlogoRunner {

}
