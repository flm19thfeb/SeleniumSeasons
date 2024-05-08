package may8th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		// to collect all links in home page 
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("No of Links : "+allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
		}
		
		driver.quit();
		
		
		

	}

}
