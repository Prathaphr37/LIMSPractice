package synchronization_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitUsingTitleIs {
//actiTIME - Enter Time-Track
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("https://demo.actitime.com/login.do");
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		String landingPage = driver.getTitle();
		System.out.println(landingPage);
		
		driver.close();
	}
}
