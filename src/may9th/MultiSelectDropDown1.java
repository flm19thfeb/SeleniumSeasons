package may9th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelectDropDown1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.mobiscroll.com/select/multiple-select");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Please select...']/parent::span)[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Books']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Toys, Kids & Baby']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
