package Apporva;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeOptions settings=new ChromeOptions();
	    settings.addArguments("-disable-notifications");
		ChromeDriver driver = new ChromeDriver(settings);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Actions action=new Actions(driver);   
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    Thread.sleep(5000);
	   // driver.findElement(By.xpath("//span[text()='Accept All']")).click();
	    action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
	   // driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"authentication\"]/iframe[2]")));
	    action.click(driver.findElement(By.xpath("//span[text()='Edit']"))).click();
	    
	}

}
