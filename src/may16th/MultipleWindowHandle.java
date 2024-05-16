package may16th;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowHandle {

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void mutlipleWindowHandlingTest() throws InterruptedException
	{
		
		String homeWindowId=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		Set<String> allWindowIds=driver.getWindowHandles();
		
		for(String windowId:allWindowIds)
		{
			driver.switchTo().window(windowId);
			
			Thread.sleep(3000);
			
			if(driver.getTitle().equalsIgnoreCase("Not Found"))
			{
				break;
			}
		}
		
	
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		Thread.sleep(3000);
		
		
		driver.switchTo().window(homeWindowId);
		
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
		
		Thread.sleep(3000);
		
	
		
		allWindowIds=driver.getWindowHandles();
		
		for(String windowId:allWindowIds)
		{
			driver.switchTo().window(windowId);
			
			Thread.sleep(3000);
			
			if(driver.getTitle().equalsIgnoreCase("TestFlight - Apple"))
			{
				break;
			}
		}
		
		
		driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homeWindowId);
		
		
		allWindowIds=driver.getWindowHandles();
		
		for(String windowId:allWindowIds)
		{
			driver.switchTo().window(windowId);
			
			Thread.sleep(3000);
			
			if(driver.getTitle().equalsIgnoreCase("Legal - Apple Media Services - Apple"))
			{
				break;
			}
		}
		
		driver.findElement(By.xpath("//a[text()='Choose your country/region']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homeWindowId);
		
	}

	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
