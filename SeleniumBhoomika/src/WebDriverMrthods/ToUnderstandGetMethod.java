package WebDriverMrthods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in/");
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
