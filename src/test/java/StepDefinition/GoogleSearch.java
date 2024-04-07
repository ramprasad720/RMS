package StepDefinition;


import org.openqa.selenium.WebDriver;

import Pages.Google;

import Utilities.CommonFunctions;
import io.cucumber.java.en.*;

public class GoogleSearch {
	WebDriver driver;
	CommonFunctions cs = new CommonFunctions();
	Google gl = new Google(cs);

	@Given("Browser is open")
	public void browser_is_open() {
	cs.init();
	}

	@And("user is navigated to Google search Page")
	public void user_is_navigated_to_google_search_page() {
		cs.navigateTo("https://www.google.com/"); 
	}
	@When("User enters {string} in Searchbox")
	public void user_enters_in_searchbox(String string) {
		gl.Searchbox();
		gl.sendKeysToSearchBox("ViratKohli");
	}

	@And("user clicks on {string} field")
	public void user_clicks_on_search_field(String keysToSend) {
		gl.EnterToSearchBox(keysToSend);
	}

	@Then("User is navigated to the search result page")
	public void user_is_navigated_to_the_search_result_page() {
		cs.getpagesource("ViratKohli");
		System.out.println("Inside step-User is successfully navigated to search results page");
		cs.close();
		
	}

}
