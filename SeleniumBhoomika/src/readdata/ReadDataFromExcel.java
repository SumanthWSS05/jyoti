package readdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Jyoti Mishra\\Desktop\\Testing.xlsx");
	    
		 //Workbook file= new XSSFWorkbook(fis);
		Workbook file= WorkbookFactory.create(fis);
		 
		
		String s1data=file.getSheet("Sheet1").getRow(4).getCell(2).getStringCellValue();
		System.out.println(s1data);
		Date date = file.getSheet("Sheet1").getRow(6).getCell(1).getDateCellValue();
		System.out.println(date);
		
		 LocalDateTime date2 = file.getSheet("Sheet1").getRow(8).getCell(2).getLocalDateTimeCellValue();
		System.out.println(date2);
		
		
		
		
	}

}
