package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	       
	       driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//button[@ondblclick= 'addtocart()']")).click();
		   Thread.sleep(3000);
		   Alert ConfirmPopUp = driver.switchTo().alert();
		   ConfirmPopUp.accept();
		   Thread.sleep(3000);
		    driver.quit();

	}

}
