package Apporva;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateFunction {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			// WebDriver driver = new ChromeDriver(); 
			 ChromeDriver driver = new ChromeDriver();
		       driver.get("https://bingosnacks.com/");
		       Thread.sleep(3000);
		       driver.get("https://demowebshop.tricentis.com/");
		       driver.navigate().back();
		       Thread.sleep(3000);
		       driver.navigate().forward();
		       Thread.sleep(3000);
		       driver.navigate().refresh();
		       driver.navigate().to("https://bingosnacks.com/");
		       driver.quit();

	}

}
