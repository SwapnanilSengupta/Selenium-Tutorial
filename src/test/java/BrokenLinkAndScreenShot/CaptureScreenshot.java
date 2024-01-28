package BrokenLinkAndScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		// capture full page 
		
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("C:\\Users\\2310300\\eclipse-workspace\\seleniumproject\\Screenshot\\fullpge.png");
		FileUtils.copyFile(src,trg);*/
		
		// capture specific area of page
		WebElement specific_location=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[3]/div"));
		File src=specific_location.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\2310300\\eclipse-workspace\\seleniumproject\\Screenshot\\newpic.png");
		FileUtils.copyFile(src,trg);
		
		
	}

}
