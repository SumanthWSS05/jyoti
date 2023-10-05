package readdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws Exception, IOException {
		
		FileInputStream fis = new FileInputStream("./src/resources/test.xlsx");
		Workbook ref = WorkbookFactory.create(fis);
		int numOfRows = ref.getSheet("DemoWebShop").getPhysicalNumberOfRows();
		int numOfCells = ref.getSheet("DemoWebShop").getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[numOfRows][numOfCells];
		
//		data[0][0] = ref.getSheet("DemoWebShop").getRow(0).getCell(0).toString();
		
		for(int i=0; i<numOfRows; i++) {
			for(int j=0; j<numOfCells; j++) {
				data[i][j] = ref.getSheet("DemoWebShop").getRow(i).getCell(j).toString();
			}
		}
		System.out.println(data[2][3]);

	}
}
