package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	
	@Given("^user is already in Login Page$")
	public void user_is_already_in_Login_Page() throws Throwable {
	    System.out.println("Navigate to login page");
	    
	}

	@When("^Title of login Page is \"([^\"]*)\"$")
	public void title_of_login_Page_is(String arg1) throws Throwable {
	    System.out.println("Verify Title");
	    
	}

	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
	    System.out.println("Enter email and Password");
	    
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    System.out.println("Click on Login Button");
	    
	}

	@Then("^user get error for email$")
	public void user_get_error_for_email() throws Throwable {
	    System.out.println("verify error");
	    
	}

	@Then("^user quit$")
	public void user_quit() throws Throwable {
	    System.out.println("close browser");
	    
	}


}
