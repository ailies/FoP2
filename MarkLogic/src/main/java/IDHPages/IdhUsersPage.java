package IDHPages;

import java.util.List;

import net.thucydides.core.annotations.findby.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhUsersPage extends AbstractPage {

	public IdhUsersPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnUsersMenu() {
		WebElement usersMenu = getDriver().findElement(
				By.cssSelector("a[href*='USERS']"));
		$(usersMenu).waitUntilVisible();
		usersMenu.click();
	}

	public void clickOnAddUserButton() {
		WebElement addUserMenuButton = getDriver().findElement(
				By.cssSelector(".PanelHeader > a > img"));
		$(addUserMenuButton).shouldBeVisible();
		addUserMenuButton.click();
	}

	public void assertNewUserPanelShouldBeVisible() {
		WebElement newUserPanel = getDriver().findElement(
				By.cssSelector(".IndentedSubPanel"));
		$(newUserPanel).shouldBeVisible();
	}

	public void inputNewUserName(String username) {
		WebElement addName = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input"));
		$(addName).waitUntilVisible();
		addName.clear();
		addName.sendKeys(username);
	}

	public void inputNewUserPassword(String password) {
		WebElement addPassword = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type='password']"));
		$(addPassword).waitUntilVisible();
		addPassword.clear();
		addPassword.sendKeys(password);
	}

	public void clickOnUserRole() {
		WebElement addRole = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > form > table > tbody > tr:nth-child(4) > td:nth-child(2) > div > input:nth-child(1)"));
		$(addRole).shouldBeVisible();
		addRole.click();
	}

	public void clickOnAddUsern() {
		WebElement addUserButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > div > a"));
		$(addUserButton).shouldBeVisible();
		addUserButton.click();
	}

	public WebElement verifyIfUserWasCreated(String... terms) {
		List<WebElement> searchResults = getDriver().findElements(
				By.cssSelector(".Para > img"));
		WebElement addName = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input"));
		System.out.println(searchResults.size());
		for (WebElement searchResult : searchResults) {
			System.out.println(searchResult.getText());
			boolean foundRow = true;
			if ($(searchResult).isCurrentlyVisible()) {
				for (String term : terms) {
					if (!searchResult.getText().toLowerCase()
							.contains(term.toLowerCase())) {
						foundRow = false;
					}
				}
			}
			if (foundRow)
				return searchResult;
			System.out.println(addName + "username");
		}

		return null;
	}

	public void inputNewPassword(String newpass) {
		WebElement newPasswordField = getDriver()
				.findElement(
						By.cssSelector("tr > td > div.Para > form > input[name='Password']"));
		$(newPasswordField).waitUntilVisible();
		newPasswordField.clear();
		newPasswordField.sendKeys(newpass);
	}

	public void clickOnChangePasswordBtn() {
		WebElement changePasswordBtn = getDriver()
				.findElement(
						By.cssSelector("tr > td > div.Para > form > a[href*='ChangeThePassword']"));
		$(changePasswordBtn).waitUntilVisible();
		changePasswordBtn.click();
	}

}
