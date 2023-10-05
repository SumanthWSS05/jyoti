package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Jewelry")).click();
		driver.findElement(By.partialLinkText("Black & White Diamond Heart")).click();
	   String Msg= driver.findElement(By.xpath("//div[contains(text(),'Sterling Silver')]")).getText();
       System.out.println(Msg);
	}

}
