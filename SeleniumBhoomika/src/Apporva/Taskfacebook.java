package Apporva;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Taskfacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeOptions settings=new ChromeOptions();
	    settings.addArguments("-disable-notifications");
		ChromeDriver driver = new ChromeDriver(settings);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	       
	    driver.get("https://en-gb.facebook.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@title='Allow all cookies']")).click();
	    driver.findElement(By.partialLinkText("Create new account")).click();
	    driver.findElement(By.name("firstname")).sendKeys("jyoti");
	    driver.findElement(By.name("lastname")).sendKeys("mishra");
	    driver.findElement(By.name("reg_email__")).sendKeys("3214569870");
	    driver.close();
	    
	}

}
