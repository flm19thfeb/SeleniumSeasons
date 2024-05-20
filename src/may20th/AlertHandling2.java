package may20th;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandling2 {


WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
	}
	
	@Test
	public void alertHandlingTest() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		
		Thread.sleep(3000);
		
		Alert al=driver.switchTo().alert();
		
		al.sendKeys("FLM");
		
		Thread.sleep(3000);
		
		al.accept();
		
	}

	
	

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
