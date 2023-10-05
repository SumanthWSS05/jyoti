package examplePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(id="username") WebElement username;
	
	private @FindBy(name="pwd") WebElement password;
	
	private @FindBy(id="loginButton") WebElement loginButton;

	private @FindBy(xpath = "") WebElement cacnel;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCacnel() {
		return cacnel;
	}
	
	
	
}
