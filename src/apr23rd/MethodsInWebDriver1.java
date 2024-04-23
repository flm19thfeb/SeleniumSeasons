package apr23rd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebDriver1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		//get
		
		driver.get("https://adactinhotelapp.com/");
		
		//driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		//String title=driver.getTitle();
		
		//System.out.println(title);
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		//close
		
		//driver.close();
		
		driver.quit();

	}

}
