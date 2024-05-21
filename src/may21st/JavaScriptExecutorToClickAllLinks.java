package may21st;

import java.util.List;

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

public class JavaScriptExecutorToClickAllLinks {

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
		
		String homeWindow=driver.getWindowHandle();
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//div[contains(@data-test,'patternSectionDesk')]"));
		
		System.out.println("No of links "+allLinks.size());
		
		JavascriptExecutor js;
		
		WebElement element=null;
		
		for(int i=0;i<allLinks.size();i++)
		{
			js=(JavascriptExecutor) driver;
			
			element=allLinks.get(i);
			
			js.executeScript("arguments[0].click();", element);
			
			driver.switchTo().window(homeWindow);
			
			Thread.sleep(3000);
			
		}
		
				
				
	}

	
	

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
