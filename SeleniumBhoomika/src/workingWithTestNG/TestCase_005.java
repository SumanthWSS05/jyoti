package workingWithTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_005 {
	@Test
	public void Function5()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		Reporter.log("window is maximized", true);
		driver.get("https://bingosnacks.com/");
		Reporter.log("Browser is opened");
		driver.close();
		Reporter.log("Closed the browser",true);
		
		
	}

}
