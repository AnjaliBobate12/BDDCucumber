package stepdefination;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {

	@Given("User is on Netbanking Landing Page")
	public void user_is_on_netbanking_landing_page() {
	    System.out.println("User landed on netbanking page");
	//    Assert.assertTrue(false);
	}

	@When("User Login into application")
	public void user_login_into_application() {
	    System.out.println("User login intoapplication");
	}
	

@When("User Login into application with {string} and password {string}")
public void user_login_into_application_with_and_password(String username, String password) {
    System.out.println(username+ " and password is "+ password);
}

@When("User Login into application with {string} and password {string} combination")
public void user_login_into_application_with_and_password_combination(String username, String password) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(username+ " and password is "+ password); 
}

@When("^User Login into application with (.+) and password (.+) combination for regax pattern$")
public void user_login_into_application_with_and_password_combination_for_regax_pattern(String username, String password) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(username+ " and password is "+ password); 
}

	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	   System.out.println("Home page is displayed");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Cards are displayed");
	}
	
	//Background
	@Given ("setup the entries in database")
	public void setup_the_Entries() {
		System.out.println("********************");
		System.out.println("setup the entries");
	}
	@When ("Lanch the browser from config variables")
	public void Launch_the_Browser() {
		System.out.println("Launching the browser");
	}
	@When ("hit the home page url of banking site")
	public void hit_the_URL() {
		System.out.println("hitting the URL");
	}
	
}
