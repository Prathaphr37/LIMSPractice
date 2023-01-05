package webelements_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookUsingIDAttributes {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("7026630735");
	driver.findElement(By.id("pass")).sendKeys("7026630736");
	driver.findElement(By.name("login")).click();
	Thread.sleep(5000);
//	driver.close();
	
	}
}
