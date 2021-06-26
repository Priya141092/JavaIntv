package Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Basecl;
import Pages.HomePage;
import Pages.Home_Page_dates_flights;

public class Home_Page_dates_flightsTest extends Basecl {
	
	Home_Page_dates_flights hp ;
	
	public Home_Page_dates_flightsTest()
	{
		super();
	}
	
	
	
	@BeforeMethod()
	public void setup()
	{
		initialization();
		hp = new Home_Page_dates_flights();
		
	}
	
	@Test
	public void Home_Page_dates_flights() throws InterruptedException
	{
		hp.selectdates();
		
	}

}
