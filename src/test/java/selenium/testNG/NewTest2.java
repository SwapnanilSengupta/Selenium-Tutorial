package selenium.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {
	@AfterClass
	public void test1() {
		System.out.println("After Class..............");
	}

	@Test
	public void test2() {
		System.out.println("Testing ..............");
	}

	@BeforeClass
	public void test3() {
		System.out.println("Before Class..............");
	}
}
