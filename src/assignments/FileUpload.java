package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload {
	
	

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://imgur.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void frameHandlingTest() throws InterruptedException, AWTException
	{
		
		driver.findElement(By.xpath("//a[@class='Button upload']/img")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'Choose Photo')]/child::img")).click();
		
		Thread.sleep(3000);
		// D:\FLM13thDecWS\SeleniumSeason\Xpath Axes.png
		
		String fileName="D:\\FLM13thDecWS\\SeleniumSeason\\Xpath Axes.png";
		
		StringSelection stringSelection=new StringSelection(fileName);
		
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		
		Clipboard  clipboard=toolkit.getSystemClipboard();
		
		clipboard.setContents(stringSelection, null);
		
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
