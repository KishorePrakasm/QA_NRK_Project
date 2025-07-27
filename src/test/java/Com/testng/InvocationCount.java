package Com.testng;

import org.testng.annotations.Test;

import Com.base.Base_Class;

public class InvocationCount extends Base_Class  {
	
	@Test(invocationCount = 5)
	private void youtube() {
		
		launchingBroweser("Chrome");
		launchUrl("https://www.youtube.com/");
		closeBrowser("quit");
		

	}

}
