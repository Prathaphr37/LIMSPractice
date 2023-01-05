package findelements_programs;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndPrice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("nike shoes");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		List<WebElement> titles = driver.findElements(By.xpath("//a[@class='IRpwTa']"));
		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='IRpwTa']/../..//div[@class='_30jeq3']"));
		
		for (int i = 0; i < titles.size(); i++) {
			String t = titles.get(i).getText();
			String p = prices.get(i).getText();
			
			System.out.println(t+" = "+p);
		}
		
		driver.close();
	}
}
