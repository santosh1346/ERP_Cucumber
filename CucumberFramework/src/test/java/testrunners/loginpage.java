package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"featurefile/login.feature"},
                  glue = "stepdefinations" ,    
                   dryRun = true,
                   plugin = {"pretty","html:testreports/logresult.html"}
                   )
public class loginpage extends  AbstractTestNGCucumberTests
{
	

}
