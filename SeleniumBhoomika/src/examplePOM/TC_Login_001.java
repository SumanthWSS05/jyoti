package examplePOM ;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import examplePOM.LoginPage;

public class TC_Login_001 {

	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
     	LoginPage lp = new LoginPage(driver);
    	lp.getUsername().sendKeys("Sumanth");
    	driver.navigate().refresh();
		lp.getUsername().sendKeys("admin");
		
	}
}
