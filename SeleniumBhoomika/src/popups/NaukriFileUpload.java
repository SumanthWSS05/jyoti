package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriFileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	       
	       driver.get("https://www.naukri.com/");
	       Thread.sleep(3000);
	       driver.findElement(By.id("register_Layer")).click();
	       driver.findElement(By.xpath("//span[text()='Send me important updates on']")).click();
	       driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Jyoti Mishra\\Documents\\peturam");

	}

}
