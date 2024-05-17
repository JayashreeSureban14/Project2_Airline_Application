package Airline_Source_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Payments_Page 
{
	WebDriver driver;
	
	//step 1
	@FindBy(id="CC")
	WebElement card_number_tf;
	
	@FindBy(id="CCN")
	WebElement card_holder_name_tf;
	
	@FindBy(id="CCMM")
	WebElement expirydate_month_dd;
	
	@FindBy(id="CCYYYY")
	WebElement expirydate_year_dd;
	
	@FindBy(id="CCCVV")
	WebElement cvv_tf;
	
//	@FindBy(id="chkSave")
	@FindBy(xpath="(//span[@class='cmark_cbox'])[5]")
	WebElement save_card_details_checkbox;
	
	@FindBy(xpath="(//div[@class='mk-pym'])[1]")
	WebElement make_payment_button;
	
	
	
	//step 2
	public void card_number()
	{
		card_number_tf.sendKeys("6521650171908865");
	}
	
	public void card_holder_name()
	{
		card_holder_name_tf.sendKeys("Jayashree Sureban");
	}
	
	public void expirydate_month()
	{
		Select exp_month=new Select(expirydate_month_dd);
		exp_month.selectByValue("08");
	}
	
	public void expirydate_year()
	{
		Select exp_year=new Select(expirydate_year_dd);
		exp_year.selectByVisibleText("2029");
	}
	
	public void cvv()
	{
		cvv_tf.sendKeys("690");
	}
	
	public void save_card_details()
	{
		save_card_details_checkbox.click();
	}
	
	public void make_payment()
	{
		make_payment_button.click();
	}
	
	
	//step 3
	public Payments_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
