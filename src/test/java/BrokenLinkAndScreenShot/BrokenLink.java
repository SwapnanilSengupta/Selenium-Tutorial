package BrokenLinkAndScreenShot;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Broken Link : "+links.size());
		int brokenLink=0;
		for(WebElement link:links)
		{
			String hrefAttValue=link.getAttribute("href");
			if(hrefAttValue.isEmpty()||hrefAttValue==null)
			{
				System.out.println("Link is Empty");
				continue;
			}
			URL linkurl=new URL(hrefAttValue);
			HttpURLConnection conn=(HttpURLConnection)linkurl.openConnection();
			conn.connect();
			if(conn.getResponseCode()>=400)
			{
				System.out.println(link.getText()+" Broken Link");
			}
			else
			{
				System.out.println(link.getText()+" Not Broken Link");
			}
		}
		
		driver.quit();
		

	}

}
