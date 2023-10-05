package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class TocaptureScreenshotOfwebElement {

	public static void main(String[] args) throws InterruptedException, IOException    {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("https://wildcraft.com/");
	       Thread.sleep(3000);
	     
	       WebElement img=driver.findElement(By.xpath("//img[@title='Wildcraft']"));
	       File Src = img.getScreenshotAs(OutputType.FILE);
	       File dest=new File("./errorShots/img3.png");
		   FileHandler.copy(Src, dest);
		   Thread.sleep(3000);
		   driver.quit();
	}

}
  