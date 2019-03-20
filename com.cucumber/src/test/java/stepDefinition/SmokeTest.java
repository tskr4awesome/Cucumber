package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest
{
     WebDriver driver ;
	
	@Given("^Open firefox and start application$")
	public void Open_firefox_and_start_application() throws Throwable
	{
		
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\saikumar.reddy\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe" );
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	}
	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void I_enter_valid_and_valid(String uname, String passwrd) throws Throwable {
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(uname);
	  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(passwrd);
	 
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable 
	{
	  
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
