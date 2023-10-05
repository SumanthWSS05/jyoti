package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandledChildWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	       
	       driver.get("https://demo.actitime.com/login.do");
	       driver.findElement(By.linkText("actiTIME Inc.")).click();
	       Thread.sleep(3000);
	       Set<String> allWindoId = driver.getWindowHandles();
	       for(String Wid:allWindoId)
	       {
	    	   driver.switchTo().window(Wid);
	    	   if(driver.getTitle().contains("Time"))
	    		{
	    		  driver.findElement(By.linkText("Try Free")).click();
	    	    }
	    	  
	       }
	     }
	       
	   
	       
	}


