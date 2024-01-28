package selenium.parallel_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Testing {
	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser", "url" })
	void setup(String br, String url) {
		if (br.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (br.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void testlogo() throws InterruptedException {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		try {
			boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
			Assert.assertEquals(status, true);
		} catch (Exception ex) {
			Assert.fail();
		}
	}

	@Test(priority = 2)
	public void testHomePageTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@AfterClass
	public void closeApp() {
		driver.quit();
	}
}
