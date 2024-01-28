package selenium.ApachePoi;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CitiBankHomework {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		String file=System.getProperty("user.dir")+"\\ExcelSheets\\caldata2.xlsx";
		int row=ExcelUtils.getRowCount(file,"Sheet1");
		for(int i=1;i<=row;i++)
		{
			    //read data from excel
				String Initial_Deposit_amout=ExcelUtils.getCellData(file,"Sheet1",i,0);
				String Interest_rate=ExcelUtils.getCellData(file,"Sheet1",i,1);
				String months=ExcelUtils.getCellData(file,"Sheet1",i,2);
				String Compunding=ExcelUtils.getCellData(file,"Sheet1",i,3);
				driver.findElement(By.id("mat-input-0")).clear();
				driver.findElement(By.id("mat-input-0")).sendKeys(Initial_Deposit_amout);
				driver.findElement(By.id("mat-input-1")).clear();
				driver.findElement(By.id("mat-input-1")).sendKeys(months);
				driver.findElement(By.id("mat-input-2")).clear();
				driver.findElement(By.id("mat-input-2")).sendKeys(Interest_rate);
				//Select drpdown=new Select(driver.findElement(By.id("mat-select-0")));
				//drpdown.selectByVisibleText(Compunding);
				driver.findElement(By.id("CIT-chart-submit")).click();
				String value=driver.findElement(By.xpath("//*[@id=\"displayTotalValue\"]")).getText();
				System.out.println(value);
				
				
		}
	}

}
