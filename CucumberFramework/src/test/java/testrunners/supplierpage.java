package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"featurefile/Supplier.feature"},
                  glue ="stepdefinations",
                  dryRun = true ,
                  plugin = {"pretty","html:testreports/supplieresult.html"}
                )
public class supplierpage
{

}
