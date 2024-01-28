package selenium.commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println("Title of the Window : " + driver.getTitle());
		System.out.println("Current URL of the Page : " + driver.getCurrentUrl());
		System.out.println("Cuurent ID of the Page : " + driver.getWindowHandle());
		// driver.getHandles Example Below
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windowid = driver.getWindowHandles();
		for (String id : windowid) {
			System.out.println(id);
		}
		driver.quit();

	}

}
