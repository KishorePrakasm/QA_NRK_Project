package Com.testng;

import org.testng.annotations.Test;

public class GroupingClass {

	@Test(groups = "Japanese")
	private void Honda() {
		System.out.println("Honda");

	}

	@Test(groups = "Japanese")
	private void Yamaha() {
		System.out.println("Yamaha");

	}

	@Test(groups = "Japanese")
	private void Suzuki() {
		System.out.println("Suzuki");

	}

	@Test(groups = "Indian")
	private void Bajaj() {
		System.out.println("Bajaj");

	}

	@Test(groups = "Indian")
	private void RoyalEnfield() {
		System.out.println("RoyalEnfield");

	}

	@Test(groups = "American")
	private void HarleyDavidson() {
		System.out.println("HarleyDavidson");

	}

	@Test(groups = "American")
	private void Buell() {
		System.out.println("Buell");

	}

	@Test(groups = "Italian")
	private void Aprilia() {
		System.out.println("Aprilia");

	}

	@Test(groups = "Italian")
	private void Ducati() {
		System.out.println("Ducati");

	}

	@Test(groups = "Italian")
	private void Benelli() {
		System.out.println("Benelli");

	}

}
