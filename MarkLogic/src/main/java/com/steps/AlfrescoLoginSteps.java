package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;

import org.junit.Assert;

import tools.AbstractSteps;

@SuppressWarnings("serial")
public class AlfrescoLoginSteps extends AbstractSteps {
	public AlfrescoLoginSteps(Pages pages) {
		super(pages);
	}

	@Step
	public void verifyLoginPageIsOpen() {
		Assert.assertTrue(
				"Current page is not the login page!",
				alfrescoLoginPage().getDriver().getTitle()
						.matches("Alfresco.*Login"));
	}

	@Step
	public void enterUsername(String usernameTerm) {
		alfrescoLoginPage().enterUsername(usernameTerm);
	}

	@Step
	public void enterPassword(String passwordTerm) {
		alfrescoLoginPage().enterPassword(passwordTerm);
	}

	@Step
	public void enterPasswordAndCheckPasswordField(String password) {
		enterPassword(password);
		Assert.assertEquals(password.length(), alfrescoLoginPage()
				.getEnteredPasswordLength());
		Assert.assertEquals("password", alfrescoLoginPage()
				.getPasswordFieldType());
	}

	@Step
	public void clickOnLoginBtn() {
		alfrescoLoginPage().clickOnLoginBtn();
	}

	@Step
	public void assertThatUserDashboardShouldBeVisible() {
		alfrescoLoginPage().assertThatUserDashboardShouldBeVisible();
	}

	@Step
	public void clickOnSitesMenuTab() {
		alfrescoLoginPage().clickOnSitesMenuTab();
	}

	@Step
	public void clickOnTestSiteSubMenu() {
		alfrescoLoginPage().clickOnTestSiteSubMenu();
	}

	@Step
	public void assertThatDocumentLibraryShouldBeVisible() {
		alfrescoLoginPage().assertThatDocumentLibraryShouldBeVisible();
	}

	@Step
	public void clickOnDocumentLibrary() {
		alfrescoLoginPage().clickOnDocumentLibrary();
	}

	@StepGroup
	public void authentication(String screenName, String pass) {
		getDriver().manage().window().maximize();
		getDriver().get("http://172.16.10.115:8080/share/page/");
		verifyLoginPageIsOpen();
		enterUsername(screenName);
		enterPassword(pass);
		enterPasswordAndCheckPasswordField(pass);
		clickOnLoginBtn();
		assertThatUserDashboardShouldBeVisible();
	}

	@StepGroup
	public void navigateToFolder() {
		clickOnSitesMenuTab();
		clickOnTestSiteSubMenu();
		assertThatDocumentLibraryShouldBeVisible();
		clickOnDocumentLibrary();

	}
}
