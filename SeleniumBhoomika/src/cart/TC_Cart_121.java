package cart;

import org.testng.annotations.Test;

import elementsRepository.HomePage;
import elementsRepository.ShoppingCartPage;
import elementsRepository.VirtualGiftCardsPage;

public class TC_Cart_121 extends BaseClass {

	@Test
	public void removeProd() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.getVirtualGiftCardsAddToCartButton().click();
		VirtualGiftCardsPage virtualGiftCartPage = new VirtualGiftCardsPage(driver);
		virtualGiftCartPage.getRecipientsNameTextField().sendKeys("Manoj");
		Thread.sleep(2000);
		virtualGiftCartPage.getRecipientsEmailTextField().sendKeys("manoj@gmail.com");
		Thread.sleep(2000);
		virtualGiftCartPage.getQuantityTextBox().clear();
		virtualGiftCartPage.getQuantityTextBox().sendKeys("2");
		Thread.sleep(2000);
		virtualGiftCartPage.getAddToCartButton().click();
		basePage.getShoppingCartLink().click();
		ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
		shoppingCartPage.getRemoveFromCartCheckBox().click();
		shoppingCartPage.getUpdateCartButton().click();		
	}
}
