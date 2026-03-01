package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class ExcelDataProvider {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setupTest() {
		
			driver = new ChromeDriver();
			System.out.println("running in chrome");
		
	}
	
	@Test(dataProvider="test1data")
	public void test1(String username, String password) {
		System.out.println(username+" | "+ password);
		driver.get("https://demo.applitools.com/");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	
//	Not needed this function if you are using testng dataprovider approach and remove the static from the function name becuase  we no longer use the mainm method.
//	public static void main(String[] args) {
//		
//		String excelpath = "D:\\java_project\\SeleniumFramework\\excel\\data.xlsx";
//		testData(excelpath,"Sheet1");
//	}
	
	@DataProvider(name = "test1data")
//	public static getData() {
	public Object getData() {	
		String excelpath = "D:\\java_project\\SeleniumFramework\\excel\\data.xlsx";
	Object data[][] = testData(excelpath,"Sheet1");
	return data;
	}
	
//	public static Object[][] testData(String excelPath, String sheetName ) {
	public static Object[][] testData(String excelPath, String sheetName ) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount  = excel.getRowCount();
		int colCount  = excel.getColCount();
		
		Object data[][] = new Object[rowCount -1][colCount];
		
		for(int i=1; i< rowCount; i ++) {
			for(int j = 0; j <colCount; j++) {
				
			String cellData = 	excel.getCellDataString(i, j);
			System.out.print(cellData+" | " );
			data[i-1][j] = cellData;
			}
			System.out.println();
		}
		return data;
	}

}
