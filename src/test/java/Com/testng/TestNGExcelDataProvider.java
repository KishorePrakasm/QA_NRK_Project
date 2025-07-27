package Com.testng;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.base.Base_Class;

public class TestNGExcelDataProvider extends Base_Class{
	@DataProvider(name="excelDataprovider")
	public Object[][]dataprovider(){
	String filePath=System.getProperty("user.dir")+"\\Excel\\userdata.xlsx";
	String sheetname="Data";	
	return ExcelUtility.getExcelData(filePath, sheetname);
		
	}
	
	@Test(dataProvider = "excelDataprovider")
	private void login(String Username, String Password) {

		launchingBroweser("chrome");
		implicitWait(30);
		launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		System.out.println("Username:  "+ Username + "|Password: " +Password);

	}
	
	

}
