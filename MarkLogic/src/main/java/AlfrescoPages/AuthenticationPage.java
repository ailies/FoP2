package AlfrescoPages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class AuthenticationPage extends PageObject {

	public AuthenticationPage(WebDriver driver) {
		super(driver);
	}

	public void enterUsername(String usernameTerm) {
		WebElement userInput = getDriver().findElement(
				By.cssSelector("input[name='username']"));
		$(userInput).waitUntilVisible();
		userInput.clear();
		userInput.sendKeys(usernameTerm);
	}

	public void enterPassword(String passwordTerm) {
		WebElement passwordInput = getDriver().findElement(
				By.cssSelector("input[name='password']"));
		$(passwordInput).waitUntilVisible();
		passwordInput.clear();
		passwordInput.sendKeys(passwordTerm);
	}

	public void clickOnLoginBtn() {
		WebElement loginBtn = getDriver()
				.findElement(
						By.cssSelector("button#page_x002e_components_x002e_slingshot-login_x0023_default-submit-button"));
		$(loginBtn).waitUntilVisible();
		loginBtn.click();
	}

	public void assertThatUserDashboardShouldBeVisible() {
		WebElement userDashboard = getDriver().findElement(
				By.cssSelector(".alf-menu-title-text"));
		$(userDashboard).shouldBeVisible();
	}

	public void clickOnSitesMenuTab() {
		WebElement sitesTab = getDriver().findElement(
				By.cssSelector("HEADER_SITES_MENU"));
		element(sitesTab).waitUntilVisible();
		sitesTab.click();
	}

	public void verifyThatUsernameFieldIsEmpty() {
		WebElement userInput = getDriver().findElement(
				By.cssSelector("input[name='username']"));
		Assert.assertTrue("The username field is not empty ",
				element(userInput).getText().isEmpty());
	}

	public void verifyThatPasswordFieldIsEmpty() {
		WebElement passwordInput = getDriver().findElement(
				By.cssSelector("input[name='password']"));
		Assert.assertTrue("The username field is not empty ",
				element(passwordInput).getText().isEmpty());
	}

	public void verifyThatTheErrorMessageBoxIsDisplayed() {
		WebElement errorMessageText = getDriver().findElement(
				By.cssSelector("div.error"));
		Assert.assertTrue("Error message not displayed",
				errorMessageText.isDisplayed());
	}

	public void verifyThatCorrectErrorMessageIsDisplayed(String expectedMessage) {
		WebElement errorMessageText = getDriver().findElement(
				By.cssSelector("div.error"));
		Assert.assertEquals(expectedMessage, errorMessageText.getText());
	}

	public void clickOnTestSiteSubMenu() {
		WebElement testSiteSubMenu = getDriver().findElement(
				By.id("HEADER_SITES_MENU_RECENT_test-site_text"));
		$(testSiteSubMenu).waitUntilVisible();
		testSiteSubMenu.click();
	}

	public void assertThatDocumentLibraryShouldBeVisible() {
		WebElement documentLibrary = getDriver().findElement(
				By.id("HEADER_SITE_DOCUMENTLIBRARY_text"));
		$(documentLibrary).shouldBeVisible();
	}

	public void clickOnDocumentLibrary() {
		WebElement documentLibrary = getDriver().findElement(
				By.id("HEADER_SITE_DOCUMENTLIBRARY_text"));
		$(documentLibrary).waitUntilVisible();
		documentLibrary.click();
	}

}
