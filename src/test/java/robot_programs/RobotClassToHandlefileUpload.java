package robot_programs;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassToHandlefileUpload {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=Cj0KCQiAnsqdBhCGARIsAAyjYjRMe2AlME6DSkmAEx26vzMd18x-7jdxEDeLyrtarZFhYS334B1K8h4aAhJoEALw_wcB&gclsrc=aw.ds");
		driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
		
		StringSelection s = new StringSelection("./src/test/resources/PrathapHR.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
//		File f1 = new File("./src/test/resources/virat-kohli.png");
//		String photo_path = f1.getAbsolutePath();
//		driver.findElement(By.xpath("//input[@name='fileToUpload']")).sendKeys(photo_path);
	}
}
