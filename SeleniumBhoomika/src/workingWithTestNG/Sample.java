package workingWithTestNG;

import org.testng.annotations.Test;

public class Sample {
	@Test
	public void Home() {
		System.out.println("Hello TestNG");
	}
	
	@Test
	public void Register() {
		System.out.println("User has registerd");
	}
	@Test
	public void login() {
		System.out.println("User has logged in");
	}
	@Test
	public void productCart() {
		System.out.println("User is able to add Product to Cart");
		
	}
	
	@Test
	public void payment() {
		System.out.println("User is able to pay");
	}
	@Test
	public void logOut() {
		System.out.println("User has logged out");
	}
	}


