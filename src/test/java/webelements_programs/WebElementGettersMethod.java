package webelements_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementGettersMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement un = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		
		//user name text field
		System.out.println("user name details ");
		System.out.println(un.getText());
		System.out.println(un.getTagName());
		System.out.println(un.getAttribute("id"));
		System.out.println(un.getAttribute("class"));
		
		int x = un.getLocation().getX();
		int y = un.getLocation().getY();
		System.out.println(x+"   "+y);
		
		int h = un.getSize().getHeight();
		int w = un.getSize().getWidth();
		System.out.println(h+"   "+w);
		
		System.out.println(un.getCssValue("background"));
		driver.close();
	}
}
