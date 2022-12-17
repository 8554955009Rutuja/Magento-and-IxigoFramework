package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Page1Home;

public class Test1Home extends TestBase{

	Page1Home home;
		
	@BeforeMethod
	public void setup()
	{
		Initialization();
		home = new Page1Home();
	}
	
	@Test(enabled = false)
	public void BookFlightTicket() throws Exception
	{
		home.Bookticket();
	}
	
	@Test(enabled = true)
	public void ChooseFlightTicket() throws Exception
	{
	   home.Bookticket();
    	home.ChooseFlight();
		home.priceofflight();
	String price = home.priceofflight();
	Assert.assertEquals(price,"19904");
	
	System.out.println(price);
	}
		
	@AfterMethod
	public void qbrowser()
	{
		driver.quit();
	}
	
}
