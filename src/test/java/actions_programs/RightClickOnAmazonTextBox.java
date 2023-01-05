package actions_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOnAmazonTextBox {

		public static void main(String[] args) throws Throwable {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://www.amazon.com");
			
			WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			Actions a = new Actions(driver);
			a.contextClick(ele).perform();
	}
}
