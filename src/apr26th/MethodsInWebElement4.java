package apr26th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebElement4 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		//driver.get("https://adactinhotelapp.com/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("login")).click();
		
		//System.out.println(driver.findElement(By.id("username_span")).getTagName());
		
		//driver.findElement(By.name("login_form")).submit();
		
		driver.findElement(By.className("_9vtf")).submit();
		
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
