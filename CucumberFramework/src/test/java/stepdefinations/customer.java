package stepdefinations;

import org.openqa.selenium.WebDriver;

import commonfunction.FunctionLibrary;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class customer {
	
	WebDriver driver;
	@When("wait for customer with {string} and {string}")
	public void wait_for_customer_with_and(String Locator_Type, String Locator_Value) 
	{
	    FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, "10");
	}
	@When("click customer with {string} and {string}")
	public void click_customer_with_and(String Locator_Type, String Locator_Value) 
	{
	 FunctionLibrary.clickAction(driver, Locator_Type, Locator_Value);  
	}
	@When("wait for customernumber with {string} and {string}")
	public void wait_for_customernumber_with_and(String Locator_Type, String Locator_Value)
	{
	   FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, "10"); 
	}
	@Then("user validate the customer table")
	public void user_validate_the_customer_table() throws Throwable 
	{
	   FunctionLibrary.customerTable(driver);
	}




}
