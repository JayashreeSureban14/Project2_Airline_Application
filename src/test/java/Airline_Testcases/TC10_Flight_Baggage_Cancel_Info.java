package Airline_Testcases;

import org.testng.annotations.Test;

import Airline_Source_Package.Home_Page;
import Airline_Source_Package.Search_Result_Page;

public class TC10_Flight_Baggage_Cancel_Info extends Launch_And_Quit
{
	@Test
	public void flight_information() throws InterruptedException
	{
		Home_Page h1=new Home_Page(driver);
		h1.login_or_signup();
		h1.customer_login();
		h1.email_id();
		h1.continue_button();
		h1.password();
		h1.login();
		
		Search_Result_Page s1=new Search_Result_Page(driver);
		s1.from();
		s1.from_location();
		s1.select_from_city();
		
		s1.to_location();
		s1.select_to_city();
		s1.select_to_city_auto();
		
		s1.choose_departure_date();
		
		s1.traveller_details();
		s1.add_adult();
		s1.add_child();
		s1.add_infant();	
		s1.done();
		
		s1.search();
		
		s1.flight_details();
		
		Thread.sleep(1000);
		s1.fare_details_rules();
		
		Thread.sleep(2000);
		s1.baggage_information();
		
		Thread.sleep(2000);
		s1.cancellation_rule();
		
	}
}
