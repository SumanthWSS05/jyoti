package Synchrinization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUnderstandExpicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.shoppersstack.com/products_page/418");
		
		driver.findElement(By.id("Check Delivery")).sendKeys("147852");
        
	    WebElement checkButton = driver.findElement(By.id("Check"));
	    WebDriverWait wait= new WebDriverWait(driver,5);
	    wait.until(ExpectedConditions.elementToBeClickable(checkButton));
	    checkButton.click();
	    System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Not Deliveriable')]")).getText());
	    driver.quit();
	}

}
