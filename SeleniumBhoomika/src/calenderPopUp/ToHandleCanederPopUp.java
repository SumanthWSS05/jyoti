package calenderPopUp;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleCanederPopUp {

	public static void main(String[] args) throws InterruptedException {
		LocalDateTime date = LocalDateTime.now().plusMonths(2).plusDays(11);
		String month=date.getMonth().toString();
		//month=month.charAt(0)+month.substring(1,3).toString();
		String mon = month.substring(1,3).toString();
		month=month.charAt(0)+mon.toLowerCase();
		int year=date.getYear();
		int day=date.getDayOfMonth();
		
		System.out.println(day+" "+month +" "+ year);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeOptions settings=new ChromeOptions();
	    settings.addArguments("-disable-notifications");
		ChromeDriver driver = new ChromeDriver(settings);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	       
	    driver.get("https://in.via.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.id("departure")).click();
	    
	    for(;;)
	    {
	    	try 
	    	{
	    		// for fixed date
	           //driver.findElement(By.xpath("//span[contains(text(),'Aug')]/../..//span[contains(text(),' 2023')]/../..//div[text()='25']")).click();
	    	 driver.findElement(By.xpath("//span[contains(text(),'"+month+"')]/../..//span[contains(text(),' "+year+"')]/../..//div[text()='"+day+"']")).click();	
	    			
	    	 // driver.findElement(By.xpath("//span[contains(text(),'"+month+"')]/../..//span[text()=' "+year+"']/../..//div[text()='"+day+"']")).click();	
	    	break;
	    	}
	    	catch(Exception e)
	    	{
	    		driver.findElement(By.xpath("//span[contains(@class,'js-next-month')]")).click();
	    	}
	    }
	   }
	    

	}


