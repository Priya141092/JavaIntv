package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Basecl;
import Utility.TestUtil;

public class Activities extends Basecl {

	@FindBy(xpath= "//span[@class='chNavText']")
	WebElement More;
	
	@FindBy(xpath= "//*[@data-cy='submenu_ActivitiesTours']")
	WebElement Activities;
	
	@FindBy(xpath= "//*[@id='activitySearch']")
	WebElement searchactivity;
	
	@FindBy(xpath="//*[@class='react-autosuggest__input react-autosuggest__input--open']")
	WebElement searchcity;
	
	@FindBy(xpath="//*[@id='react-autowhatever-1-section-0-item-0']")
	WebElement destination;
	
	@FindBy(xpath="//*[@class='appendBottom5 suggestionTxt' and text()='Goa1']")
	WebElement selectdestination;
	
	@FindBy(xpath="//button[@data-cy='submit']")
	WebElement searchbutton;
	
	@FindBy(xpath="//*[@class='landing-city-arrow']")
	WebElement arrowbutton;
	
	
	public Activities()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ActivitiesTours()
	{
		More.click();
		Activities.click();
	}
	
    public void searchactivity() throws InterruptedException
    {
	   searchactivity.click();
       Thread.sleep(2000);
       searchcity.click();
       Thread.sleep(2000);
       destination.click();
       //searchcity.sendKeys("Andaman");
      
       
    	
    }
	
    public void searchdestination()
    {
    	searchbutton.click();
    	//arrowbutton.click();
    	
    }
}
