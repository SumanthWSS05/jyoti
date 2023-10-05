package workingWithTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseChildClass extends BaseClass{
	
@Test
public void Computer() throws InterruptedException
{
	
	 driver.findElement(By.linkText("COMPUTERS")).click();
	 Thread.sleep(2000);
	 
   
}

}
	


