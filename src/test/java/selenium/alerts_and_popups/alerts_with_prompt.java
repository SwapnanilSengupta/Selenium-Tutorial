package selenium.alerts_and_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts_with_prompt {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert alertwindow=driver.switchTo().alert();
		alertwindow.sendKeys("Swapnanil");
		alertwindow.accept();
		// Validation
		String result=driver.findElement(By.xpath("//*[@id=\'result\']")).getText();
		String expected="You entered: Swapnanil";
		if(result.equals(expected))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.quit();
	}

}
