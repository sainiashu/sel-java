package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extent_adv_test_reports {

	ExtentSparkReporter htmlReporter;	
	ExtentReports extent;
	WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		// initialize the HtmlReporter
		htmlReporter = new ExtentSparkReporter("extent.html");

		// initialize ExtentReports and attach the HtmlReporter
		extent = new ExtentReports();
		// attach only HtmlReporter
		extent.attachReporter(htmlReporter);
	}

	@BeforeTest
	public void setupTest() {
		driver = new ChromeDriver();
		System.out.println("Set driver");
	}
	
	
	
	@Test
	public void test1() {
		 // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        

	}
	
	@Test
	public void test2() {
		 // creates a toggle for the given test, adds all log events under it    
       ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

       // log(Status, details)
       test.log(Status.INFO, "This step shows usage of log(status, details)");

       // info(details)
       test.info("This step shows usage of info(details)");
       
       // log with snapshot
       test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
       
       // test with snapshot
       test.addScreenCaptureFromPath("screenshot.png");
       

	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println(" Quit successfully");
	} 

	@AfterSuite
	public void teardown() {
		 extent.flush();
	}
}
