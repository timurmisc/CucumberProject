package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class holiday {

	
	@Given ("I am logged on and have info pulled up")
	public void I_book_a_flight_on_for_air_ticket () {	
		System.out.println("hello from GIVEN");	
	}

	
	@When ("I go search page")
	public void  I_go_search_page () {
		System.out.println("hello from When");			
	}
	
}
