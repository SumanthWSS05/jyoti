package workingWithTestNG;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test
	public void login()
	{
		System.out.println("User login");	
	}
	@Test
	public void otp()
	{
		System.out.println("Otp for app");	
	}
	
	@Test(dependsOnMethods="otp", invocationCount = 3)
	public void message()
	{
		System.out.println("Good Eve");
		
	}

}
