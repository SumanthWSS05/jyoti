package assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UnderstandingAssertions {

	@Test
	public void create() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), "actiTIME - Login", "Home page Title is not matching");
		Reporter.log("Opened Actitime web page", true);

		// Step 3: Enter valid email into email textfield
		driver.findElement(By.id("username")).sendKeys("admin");
		String actualEmailEntered = driver.findElement(By.id("username")).getAttribute("value");
		sa.assertEquals(actualEmailEntered, "admin", "username is not entered properly");

		// Step 4: Enter valid password into password textfield
		WebElement us = driver.findElement(By.name("pwd"));
		us.sendKeys("manager");
		String actualPasswordEntered = us.getAttribute("value");
		sa.assertEquals(actualPasswordEntered, "manager", "password is not entered properly");

		// Step 4: Click on Login button
		driver.findElement(By.id("loginButton")).click();
		String actualHomePageTitle = driver.getTitle();
		sa.assertEquals(actualHomePageTitle, "actiTIME - Login", "Home page is not displayed");
		driver.close();
		Reporter.log("closed the browser", true);
		sa.assertAll();
	}
}
