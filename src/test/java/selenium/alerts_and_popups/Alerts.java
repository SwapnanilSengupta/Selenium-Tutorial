package selenium.alerts_and_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://webapps.tekstac.com/MultipleWindow/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[1]/button")).click();
		Alert alertwindow=driver.switchTo().alert();
		System.out.println(alertwindow.getText());
		//alertwindow.accept(); this will close alert window with ok button
		//alertwindow.dismiss(); this will close alert window with cancel button
		
	}

}
