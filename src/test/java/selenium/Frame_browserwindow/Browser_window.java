package selenium.Frame_browserwindow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_window {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		// Approach 1
		Set<String> windowIds=driver.getWindowHandles();
		List<String> windowIdsList=new ArrayList(windowIds);
		String parentWindowId=windowIdsList.get(0);
		String childWindowId=windowIdsList.get(1);
		
		//switch to child window
		
		driver.switchTo().window(childWindowId);
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/a/button")).click();
		

		
	}

}
