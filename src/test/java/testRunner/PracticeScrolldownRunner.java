package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesFile/PracticeScrollDown.feature",
					glue="stepdef",
					publish=true)
public class PracticeScrolldownRunner 
{
	

}
