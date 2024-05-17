package Airline_Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Airline_Source_Package.Home_Page;

//Test login with invalid credentials and ensure proper error messages are displayed

public class TC3_Unsuccessful_Login extends Launch_And_Quit
{
	@Test
	public void unsuccessful_login()
	{
		Home_Page h1=new Home_Page(driver);
		h1.login_or_signup();
		h1.customer_login();
		h1.email_id();
		h1.continue_button();
		h1.invalid_password();
		h1.login();
		
		Assert.assertEquals(driver.getTitle(), "Book Flights, Hotels, Holidays, Bus & Train Tickets - EaseMyTrip.com");
	}
	
}
