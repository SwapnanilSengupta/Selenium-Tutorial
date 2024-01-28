package selenium.TestNGListeners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(selenium.TestNGListeners.ExtentReport.class)
public class Listener {
	@AfterClass
	public void test1() {
		System.out.println("After Class..............");
	}

	@Test()
	public void test11() {
		System.out.println("Testing 11 ..............");
	}

	@Test(dependsOnMethods = {"test11"})
	public void test2() {
		System.out.println("Testing ..............");
	}

	@BeforeClass
	public void test3() {
		System.out.println("Before Class..............");
	}
}
