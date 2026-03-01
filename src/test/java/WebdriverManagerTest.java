import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManagerTest {

	public static void main(String[] args) {
		
		Logger seleniumLogger = Logger.getLogger("org.openqa.selenium");
		seleniumLogger.setLevel(Level.SEVERE); // Only show errors, hide warnings
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.applitools.com/");
		WebElement textbox = driver.findElement(By.id("username"));
		
		List<WebElement> inputBox = driver.findElements(By.className("form-group"));
		int count= inputBox.size();
		
		System.out.println(count);
//		textbox.sendKeys("admin");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.get("https://google.com");
		driver.close();
		driver.quit();
	}
}
