package Com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	@Test
	private void softAssert() {

		String actual = "Kishore";

		String expected = "kishore";

		SoftAssert soft = new SoftAssert();

		System.out.println("VERIFICATION DONE");

	}

	@Test
	private void hardAssert() {

		String actual = "Kishore";

		String expected = "Kishore";

		Assert.assertEquals(actual, expected);
		System.out.println("VERIFICATION DONE");

	}

}
