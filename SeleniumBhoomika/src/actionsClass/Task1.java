package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
		driver.get("https://www.winni.in/");
		WebElement cake = driver.findElement(By.partialLinkText("CAKES"));
		Thread.sleep(2000);
		action.moveToElement(cake).perform();
		Thread.sleep(2000);
		action.click(driver.findElement(By.partialLinkText("Chocolate Cakes"))).perform();
		driver.findElement(By.xpath("//img[@title='Death By Chocolate Cake']")).click();

	}

}
