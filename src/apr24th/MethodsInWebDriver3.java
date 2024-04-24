package apr24th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebDriver3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		//manage - to maximize window
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//getWindowHandle():String 
		
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		//driver.get("https://play.google.com/store/apps/details?id=com.adactin.education.hotelbooking");
		
		System.out.println(driver.getWindowHandles());
		
		driver.quit();

	}

}
