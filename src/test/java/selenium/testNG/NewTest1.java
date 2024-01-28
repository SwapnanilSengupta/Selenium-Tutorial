package selenium.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test(priority=1)
  public void test1() 
  {
	  System.out.println("Testing 1..............");
  }
  @Test(priority=2)
  public void test2() 
  {
	  System.out.println("Testing 2..............");
  }
  @Test(priority=3)
  public void test()
  {
	  System.out.println("Testing 3..............");
  }
}
