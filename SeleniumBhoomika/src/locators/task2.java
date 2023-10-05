package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/register");
		       
		       driver.findElement(By.id("gender-female")).click();  
		       driver.findElement(By.name("FirstName")).sendKeys("jyoti");
		       driver.findElement(By.name("LastName")).sendKeys("Mishra");
		       driver.findElement(By.id("Email")).sendKeys("jyoti.mishra254@gmail.com");
		       driver.findElement(By.id("Password")).sendKeys("Mishra123");
		       driver.findElement(By.id("ConfirmPassword")).sendKeys("Mishra123");
		       driver.findElement(By.id("register-button")).click();
		      
	  
	}

}
