package Airline_Testcases;

import org.testng.annotations.Test;

import Airline_Source_Package.Flight_Booking_Page;
import Airline_Source_Package.Home_Page;
import Airline_Source_Package.Search_Result_Page;

public class TC11_Passenger_Details_for_Booking extends Launch_And_Quit
{
	@Test (retryAnalyzer=Airline_Testcases.Retry_Logic.class)
	public void passenger_details() throws InterruptedException
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
		s1.add_child();
		
		s1.done();
		s1.search();
		
		Flight_Booking_Page f1=new Flight_Booking_Page(driver);
		f1.book_now();
		f1.check_insurance();
		f1.contact_emailId();
		f1.continue_booking();
		
		f1.adult_title();
		f1.first_name_adult();
		f1.last_name_adult();
		
		f1.child_title();
		f1.first_name_child();
		f1.last_name_child();
		
		f1.mobile_number();
		
		Thread.sleep(1000);
		f1.continue_traveller_booking();
	//	f1.continue_for_payment();
	}
}
