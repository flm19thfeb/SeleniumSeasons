package may10th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateLogin {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void validateLoginUsingValidUsernameAndValidPassword() throws InterruptedException
	{
		
		
		driver.findElement(By.name("username")).sendKeys("reyaz0806");
		
		driver.findElement(By.name("password")).sendKeys("reyaz123");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
		
		
		
	}
	
	@Test
	public void validateLoginUsingInValidUsernameAndValidPassword() throws InterruptedException
	{
		
		
		driver.findElement(By.name("username")).sendKeys("reyaz1212");
		
		driver.findElement(By.name("password")).sendKeys("reyaz123");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
		
		
	}

}
