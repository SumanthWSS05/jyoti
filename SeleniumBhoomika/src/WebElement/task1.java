package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement img= driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		Thread.sleep(2000);
		System.out.println(img.getCssValue("color"));
		Thread.sleep(2000);
		System.out.println(img.getAttribute("alt"));
		
		
		
	}
	

}
