package select_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SkillRaryDropDown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='cars']"));
		
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		s.selectByValue("500");
		
		Thread.sleep(5000);
		s.deselectByIndex(1);
		s.deselectByValue("500");
		
		
		
	}
}
