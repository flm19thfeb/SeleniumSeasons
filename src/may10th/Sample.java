package may10th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void setUp2()
	{
		driver=new FirefoxDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
	}
	@Test
	public void abcTest()
	{
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
