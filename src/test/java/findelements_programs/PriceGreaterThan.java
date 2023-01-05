package findelements_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceGreaterThan {

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
			
			//₹2,956
			//steps
//			String p1 = p.substring(1);
//			String p2 = p1.replace(",", "");
//			int p3 = Integer.parseInt(p2);
			
			int p1 = Integer.parseInt( p.substring(1).replace(",", ""));
			if (p1>2000) {
				System.out.println(t+" = "+p1);
			}
			
		}
		
		driver.close();
}
}
