package synchronization_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitUsingElementVisibility {

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
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loginButton")));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='content users']")));
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		
		driver.close();
	}
}
