package com.pages;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class CreateNewFolderPage extends PageObject {

	@FindBy(css = ".filename")
	WebElement testFolder;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createContent-button-button")
	WebElement createFolderDropDown;

	@FindBy(css = ".yuimenuitemlabel .folder-file")
	WebElement createFolder;

	@FindBy(css = "input[name='prop_cm_name']")
	WebElement folderName;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder-form-submit-button")
	WebElement createFolderBtn;

	@FindBy(xpath = "|path|/Test|")
	WebElement newFolder;

	@FindBy(css = "")
	WebElement createFolderFromTemplate;

	@FindBy(css = "input[name='Content Folder']")
	WebElement contentFolder;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder_prop_cm_name")
	WebElement contentFolderName;

	@FindBy(css = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder-form-submit-button")
	WebElement saveContentFolder;

	/*
	 * public boolean getElementIfExists2(By by, int waitingTime, TimeUnit
	 * timeUnit) { getDriver().manage().timeouts().implicitlyWait(waitingTime,
	 * timeUnit); try { WebElement mainFolder = getDriver().findElement(by);
	 * getDriver().manage().timeouts() .implicitlyWait(30, TimeUnit.SECONDS);
	 * return true; } catch (Exception e) { getDriver().manage().timeouts()
	 * .implicitlyWait(30, TimeUnit.SECONDS); return false; }
	 */

	/*
	 * public void mainFolder() { if (((PageObject)
	 * getDriver()).element("mainFolder").isDisplayed()) { mainFolder.click(); }
	 * { ((PageObject) getDriver()).element("createMainFolder").click(); }
	 */

	public void clickCreateFolderDropDown() {
		element(createFolderDropDown).waitUntilVisible();
		createFolderDropDown.click();
	}

	public void clickCreateFolder() {
		element(createFolder).waitUntilVisible();
		createFolder.click();
	}

	public void insertFolderName(String name) {
		element(folderName).waitUntilVisible();
		folderName.sendKeys(name);
	}

	public void clickCreateFolderBtn() {
		element(createFolderBtn).waitUntilVisible();
		createFolderBtn.click();
	}

	public void clickNewFolder() {
		element(newFolder).waitUntilVisible();
		newFolder.click();
	}

	public void clickCreateFolderFromTemplate() {
		createFolderFromTemplate.click();
	}

	public void clickContentFolder() {
		contentFolder.click();
	}

	public void typeContentFolderName(String folderName) {
		contentFolderName.sendKeys(folderName);
	}

	public void saveContentFolder() {
		contentFolder.click();
	}
}