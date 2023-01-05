package findelements_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestionAndClickOnSomeText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("virat");
		List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(.,'virat')]"));
		for (WebElement lv : sugg) {
			String text = lv.getText();
			if (text.equals("virat kohli birthday")) {
				lv.click();
				break;
			}
		}
		driver.close();
	}
}
