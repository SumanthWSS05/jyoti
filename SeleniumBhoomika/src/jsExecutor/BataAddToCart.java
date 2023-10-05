package jsExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BataAddToCart {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	       JavascriptExecutor js=driver;
	       driver.get("https://www.bata.in/new/");
	       Thread.sleep(5000);
	       WebElement addToBag = driver.findElement(By.xpath("//*[@id=\"product-search-results\"]/div/div[2]/div[5]/div[14]/div/div[1]/div[2]/div[3]/div[2]/button"));
          js.executeScript("arguments[0].click()", addToBag);
          Thread.sleep(3000);
          driver.quit();
 
	}

}
