package select_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckMultiselectOrNot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Prathap/OneDrive/Desktop/selenium/listbox.html");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='KB']"));
		
		Select s = new Select(dropdown);
		

		if (s.isMultiple()) {
			System.out.println("is multi selected");
		} else {
			System.out.println("single selected ");
		}
	}
}

//http://localhost:8080/login?from=%2F
