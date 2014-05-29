package com.steps;

import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class CreateUserSteps extends AbstractSteps {

	public CreateUserSteps(Pages pages) {
		super(pages);
	}

	@StepGroup
	public void CreateNewUser() {
		alfrescoCreateUserPage().clickOnAdminTools();
		alfrescoCreateUserPage().clickOnUserTools();
		alfrescoCreateUserPage().clickOnNewUserBtn();
		alfrescoCreateUserPage().inputFirstNameField("User");
		alfrescoCreateUserPage().inputEmailField("amelia.ilies@ixxus.co.uk");
		alfrescoCreateUserPage().inputUserNameField("TestUser");
		alfrescoCreateUserPage().inputPasswordField("password");
		alfrescoCreateUserPage().inputVerifyPasswordField("password");
		alfrescoCreateUserPage().clickOnCreateUserBtn();
	}

}
