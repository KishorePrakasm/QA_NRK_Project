package Com.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Com.base.Base_Class;

public class TestClass extends Base_Class{

	 WebDriver driver;

	    @Test(retryAnalyzer = ReTest.class)
	    public void testMethod() {
	        launchingBroweser("chrome");
	        launchUrl("https://www.facebook.com/");
	        driver.close();
	    }
}
