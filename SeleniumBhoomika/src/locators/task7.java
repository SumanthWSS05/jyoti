package locators;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class task7 {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.next.co.uk/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@aria-label='Close cookies section']")).click();
		    Actions action= new Actions(driver);
		    WebElement GiftsAndFlowers=driver.findElement(By.xpath("//div[contains(text(),'gifts & flowers')]"));
		    action.moveToElement(GiftsAndFlowers).perform(); 
		    Thread.sleep(2000);
		    action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Birthday')]"))).click().build().perform();
	
		    driver.findElement(By.xpath("//img[contains(@alt, 'Multi Happy Birthday Balloon')]")).click();
		    Thread.sleep(2000);
		    String Msg= driver.findElement(By.xpath("//h1[contains(text(),'Happy Birthday')]")).getText();
		    System.out.println(Msg);
			
            
	}

}
