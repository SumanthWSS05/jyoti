package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kwickremoval.co.uk/");
		driver.findElement(By.linkText("Contact us")).click();
		Thread.sleep(2000);
	   String Msg= driver.findElement(By.xpath("//span[contains(text(),'contact')]")).getText();
       System.out.println(Msg);
	}

}
