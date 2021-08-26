package Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Basecl;
import Pages.Activities;
import Pages.HomePage;
import Pages.Home_Page_dates_flights;

public class ActivitiesTest extends Basecl {
	
	Activities a;
	
	public ActivitiesTest()
	{
		super();
	}
	
	
	
	@BeforeMethod()
	public void setup()
	{
		initialization();
		a = new Activities();
		
	}
	
	@Test(enabled= false)
	public void ActivitiesToursTest()
	{
		a.ActivitiesTours();
	}
	
	@Test(enabled= false)
	public void searchactivityTest() throws InterruptedException
	{
		//HomePage.Login.click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//html")).click();
		a.ActivitiesTours();
		Thread.sleep(3000);
		a.searchactivity();
	}
	
	@Test(enabled= true)
	public void searchdestinationTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//html")).click();
		a.ActivitiesTours();
		a.searchactivity();
		a.searchdestination();
		
		
	}
	

}
