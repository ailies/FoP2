package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class LoginPage extends PageObject {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	// --------ELEMENTS----------
	@FindBy(css = "input[name='username']")
	WebElement username;

	@FindBy(css = "input[name='password']")
	WebElement password;

	@FindBy(css = "button#page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")
	WebElement loginBtn;

	@FindBy(css = ".alf-menu-title-text")
	WebElement userDashboard;

	@FindBy(id = "HEADER_SITES_MENU")
	WebElement SitesTab;

	@FindBy(id = "HEADER_SITES_MENU_RECENT_test-site_text")
	WebElement testSiteSubMenu;

	@FindBy(id = "HEADER_SITE_DOCUMENTLIBRARY_text")
	WebElement documentLibrary;

	// ---------METHODS-----------------

	public void inputUsername(String usernameTerm) {
		element(username).waitUntilVisible();
		username.sendKeys(usernameTerm);
	}

	public void inputPassword(String passwordTerm) {
		element(password).waitUntilVisible();
		password.sendKeys(passwordTerm);
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
