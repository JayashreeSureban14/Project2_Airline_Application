package Airline_Source_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Multi_City_Flights_Page 
{
	WebDriver driver;
	
	//step 1
	@FindBy(id="pmulff1")
	WebElement mcity_from_field;
	
	@FindBy(id="a_FromSector-mul1_show")
	WebElement enter_from_city_tf;
	
/*
	@FindBy(xpath="//div[@class='mflexcol']")
//	@FindBy(xpath="//ul[@class='ausuggest']")
	List<WebElement> select_from_city_autosuggesion; */
	
	@FindBy(id="spnBengaluru")
	WebElement select_from_city_auto;
	
	@FindBy(id="pmultt1")
	WebElement mcity_to_field;
	
	@FindBy(id="a_ToSector-mul1_show")
	WebElement enter_to_city_tf;
	
	@FindBy(id="spnKochi")
	WebElement select_to_city_auto;
	
	@FindBy(id="ddateMul1")
	WebElement click_on_calender;
	
	@FindBy(id="02/06/2024")
	WebElement select_departure_date;
	
	@FindBy(id="pmultt2")
	WebElement click_destination_city;
	
	@FindBy(id="a_ToSector-mul2_show")
	WebElement enter_destination_city_tf;
	
	@FindBy(id="spnHyderabad")
	WebElement select_destination_city_auto;
	
	@FindBy(id="ddateMul2")
	WebElement click_on_calender2;
	
	@FindBy(id="addmul2")
	WebElement search_mcity_flights_btn;
	
	//step 2
	public void mcity_from_field()
	{
		mcity_from_field.click();
	}
	
	public void enter_from_city()
	{
		enter_from_city_tf.sendKeys("Bengaluru");
	}
	
	public void from_autosuggesion()
	{
	/*	System.out.println(select_from_city_autosuggesion.size());
		select_from_city_autosuggesion.get(1).click();
		*/
		select_from_city_auto.click();
	}
	
	public void mcity_to_field()
	{
		mcity_to_field.click();
	}
	
	public void enter_to_city()
	{
		enter_to_city_tf.sendKeys("Kochi");
	}
	
	public void select_to_city()
	{
		select_to_city_auto.click();
	}
	
	public void click_on_calender()
	{
		click_on_calender.click();
	}
	
	public void select_departure_date()
	{
		select_departure_date.click();
	}
	
	public void click_destination_city()
	{
		click_destination_city.click();
	}
	
	public void enter_destination_city()
	{
		enter_destination_city_tf.sendKeys("Hyderabad");
	}
	
	public void select_destination_city()
	{
		select_destination_city_auto.click();
	}
	
	public void click_on_calender2()
	{
		click_on_calender2.click();
	}
	
	public void search_mcity_flights()
	{
		search_mcity_flights_btn.click();
	}
	
	
	//step 3
	public Multi_City_Flights_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
