package actions_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverEbay {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.ebay.com");
		
		WebElement electronic = driver.findElement(By.xpath("(//a[.='Electronics'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(electronic).perform();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[.='Apple']")).click();
		
		driver.close();
	}
}
