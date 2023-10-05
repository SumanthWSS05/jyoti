package readdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * 
 * @author Sumanth
 *
 */
public class ExcelLibrary {

	/**
	 * This method is used to read data from an Excel file
	 * @param sheetName pass the sheet name where the data has to be read
	 * @param rowNum    give the row info where the data is present
	 * @param cellNum   give the cell info where the data is stored
	 * @return the data will be read in string and it will be returned
	 */
	public static String readFromExcel(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		try {
			FileInputStream fis = new FileInputStream("./src/resources/testing.xlsx");
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
	}

	// Step 1: create FIS object
	// Step 2: create Workbook object
	// Step 3: call read methods
	public static String[][] readAllData(String sheet) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/resources/testing.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		int rowNum = workbook.getSheet(sheet).getPhysicalNumberOfRows();
		int colNum = workbook.getSheet(sheet).getRow(0).getPhysicalNumberOfCells();
		String[][] arr = new String[rowNum][colNum];
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
				arr[i][j] = workbook.getSheet(sheet).getRow(i).getCell(j).toString();
			}
		}
		return arr;
	}

}
