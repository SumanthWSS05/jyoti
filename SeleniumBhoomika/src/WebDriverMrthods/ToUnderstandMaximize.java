package WebDriverMrthods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandMaximize {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/ ");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
