package selenium.locator.idnamelinktext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		//Search box
		driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
		// search button
		driver.findElement(By.name("submit_search")).click();
		// link text
		driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();

	}

}
