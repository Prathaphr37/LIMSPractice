package popup_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertPopUp {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// defines implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/Prathap/OneDrive/Desktop/selenium/alert.html");

		// clicks on try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Thread.sleep(5000);
		Alert a = driver.switchTo().alert();
		
		System.out.println(a.getText());
		a.accept();
//		a.dismiss();

		driver.close();
	}
}
