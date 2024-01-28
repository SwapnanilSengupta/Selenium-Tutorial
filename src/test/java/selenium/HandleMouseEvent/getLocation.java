package selenium.HandleMouseEvent;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {

	public static void main(String[] args)  
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement img=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
		System.out.println("Image position at maximize screen"+img.getLocation());
		driver.manage().window().minimize();
		System.out.println("Image position at minimum screen"+img.getLocation());
		Point p=new Point(50,100);
		driver.manage().window().setPosition(p);
		System.out.println("Image position at 50x100 screen"+img.getLocation());
		driver.quit();
	}

}
