package AlfrescoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class AlfrescoCreateUserPage extends PageObject {

	public AlfrescoCreateUserPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "HEADER_ADMIN_CONSOLE_text")
	WebElement adminTools;

	@FindBy(css = "a[href*='users']")
	WebElement usersTools;

	@FindBy(id = "page_x002e_ctool_x002e_admin-console_x0023_default-newuser-button-button")
	WebElement newUserBtn;

	@FindBy(id = "page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname")
	WebElement firstNameField;

	@FindBy(id = "page_x002e_ctool_x002e_admin-console_x0023_default-create-lastname")
	WebElement lastNameField;

	@FindBy(id = "page_x002e_ctool_x002e_admin-console_x0023_default-create-email")
	WebElement emailField;

	@FindBy(id = "page_x002e_ctool_x002e_admin-console_x0023_default-create-username")
	WebElement userNameField;

	@FindBy(id = "page_x002e_ctool_x002e_admin-console_x0023_default-create-password")
	WebElement passwordField;

	@FindBy(id = "page_x002e_ctool_x002e_admin-console_x0023_default-create-verifypassword")
	WebElement verifyPasswordField;

	@FindBy(id = "page_x002e_ctool_x002e_admin-console_x0023_default-createuser-ok-button-button")
	WebElement createUserBtn;

	public void clickOnAdminTools() {
		element(adminTools).waitUntilVisible();
		adminTools.click();
	}

	public void clickOnUserTools() {
		element(usersTools).waitUntilVisible();
		usersTools.click();
	}

	public void clickOnNewUserBtn() {
		element(newUserBtn).waitUntilVisible();
		newUserBtn.click();
	}

	public void inputFirstNameField(String fName) {
		element(firstNameField).waitUntilVisible();
		firstNameField.clear();
		firstNameField.sendKeys(fName);
	}

	public void inputLastNameField(String lName) {
		element(lastNameField).waitUntilVisible();
		lastNameField.clear();
		lastNameField.sendKeys(lName);
	}

	public void inputEmailField(String mail) {
		element(emailField).waitUntilVisible();
		emailField.clear();
		emailField.sendKeys(mail);
	}

	public void inputUserNameField(String user) {
		element(userNameField).waitUntilVisible();
		userNameField.sendKeys(user);
	}

	public void inputPasswordField(String pass) {
		element(passwordField).waitUntilVisible();
		passwordField.clear();
		passwordField.sendKeys(pass);
	}

	public void inputVerifyPasswordField(String pass) {
		element(verifyPasswordField).waitUntilVisible();
		verifyPasswordField.clear();
		verifyPasswordField.sendKeys(pass);
	}

	public void clickOnCreateUserBtn() {
		element(createUserBtn).waitUntilVisible();
		createUserBtn.click();
		waitFor(ExpectedConditions.invisibilityOfElementLocated(By
				.id("message")));
	}
}
