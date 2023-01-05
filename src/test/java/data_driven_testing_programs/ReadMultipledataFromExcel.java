package data_driven_testing_programs;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipledataFromExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("./src/test/resources/project.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Sheet2");
		int rowCount = sh.getLastRowNum() + 1;
		int colCount = sh.getRow(0).getLastCellNum();

		System.out.println("Row count = " + rowCount);
		System.out.println("column count = " + colCount);

		for (int i = 0; i < rowCount; i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < colCount; j++) {
				String data = row.getCell(j).getStringCellValue();
				System.out.print(data+"  ");
			}
			System.out.println();
		}

		wb.close();
	}
}
