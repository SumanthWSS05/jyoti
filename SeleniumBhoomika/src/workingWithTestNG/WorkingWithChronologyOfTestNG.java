package workingWithTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WorkingWithChronologyOfTestNG {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("data base connection is started");
	}
	@BeforeMethod
	public void beforeMehtod()
	{
		System.out.println("Before method");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("To open the browser");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("To quit browser");
	}
	@Test
	public void login()
	{
		System.out.println("login");
	}
	@Test
	public void logout()
	{
		System.out.println("logout");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("data base connection is stopped");
	}
	
	
	
	
}
