package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class CreateNewFolderPage extends PageObject {

	public CreateNewFolderPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createContent-button-button")
	WebElement create;

	@FindBy(css = ".yuimenuitemlabel .folder-file")
	WebElement createFolder;

	@FindBy(css = "input[name='prop_cm_name']")
	WebElement folderName;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder-form-submit-button")
	WebElement createFolderBtn;

	@FindBy(id = "alf-id8")
	WebElement testingFolder;

	@FindBy(css = "a[title='Create folder from template']")
	WebElement createFolderFromTemplate;

	@FindBy(css = "a[title='Content Folder']")
	WebElement createContentFolder;

	@FindBy(css = "input[id='template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder_prop_cm_name']")
	WebElement contentFolderName;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder-form-submit-button")
	WebElement saveContentFolderBtn;

	@FindBy(id = "a[title='DemoTesting']")
	WebElement demoTestingFolder;

	public void clickOnCreate() {
		element(create).waitUntilVisible();
		create.click();
	}

	public void clickOnCreateFolder() {
		element(createFolder).waitUntilVisible();
		createFolder.click();
	}

	public void inputFolderName(String name) {
		element(folderName).waitUntilVisible();
		folderName.clear();
		folderName.sendKeys(name);
	}

	public void clickOnCreateFolderBtn() {
		element(createFolderBtn).waitUntilVisible();
		createFolderBtn.click();
	}

	public void clickOnTestingFolder() {
		element(testingFolder).waitUntilVisible();
		testingFolder.click();
	}

	/*public void checkFolderFromTemplateWasCreated() {
		WebElement folderFromTemplateWasCreated = getDriver().findElement(
				By.tagName("Test"));
		Assert.assertTrue(folderFromTemplateWasCreated.isDisplayed());
	}*/

	public void clickOnCreateFolderFromTemplate() {
		element(createFolderFromTemplate).waitUntilVisible();
		createFolderFromTemplate.click();
	}

	public void clickOnCreateContentFolder() {
		createContentFolder.click();
	}

	public void inputContentFolderName(String contentName) {
		contentFolderName.sendKeys(contentName);
	}

	public void clickOnSaveContentFolder() {
		saveContentFolderBtn.click();
	}

	public void checkContentFolderWasCreated() {
		WebElement contentFolder = getDriver().findElement(
				By.tagName("DemoTesting"));
		Assert.assertTrue(contentFolder.isDisplayed());
	}

	public void clickOnDemoTestingFolder() {
		element(demoTestingFolder).waitUntilVisible();
		demoTestingFolder.click();
	}
}