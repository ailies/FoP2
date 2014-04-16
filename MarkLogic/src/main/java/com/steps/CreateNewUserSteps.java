package com.steps;

import com.pages.CreateNewUserPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class CreateNewUserSteps extends ScenarioSteps {

	public CreateNewUserSteps(Pages pages) {
		super(pages);
	}

	CreateNewUserPage createNewUser;

	@Step
	public void clickOnAdminTools() {
		createNewUser.clickOnAdminTools();
	}

	@Step
	public void clickOnUserTools() {
		createNewUser.clickOnUserTools();
	}

	@Step
	public void clickOnNewUserBtn() {
		createNewUser.clickOnNewUserBtn();
	}

	@Step
	public void inputFirstNameField(String fName) {
		createNewUser.inputFirstNameField(fName);
	}

	@Step
	public void inputEmailField(String mail) {
		createNewUser.inputEmailField(mail);
	}

	@Step
	public void inputUserNameField(String uName) {
		createNewUser.inputUserNameField(uName);
	}

	@Step
	public void inputPasswordField(String pass) {
		createNewUser.inputPasswordField(pass);
	}

	@Step
	public void inputVerifyPasswordField(String pass) {
		createNewUser.inputVerifyPasswordField(pass);
	}

	@Step
	public void clickOnCreateUserBtn() {
		createNewUser.clickOnCreateUserBtn();
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
