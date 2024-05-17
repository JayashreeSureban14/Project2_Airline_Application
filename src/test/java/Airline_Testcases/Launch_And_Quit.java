package Airline_Testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_And_Quit 
{
	WebDriver driver;
	
	@BeforeMethod
	public void launch_browser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.goibibo.com/");
		driver.get("https://www.easemytrip.com/");
	//	driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void quit_browser() throws IOException, InterruptedException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\Project2\\Project2_Screenshots\\test_"+Math.random()+".png");
		FileHandler.copy(source, dest);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
