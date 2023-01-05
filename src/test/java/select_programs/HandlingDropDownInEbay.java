package select_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownInEbay {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select s = new Select(dropdown);
		
		Thread.sleep(5000);
		s.selectByIndex(9);
		Thread.sleep(5000);
		s.selectByValue("267");
		Thread.sleep(5000);
		s.selectByVisibleText("Music");
		Thread.sleep(5000);

		driver.close();
	}
}
