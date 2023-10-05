package jsExecutor;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TaskJavaExecutor {

	public static void main(String[] args) throws IOException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	       JavascriptExecutor js=driver;
	      
	       driver.get("https://www.zomato.com/bangalore");
	       for(;;)
	       {
	    	   try {
	    		    driver.findElement(By.xpath("//h4[text()='EasyBites by Empire']")).click();
	    	        break;
	    	       }
	    	   catch(Exception e)
	    	   {
	    		   js.executeScript("window.scrollBy(0,150)"); 
	    	   }
	       }
	       Thread.sleep(5000);
	       File Src = driver.getScreenshotAs(OutputType.FILE);
	       File dest = new File("./errorShots/img6.png");
		   FileHandler.copy(Src, dest);
		  
		 
	}

}
