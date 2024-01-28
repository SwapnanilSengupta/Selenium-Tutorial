package selenium.staticAndwebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1) Total Number of Row
		
		int row=driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr")).size();
		System.out.println("Total Number of Rows : "+row);
		
		// 2) Total number of Coloumn
		
		int coloumn=driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[1]/th")).size();
		System.out.println("Total Number of Coloumn : "+coloumn);
		
		//3 ) Read Specific Row or Coloumn Data
		
		String value=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[4]/td[1]")).getText();
		System.out.println("Text is : "+value);
		
		//4) Read all row and column
		for(int i=2;i<=row;i++)
		{
			for(int j=1;j<=coloumn;j++)
			{
				String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(data+"    ");
			}
			System.out.println();
		}
		
		//5) print the book name whose author is amit
		for(int i=2;i<=row;i++)
		{
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
			if(author.equals("Amit"))
			{
				String book=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
				System.out.println("Book by Amit : "+book);
			}
		}
		
		//6) sum of price all books
		int sum=0;
		for(int i=2;i<=row;i++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
			sum+=Integer.parseInt(price);
		}
		System.out.println("Sum of Price of All Books : "+sum);
		driver.quit();
	}

}
