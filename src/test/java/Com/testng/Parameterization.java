package Com.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.base.Base_Class;

public class Parameterization extends Base_Class {

	@Test
	@Parameters({ "Username", "Password" })
	private void login(String Username, String Password) {

		launchingBroweser("chrome");
		implicitWait(30);
		launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@type='submit']")).click();

	}

}
