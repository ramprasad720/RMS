package StepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {

	@Given("User is on login pagen")
	public void user_is_on_login_pagen() {
	   
		System.out.println("Inside step- User is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		 System.out.println("Inside step- User enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		 System.out.println("Inside step- User clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		 System.out.println("Inside step- User is successfully navigated to home page ");
	}

}
