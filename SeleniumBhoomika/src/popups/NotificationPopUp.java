package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeOptions settings=new ChromeOptions();
	    settings.addArguments("-disable-notifications");
		ChromeDriver driver = new ChromeDriver(settings);
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	       
	       driver.get("https://www.kalkifashion.com/");
	       Thread.sleep(3000);
	       
	}

}
