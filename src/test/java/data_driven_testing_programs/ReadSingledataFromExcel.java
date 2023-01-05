package data_driven_testing_programs;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadSingledataFromExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("./src/test/resources/project.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(0);
		Cell cel = row.getCell(0);
		String data = cel.getStringCellValue();
		
		System.out.println(data);
		
		wb.close();
	}
}
