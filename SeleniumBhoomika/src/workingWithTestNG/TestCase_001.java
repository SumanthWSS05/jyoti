package workingWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_001 {
	@Test(groups="Shopping")
	public void Function1()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		Reporter.log("window is maximized", true);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Browser is opened");
		driver.close();
		Reporter.log("Closed the browser",true);
	}

}
