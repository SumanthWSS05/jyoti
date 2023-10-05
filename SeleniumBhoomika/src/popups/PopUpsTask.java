package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUpsTask {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	       
	       driver.get("https://licindia.in/branch");
	       Thread.sleep(3000);
	       Actions action=new Actions(driver);
	      
			WebElement Login= driver.findElement(By.xpath("//a[@title='Login']"));
			action.moveToElement(Login).perform();
			driver.findElement(By.linkText("Agent Portal")).click();
			
		    Thread.sleep(3000);
		    Alert ConfirmationPopUp = driver.switchTo().alert();
		    ConfirmationPopUp .dismiss();
		    Thread.sleep(3000);
		    driver.quit();

	}

}
