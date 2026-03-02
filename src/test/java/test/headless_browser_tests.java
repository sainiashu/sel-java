package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class headless_browser_tests {
	
	public static void main(String[] args) {
		HeadlessChrome();
	}
	
	public static void HeadlessChrome() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1280,800");
		WebDriver driver = new ChromeDriver(options);
		
		
		
		driver.get("https://demo.applitools.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("log-in")).click();
		driver.close();
		driver.quit();
		System.out.println("Test completed");
	} 

}
