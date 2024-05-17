package Airline_Testcases;

import org.testng.annotations.Test;

import Airline_Source_Package.Home_Page;
import org.testng.Assert;

//Validate the login functionality with valid credentials.

public class TC2_Login_Functionality extends Launch_And_Quit
{
	@Test
	public void sucessful_login()
	{
		Home_Page h1=new Home_Page(driver);
		h1.login_or_signup();
		h1.customer_login();
		h1.email_id();
		h1.continue_button();
		h1.password();
		h1.login();
		
		Assert.assertEquals(driver.getTitle(), "Book Flights, Hotels, Holidays, Bus & Train Tickets - EaseMyTrip.com");
	}
}
