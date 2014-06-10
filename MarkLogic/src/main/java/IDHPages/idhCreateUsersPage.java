package IDHPages;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class idhCreateUsersPage extends AbstractPage {

	public idhCreateUsersPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".PanelHeader > a > img")
	WebElement addUserMenuButton;

	@FindBy(css = ".IndentedSubPanel")
	WebElement newUserPanel;

	@FindBy(css = "body > div.Screen > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input")
	WebElement addName;

	@FindBy(css = "body > div.Screen > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type='password']")
	WebElement addPassword;

	@FindBy(css = "body > div.Screen > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > form > table > tbody > tr:nth-child(4) > td:nth-child(2) > div > input:nth-child(1)")
	WebElement addRole;

	@FindBy(css = "body > div.Screen > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > div > a")
	WebElement addUserButton;

	public void clickOnAddUserButton() {
		element(addUserButton).shouldBeVisible();
		addUserButton.click();
	}

	public void assertNewUserPanelShouldBeVisible() {
		element(newUserPanel).shouldBeVisible();
	}

	public void inputNewUserName(String user) {
		element(addName).waitUntilVisible();
		addName.clear();
		addName.sendKeys(user);
	}

	public void inputNewUserPassword(String user) {
		element(addPassword).waitUntilVisible();
		addPassword.clear();
		addPassword.sendKeys(user);
	}

	public void clickOnUserRole() {
		element(addRole).shouldBeVisible();
		addRole.click();
	}

	public void clickOnAddUsern() {
		element(addUserButton).shouldBeVisible();
		addUserButton.click();
	}

}
