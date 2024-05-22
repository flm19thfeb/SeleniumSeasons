package may22nd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBox {
	

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@Test
	public void checkButtonTest() throws InterruptedException
	{
				
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
		
		
	}
	
	@Test
	public void radioButtonTestForNoneSelection() throws InterruptedException
	{
		
		List<WebElement> allChecks=driver.findElements(By.xpath("//td[@class='table5']/child::input[@type='checkbox']"));
			
		for(int i=0;i<allChecks.size();i++)
		{
			if(allChecks.get(i).isSelected())
			{
				JavascriptExecutor js=(JavascriptExecutor) driver;
				
				
				WebElement element=allChecks.get(i);
				
				js.executeScript("arguments[0].click()", element);
				
				//allChecks.get(i).click();
			}
		}
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
		
		
	}
	
	@Test
	public void radioButtonTestForAllSelection() throws InterruptedException
	{
		
		List<WebElement> allChecks=driver.findElements(By.xpath("//td[@class='table5']/child::input[@type='checkbox']"));
			
		for(int i=0;i<allChecks.size();i++)
		{
			if(!allChecks.get(i).isSelected())
			{
				JavascriptExecutor js=(JavascriptExecutor) driver;
				
				
				WebElement element=allChecks.get(i);
				
				js.executeScript("arguments[0].click()", element);
				
				//allChecks.get(i).click();
			}
		}
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
		
		
	}
	
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

	

}
