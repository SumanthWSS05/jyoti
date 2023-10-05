package WebDriverMrthods;

import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.kfc.co.uk/");
			Thread.sleep(5000);
			String title=driver.getTitle();
			System.out.println(title);
			driver.quit();

	}

}
