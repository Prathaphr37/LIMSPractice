package select_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		WebElement dropdown = driver.findElement(By.name("birthday_month"));
		
		Select s = new Select(dropdown);
		s.selectByIndex(0);
		s.selectByValue("3");
		s.selectByVisibleText("May");
		
		List<WebElement> allOptions = s.getOptions();
		TreeSet set = new TreeSet<>();
		for (WebElement lv : allOptions) {
			String text = lv.getText();
			System.out.println(lv.getText());
			set.add(text);
		}
		
		System.out.println("after sorting");
		for (Object lv : set) {
			System.out.println(lv);
			
		}
	}
}
