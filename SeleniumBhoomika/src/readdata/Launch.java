package readdata;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Launch {

	@DataProvider
	public String[] registerData()  throws Exception, IOException {
		String[] url = {
							"https://www.zomato.com" ,
							"https://www.polarbear.com" ,
							"https://baskinrobbinsindia.com/"
						};
		return url;
	}
	
	@Test(dataProvider = "registerData")
	public void registerUser(String url) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.close();
	}
}
