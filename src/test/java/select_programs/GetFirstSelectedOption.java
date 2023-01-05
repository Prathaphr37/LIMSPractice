package select_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Prathap/OneDrive/Desktop/selenium/listbox.html");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='KB']"));
		
		Select s = new Select(dropdown);
		Thread.sleep(2000);
		s.selectByIndex(4);
		Thread.sleep(2000);
		s.selectByValue("T");
		Thread.sleep(2000);
		s.selectByVisibleText("PepperChicken");
		
		WebElement first = s.getFirstSelectedOption();
		System.out.println(first.getText());
	}
}
