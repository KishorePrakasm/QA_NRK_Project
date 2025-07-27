package Com.listnear;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;

import Com.base.Base_Class;

public class ExtentReporter_Test {
	
	public static ExtentTest extenttest;
	
	@BeforeSuite
    public void extentTestReportStartup() throws IOException {
        Base_Class base = new Base_Class();
        base.extentReportStart(null);
    }

    @AfterSuite
    public void extentReportEnd() throws IOException {
        Base_Class base = new Base_Class();
        base.extentReportTearDown(null);
    }

}
