package Airline_Source_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page 
{
	WebDriver driver;
	
	//step 1
	@FindBy(id="divSignInPnl")
	WebElement login_or_signup_hoverover;
	
	@FindBy(id="shwlogn")
	WebElement customer_login_button;
	
	@FindBy(id="txtEmail")
	WebElement email_tf;
	
//	@FindBy(id="shwotp")
	@FindBy(xpath="//input[@id='shwotp']")
	WebElement continue_button;
	
	@FindBy(id="txtEmail2")
	WebElement password_tf;
	
//	@FindBy(name="btn_Login")
	@FindBy(xpath="(//input[@class='_btnLogin'])[3]")
	WebElement login_button;
	
	//logout functionality
	@FindBy(id="welcome-det-User")
	WebElement user_hoverover;
	
	@FindBy(xpath="(//span[.='Log Out'])[2]")
	WebElement logout_button;
	
	
	//step 2
	public void login_or_signup()
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(login_or_signup_hoverover).perform();
	}
	
	public void customer_login()
	{
		customer_login_button.click();
	}
	
	public void email_id()
	{
		email_tf.sendKeys("jmsureban@gmail.com"); //Amazon@123 - pwd
	}
	
	public void continue_button()
	{
		continue_button.click();
	}
	
	public void password()
	{
		password_tf.sendKeys("Amazon@123");
	}
	
	public void invalid_password()
	{
		password_tf.sendKeys("Amazon@12345");
	}
	
	
	public void login()
	{
		login_button.click();
	}
	
	public void username_hoverover()
	{
		Actions a2=new Actions(driver);
		a2.moveToElement(user_hoverover).perform();
	}
	
	public void logout()
	{
		logout_button.click();
	}
	
	//step 3
	public Home_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
