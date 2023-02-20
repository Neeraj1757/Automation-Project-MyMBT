package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	public static void main(String[] args) throws IOException {
		File datafile = new File("C:\\Users\\ajja.kumar\\Downloads\\ExcelData.xlsx");
		FileInputStream fis = new FileInputStream(datafile);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		double firstdata = sh.getRow(1).getCell(0).getNumericCellValue();
		System.out.println(firstdata);
		String seconddata = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(seconddata);
		String thirddata = sh.getRow(1).getCell(2).getStringCellValue();
		System.out.println(thirddata);
		double fourthdata = sh.getRow(1).getCell(3).getNumericCellValue();
		System.out.println(fourthdata);
		String fifthdata = sh.getRow(1).getCell(4).getStringCellValue();
		System.out.println(fifthdata);
		double firstdata1 = sh.getRow(2).getCell(0).getNumericCellValue();
		System.out.println(firstdata1);
		String seconddata1 = sh.getRow(2).getCell(1).getStringCellValue();
		System.out.println(seconddata1);
		String thirddata1 = sh.getRow(2).getCell(2).getStringCellValue();
		System.out.println(thirddata1);
		double fourthdata1 = sh.getRow(2).getCell(3).getNumericCellValue();
		System.out.println(fourthdata1);
		String fifthdata1 = sh.getRow(2).getCell(4).getStringCellValue();
		System.out.println(fifthdata1);
	}
}