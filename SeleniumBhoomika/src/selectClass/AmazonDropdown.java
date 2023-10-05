package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	    WebElement searchbox = driver.findElement(By.id("searchDropdownBox"));
		Select Dp1= new Select(searchbox);
		Dp1.selectByVisibleText("Books");
		List<WebElement> optionsList = Dp1.getOptions();
		for(WebElement option: optionsList)
		{
			System.out.println(option.getText());
		}
		
	}

	}


