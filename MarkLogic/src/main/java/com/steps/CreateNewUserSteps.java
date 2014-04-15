package com.steps;

import com.pages.CreateNewUserPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class CreateNewUserSteps extends ScenarioSteps{

	public CreateNewUserSteps(Pages pages) {
		super(pages);
	}
	
	CreateNewUserPage createNewUser;
	
	@Step
	public void clickAdminUserTab() {
		createNewUser.clickAdminUserTab();
	}
	
	@Step
	public void clickUserSubMenu(){
		createNewUser.clickUserSubMenu();
	}
	
	@Step
	public void clickNewUser() {
		createNewUser.clickNewUser();
	}
	
	@Step
	public void typeFirstNameField(String fName) {
		createNewUser.typeFirstNameField(fName);
	}
	
	@Step
	public void typeEmailField(String mail) {
		createNewUser.typeEmailField(mail);
	}
	
	@Step
	public void clickUserNameField(String uName) {
		createNewUser.clickUserNameField(uName);
	}
	
	@Step
	public void clickPasswordField(String pass) {
		createNewUser.clickPasswordField(pass);
	}
	
	@Step
	public void clickVerifyPasswordField(String pass) {
		createNewUser.clickVerifyPasswordField(pass);
	}
	
	@Step
	public void clickCreateUserBtn() {
		createNewUser.clickCreateUserBtn();
	}
	
	
	@StepGroup
	public void CreateNewUser(){
		clickAdminUserTab();
		clickUserSubMenu();
		clickNewUser();
		typeFirstNameField("User");
		typeEmailField("amelia.ilies@ixxus.co.uk");
		clickUserNameField("TestUser");
		clickPasswordField("password");
		clickVerifyPasswordField("password");
		clickCreateUserBtn();
	}
	
}
