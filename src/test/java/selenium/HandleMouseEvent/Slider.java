package selenium.HandleMouseEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.jQueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement min_slider=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		WebElement max_slider=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		System.out.println("Starting Location of Min Slider"+min_slider.getLocation());//(59,249)
		act.dragAndDropBy(min_slider, 100, 249).perform();
		act.dragAndDropBy(max_slider, -100, 249).perform();
	
	}

}
