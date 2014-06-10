package IDHPages;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class idhAuthenticationPage extends AbstractPage{

	public idhAuthenticationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "UserName")
	WebElement usernameField;

	@FindBy(id = "Password")
	WebElement passwordField;
	
	@FindBy(css = ".LoginSubmitLine > input")
	WebElement loginButton;
	
	@FindBy(css = ".InfoText > u > a")
	WebElement logoutButton;
	
	public void inputUsername(String username)	{
		element(usernameField).waitUntilVisible();
		usernameField.sendKeys(username);
	}
	
	public void inputPassword(String password)	{
		element(passwordField).waitUntilVisible();
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginButton()	{
		element(loginButton).waitUntilVisible();
		loginButton.click();
	}
	
	public void verifyIfUserIsLoggedIn()	{
		element(logoutButton).shouldBeVisible();
	}
}
