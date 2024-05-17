package Airline_Testcases;

import org.testng.annotations.Test;

import Airline_Source_Package.Home_Page;
import Airline_Source_Package.Multi_City_Flights_Page;
import Airline_Source_Package.Search_Result_Page;

public class TC7_Multi_City_Flights extends Launch_And_Quit
{
	@Test (retryAnalyzer=Airline_Testcases.Retry_Logic.class)
	public void multi_city_flights() throws InterruptedException
	{
		Home_Page h1=new Home_Page(driver);
		h1.login_or_signup();
		h1.customer_login();
		h1.email_id();
		h1.continue_button();
		h1.password();
		h1.login();
		
		Search_Result_Page s1=new Search_Result_Page(driver);
		s1.multicity_trip();
		
		
		Multi_City_Flights_Page m1=new Multi_City_Flights_Page(driver);
		m1.mcity_from_field();
		m1.enter_from_city();
		Thread.sleep(1000);
		m1.from_autosuggesion(); 
		
		m1.mcity_to_field();
		m1.enter_to_city();
		Thread.sleep(1000);
		m1.select_to_city();
		
		m1.click_on_calender();
		m1.select_departure_date();
		
		m1.click_destination_city();
		m1.enter_destination_city();
		Thread.sleep(1000);
		m1.select_destination_city();
		
		m1.click_on_calender2();
		m1.select_departure_date();
		
		m1.search_mcity_flights();
	}
}
