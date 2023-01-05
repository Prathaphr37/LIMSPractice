package frames_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchControlUsingIndex {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Prathap/OneDrive/Desktop/selenium/page2.html");
		driver.findElement(By.xpath("//input[@id='t2']")).sendKeys("main frame");
		Thread.sleep(3000);
		//by using index
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='t1']")).sendKeys("sub frame");
		Thread.sleep(5000);
		driver.close();
	}
}
