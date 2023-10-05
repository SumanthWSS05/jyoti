package iFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
	 
	     driver.switchTo().frame("login_page");
	    // driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("123");
	     driver.findElement(By.linkText("CONTINUE")).click();

	}

}
