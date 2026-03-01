package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng_multibrowsers {

	WebDriver driver = null;
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println(" Browser Name: " + browserName);
		System.out.println(" Thread : " + Thread.currentThread().getName());
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println("running in chrome");
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.out.println("running in firefox");
		}

		else if(browserName.equalsIgnoreCase("ie")) {
			System.out.println("running in ie");
		}
		
	}

	@Test
	public void test1() throws InterruptedException {
		
		driver.get("https://demo.applitools.com/");
		Thread.sleep(4000);
		driver.close();
	}

	@AfterTest
	public void teardown() {
		System.out.println(" Test completed successfully");		

	}
}
