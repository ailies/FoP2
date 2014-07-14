package AlfrescoPages;

import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class AlfrescoCreateFolderPage extends AbstractPage {

	public AlfrescoCreateFolderPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnCreate() {
		WebElement create = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createContent-button-button"));
		$(create).waitUntilVisible();
		create.click();
	}

	public void clickOnCreateFolder() {
		WebElement createFolder = getDriver().findElement(
				By.cssSelector(".yuimenuitemlabel .folder-file"));
		$(createFolder).waitUntilVisible();
		createFolder.click();
	}

	public void inputFolderName(String folderInput) {
		WebElement folderName = getDriver().findElement(
				By.cssSelector("input[name='prop_cm_name']"));
		$(folderName).waitUntilVisible();
		folderName.clear();
		folderName.sendKeys(folderInput);
	}

	public void clickOnCreateFolderBtn() {
		WebElement createFolderBtn = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder-form-submit-button"));
		$(createFolderBtn).waitUntilVisible();
		createFolderBtn.click();
	}

	public void clickOnCreateFolderFromTemplate() {
		WebElement createFolderFromTemplate = getDriver()
				.findElement(
						By.cssSelector(".yuimenu.yui-module.yui-overlay.yui-button-menu.yui-menu-button-menu.visible >.bd ul:nth-child(2) li:nth-child(2) a"));
		$(createFolderFromTemplate).waitUntilVisible();
		createFolderFromTemplate.click();
	}

	public void clickOnCreateContentFolder() {
		WebElement createContentFolder = getDriver().findElement(
				By.cssSelector("span[title='']"));
		$(createContentFolder).waitUntilVisible();
		createContentFolder.click();
	}

	public void inputContentFolderName(String contentName) {
		WebElement contentFolderName = getDriver()
				.findElement(
						By.cssSelector("#template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder_prop_cm_name"));
		$(contentFolderName).waitUntilVisible();
		contentFolderName.clear();
		contentFolderName.sendKeys(contentName);
	}

	public void clickOnSaveContentFolder() {
		WebElement saveContentFolderBtn = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder-form-submit-button"));
		$(saveContentFolderBtn).waitUntilVisible();
		saveContentFolderBtn.click();
	}

}