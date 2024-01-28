package day17;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

/* 
1) Launch browser
2) open url
	https://opensource-demo.orangehrmlive.com/
3) Provide username  - Admin
4) Provide password  - admin123
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : OrangeHRM
7) close browser 
*/

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// ChromeDriver driver=new ChromeDriver();
		// 1) Launch browser
		WebDriver driver = new ChromeDriver();
		
		// 2)open url https://opensource-demo.orangehrmlive.com/
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// For full screen
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// 3) Provide username - Admin
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//4) Provide password  - admin123
		driver.findElement(By.name("password")).sendKeys("admin12");
		
		//5) Click on Login button 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		//6) Verify the title of dashboard page Exp title : OrangeHRM
		// Title Validation 
		/*if(driver.getTitle().equals("OrangeHRM"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		*/
		//Label Validation after successful login
		String actual_label="";
		try
		{
			actual_label=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
		}
		catch(NoSuchElementException e)
		{
			
		}
		
		String expected_label="Dashboard";
		if(actual_label.equals(expected_label))
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		// 7)close browser 
		driver.quit();
	}
}
