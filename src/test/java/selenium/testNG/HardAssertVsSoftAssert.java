package selenium.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertVsSoftAssert {
  @Test
  public void hard_assert() 
  {
	  System.out.println("hard testing................");
	  System.out.println("hard testing................");
	  System.out.println("hard testing................");
	  Assert.assertEquals(1,2);  //if it fails then below statement will not be executed
	  System.out.println("hard assertion completed................");
	  
  }
  @Test
  public void soft_assert() 
  {
	  SoftAssert sa=new SoftAssert();
	  System.out.println("soft testing................");
	  System.out.println("soft testing................");
	  System.out.println("soft testing................");
	  sa.assertEquals(1,2);  //if it fails then below statement will  be executed in SoftAssert
	  System.out.println("soft assertion completed................");
	  
  }
}
