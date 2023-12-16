package stepdefinations;

import org.openqa.selenium.WebDriver;

import commonfunction.FunctionLibrary;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pratice  
{
	WebDriver driver;
	@When("open browser")
	public void open_browser() throws Throwable 
	{
	    driver = FunctionLibrary.startBrowser();
	     
	}
	@When("open aapplication url {string}")
	public void open_aapplication_url(String url) 
	{
	    FunctionLibrary.openUrl(driver, url);
	}
	@When("wait for username with {string} and {string}")
	public void wait_for_username_with_and(String Locator_Type, String Locator_Value)
	{
	   FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, "10"); 
	}
	@When("enter username with {string} and {string}")
	public void enter_username_with_and(String Locator_Type, String Locator_Value) 
	{
	    FunctionLibrary.typeAction(driver, Locator_Type, Locator_Value, "admin");
	}
	@When("enter password with {string} and {string}")
	public void enter_password_with_and(String Locator_Type, String Locator_Value) 
	{
		FunctionLibrary.typeAction(driver, Locator_Type, Locator_Value, "master");
	}
	@When("click on login with {string} and {string}")
	public void click_on_login_with_and(String Locator_Type, String Locator_Value)
	{
	   FunctionLibrary.clickAction(driver, Locator_Type, Locator_Value);
	}
	@When("wait for supplier with {string} and {string}")
	public void wait_for_supplier_with_and(String Locator_Type, String Locator_Value) 
	{
		FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, "10");
	}
	    
	@When("click supplier with {string} and {string}")
	public void click_supplier_with_and(String Locator_Type, String Locator_Value) 
	{
		FunctionLibrary.clickAction(driver, Locator_Type, Locator_Value);
	}
	@When("wait for add button with {string} and {string}")
	public void wait_for_add_button_with_and(String Locator_Type, String Locator_Value) 
	{
		FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, "10");
	}
	@When("click on addbutton with {string} and {string}")
	public void click_on_addbutton_with_and(String Locator_Type, String Locator_Value) 
	{
		FunctionLibrary.clickAction(driver, Locator_Type, Locator_Value);
		
	}
	@When("wait for suppliernumber with {string} and {string}")
	public void wait_for_suppliernumber_with_and(String Locator_Type, String Locator_Value) 
	{
		FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, "10");
	    
	}
	@Then("capture data with {string} with {string}")
	public void capture_data_with_with(String Locator_Type, String Locator_Value) throws Throwable
	{
	   FunctionLibrary.capturesupplier(driver, Locator_Type, Locator_Value);
	}
	@When("enter in {string} with {string} and {string}")
	public void enter_in_with_and(String Test_Data,String Locator_Type, String Locator_Value)
	{
		FunctionLibrary.typeAction(driver, Locator_Type, Locator_Value, Test_Data);
	}
	@When("click add button after adding notes with {string} and {string}")
	public void click_add_button_after_adding_notes_with_and(String Locator_Type, String Locator_Value)
	{
		FunctionLibrary.clickAction(driver, Locator_Type, Locator_Value);
		
	}
	@When("wait for button with {string} and {string}")
	public void wait_for_button_with_and(String Locator_Type, String Locator_Value) 
	{
		FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, "10");
	}
	@When("click on ok button with {string} and {string}")
	public void click_on_ok_button_with_and(String Locator_Type, String Locator_Value) 
	{
		FunctionLibrary.clickAction(driver, Locator_Type, Locator_Value);
		
	}
	@When("wait for alert with {string} and {string}")
	public void wait_for_alert_with_and(String Locator_Type, String Locator_Value) 
	{
		FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, "10");
	}
	@When("click on alert with {string} and {string}")
	public void click_on_alert_with_and(String Locator_Type, String Locator_Value) 
	{
		FunctionLibrary.clickAction(driver, Locator_Type, Locator_Value);
		
	}
	@Then("user validate the supplier table")
	public void user_validate_the_supplier_table() throws Throwable 
	{
	   FunctionLibrary.supplierTable(driver); 
	}
	@When("user closes the browser")
	public void user_closes_the_browser() 
	{
	   FunctionLibrary.closeBrowser(driver);
	}



}
