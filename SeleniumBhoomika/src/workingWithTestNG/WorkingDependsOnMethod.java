package workingWithTestNG;

import org.testng.annotations.Test;

public class WorkingDependsOnMethod {
	@Test
	public void Home() {
		System.out.println("Home page");
	}
	
	@Test
	public void register() {
		System.out.println("User has registerd");
	}
	@Test
	public void login() {
		System.out.println("User has logged in");
	}
	
	@Test(dependsOnMethods= {"register"})
	public void logout() {
		System.out.println("User has logged out");
	}
	
}
