package Test;

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
	
	@Test
	public void buyhoodies() throws Exception
	{
		home.Verifyjacket();
	}
	
	@AfterMethod
	public void qbrowser()
	{
		driver.quit();
	}
	
}
