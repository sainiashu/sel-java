package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.loginpage_pom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class loginTest_POM {
	
	private static WebDriver driver = null;
			
	
	public static void main(String[] args) {
		LoingTest_POM();
		
	}

	public static void LoingTest_POM() {
		
		driver = new ChromeDriver();
		loginpage_pom login = new loginpage_pom(driver);
		driver.get("https://demo.applitools.com/");
		
		login.enterUsername("ashu");
		login.enterPassword("ashu");
		login.clickSignin();
		driver.quit();
	}
}
