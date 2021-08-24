package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Basecl;
import Pages.Activities;


public class CityWiseActivity extends Basecl{
	
	Activities a = new Activities();
	@FindBy(xpath="//*[@class='landing-city-name-wrapper']")
	WebElement arrowbutton;
	
	@FindBy(xpath="//*[@class='custom-modal-content undefined' ]/div[2]/div[1]/div[2]/div[2]/div[1]/a[11]")
	WebElement london;
	
	@FindBy(xpath="//*[@class='landing-city-title' and text()='London']")
 	public  WebElement  landingcity;
	
	@FindBy(xpath="//*[@class='custom-modal']/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/a[11]")
	WebElement london3;
	
	@FindBy(xpath = "//*[@class='custom-modal-content undefined']")
	WebElement box;
	
	
	public CityWiseActivity()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  changecitytointernational() throws InterruptedException
	{
	a.ActivitiesTours();
	a.searchactivity();
	a.searchdestination();
	arrowbutton.click();
	Thread.sleep(2000);
	//driver.switchTo().frame("SELECT YOUR CITY");
	//driver.switchTo().frame(box);
    london3.click();

	
	
	
	}

}
