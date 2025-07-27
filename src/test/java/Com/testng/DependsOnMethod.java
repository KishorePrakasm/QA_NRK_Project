package Com.testng;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	private void SampleOne() {
		System.out.println("SAMPLE ONE");

	}
	@Test
	private void SampleTwo() {
		System.out.println("SAMPLE TWO");
	}
		
		@Test(dependsOnMethods = {"SampleOne","SampleTwo"})
		private void SampleThree() {
			System.out.println("SAMPLE THREE");
		}
	
	
}
