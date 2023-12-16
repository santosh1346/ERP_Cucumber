
package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"./featurefile/customer.feature"},
                  dryRun =  false,
                  glue = "stepdefinations")

public class Customer {
	

}
