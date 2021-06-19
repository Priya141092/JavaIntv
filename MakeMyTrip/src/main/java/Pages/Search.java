package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import Base.Basecl;
import Utility.TestUtil;


public class Search extends Basecl {
	WebDriverWait wait = new WebDriverWait(driver,20);
	
	@FindBy(xpath= "//a[text()='Search']")
	WebElement search;
	
	@FindBy(xpath="//*[@class='autopop__wrap makeFlex column defaultCursor']")
	WebElement alert1;
	
	@FindBy(xpath="//li[@data-cy='menu_More']/a[@class=' makeFlex hrtlCenter column']/span[2]")
	WebElement more;
	
	@FindBy(xpath="//a[text()='Activities']")
	public static WebElement activities;
	
	@FindBy(xpath="//p[@class='login__earn font18 latoBlack appendBottom20 defaultCursor textCenter']")
	public static WebElement modal;
	
	@FindBy(xpath="//input[@placeholder='Activities, Tours or Destination']")
	public static WebElement tour;
	
	@FindBy(xpath="//a[@href='https://www.makemytrip.com/support/in/eng/contact-us.php']")
	public static WebElement Contactus;
	
	
	HomePage h = new HomePage();
	
	//boolean text = modal.isDisplayed();
	
	
	public Search()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void nextpagesearch() throws InterruptedException
	{

//		boolean text = modal.isDisplayed();
//		System.out.println(text);
		
		if(modal.isEnabled()==true)
		{
		h.Login.click();
		search.click();
		}
		
		else 
		{
			search.click();
		}
		
		
	}
	
	public void moreitems() throws InterruptedException
	{
		//wait.until(ExpectedConditions.elementToBeClickable(more));
		Thread.sleep(3000);
		more.click();
		Thread.sleep(3000);
		String clickl = Keys.chord(Keys.CONTROL,Keys.ENTER);
		Contactus.sendKeys(clickl);
		TestUtil.switchingtab();
	}
	
	
	

}
