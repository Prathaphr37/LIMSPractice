package select_programs;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFaceBookAccount {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Prathap");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("H R");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("prathaphr@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("7026630736");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("prathaphr@gmail.com");
		driver.findElement(By.xpath("//label[.='Male']")).click();

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(day);
		s1.selectByValue("3");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Jul");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("1998");
	}
}
