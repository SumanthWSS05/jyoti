package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class taskDuobleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement plusIcon = driver.findElement(By.id("add"));
		Thread.sleep(3000);
		action.doubleClick(plusIcon).perform();
		WebElement minus = driver.findElement(By.id("minus"));
		Thread.sleep(3000);
		action.doubleClick(minus).perform();
		

	}

}
