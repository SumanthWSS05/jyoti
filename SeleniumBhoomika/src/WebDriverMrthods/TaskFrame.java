package WebDriverMrthods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
	      Thread.sleep(4000) ;
	     //Using index
	     // driver.switchTo().frame(0); 
	      
	     // Using id
	    driver.switchTo().frame("send-sms-iframe");
	     driver.findElement(By.id("regEmail")).sendKeys("8475412368");
	}

}
