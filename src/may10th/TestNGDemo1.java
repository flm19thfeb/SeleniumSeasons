package may10th;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo1 {
	
	@Test(priority=11)
	public void loginTest()
	{
		System.out.println("Browser started ...");
		System.out.println("App Launched ...");
		System.out.println("Login Successfull ...");
		Assert.assertTrue(false);
		System.out.println("Browser closed ...");
	}
	
	@Test(priority=-10)
	public void registrationTest()
	{
		System.out.println("Browser started ...");
		System.out.println("App Launched ...");
		System.out.println("Registration Successfull ...");
		System.out.println("Browser closed ...");
	}
	
	@Test(priority=20)
	public void forgotPasswordTest()
	{
		System.out.println("Browser started ...");
		System.out.println("App Launched ...");
		System.out.println("Forgot Password Successfull ...");
		System.out.println("Browser closed ...");
		
	}
	
	@Test(priority = 30,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		System.out.println("Browser started ...");
		System.out.println("App Launched ...");
		System.out.println("Change Password Successfull ...");
		System.out.println("Browser closed ...");
	}
	
	

}
