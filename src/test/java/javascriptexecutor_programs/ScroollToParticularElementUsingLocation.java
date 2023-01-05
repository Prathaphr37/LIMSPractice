package javascriptexecutor_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroollToParticularElementUsingLocation {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com");
		WebElement ele = driver.findElement(By.xpath("//div[.='Get to Know Us']"));
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		
		driver.close();
	}
}
