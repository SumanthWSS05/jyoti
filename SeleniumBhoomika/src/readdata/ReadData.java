package readdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Step 1 : Create FIS object
		FileInputStream fis = new FileInputStream("./resources/config.properties");
		FileInputStream ref = new FileInputStream("./resources/test.xlsx");
		
		//Step 2 : create object of file type
		Properties prop = new Properties();
		Workbook workbook = WorkbookFactory.create(ref);
		
		//Step 3 : call read methods
		prop.load(fis);
	
		System.setProperty(prop.getProperty("chromekey"), prop.getProperty("chromepath"));
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("testurl"));
		driver.findElement(By.id("email")).sendKeys(workbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
				
	}

}
