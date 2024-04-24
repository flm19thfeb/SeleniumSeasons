package apr24th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebDriver2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		//getCurrentUrl():String 
		
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource():String 
		//System.out.println(driver.getPageSource());
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();

	}

}
