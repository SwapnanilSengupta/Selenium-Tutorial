package selenium.parameter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter 
{
  WebDriver driver;
  @BeforeClass
  @Parameters({"browser"})
  void setup(String br)
  {
	 if(br.equals("chrome"))
	 {
		 driver=new ChromeDriver();
	 }
	 else if(br.equals("edge"))
	 {
		 driver=new EdgeDriver();
	 }
	 else
	 {
		 driver=new FirefoxDriver();
	 }
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }
  @Test(priority=1)
  public void testlogo() 
  {
	  try
	  {
		  boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		  Assert.assertEquals(status,true);
	  }
	  catch(Exception ex)
	  {
		  Assert.fail();
	  }

  }
  @Test(priority=2)
  public void testHomePageTitle()
  {
	  Assert.assertEquals(driver.getTitle(),"OrangeHRM");
  }
  @AfterClass
  public void closeApp()
  {
	  driver.quit();
  }
}
