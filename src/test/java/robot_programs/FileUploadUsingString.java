package robot_programs;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingString {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=Cj0KCQiAnsqdBhCGARIsAAyjYjRMe2AlME6DSkmAEx26vzMd18x-7jdxEDeLyrtarZFhYS334B1K8h4aAhJoEALw_wcB&gclsrc=aw.ds");
		File f = new File("./src/test/resources/PrathapHR.docx");
		String path = f.getAbsolutePath();
		driver.findElement(By.xpath("//button[.='Upload Resume']")).sendKeys(path);
		
	}
}
