import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.logging.Level;
import java.util.logging.Logger;



public class BrowserTest {

	public static void main(String[] args) {
		
		Logger seleniumLogger = Logger.getLogger("org.openqa.selenium");
		seleniumLogger.setLevel(Level.SEVERE); // Only show errors, hide warnings
//		WebDriver driver = new FirefoxDriver();
		
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		
//		System.setProperty("webdriver.chrome.driver", projectpath + "/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.applitools.com/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		driver.quit();
	}
}
