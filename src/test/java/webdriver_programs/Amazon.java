package webdriver_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		String title = driver.getTitle();
		System.out.println("title = "+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("URL = "+url);
		
		String ps = driver.getPageSource();
		System.out.println("page source = "+ps);
		
		Thread.sleep(5000);
		driver.navigate().to("https://www.flipkart.com");
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.close();
	}

}
