package data_driven_testing_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("./src/test/resources/project.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Sheet3");
		
		Row row = sh.createRow(0);
		Cell cel = row.createCell(0);
		cel.setCellValue("prathap");
		
		FileOutputStream fo = new FileOutputStream("./src/test/resources/project.xlsx");
		wb.write(fo);
		
		wb.close();
	}
}
