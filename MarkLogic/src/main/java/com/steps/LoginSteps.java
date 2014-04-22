package com.steps;

import com.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class LoginSteps extends ScenarioSteps {
	public LoginSteps(Pages pages) {
		super(pages);
	}

	LoginPage login;

	@Step
	public void inputUsername(String usernameTerm) {
		login.inputUsername(usernameTerm);
	}

	@Step
	public void inputPassword(String passwordTerm) {
		login.inputPassword(passwordTerm);
	}

	@Step
	public void clickOnLoginBtn() {
		login.clickOnLoginBtn();
	}

	@Step
	public void assertThatUserDashboardShouldBeVisible() {
		login.assertThatUserDashboardShouldBeVisible();
	}

	@Step
	public void clickOnSitesMenuTab() {
		login.clickOnSitesMenuTab();
	}

	@Step
	public void clickOnTestSiteSubMenu() {
		login.clickOnTestSiteSubMenu();
	}

	@Step
	public void assertThatDocumentLibraryShouldBeVisible() {
		login.assertThatDocumentLibraryShouldBeVisible();
	}

	@Step
	public void clickOnDocumentLibrary() {
		login.clickOnDocumentLibrary();
	}

	@StepGroup
	public void loginToSite(String screenName, String pass) {
		getDriver().get("http://172.16.10.115:8080/share/page/");
		inputUsername(screenName);
		inputPassword(pass);
		clickOnLoginBtn();
		assertThatUserDashboardShouldBeVisible();
	}

	@StepGroup
	public void GetToFolder() {
		clickOnSitesMenuTab();
		clickOnTestSiteSubMenu();
		assertThatDocumentLibraryShouldBeVisible();
		clickOnDocumentLibrary();

	}
}
