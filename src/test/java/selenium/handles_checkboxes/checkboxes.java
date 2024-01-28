package selenium.handles_checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://total-qa.com/checkbox-example/");
		driver.manage().window().maximize();
		// select one specific checkbox
		
		//driver.findElement(By.xpath("//*[@id=\"post-3261\"]/div/p/input[1]")).click();
		
		//select all the checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type=\'checkbox\']"));
		/*System.out.println("Total number of Checkboxes : "+checkboxes.size());
		for(WebElement chkbox:checkboxes)
		{
			chkbox.click();
		}*/
		
		//select last 2 checkboxes
		for(int i=2;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		Thread.sleep(3000);
		
		// clear or uncheck boxes
		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
		driver.quit();
	}

}
