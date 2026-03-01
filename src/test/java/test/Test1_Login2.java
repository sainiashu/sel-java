package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.logging.Level;
import java.util.logging.Logger;
import pages.loginPage;

public class Test1_Login2 {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		loginTest();
	}
	
	public static void loginTest() {
		Logger seleniumLogger = Logger.getLogger("org.openqa.selenium");
		seleniumLogger.setLevel(Level.SEVERE); // Only show errors, hide warnings
		
		driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.applitools.com/");
		
		loginPage.textBox_username(driver).sendKeys("admin");
		loginPage.textBox_password(driver).sendKeys("admin");
		loginPage.btn_signin(driver).click();
		
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.id("password")).sendKeys("admin");
//		driver.findElement(By.id("log-in")).click();
//		driver.close();
		driver.quit();
		
		//
		
	}

}
