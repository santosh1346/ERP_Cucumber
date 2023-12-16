package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ERP
{
public static WebDriver driver;
@Given("I open browser with url {string}")
public void i_open_browser_with_url(String string)
{
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get(string);
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
}
@When("I enter user name as {string}")
public void i_enter_user_name_as(String string)
{
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys(string);
    
}
@When("i enter user password as {string}")
public void i_enter_user_password_as(String string)
{
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys(string);
}
@When("i click login")
public void i_click_login() 
	{
	driver.findElement(By.id("btnsubmit")).click();
	}
@Then("i should see login page")
public void i_should_see_login_page()
{
    if(driver.findElement(By.partialLinkText("Dashboard")).isDisplayed()) 
    {
    	System.out.println("system displayed dashboard");
    }
}
@When("i click logout")
public void i_click_logout()
{
	driver.findElement(By.partialLinkText("Dashboard")).click();   
}
@When("i close browser")
public void i_close_browser()
{
 driver.close();  
}		

}
