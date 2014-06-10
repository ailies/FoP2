package AlfrescoPages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class AuthenticationPage extends PageObject {

	public AuthenticationPage(WebDriver driver) {
		super(driver);
	}

	// --------ELEMENTS----------
	@FindBy(css = "input[name='username']")
	private WebElement userInput;

	@FindBy(css = "input[name='password']")
	private WebElement passwordInput;

	@FindBy(css = "button#page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")
	private WebElement loginBtn;

	@FindBy(css = "div.error")
	private WebElement errorMessageText;

	@FindBy(css = ".alf-menu-title-text")
	private WebElement userDashboard;

	@FindBy(id = "HEADER_SITES_MENU")
	private WebElement SitesTab;

	@FindBy(id = "HEADER_SITES_MENU_RECENT_test-site_text")
	private WebElement testSiteSubMenu;

	@FindBy(id = "HEADER_SITE_DOCUMENTLIBRARY_text")
	private WebElement documentLibrary;

	// ---------METHODS-----------------

	public void enterUsername(String usernameTerm) {
		element(userInput).waitUntilVisible();
		userInput.clear();
		userInput.sendKeys(usernameTerm);
	}

	public void enterPassword(String passwordTerm) {
		element(passwordInput).waitUntilVisible();
		passwordInput.clear();
		passwordInput.sendKeys(passwordTerm);
	}

	public int getEnteredPasswordLength() {
		element(passwordInput).waitUntilVisible();
		return element(passwordInput).getTextValue().length();
	}

	public String getPasswordFieldType() {
		element(passwordInput).waitUntilVisible();
		return passwordInput.getAttribute("type");
	}

	public void clickOnLoginBtn() {
		element(loginBtn).waitUntilVisible();
		element(loginBtn).click();
	}

	public void assertThatUserDashboardShouldBeVisible() {
		element(userDashboard).shouldBeVisible();
	}

	public void clickOnSitesMenuTab() {
		element(SitesTab).waitUntilVisible();
		SitesTab.click();
	}

	public void verifyThatUsernameFieldIsEmpty() {
		Assert.assertTrue("The username field is not empty ",
				element(userInput).getText().isEmpty());
	}

	public void verifyThatPasswordFieldIsEmpty() {
		Assert.assertTrue("The username field is not empty ",
				element(passwordInput).getText().isEmpty());
	}

	public void verifyThatTheErrorMessageBoxIsDisplayed() {
		Assert.assertTrue("Error message not displayed",
				errorMessageText.isDisplayed());
	}

	public void verifyThatCorrectErrorMessageIsDisplayed(String expectedMessage) {
		Assert.assertEquals(expectedMessage, errorMessageText.getText());
	}

	public void clickOnTestSiteSubMenu() {
		element(testSiteSubMenu).waitUntilVisible();
		testSiteSubMenu.click();
	}

	public void assertThatDocumentLibraryShouldBeVisible() {
		element(documentLibrary).shouldBeVisible();
	}

	public void clickOnDocumentLibrary() {
		element(documentLibrary).waitUntilVisible();
		documentLibrary.click();
	}

}
