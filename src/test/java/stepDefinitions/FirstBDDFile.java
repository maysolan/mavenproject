package stepDefinitions;

import org.openqa.selenium.WebDriver;
import commonClass.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClass.LoginPage;

public class FirstBDDFile extends Hooks{
	String username = "standard_user";
	String pwd = "secret_sauce";
	LoginPage loginpage = new LoginPage();
	WebDriver driver = Hooks.driversetup();


	@Given("I want to launch the Saucelab URL")
	public void i_want_to_launch_the_Saucelab_URL() throws InterruptedException {
		loginpage.launchurl();
		
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("I want to enter \"([^\"]*)\" and \"([^\"]*)\"")
	public void i_want_to_enter_and(String username, String password) throws InterruptedException {
		loginpage.login(username, password);
		
		throw new io.cucumber.java.PendingException();
	}

//	@When("I want to enter username1 and secret_sauce")
//	public void i_want_to_enter_standard_user_and_secret_sauce() {
//		
//		
//	    throw new io.cucumber.java.PendingException();
//	}

	@Then("I click on the submit button")
	public void i_click_on_the_submit_button() throws InterruptedException {
		loginpage.submit();
		
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I validate that account login is successfull")
	public void i_validate_that_account_login_is_successfull() throws InterruptedException {
		loginpage.validate();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I will quite my browser")
	public void i_will_quite_my_browser() {		
	    driver.quit();
	    throw new io.cucumber.java.PendingException();
	}


	
	
	
	
	
}