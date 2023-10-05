package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandDependentIndependentXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/search?q=watches");
		Thread.sleep(2000);
		String price=driver.findElement(By.xpath("//p[text()='Fashionate Sports Watches']/..//h5")).getText();
		Thread.sleep(2000);
		System.out.println(price);
		driver.quit();
	}

}
