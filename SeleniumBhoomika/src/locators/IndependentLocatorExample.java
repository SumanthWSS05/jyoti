package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentLocatorExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("GIFT CARDS")).click();
		driver.findElement(By.xpath("//a[text()='$100 Physical Gift Card']/../..//input")).click();
		Thread.sleep(2000);
		String name=driver.findElement(By.xpath("//h1[@itemprop='name']")).getText();
		System.out.println(name);
		driver.quit();

	}

}
