package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.WorkbookDocumentImpl;

public class ExcelUtils {

	static String projectPath ;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) {
		
		try {
			projectPath =  System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelPath);
			sheet =  workbook.getSheet(sheetName);
		} catch(Exception exp) {
			
			exp.printStackTrace();
		} 
		
		
	}

	public static void main(String[] args) {
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}

	public static int getRowCount() {
		int rowCount = 0; 
		
		XSSFWorkbook workbook;
		try {
			projectPath =  System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/excel/data.xlsx");
			sheet =  workbook.getSheet("Sheet1");
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No.of row count: "+ rowCount );

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCount;
	}

	public static int getColCount() {
		int colCount = 0;
		XSSFWorkbook workbook;
		try {
			projectPath =  System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/excel/data.xlsx");
			sheet =  workbook.getSheet("Sheet1");
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No.of col count: "+ colCount );

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colCount;
	}
	
	public static String getCellDataString(int rowNum, int colNum) {
		String getCellData= null;
		
		try {			
			getCellData=	sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(getCellData);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

		return getCellData;
	}
	
	public static void getCellDataNumber(int rowNum, int colNum) {

		try {
			projectPath =  System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/excel/data.xlsx");
			sheet =  workbook.getSheet("Sheet1");
			Double getCellData=	sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();

			System.out.println(getCellData);
		} catch (IOException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
}
