package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Basecl;

public class HomePage extends Basecl{
	
	WebDriverWait wait = new WebDriverWait(driver,20);
	
	
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	
	@FindBy(xpath= "//*[@class='makeFlex hrtlCenter font10 makeRelative lhUser']")
	public static WebElement Login;
	
	@FindBy(xpath= "//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath= "//button[@class='capText font16']")
	WebElement  continue1;
	
	@FindBy(xpath= "//input[@type='password']")
	WebElement password;
	
	@FindBy(id ="password")
	WebElement password1;
	
	@FindBy(xpath="//button[@data-cy='login']")
	public static WebElement loginclick;
	
	
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public  void login() throws InterruptedException
	{
		Thread.sleep(3000);
		Login.click();
		Login.click();
		username.sendKeys(prop.getProperty("username"));
		continue1.click();
		Thread.sleep(2000);
		//jsExecutor.executeScript("document.getElementById('password').value='Qait@12345';");
		password1.sendKeys("Qait@12345");
		loginclick.click();
		//wait.until(ExpectedConditions.elementToBeClickable(loginclick));
	}
	
	

}
