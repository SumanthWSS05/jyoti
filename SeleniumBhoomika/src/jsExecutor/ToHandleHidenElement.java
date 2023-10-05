package jsExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHidenElement {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	       JavascriptExecutor js=driver;
	       driver.get("https://www.levi.in/buy-more-save-more");
	       Thread.sleep(5000);
	       WebElement addToBag = driver.findElement(By.xpath("//a[contains(text(),' Black Brand Logo Printed Crew')]/../../div/a[@id='quickviewbutton']"));
           js.executeScript("arguments[0].click()", addToBag);
           Thread.sleep(3000);
           driver.quit();

	}

}
