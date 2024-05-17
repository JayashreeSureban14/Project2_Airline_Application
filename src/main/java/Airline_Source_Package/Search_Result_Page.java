package Airline_Source_Package;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Result_Page 
{
	WebDriver driver;
	
	//step 1
	@FindBy(id="pff")
	WebElement from_button;
	
	@FindBy(id="a_FromSector_show")
	WebElement from_tf;
	
	@FindBy(xpath="//div[@class='mflexcol']")
	List<WebElement> select_city_autosuggestion;
	
	@FindBy(id="ptt")
	WebElement to_button;
	
	@FindBy(id="a_Editbox13_show")
	WebElement to_location_tf;
	
	@FindBy(xpath="//div[@class='mflexcol']")
	List<WebElement> select_to_city_autosuggesion;
	
	
/*	@FindBy(id="ddate")
	WebElement departure_date_picker; */
	
	@FindBy(id="fiv_4_30/05/2024")
	WebElement choose_departure_date;
	
	@FindBy(id="iDownArr")
	WebElement traveller_details_dropdown;
	
	@FindBy(id="add")
	WebElement add_adult_button;
	
	@FindBy(xpath="(//button[@class='add plus_boxChd'])[1]")
	WebElement add_child_botton;
	
	@FindBy(xpath="(//button[@class='add plus_box1Inf'])[1]")
	WebElement add_infant_button;
	
	@FindBy(id="traveLer")
	WebElement done_button;
	
	@FindBy(className="srchBtnSe")
	WebElement search_button;
	
	@FindBy(xpath="(//div[@class='d-up'])[1]")
	WebElement flight_details_link;
	
	@FindBy(xpath="(//li[@class='ng-scope'])[1]")
	WebElement fare_details_rules_button;
	
	@FindBy(xpath="//li[.='Baggage Information']")
	WebElement baggage_information_button;
	
	@FindBy(xpath="(//li[@class='ng-scope'])[2]")
	WebElement cancellation_rule_button;
	
	@FindBy(id="lbEconomy")
	WebElement economy_radio;
	
	@FindBy(id="lbpEconomy")
	WebElement prem_economy_radio;
	
	@FindBy(id="spanBusiness")
	WebElement business_radio;
	
	@FindBy(id="lbFirst")
	WebElement first_class_radio;
	
	@FindBy(id="rtrip")
	WebElement round_trip_button;
	
	@FindBy(id="fiv_2_25/06/2024")
	WebElement choose_return_date;
	
	
	@FindBy(id="mcity")
	WebElement multicity_trip_button;
	
	
	
	
	//step 2
	public void from()
	{
		from_button.click();
	}
	
	public void from_location()
	{
		from_tf.sendKeys("Belgaum");	
	}
	
	public void from_location1()
	{
		from_tf.sendKeys("Bengaluru");
	}
	
	public void select_from_city()
	{
		
		select_city_autosuggestion.get(1).click();
	}
	
	public void to_location()
	{
		to_button.click();
	}
	
	public void select_to_city()
	{
		to_location_tf.sendKeys("Mumbai");
	}
	
	public void select_to_city1()
	{
		to_location_tf.sendKeys("Singapore");
	}
	
	public void select_to_delhi()
	{
		to_location_tf.sendKeys("Delhi");
	}
	
	public void select_to_city_auto()
	{
		select_to_city_autosuggesion.get(1).click();
	}
	
/*	public void departure_date()
	{
		departure_date_picker.click();
	} */
	
	public void choose_departure_date()
	{
		choose_departure_date.click();
	}
	
	public void traveller_details()
	{
		traveller_details_dropdown.click();
	}
	
	public void add_adult()
	{
		add_adult_button.click();
	}
	
	public void add_child()
	{
		add_child_botton.click();
	}
	
	public void add_infant()
	{
		add_infant_button.click();
	}
	
	public void done()
	{
		done_button.click();
	}
	
	public void search()
	{
		search_button.click();
	}
	
	public void flight_details()
	{
		flight_details_link.click();
	}
	
	public void fare_details_rules()
	{
		fare_details_rules_button.click();
	}
	
	public void baggage_information()
	{
		baggage_information_button.click();
	}
	
	public void cancellation_rule()
	{
		cancellation_rule_button.click();
	}
	
	public void economy_class()
	{
		economy_radio.click();
	}
	
	public void prem_economy_class()
	{
		prem_economy_radio.click();
	}
	
	public void business_class()
	{
		business_radio.click();
	}
	
	public void first_class()
	{
		first_class_radio.click();
	}
	
	public void round_trip()
	{
		round_trip_button.click();
	}
	
	public void choose_return_date()
	{
		choose_return_date.click();
	}
	
	public void multicity_trip()
	{
		multicity_trip_button.click();
	}
	
	
	//step 3
	public Search_Result_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
