package synchronization_programs;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FluentWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 org.openqa.selenium.support.ui.FluentWait wait = new org.openqa.selenium.support.ui.FluentWait<>(driver);
			wait.withTimeout(Duration.ofSeconds(30));
			wait.pollingEvery(Duration.ofSeconds(30));
			wait.ignoring(NoSuchElementException.class);
			
			driver.get("https://demo.actitime.com/login.do");
			String loginPage = driver.getTitle();
			System.out.println(loginPage);
			
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loginButton")));
			
			wait.until(ExpectedConditions.titleContains("Time-Track"));
			String landingPage = driver.getTitle();
			System.out.println(landingPage);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='content users']")));
			driver.findElement(By.xpath("//a[@class='content users']")).click();
			
			driver.close();
			
	}
}
