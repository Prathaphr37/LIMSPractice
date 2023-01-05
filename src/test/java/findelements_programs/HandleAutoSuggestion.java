package findelements_programs;

import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestion {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("virat");
		List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(.,'virat')]"));
		TreeSet set = new TreeSet<>();
		
		for (WebElement lv : sugg) {
			System.out.println(lv.getText());
			set.add(lv.getText());
		}
		
		System.out.println(set);
		
		
		for (Object lv : set) {
			System.out.println(lv);
		}
	}
}
