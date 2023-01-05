package actions_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop");
		
		WebElement ele1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement ele2 = driver.findElement(By.xpath("//h1[.='Block 4']"));
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
		
		Thread.sleep(5000);
//		driver.close();	
	}
}
