package webelements_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//isDisplayed(),isEnabled(),isSelected().
public class WebElementVerificationMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement un = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		System.out.println(un.isDisplayed());
		System.out.println(un.isEnabled());
		
		System.out.println(pwd.isDisplayed());
		System.out.println(pwd.isEnabled());
		
		System.out.println(un.isSelected());
		System.out.println(pwd.isSelected());

		driver.close();
	}
}
