package may17th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameHanlding {
	

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void frameHandlingTest() throws InterruptedException
	{
		
		//driver.switchTo().frame(0);
		
		//driver.switchTo().frame("demo-frame");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	
		Actions action=new Actions(driver);
		
		action.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), 
				 driver.findElement(By.xpath("//div[@id='droppable']")))
				.perform();
	}

	
	

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
