package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohandlePopUps {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	       
	       driver.get("https://netbanking.hdfcbank.com/netbanking/");
	       Thread.sleep(3000);
	       driver.switchTo().frame("login_page");
	       driver.findElement(By.linkText("CONTINUE")).click();
	       Thread.sleep(3000);
	       Alert alertPopUp = driver.switchTo().alert();
	      // alertPopUp.accept();
	       alertPopUp.dismiss();
	       Thread.sleep(3000);
	       driver.quit();
	      
	      
	       

	}

}
