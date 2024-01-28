package selenium.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider {
	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
	}

	@Test(dataProvider = "dp")
	public void testLogin(String email, String pwd) {
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"))
				.click();
		String exp_title = "nopCommerce demo store";
		String act_title = driver.getTitle();
		Assert.assertEquals(exp_title, act_title);
	}

	@DataProvider(name = "dp")
	String[][] loginData() {
		String data[][] = { { "abc@gmail.com", "test123" }, { "pavanol@gmail.com", "test@123" },
				{ "pavanoltraining@gmail.com", "test3" }, { "pavanoltraining@gmail.com", "test123" },
				{ "pavanoltraining@gmail.com", "test123" } };
		return data;
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
