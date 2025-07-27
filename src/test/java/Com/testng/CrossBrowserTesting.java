package Com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Com.base.Base_Class;

public class CrossBrowserTesting extends Base_Class {

	@Test(priority = -1)
	private void chrome() {
		launchingBroweser("chrome");
		launchUrl("https://www.google.com/");
		System.out.println("Browser Id;  " + Thread.currentThread());
	}

	@Test(priority = 3)
	private void Edge() {

		launchingBroweser("edge");
		launchUrl("https://www.google.com/");
		System.out.println("Browser Id;  " + Thread.currentThread());

	}

	@Test(priority = 1)
	private void firefox() {
		launchingBroweser("firefox");
		launchUrl("https://www.google.com/");
		System.out.println("Browser Id;  " + Thread.currentThread());
	}

}
