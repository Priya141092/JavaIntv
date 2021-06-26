package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Basecl;
import Utility.TestUtil;
import Pages.HomePage;

public class Home_Page_dates_flights extends Basecl {
	
	
	
	@FindBy(xpath= "//*[@class='lbl_input latoBold appendBottom10' and text()='DEPARTURE']")
	public static WebElement departure;
	
	@FindBy(xpath=" //*[@class='DayPicker-Day DayPicker-Day--selected']/div[1]")
	WebElement date;
	
	@FindBy(xpath="//*[@aria-label='Tue Jul 13 2021']")
	WebElement date1;
	
	
	
	
	public Home_Page_dates_flights()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectdates() throws InterruptedException
	{
		
		
		Actions a = new Actions(driver);
		a.moveToElement(departure).doubleClick().build().perform();
		//departure.click();
		
		Thread.sleep(3000);
		TestUtil.calendarpicker();
		date1.click();
		
		//a.moveToElement(date).doubleClick().build().perform();
	}


		
		

	

}
