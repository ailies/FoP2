package AlfrescoPages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class AlfrescoCreateUserPage extends PageObject {

	public AlfrescoCreateUserPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnAdminTools() {
		WebElement adminTools = getDriver().findElement(
				By.id("HEADER_ADMIN_CONSOLE_text"));
		$(adminTools).waitUntilVisible();
		adminTools.click();
	}

	public void clickOnUserTools() {
		WebElement usersTools = getDriver()
				.findElement(
						By.id("page_x002e_ctool_x002e_admin-console_x0023_default-newuser-button-button"));
		$(usersTools).waitUntilVisible();
		usersTools.click();
	}

	public void clickOnNewUserBtn() {
		WebElement newUserBtn = getDriver()
				.findElement(
						By.id("page_x002e_ctool_x002e_admin-console_x0023_default-newuser-button-button"));
		$(newUserBtn).waitUntilVisible();
		newUserBtn.click();
	}

	public void inputFirstNameField(String fName) {
		WebElement firstNameField = getDriver()
				.findElement(
						By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname"));
		$(firstNameField).waitUntilVisible();
		firstNameField.clear();
		firstNameField.sendKeys(fName);
	}

	public void inputLastNameField(String lName) {
		WebElement lastNameField = getDriver()
				.findElement(
						By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-lastname"));
		$(lastNameField).waitUntilVisible();
		lastNameField.clear();
		lastNameField.sendKeys(lName);
	}

	public void inputEmailField(String mail) {
		WebElement emailField = getDriver()
				.findElement(
						By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-email"));
		$(emailField).waitUntilVisible();
		emailField.clear();
		emailField.sendKeys(mail);
	}

	public void inputUserNameField(String user) {
		WebElement userNameField = getDriver()
				.findElement(
						By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-username"));
		$(userNameField).waitUntilVisible();
		userNameField.sendKeys(user);
	}

	public void inputPasswordField(String pass) {
		WebElement passwordField = getDriver()
				.findElement(
						By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-password"));
		$(passwordField).waitUntilVisible();
		passwordField.clear();
		passwordField.sendKeys(pass);
	}

	public void inputVerifyPasswordField(String pass) {
		WebElement verifyPasswordField = getDriver()
				.findElement(
						By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-verifypassword"));
		$(verifyPasswordField).waitUntilVisible();
		verifyPasswordField.clear();
		verifyPasswordField.sendKeys(pass);
	}

	public void clickOnCreateUserBtn() {
		WebElement createUserBtn = getDriver()
				.findElement(
						By.id("page_x002e_ctool_x002e_admin-console_x0023_default-createuser-ok-button-button"));
		$(createUserBtn).waitUntilVisible();
		createUserBtn.click();
		waitFor(ExpectedConditions.invisibilityOfElementLocated(By
				.id("message")));
	}
}
