package selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalcommand {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		//isDisplayed
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("THE DISPLAY STATUS OF LOGO : "+logo.isDisplayed());
		
		//isSelected
		WebElement male_radio_button=driver.findElement(By.xpath("//*[@id=\'gender-male\']"));
		WebElement female_radio_button=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//Before Selection
		System.out.println("Before Selection.......................");
		System.out.println("Male Button : "+male_radio_button.isSelected());
		System.out.println("Female Button : "+female_radio_button.isSelected());
		
		//After Selecting Male Button
		System.out.println("After Male Button Selection.......................");
		male_radio_button.click();
		System.out.println("Male Button : "+male_radio_button.isSelected());
		System.out.println("Female Button : "+female_radio_button.isSelected());
		
		//After Selecting Female Button
		Thread.sleep(5000);
		System.out.println("After Female Button Selection.......................");
		female_radio_button.click();
		System.out.println("Male Button : "+male_radio_button.isSelected());
		System.out.println("Female Button : "+female_radio_button.isSelected());
		driver.quit();
		
	}

}
