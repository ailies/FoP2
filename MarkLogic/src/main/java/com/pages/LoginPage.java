package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class LoginPage extends PageObject {

	// --------ELEMENTS----------
	@FindBy(css = "input[name='username']")
	private WebElement username;

	@FindBy(css = "input[name='password']")
	private WebElement password;

	@FindBy(css = "button#page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")
	private WebElement loginBtn;

	@FindBy(css = ".alf-menu-title-text")
	private WebElement userDashboard;

	@FindBy(id = "HEADER_SITES_MENU")
	private WebElement SitesTab;

	@FindBy(id = "HEADER_SITES_MENU_RECENT_test-site_text")
	WebElement testSiteSubMenu;

	@FindBy(id = "HEADER_SITE_DOCUMENTLIBRARY_text")
	WebElement documentLibrary;


	// ---------METHODS-----------------

	public void typeUsername(String usernameTerm) {
		element(username).waitUntilVisible();
		username.sendKeys(usernameTerm);
	}

	public void typePassword(String passwordTerm) {
		element(password).waitUntilVisible();
		password.sendKeys(passwordTerm);
	}

	public void clickLoginBtn() {
		element(loginBtn).waitUntilVisible();
		element(loginBtn).click();
	}

	public void assertUserDashboardShouldBeVisible() {
		element(userDashboard).shouldBeVisible();
	}

	public void clickSitesMenuTab() {
		element(SitesTab).waitUntilVisible();
		SitesTab.click();
	}

	public void clickTestSiteSubMenu() {
		element(testSiteSubMenu).waitUntilVisible();
		testSiteSubMenu.click();
	}

	public void assertdocumentLibraryShouldBeVisible() {
		element(documentLibrary).shouldBeVisible();
	}

	public void clickDocumentLibrary() {
		element(documentLibrary).waitUntilVisible();
		documentLibrary.click();
	}

	
}
