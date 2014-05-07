package com.steps;

import tools.AbstractSteps;

import com.pages.Alfresco.AlfrescoCreateNewUserPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class CreateNewUserSteps extends AbstractSteps {

	public CreateNewUserSteps(Pages pages) {
		super(pages);
	}

	@Step
	public void clickOnAdminTools() {
		alfrescoCreateNewUserPage().clickOnAdminTools();
	}

	@Step
	public void clickOnUserTools() {
		alfrescoCreateNewUserPage().clickOnUserTools();
	}

	@Step
	public void clickOnNewUserBtn() {
		alfrescoCreateNewUserPage().clickOnNewUserBtn();
	}

	@Step
	public void inputFirstNameField(String fName) {
		alfrescoCreateNewUserPage().inputFirstNameField(fName);
	}

	@Step
	public void inputEmailField(String mail) {
		alfrescoCreateNewUserPage().inputEmailField(mail);
	}

	@Step
	public void inputUserNameField(String uName) {
		alfrescoCreateNewUserPage().inputUserNameField(uName);
	}

	@Step
	public void inputPasswordField(String pass) {
		alfrescoCreateNewUserPage().inputPasswordField(pass);
	}

	@Step
	public void inputVerifyPasswordField(String pass) {
		alfrescoCreateNewUserPage().inputVerifyPasswordField(pass);
	}

	@Step
	public void clickOnCreateUserBtn() {
		alfrescoCreateNewUserPage().clickOnCreateUserBtn();
	}

	@StepGroup
	public void CreateNewUser() {
		clickOnAdminTools();
		clickOnUserTools();
		clickOnNewUserBtn();
		inputFirstNameField("User");
		inputEmailField("amelia.ilies@ixxus.co.uk");
		inputUserNameField("TestUser");
		inputPasswordField("password");
		inputVerifyPasswordField("password");
		clickOnCreateUserBtn();
	}

}
