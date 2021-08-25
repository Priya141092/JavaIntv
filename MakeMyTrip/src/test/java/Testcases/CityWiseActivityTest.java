package Testcases;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Basecl;
import Pages.Activities;
import Pages.CityWiseActivity;
import junit.framework.Assert;

public class CityWiseActivityTest extends Basecl {
	
	CityWiseActivity c;
	ActivitiesTest t;
	
	
	
	@BeforeMethod()
	public void setup()
	{
		initialization();
		c = new CityWiseActivity();
	}
	
	@Test
	public void changecitytointernationalTest() throws InterruptedException
	{
		//t.searchdestinationTest();
		driver.findElement(By.xpath("//html")).click();
		c.changecitytointernational();
		String text = c.landingcity.getText();
		//Assert.assertEquals("London", text);
		 
	}
		

}
