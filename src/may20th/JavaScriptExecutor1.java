package may20th;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutor1 {

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void scrollTest() throws InterruptedException
	{
		
		try
		{
			Thread.sleep(10000);
			
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@title,'notification-frame')]")));
			
			driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
			
			driver.switchTo().defaultContent();
			
		}
		catch(Exception e)
		{
			
		}
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0, 1000);");
		
		//js.executeScript("window.scrollBy(0, document.body.scrollHeight);");
		
		WebElement element=driver.findElement(By.xpath("//div[text()='Sell on Pepperfry']"));
		
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		js.executeScript("window.scrollBy(0, -500);");
		
		element.click();
		
		//js.executeScript("arguments[0].click()", element);
		
		//driver.findElement(By.xpath("//div[text()='Sell on Pepperfry']")).click();
		
		Thread.sleep(3000);
		
		try
		{
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@title,'notification-frame')]")));
			
			driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
			
			driver.switchTo().defaultContent();
			
		}
		catch(Exception e)
		{
			
		}
		
				
	}

	
	

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
