package Com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.base.Base_Class;

public class ReadExcelData extends Base_Class{
	
	public static void youtubeTest() {
		
		launchingBroweser("chrome");
		launchUrl("https://www.youtube.com/");
		
		File file = new File("C:\\Users\\praka\\Downloads\\DataDriven_JAN.xlsx");
		try {
			Workbook book= new XSSFWorkbook(file);
			
			Sheet sheet= book.getSheet("Sheet1");
			
			Row row=sheet.getRow(1);
			
			Cell cell= row.getCell(0);
			
			DataFormatter dataFormate = new DataFormatter();
			
			String data=dataFormate.formatCellValue(cell);
			
			System.out.println(data);
			
			WebElement search=  driver.findElement(By.xpath("//*[@role='combobox']"));
			search.sendKeys(data);
			
			//takeScreenshots();
			
			
			
		} catch (InvalidFormatException | IOException e) {
			
			e.printStackTrace();
		}
	}


}
