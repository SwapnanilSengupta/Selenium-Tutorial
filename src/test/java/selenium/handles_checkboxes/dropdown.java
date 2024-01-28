package selenium.handles_checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		WebElement drpcountryEle=driver.findElement(By.xpath("//*[@id='post-2646']/div[2]/div/div/div/p/select"));
		Select drpcountry=new Select(drpcountryEle);
		
		//selecting option from dropdown
		
		//drpcountry.selectByVisibleText("Aruba");
		drpcountry.selectByValue("ALB");
		
		//Find Total option in dropdown
		
		List<WebElement> options=drpcountry.getOptions();
		System.out.println("Total number of elemenent is dropdown :"+options.size());
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		

	}

}
