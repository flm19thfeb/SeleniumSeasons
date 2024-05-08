package may8th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting3 {
	
	public static void main(String[] args) {
		

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("//div[text()='Make Money with Us']/parent::div"));
		
		List<WebElement> allLinks=block.findElements(By.tagName("a"));
		
		System.out.println("No of Links in Make money with us Module "+allLinks.size());
		
		for(WebElement temp:allLinks)
		{
			System.out.println(temp.getText());
		}
		
		driver.quit();
		
	}

}
