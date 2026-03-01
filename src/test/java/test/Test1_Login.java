package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test1_Login {
	
	public static void main(String[] args) {
		loginTest();
	}
	
	public static void loginTest() {
		Logger seleniumLogger = Logger.getLogger("org.openqa.selenium");
		seleniumLogger.setLevel(Level.SEVERE); // Only show errors, hide warnings
		
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.applitools.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("log-in")).click();
		driver.close();
		driver.quit();
		
		//
		
	}

}
