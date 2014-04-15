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
	public void typeUsername(String usernameTerm) {
		login.typeUsername(usernameTerm);
	}

	@Step
	public void typePassword(String passwordTerm) {
		login.typePassword(passwordTerm);
	}

	@Step
	public void clickLoginBtn() {
		login.clickLoginBtn();
	}

	@Step
	public void assertUserDashboardShouldBeVisible() {
		login.assertUserDashboardShouldBeVisible();
	}

	@Step
	public void clickSitesMenuTab() {
		login.clickSitesMenuTab();
	}

	@Step
	public void clickTestSiteSubMenu() {
		login.clickTestSiteSubMenu();
	}

	@Step
	public void assertDocumentLibraryShouldBeVisible() {
		login.assertdocumentLibraryShouldBeVisible();
	}

	@Step
	public void clickDocumentLibrary() {
		login.clickDocumentLibrary();
	}

	@StepGroup
	public void login(String screenName, String pass) {
		getDriver().get("http://172.16.10.115:8080/share/page/");
		typeUsername(screenName);
		typePassword(pass);
		clickLoginBtn();
		assertUserDashboardShouldBeVisible();
	}

	@StepGroup
	public void GetToFolder() {
		clickSitesMenuTab();
		clickTestSiteSubMenu();
		assertDocumentLibraryShouldBeVisible();
		clickDocumentLibrary();

	}
}
