package findelements_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size());
		System.out.println(links.getClass().getName());
		
		for (WebElement lv : links) {
			System.out.println(lv.getText());
		}
		
	}
}
