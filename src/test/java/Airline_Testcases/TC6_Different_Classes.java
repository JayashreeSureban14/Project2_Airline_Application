package Airline_Testcases;

import org.testng.annotations.Test;

import Airline_Source_Package.Home_Page;
import Airline_Source_Package.Search_Result_Page;

public class TC6_Different_Classes extends Launch_And_Quit
{
	@Test (retryAnalyzer=Airline_Testcases.Retry_Logic.class)
	public void classes() throws InterruptedException
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
		
		Thread.sleep(1000);
		s1.prem_economy_class();
		
		Thread.sleep(1000);
		s1.economy_class();
		
		Thread.sleep(1000);
		s1.business_class();
		
		Thread.sleep(1000);
		s1.first_class();
		
		s1.done();
		s1.search();
		
		
	}
}
