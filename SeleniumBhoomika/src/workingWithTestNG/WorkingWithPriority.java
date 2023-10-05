package workingWithTestNG;

import org.testng.annotations.Test;

public class WorkingWithPriority {
	@Test(priority = 1)
	public void Home() {
		System.out.println("Home page displayed");
	}
	
	@Test(priority = 2)
	public void Register() {
		System.out.println("User has registerd");
	}
	@Test(priority = 3)
	public void login() {
		System.out.println("User has logged in");
	}
	@Test
	public void productCart() {
		System.out.println("User is able to add Product to Cart");
		
	}
	
	@Test(priority = 4)
	public void payment() {
		System.out.println("User is able to pay");
	}
	@Test(priority = 5)
	public void logOut() {
		System.out.println("User has logged out");
	}

}
