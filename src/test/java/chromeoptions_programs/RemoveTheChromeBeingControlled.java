package chromeoptions_programs;

import java.util.Arrays;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class RemoveTheChromeBeingControlled {

	@Test
	public void removeTheChromeBeingControlledUsingStringArray() throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	public void removeTheChromeBeingControlledUsingArray() throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	public void removeTheChromeBeingControlledUsingCollection() throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	public void removeTheChromeBeingControlledUsingCollectionSingletonList() throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
		driver.close();
	}
	
}
