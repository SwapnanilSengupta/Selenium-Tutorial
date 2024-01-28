package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		// Relative Xpath
		//String productname=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/form/div/div[2]/div[1]/h4/a")).getText();
		//System.out.println(productname);
		
		// Absolute Xpath
		String productname=driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[2]/div[1]/form/div/div[2]/div[1]/h4/a")).getText();
		System.out.println(productname);
		driver.quit();
	}

}
