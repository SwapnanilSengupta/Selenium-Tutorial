package selenium.HandleMouseEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement desktop=driver.findElement(By.xpath("//a[contains(text(),\"Desktops\")][contains(@class,\"nav-link dropdown-toggle\")]"));
		WebElement mac=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a"));
		Actions act=new Actions(driver);
		
		//Mouse Hover
		act.moveToElement(desktop).moveToElement(mac).click().perform();
		
	}

}
