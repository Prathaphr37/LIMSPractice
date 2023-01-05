package actions_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DobleClick {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com");
			
		WebElement course = driver.findElement(By.xpath("//a[.='COURSE']"));
		Actions a = new Actions(driver);
		a.moveToElement(course).perform();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("(//a[.='Selenium Training'])[1]")).click();
		
		WebElement plusbtn = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		a.doubleClick(plusbtn).perform();
		Thread.sleep(10000);
		driver.close();
}
}
