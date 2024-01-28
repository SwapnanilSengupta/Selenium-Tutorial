package selenium.HandleMouseEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement rightClick=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		Actions act=new Actions(driver);
		act.contextClick(rightClick).perform();
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
		driver.switchTo().alert().accept();
		
		
	}

}
