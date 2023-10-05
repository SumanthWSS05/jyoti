package workingWithTestNG;

import org.testng.annotations.Test;

public class WorkingWithHelpingAttributes {
	@Test(enabled=false)
	public void Home() {
		System.out.println("Home page");
	}
	
	@Test
	public void register() {
		System.out.println("User has registerd");
	}
	@Test(description="user login")
	public void login() {
		System.out.println("User has logged in");
	}

}
