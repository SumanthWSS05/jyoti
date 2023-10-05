package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandMultiSelectDropDown {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/");
			Thread.sleep(2000);
			WebElement listBox= driver.findElement(By.id("cars"));
            Select selectOption =new Select(listBox);
           System.out.println(selectOption.isMultiple());
           
           //select by Index
           selectOption.selectByIndex(2);
           Thread.sleep(2000);
           // select by value
           selectOption.selectByValue("99");
           Thread.sleep(2000);
           selectOption.selectByVisibleText("INR 200 - INR 299 ( 3 )");
           Thread.sleep(2000);
           //driver.quit();
	}

}
