package jsExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByAndScrollTo {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       JavascriptExecutor js=driver;
	      
	       driver.get("https://wildcraft.com/");
	       js.executeScript("window.scrollBy(0,100)");
	       Thread.sleep(2000);
	       js.executeScript("window.scrollBy(0,100)");
	       Thread.sleep(2000);
	       js.executeScript("window.scrollBy(0,100)");
	       Thread.sleep(2000);
	       js.executeScript("window.scrollTo(0,900)");
	       Thread.sleep(2000);
	       js.executeScript("window.scrollTo(0,900)");
	       Thread.sleep(4000);
	       driver.quit();
	       

	}

}
