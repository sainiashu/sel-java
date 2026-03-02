package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.loginpage_pom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestNG_loginTest {
	
	WebDriver driver = null;
			
	
	@BeforeTest
	public void setupTest() {
		driver = new ChromeDriver();
		System.out.println("Set driver");
	}
	
	@Test
	public void LoingTest_POM() {
		
		loginpage_pom login = new loginpage_pom(driver);
		driver.get("https://demo.applitools.com/");
		login.enterUsername("admin");
		login.enterPassword("admin");
		login.clickSignin();
		
	}
	
	@Test
	public void LoingTest() {
		
		loginpage_pom login = new loginpage_pom(driver);
		driver.get("https://demo.applitools.com/");
		login.enterUsername("admin");
		login.enterPassword("admin");
		login.clickSignin();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println(" Quit successfully");
	} 
}
