package Airline_Testcases;

import org.testng.annotations.Test;

import Airline_Source_Package.Home_Page;
import Airline_Source_Package.Search_Result_Page;

//Test the search functionality for round-trip flights.

public class TC5_Round_Trip_Flights extends Launch_And_Quit
{
	@Test (retryAnalyzer=Airline_Testcases.Retry_Logic.class)
	public void round_trip_flights()
	{
		Home_Page h1=new Home_Page(driver);
		h1.login_or_signup();
		h1.customer_login();
		h1.email_id();
		h1.continue_button();
		h1.password();
		h1.login();
		
		Search_Result_Page s1=new Search_Result_Page(driver);
		s1.round_trip();
		s1.from();
		s1.from_location1();
		s1.select_from_city();
		
		s1.to_location();
		s1.select_to_city1();
		s1.select_to_city_auto();
		
		s1.choose_departure_date();
		s1.choose_return_date();
		
		s1.search();
			
	}
}
