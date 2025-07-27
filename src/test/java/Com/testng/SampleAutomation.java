package Com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SampleAutomation {
	@BeforeSuite
	private void propertySetting() {
		System.out.println("PROPERTY SETTING");

	}

	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");

	}

	@BeforeClass
	private void urlLaunch() {
		System.out.println("URL LAUNCH");

	}

	@BeforeMethod
	private void login() {
		System.out.println("LOGIN");

	}

//	@Ignore
	@Test
	private void men() {
		System.out.println("MEN");
	}

	@Test
	private void women() {
		System.out.println("WOMEN");

	}

	@Test
	private void kids() {
		System.out.println("KIDS");
	}

	@AfterMethod
	private void logout() {
		System.out.println("LOGOUT");
	}

	@AfterClass
	private void screenshot() {
		System.out.println("SCREEN SHOT");
	}

	@AfterTest
	private void closeBrowser() {
		System.out.println("CLOSE BROWSER");
	}

	@AfterSuite
	private void browserTermination() {
		System.out.println("BROWSER TERMINATION");
	}

}
