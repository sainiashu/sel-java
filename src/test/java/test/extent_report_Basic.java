package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.loginpage_pom;

public class extent_report_Basic {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		// initialize the HtmlReporter
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentreports.html");
		
		// initialize ExtentReports and attach the HtmlReporter
		ExtentReports extent = new ExtentReports();
		// attach only HtmlReporter
		extent.attachReporter(htmlReporter);
		
		// creating tests
		ExtentTest test = extent.createTest("login test");
//		test.pass("details");
		
		driver = new ChromeDriver();
		loginpage_pom login = new loginpage_pom(driver);
		driver.get("https://demo.applitools.com/");
		test.pass("laucn the site");
		
		login.enterUsername("ashu");
		test.pass("enter username");
		
		login.enterPassword("ashu");
		test.pass("enter password");
		
		login.clickSignin();
		test.fail("click login");
		
		driver.close();
		test.info("close browser");
		driver.quit();
		test.info("quit browser");
		// calling flush writes everything to the log file
        extent.flush();


//
//		// attach all reporters
//		extent.attachReporter(htmlReporter, klovReporter, emailReporter, logger);

	}

}
