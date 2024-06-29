package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*
 * single Scenario: tags="@Mobiles"
 * Multiple Scenario: Tage="@Tag1 or @Tag2"
 * Skip any one Scenario: tags=" not @tag1"
 * Skip Multiple Scenario: tags=" not @ignore"
 * To run all:= tags="@All"
 * 
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesFile/Amazon.feature",
					glue="stepdef",
					tags="@All",
					publish=true)
public class AmazonRunnerWithTag 
{

	
}
