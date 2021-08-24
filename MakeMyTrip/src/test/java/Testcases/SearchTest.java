package Testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Basecl;
import Pages.HomePage;
import Pages.Search;
import junit.framework.Assert;

public class SearchTest extends Basecl {

	
	Search s ;
	
	
	public SearchTest()
	{
		super();
	}
	
	@BeforeMethod()
	public void setup()
	{
		initialization();
		s = new Search();
	}
	@Test(enabled=false)
	public void nextpagesearchtest() throws InterruptedException
	{
		
		s.nextpagesearch();
		String title = driver.getTitle();
		Assert.assertEquals(prop.getProperty("exp_title"), title);
		
		
	}
	@Test(enabled=true)
	public void moreitemstest() throws InterruptedException
	{
		s.nextpagesearch();
		s.moreitems();
		boolean value= s.tour.isDisplayed();
		Assert.assertEquals(true, value);
		
		
	}
	
	
}
