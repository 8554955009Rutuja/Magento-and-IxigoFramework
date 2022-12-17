package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class Page1Home extends TestBase{

	@FindBy(xpath = "(//div[@class='clear-input ixi-icon-cross'])[1]")private WebElement Xfrom;
	@FindBy(xpath = "(//input[@placeholder='Enter city or airport'])[1]")private WebElement from;
	
	@FindBy(xpath = "(//input[@placeholder='Enter city or airport'])[2]")private WebElement to;
//	@FindBy(xpath = "(//div[text()='Mangalore'])[1]")private WebElement to;

	@FindBy(xpath = "(//input[@class='c-input u-v-align-middle'])[3]") private WebElement dateofdeparture;
	@FindBy(xpath = "(//input[@class='c-input u-v-align-middle'])[4]") private WebElement dateofreturn;

	@FindBy(xpath = "//button[@class='ixi-icon-arrow rd-next']") private WebElement nextdatebutton;
	
	@FindBy(xpath = "(//td[@data-date='03032023'])[1]") private WebElement selectgoingdate;	
	@FindBy(xpath = "(//td[@data-date='07032023'])[2]") private WebElement selectreturndate;

	@FindBy(xpath = "(//div[@class='u-ripple'])[1]") private WebElement clickonsearch;

	@FindBy(xpath = "(//span[text()='QUICKEST'])[1]") private WebElement leftquickest;
	@FindBy(xpath = "(//span[text()='QUICKEST'])[2]") private WebElement rightquickest;

	@FindBy(xpath = "(//div[@class='radio-button'])[1]") private WebElement clickon1flight;
	@FindBy(xpath = "(//div[@class='summary-section'])[61]") private WebElement clickon2flight;

	@FindBy(xpath = "//span[text()='19904']") private WebElement price;

	
	public Page1Home()
	{
		PageFactory.initElements(driver, this);
	}

	public void Bookticket() throws Exception 
	{	
		Xfrom.click();
		
		from.sendKeys("Pune");		Thread.sleep(1000);
		Actions a = new Actions(driver);
     	a.sendKeys(Keys.ENTER).build().perform();Thread.sleep(1000);

     	to.sendKeys("Mangalore");		Thread.sleep(1000);
		Actions b = new Actions(driver);
     	b.sendKeys(Keys.ENTER).build().perform();Thread.sleep(1000);
		
		dateofdeparture.click();                     Thread.sleep(1000);
		nextdatebutton.click();	                    Thread.sleep(200);
		nextdatebutton.click();	                    Thread.sleep(200);
		nextdatebutton.click();	                    Thread.sleep(200);
		selectgoingdate.click();                      Thread.sleep(500);

		dateofreturn.click();                            Thread.sleep(500);
		selectreturndate.click();                     Thread.sleep(1000);
		clickonsearch.click();                          Thread.sleep(8000);		
	}
	
	public void ChooseFlight() throws Exception
	{
		Thread.sleep(5000);
		leftquickest.click();    Thread.sleep(5000);		
		clickon1flight.click();  Thread.sleep(3000);
		
		rightquickest.click();  Thread.sleep(5000);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,2000)");

		clickon2flight.click();  Thread.sleep(3000);

	}
	
	public String priceofflight()
	{
	    return price.getText();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
