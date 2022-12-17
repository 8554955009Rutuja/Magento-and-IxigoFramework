package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
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

	@FindBy(xpath = "(//span[normalize-space(text())='Women'])[1]")private WebElement womenlabel;
	@FindBy(xpath = "(//span[text()='Tops'])[1]") private WebElement movetotop;
	@FindBy(xpath = "(//span[text()='Hoodies & Sweatshirts'])[1]") private WebElement movetohoodies;

	@FindBy(xpath = "(//div[@class='control'])[3]")private WebElement pageDD;
	@FindBy(xpath = "(//option[@value='36'])[1]")private WebElement pageDD36;

	@FindBy(xpath = "//div[text()='Price']") private WebElement priceDD;
	@FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/women/tops-women/hoodies-and-sweatshirts-women.html?price=50-60&product_list_limit=36']") private WebElement selectprice;

	@FindBy(xpath = "(//a[normalize-space(text())='Mona Pullover Hoodlie'])[1]")private WebElement selecthoodie;

	@FindBy(xpath = "//div[text()='L']")private WebElement selectsize;
	@FindBy(xpath = "//div[@aria-label='Green']")private WebElement selectcolor;
	@FindBy(xpath = "//button[@title='Add to Cart']")private WebElement addtocartbutton;

	@FindBy(xpath = "(//a[@href='https://magento.softwaretestingboard.com/checkout/cart/'])[1]")private WebElement cartbutton;	
	@FindBy(xpath = "//button[text()='Proceed to Checkout']")private WebElement proceedtocheckoutbutton;

           
	         //input data
			@FindBy(xpath = "(//input[@class='input-text'])[3]")private WebElement inputemail;	
			@FindBy(xpath = "(//input[@class='input-text'])[5]")private WebElement  inputFirstName ;
			@FindBy(xpath = "(//input[@type='text'])[2]")private WebElement inputLastName;
			@FindBy(xpath = "(//input[@type='text'])[3]")private WebElement inputCompany;
			@FindBy(xpath = "(//input[@type='text'])[4]")private WebElement inputStreetAddress;
			@FindBy(xpath = "(//input[@type='text'])[7]")private WebElement inputCity;		
			@FindBy(xpath = "(//select[@class='select'])[1]")private WebElement inputState;		
			@FindBy(xpath = "(//input[@type='text'])[9]")private WebElement inputZipPostalCode ;
			@FindBy(xpath = "(//select[@class='select'])[2]")private WebElement inputCountry ;
			@FindBy(xpath = "(//input[@type='text'])[10]")private WebElement inputPhoneNumber ;

			@FindBy(xpath = "//button[@data-role='opc-continue']")private WebElement nextbutton ;
			@FindBy(xpath = "//span[text()='Place Order']")private WebElement placeorderbutton ;
			@FindBy(xpath = "//span[text()='Continue Shopping']")private WebElement continuebuttonbutton ;

				
	public Page1Home()
	{
		PageFactory.initElements(driver, this);
	}

	public void Verifyjacket() throws Exception
	{
		
		                                                                                                 Thread.sleep(1000);
		Actions act = new Actions(driver);
	    act.moveToElement(womenlabel).build().perform();Thread.sleep(5000);
	    act.moveToElement(movetotop).build().perform();Thread.sleep(500);
	    act.moveToElement(movetohoodies).build().perform();Thread.sleep(3000);	    

	    movetohoodies.click();		                                                  	Thread.sleep(2000);
    	pageDD.click();	                                                                     	Thread.sleep(3000);
    	
		Actions actforpages = new Actions(driver);
		actforpages.moveToElement(pageDD).build().perform();Thread.sleep(500);           
		actforpages.sendKeys(Keys.DOWN).build().perform();Thread.sleep(500);
		actforpages.sendKeys(Keys.DOWN).build().perform();Thread.sleep(500);
		actforpages.sendKeys(Keys.ENTER).build().perform();Thread.sleep(2000);

		priceDD.click();                                                                        Thread.sleep(1000);
		selectprice.click();                                                                   Thread.sleep(1000);
		
		selecthoodie.click();                                                               Thread.sleep(3000);
		
		selectsize.click();                                                                       Thread.sleep(200);
		selectcolor.click();                                                                    Thread.sleep(200);
		addtocartbutton.click();                                                        Thread.sleep(8000);
	
		cartbutton.click();                                                                  Thread.sleep(2000);
		proceedtocheckoutbutton.click();	                               	 Thread.sleep(20000);	
		
	    inputemail.sendKeys("rutujamohite@gmail.com"); Thread.sleep(1000);
		inputFirstName.sendKeys("Rutuja");                              Thread.sleep(500);
	   inputLastName.sendKeys("Mohite");                              Thread.sleep(500);
	   inputCompany.sendKeys("xyz");                              Thread.sleep(500);
	   inputStreetAddress.sendKeys("Kharadi Bypass PUNE");Thread.sleep(500);
	   inputCity.sendKeys("Pune");                                              Thread.sleep(500);
   
	 inputCountry.click();
	 Select country = new Select(inputCountry);
	 country.selectByVisibleText("India");
	 
	 
	 inputState.click();
     Select state = new Select(inputState);
     state.selectByVisibleText("Maharashtra");
     
	 inputZipPostalCode.sendKeys("789456");                    Thread.sleep(500);
     		    
	 inputPhoneNumber.sendKeys("7894561230");          Thread.sleep(4000);
			 
	 nextbutton.click();                                                                Thread.sleep(5000);
	 placeorderbutton.click();                                                   Thread.sleep(5000);
	 continuebuttonbutton.click();                                         Thread.sleep(3000);
	 
	 
	}
}
