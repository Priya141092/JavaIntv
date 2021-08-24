 package Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Basecl;
import Pages.HomePage;
import org.apache.log4j.Logger;


//Different Types of logs
//1.info
//2.warn
//3.error
//4.fatal
//How to genrate logs usinfg apache log4j api
//where to create log4j.properties file- to be created inside resources source folder



public class HomePageTest extends Basecl {
	
	HomePage homepage;
	Logger log = Logger.getLogger(HomePageTest.class);
	
	
	public HomePageTest()
	{
		super();
	}
	
	
	
	@BeforeMethod()
	public void setup()
	{
		initialization();
		homepage = new HomePage();
	}
	
	@Test(groups = { "strong_ties" })
	public void loginTest() throws InterruptedException 
	{
		
		homepage.login();
		log.info("Warninig");
	}
	
	

}
