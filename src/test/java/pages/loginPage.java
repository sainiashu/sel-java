package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	
	private static WebElement element = null;
	
	public static WebElement textBox_username(WebDriver driver){
		
	element = driver.findElement(By.id("username"));
	return element;
		
	}
	
	public static WebElement textBox_password(WebDriver driver){
		
		element = driver.findElement(By.id("password"));
		return element;
			
		}

	public static WebElement btn_signin(WebDriver driver){
		
//		element = driver.findElement(By.id("password"));
		element = driver.findElement(By.id("log-in"));
		return element;
			
		}

}
