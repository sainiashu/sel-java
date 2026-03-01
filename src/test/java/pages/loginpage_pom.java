package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage_pom {
	
	private static WebDriver driver = null;
	
	By textbox_username = By.id("username");
	By textbox_password = By.id("password");
	By btn_signin = By.id("log-in");
	
	public loginpage_pom(WebDriver driver) {
		this.driver= driver;
		
	}
	
	public void enterUsername(String username) {
		
		driver.findElement(textbox_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(textbox_password).sendKeys(password);
	}
	
	public void clickSignin() {
		driver.findElement(btn_signin).click();
	}

}
