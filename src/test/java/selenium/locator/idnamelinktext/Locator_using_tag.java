package selenium.locator.idnamelinktext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_using_tag {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		//Finding the number of slider in the homepage
		List<WebElement>slider=driver.findElements(By.className("homeslider-container"));
		System.out.println("Number of Slider : "+slider.size());
		
	   //Find Total number of Images in home page
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Number of Images : "+images.size());
		
		//Find Total number of Links in home page
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Number of Links : "+links.size());
		driver.quit();

    }
}
