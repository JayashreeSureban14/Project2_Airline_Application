package Airline_Source_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Flight_Booking_Page 
{
	WebDriver driver;
	
	//step 1
	@FindBy(xpath="(//button[@class='btn book-bt-n ng-scope'])[1]")
//	@FindBy(xpath="(//button[.='Book Now'])[1]")
	WebElement book_now_button;
	
	@FindBy(id="chkInsurance")
	WebElement check_insurance_radio;
	
	@FindBy(name="txtEmailId")
	WebElement enter_emailId_tf;
	
	@FindBy(id="spnVerifyEmail")
	WebElement cont_booking_button;
	
	@FindBy(id="titleAdult0")
	WebElement title_dropdown;
	
	@FindBy(id="txtFNAdult0")
	WebElement first_name_tf;
	
	@FindBy(id="txtLNAdult0")
	WebElement last_name_tf;
	
	@FindBy(id="titleChild0")
	WebElement child_title_dropdown;
	
	@FindBy(id="txtFNChild0")
	WebElement child_first_name_tf;
	
	@FindBy(id="txtLNChild0")
	WebElement child_last_name_tf;
	
	@FindBy(id="txtCPhone")
	WebElement mobile_number_tf;
	
	@FindBy(className="cancl")
	WebElement coupon_cancel_button;
	
	@FindBy(id="txtCouponCode")
	WebElement enter_coupon_code_tf;
	
	@FindBy(xpath="(//span[@class='coupn_checkmark'])[2]")
	WebElement coupon_code_radio;
	
//	@FindBy(id="spnTransaction")
	@FindBy(xpath="(//span[.='Continue Booking'])[3]")
//	@FindBy(xpath="//span[@id='spnTransaction']")
	WebElement continue_booking_button;
	
	
	@FindBy(id="titleAdult1")
	WebElement adult2_title_dropdown;
	
	@FindBy(id="txtFNAdult1")
	WebElement adult2_firstname_tf;
	
	@FindBy(id="txtLNAdult1")
	WebElement adult2_lastname_tf;
	
	@FindBy(id="titleInfant0")
	WebElement infant_title_dropdown;
	
	@FindBy(id="txtFNInfant0")
	WebElement infant_firstname_tf;
	
	@FindBy(id="txtLNInfant0")
	WebElement infant_lastname_tf;
	
	@FindBy(id="divDOBDayInfant0")
	WebElement infant_dob_day_dropdown;
	
	@FindBy(id="divDOBMonInfant0")
	WebElement infant_dob_month_dropdown;
	
	@FindBy(id="divDOBYarInfant0")
	WebElement infant_dob_year_dropdown;
	
	
//	@FindBy(id="IXG_DEL10F")
	@FindBy(xpath="(//label[@class='s_seat_avl  darkblue-bg'])[9]")
	WebElement select_seat_button;
	
	@FindBy(id="DivContinueAncillary")
	WebElement select_seat_continue_button;
	
	@FindBy(id="DivContinueAncillary")
	WebElement continue_for_payment_button;
	
	@FindBy(id="skipPop")
	WebElement skip_to_payment_link;
	
	
	
	
	//step 2
	public void book_now()
	{
		book_now_button.click();
	}
	
	public void check_insurance()
	{
		check_insurance_radio.click();
	}
	
	public void contact_emailId()
	{
		enter_emailId_tf.sendKeys("jmsureban@gmail.com");
	}
	
	public void continue_booking()
	{
		cont_booking_button.click();
	}
	
	public void adult_title()
	{
		Select st=new Select(title_dropdown);
		st.selectByVisibleText("MS");
	}
	
	public void first_name_adult()
	{
		first_name_tf.sendKeys("Jayashree");
	}
	
	public void last_name_adult()
	{
		last_name_tf.sendKeys("Sureban");
	}
	
	public void child_title()
	{
		Select s2=new Select(child_title_dropdown);
		s2.selectByVisibleText("Master");
	}
	
	public void first_name_child()
	{
		child_first_name_tf.sendKeys("Sachit");
	}
	
	public void last_name_child()
	{
		child_last_name_tf.sendKeys("Sureban");
	}
	
	public void mobile_number()
	{
		mobile_number_tf.sendKeys("9986263210");
	}
	
	
	public void coupon_cancel()
	{
		coupon_cancel_button.click();
	}
	
	public void enter_coupon_code()
	{
		enter_coupon_code_tf.sendKeys("12345");
	}
	
	public void select_coupon_code()
	{
		coupon_code_radio.click();
	}
	
	public void continue_traveller_booking()
	{
		continue_booking_button.click();
	}
	
	public void adult2_title()
	{
		Select a3=new Select(adult2_title_dropdown);
		a3.selectByVisibleText("Mrs");
		
	}
	
	public void adult2_firstname()
	{
		adult2_firstname_tf.sendKeys("Smita");
	}
	
	public void adult2_lastname()
	{
		adult2_lastname_tf.sendKeys("Goudar");
	}
	
	public void infant_title()
	{
		Select s4=new Select(infant_title_dropdown);
		s4.selectByVisibleText("Master");
	}
	
	public void infant_firstname()
	{
		infant_firstname_tf.sendKeys("Sachu");
	}
	
	public void infant_lastname()
	{
		infant_lastname_tf.sendKeys("Baby");
	}
	
	public void infant_dob_day()
	{
		Select day=new Select(infant_dob_day_dropdown);
		day.selectByVisibleText("9");
	}
	
	public void infant_dob_month()
	{
		Select month=new Select(infant_dob_month_dropdown);
		month.selectByVisibleText("Feb");
	}
	
	public void infant_dob_year()
	{
		Select year=new Select(infant_dob_year_dropdown);
		year.selectByVisibleText("2023");
	}
	
	public void select_seat()
	{
		select_seat_button.click();
	}
	
	public void select_seat_and_continue()
	{
		select_seat_continue_button.click();
	}
	
	public void continue_for_payment()
	{
		continue_for_payment_button.click();
	}
	
	public void skip_to_payment()
	{
		skip_to_payment_link.click();
	}
	
	
	
	//step 3
	public Flight_Booking_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
