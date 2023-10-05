package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class taskScreenshot {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	       Actions action= new Actions(driver);
	       WebElement source=driver.findElement(By.id("box3"));
	       WebElement target=driver.findElement(By.id("box103"));
	       action.dragAndDrop(source, target).build().perform();
	       action.contextClick(driver.findElement(By.id("box3"))).perform();
	       File Src = driver.getScreenshotAs(OutputType.FILE);
	   
			File dest=new File("./errorShots/img2.png");
			FileHandler.copy(Src, dest);
	}

}
