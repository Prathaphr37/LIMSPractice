package popup_programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptConfirmationPopUpClickOncancel {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='content users']")));
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys("prathap");
		driver.findElement(By.xpath("//div[@class='closeButton hideButton_panelContainer']")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		 Alert a = driver.switchTo().alert();
		 System.out.println(a.getText());
		 Thread.sleep(5000);
		 
		 //click on cancel
		 a.dismiss();
		 
		 driver.close();
}
}
