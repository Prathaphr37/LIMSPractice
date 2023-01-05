package chromeoptions_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingHeadlessBrowser {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("nike shoes");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		List<WebElement> titles = driver.findElements(By.xpath("//a[@class='IRpwTa']"));
		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='IRpwTa']/../..//div[@class='_30jeq3']"));

		for (WebElement lv : titles) {
			System.out.println(lv.getText());
		}
			
		for (WebElement lv : prices) {
			System.out.println(lv.getText());
		}

		driver.close();
	}
}
