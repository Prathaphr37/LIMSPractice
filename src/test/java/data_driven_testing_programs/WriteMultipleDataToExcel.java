package data_driven_testing_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteMultipleDataToExcel {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nike shoes");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		List<WebElement> titles = driver.findElements(By.xpath("//a[@class='IRpwTa']"));
		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='IRpwTa']/../..//div[@class='_30jeq3']"));
	
		for (WebElement lv : prices) {
			System.out.println(lv.getText());
		}
		for (WebElement lv : titles) {
			System.out.println(lv.getText());
		}
		
		FileInputStream fi = new FileInputStream("./src/test/resources/project.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Sheet4");
		
		for (int i = 0; i < titles.size(); i++) {
			Row row = sh.createRow(i);
			 row.createCell(0).setCellValue(titles.get(i).getText());
			 row.createCell(1).setCellValue(prices.get(i).getText());	 
		}
		FileOutputStream fo = new FileOutputStream("./src/test/resources/project.xlsx");
		wb.write(fo);	
		wb.close();
		
}
}
