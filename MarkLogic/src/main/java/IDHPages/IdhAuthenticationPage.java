package IDHPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhAuthenticationPage extends AbstractPage {

	public IdhAuthenticationPage(WebDriver driver) {
		super(driver);
	}

	public void inputUsername(String username) {
		WebElement usernameField = getDriver().findElement(By.id("UserName"));
		$(usernameField).waitUntilVisible();
		usernameField.sendKeys(username);
	}

	public void inputPassword(String password) {
		WebElement passwordField = getDriver().findElement(By.id("Password"));
		$(passwordField).waitUntilVisible();
		passwordField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		WebElement loginButton = getDriver().findElement(
				By.cssSelector(".LoginSubmitLine > input"));
		$(loginButton).waitUntilVisible();
		loginButton.click();
	}

	public void verifyIfUserIsLoggedIn() {
		WebElement logoutButton = getDriver().findElement(
				By.cssSelector(".InfoText > u > a"));
		$(logoutButton).shouldBeVisible();
	}
}
