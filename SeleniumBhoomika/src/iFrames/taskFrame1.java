package iFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskFrame1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Frames.html");
	 
	     driver.switchTo().frame("singleframe");
	    driver.findElement(By.tagName("input")).sendKeys("123");
	  //  driver.switchTo().defaultContent();
	    driver.switchTo().parentFrame();
	    driver.findElement(By.partialLinkText("with in an Iframe")).click();
	    WebElement frame1 = driver.findElement(By.xpath("//div[@id=\"Multiple\"]/iframe"));
	    driver.switchTo().frame(frame1);
	    WebElement frame2 = driver.findElement(By.xpath("//div[@class=\"iframe-container\"]/iframe"));
	    driver.switchTo().frame(frame2);
	    driver.findElement(By.tagName("input")).sendKeys("jyoti");
	    
	}

}
