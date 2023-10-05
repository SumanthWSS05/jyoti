package workingWithTestNG;

import org.testng.annotations.Test;

public class WorkingAlwaysRun {
	@Test
	public void addToCart()
	{
		System.out.println("Add to cart test");
		int i=9/0;
	}
	@Test(alwaysRun=true,dependsOnMethods="addToCart")
	public void payment()
	{
		System.out.println("Payment Test");
		
	}
	}


