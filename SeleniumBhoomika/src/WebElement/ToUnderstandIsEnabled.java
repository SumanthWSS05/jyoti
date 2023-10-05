package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//div[text()='Log in']/.."));
		System.out.println(login.isEnabled());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("jyoti");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("pass4578");
		Thread.sleep(2000);
		System.out.println(login.isEnabled());
		driver.quit();
		
		
		
		
		

	}

}
