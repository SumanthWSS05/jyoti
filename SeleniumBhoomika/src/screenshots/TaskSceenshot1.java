package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TaskSceenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// WebDriver driver = new ChromeDriver(); 
		 ChromeDriver driver = new ChromeDriver();
	       driver.get("https://bingosnacks.com/");
	       Thread.sleep(3000);
	     
	       WebElement img=driver.findElement(By.xpath("//img[@title='Bingo!']"));
	       File Src = img.getScreenshotAs(OutputType.FILE);
	       File dest=new File("./errorShots/img4.png");
		   FileHandler.copy(Src, dest);
		   Thread.sleep(3000);
		    Src = driver.getScreenshotAs(OutputType.FILE);
	       dest=new File("./errorShots/img5.png");
		   FileHandler.copy(Src, dest);
		   Thread.sleep(3000);
		   driver.quit();

	}

}
