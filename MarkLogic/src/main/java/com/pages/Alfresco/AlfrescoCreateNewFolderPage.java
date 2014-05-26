package com.pages.Alfresco;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class AlfrescoCreateNewFolderPage extends AbstractPage {

	public AlfrescoCreateNewFolderPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createContent-button-button")
	private WebElement create;

	@FindBy(css = ".yuimenuitemlabel .folder-file")
	private WebElement createFolder;

	@FindBy(css = "input[name='prop_cm_name']")
	private WebElement folderName;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder-form-submit-button")
	private WebElement createFolderBtn;

	@FindBy(css = ".yuimenu.yui-module.yui-overlay.yui-button-menu.yui-menu-button-menu.visible >.bd ul:nth-child(2) li:nth-child(2) a")
	private WebElement createFolderFromTemplate;

	@FindBy(css = "span[title='']")
	private WebElement createContentFolder;

	@FindBy(css = "#template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder_prop_cm_name")
	private WebElement contentFolderName;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder-form-submit-button")
	private WebElement saveContentFolderBtn;

	public void clickOnCreate() {
		element(create).waitUntilVisible();
		create.click();
	}

	public void clickOnCreateFolder() {
		element(createFolder).waitUntilVisible();
		createFolder.click();
	}

	public void inputFolderName(String folderInput) {
		element(folderName).waitUntilVisible();
		folderName.clear();
		folderName.sendKeys(folderInput);
	}

	public void clickOnCreateFolderBtn() {
		element(createFolderBtn).waitUntilVisible();
		createFolderBtn.click();
	}

	public void clickOnCreateFolderFromTemplate() {
		element(createFolderFromTemplate).waitUntilVisible();
		element(createFolderFromTemplate).click();
	}

	public void clickOnCreateContentFolder() {
		element(createContentFolder).waitUntilVisible();
		element(createContentFolder).click();
	}

	public void inputContentFolderName(String contentName) {
		contentFolderName.clear();
		contentFolderName.sendKeys(contentName);
	}

	public void clickOnSaveContentFolder() {
		saveContentFolderBtn.click();
	}

}