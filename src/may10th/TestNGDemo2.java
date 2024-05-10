package may10th;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo2 {
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Browser started ...");
		System.out.println("App Launched ...");
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Browser closed ...");
	}
	
	@Test(priority=11)
	public void loginTest()
	{
		
		System.out.println("Login Successfull ...");
		Assert.assertTrue(true);
		
	}
	
	@Test(priority=-10)
	public void registrationTest()
	{
		
		System.out.println("Registration Successfull ...");
		
	}
	
	@Test(priority=20)
	public void forgotPasswordTest()
	{
		
		System.out.println("Forgot Password Successfull ...");
		
		
	}
	
	@Test(priority = 30,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		
		System.out.println("Change Password Successfull ...");
		
	}
	
	

}
