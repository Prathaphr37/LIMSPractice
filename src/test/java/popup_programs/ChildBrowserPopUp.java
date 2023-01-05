package popup_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		//clicks on new window for three times
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		
		handlewindows(driver);
		System.out.println(driver.getTitle());
	}

	public static void handlewindows(WebDriver driver) {
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String lv : allWindows) {
			driver.switchTo().window(lv);
			if (!lv.equals(mainWindow)) {
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		
	}
}
