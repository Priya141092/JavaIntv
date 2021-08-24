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
	
	@FindBy(xpath="//*[@aria-label='Tue Aug 10 2021']")
	WebElement date1;
	
	@FindBy(xpath="//*[@class='lbl_input latoBold appendBottom10' and text()='RETURN']")
	WebElement returnbutton;
	
	@FindBy(xpath="//*[@aria-label='Sat Aug 14 2021']")
	WebElement returndate;
	
	@FindBy(xpath="//*[@class='lbl_input latoBold appendBottom10' and text()='Travellers & CLASS']")
	WebElement traveller;
	
	@FindBy(xpath="//*[@data-cy='adults-1']")
	WebElement adults;
	
	@FindBy(xpath="//*[@data-cy='children-2']")
	WebElement children;
	
	@FindBy(xpath="//*[@data-cy='infants-1']")
	WebElement infants;
	
	
	
	
	public Home_Page_dates_flights()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectdates() throws InterruptedException
	{
		
		
		Actions a = new Actions(driver);
		a.moveToElement(departure).doubleClick().build().perform();
		departure.click();
		Thread.sleep(3000);
		TestUtil.calendarpicker();
		date1.click();
		a.moveToElement(returnbutton).doubleClick().build().perform();
		returndate.click();
	
		
		//a.moveToElement(date).doubleClick().build().perform();
	}
	
	public void travellerclass()
	{
		Actions b = new Actions(driver);
		b.moveToElement(traveller).doubleClick().build().perform();
		adults.click();
		children.click();
		infants.click();
		
	}


		
		

	

}
