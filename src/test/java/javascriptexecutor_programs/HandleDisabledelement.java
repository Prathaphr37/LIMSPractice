package javascriptexecutor_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledelement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Prathap/OneDrive/Desktop/selenium/disabled.html");
		driver.findElement(By.id("abc"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('abc').value='prathap'");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('abc').value=''");
		driver.close();
	}
}
