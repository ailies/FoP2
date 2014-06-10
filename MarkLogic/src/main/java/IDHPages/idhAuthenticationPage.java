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
	
	public void inputUsername(String u)	{
		element(usernameField).waitUntilVisible();
		usernameField.sendKeys(u);
	}
	
	public void inputPassword(String p)	{
		element(passwordField).waitUntilVisible();
		passwordField.sendKeys(p);
	}
	
	public void clickOnLoginButton()	{
		element(loginButton).waitUntilVisible();
		loginButton.click();
	}
	
	public void verifyIfUserIsLoggedIn()	{
		element(logoutButton).shouldBeVisible();
	}
}
