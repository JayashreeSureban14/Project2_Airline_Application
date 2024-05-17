package Airline_Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Airline_Source_Package.Home_Page;

//Verify that users can successfully register for a new account.

public class TC1_Register_New_Account extends Launch_And_Quit
{
	@Test
	public void new_user_register()
	{
		Home_Page h1=new Home_Page(driver);
		h1.login_or_signup();
		h1.customer_login();
		h1.email_id();
		h1.continue_button();
		
		Assert.assertEquals(driver.getTitle(), "Book Flights, Hotels, Holidays, Bus & Train Tickets - EaseMyTrip.com");
		
	}
	
}
