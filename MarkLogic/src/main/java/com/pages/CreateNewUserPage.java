package com.pages;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class CreateNewUserPage extends PageObject {

	@FindBy(id = "HEADER_ADMIN_CONSOLE_text")
	WebElement AdminUserTab;

	@FindBy(css = "a[href*='users']")
	WebElement UsersSubMenu;

	@FindBy(id = "page_x002e_ctool_x002e_admin-console_x0023_default-newuser-button-button")
	WebElement NewUser;

	@FindBy(id = "page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname")
	WebElement FirtsNameField;

	@FindBy(id = "page_x002e_ctool_x002e_admin-console_x0023_default-create-email")
	WebElement EmailField;

	@FindBy(id = "page_x002e_ctool_x002e_admin-console_x0023_default-create-username")
	WebElement UserNameField;

	@FindBy(id = "page_x002e_ctool_x002e_admin-console_x0023_default-create-password")
	WebElement PasswordField;

	@FindBy(id = "page_x002e_ctool_x002e_admin-console_x0023_default-create-verifypassword")
	WebElement VerifyPasswordField;

	@FindBy(id = "page_x002e_ctool_x002e_admin-console_x0023_default-createuser-ok-button-button")
	WebElement CreateUserBtn;

	public void clickAdminUserTab() {
		element(AdminUserTab).waitUntilVisible();
		AdminUserTab.click();
	}

	public void clickUserSubMenu() {
		element(UsersSubMenu).waitUntilVisible();
		UsersSubMenu.click();
	}

	public void clickNewUser() {
		element(NewUser).waitUntilVisible();
		NewUser.click();
	}

	public void typeFirstNameField(String fName) {
		element(FirtsNameField).waitUntilVisible();
		FirtsNameField.sendKeys(fName);
	}

	public void typeEmailField(String mail) {
		element(EmailField).waitUntilVisible();
		EmailField.sendKeys(mail);
	}

	public void clickUserNameField(String user) {
		element(UserNameField).waitUntilVisible();
		UserNameField.sendKeys(user);
	}

	public void clickPasswordField(String pass) {
		element(PasswordField).waitUntilVisible();
		PasswordField.sendKeys(pass);
	}

	public void clickVerifyPasswordField(String pass) {
		element(VerifyPasswordField).waitUntilVisible();
		VerifyPasswordField.sendKeys(pass);
	}

	public void clickCreateUserBtn() {
		element(CreateUserBtn).waitUntilVisible();
		CreateUserBtn.click();
	}
}
