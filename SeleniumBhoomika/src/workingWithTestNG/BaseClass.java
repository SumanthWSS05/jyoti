package workingWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	ChromeDriver driver;
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
	@BeforeMethod
	public void login() throws InterruptedException
	{
     	driver.findElement(By.linkText("Log in")).click();
     	 driver.findElement(By.id("Email")).sendKeys("jyoti.mishra254@gmail.com");
	       driver.findElement(By.id("Password")).sendKeys("Mishra123");
	       driver.findElement(By.xpath("//input[@value='Log in']")).click();
	       Thread.sleep(2000);
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.linkText("Log out")).click();
	}
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}
	

}
