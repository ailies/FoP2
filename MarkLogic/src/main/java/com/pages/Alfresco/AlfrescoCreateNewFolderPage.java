package com.pages.Alfresco;

import java.util.List;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;
import tools.StringUtils;

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
	// +
	// "input[id='templat e_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder_prop_cm_name']")
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

	public void verifyIfNodesExistInBreadcrumbs(String... terms) {
		WebElement breadcrumbsContainer = waitUntilElementExists(
				By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-navBar"),
				15);
		System.out.println(breadcrumbsContainer.getText());
		for (String term : terms) {
			System.out.println();
			if (!breadcrumbsContainer.getText().toLowerCase()
					.contains(term.toLowerCase())) {
				Assert.fail(String.format("Node not found"));
			}
		}
	}

	public boolean verifyIfElementExists(String term) {
		String noOfPagesContainer = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-paginatorBottom"))
				.getText().trim();
		int noOfPages = StringUtils.getAllIntegerNumbersFromString(
				noOfPagesContainer).get(3);
		for (int i = 0; i < noOfPages; i++) {
			List<WebElement> searchResults = getDriver().findElements(
					By.cssSelector(".filename"));
			for (WebElement searchResult : searchResults) {
				boolean foundRow = true;
				if ($(searchResult).isCurrentlyVisible()) {

					if (!searchResult.getText().toLowerCase()
							.contains(term.toLowerCase())) {
						foundRow = false;
					}

				}
				if (foundRow)
					return true;
			}
			if (i < noOfPages - 1) {
				getDriver().findElement(By.cssSelector(".yui-pg-next")).click();

				waitABit(2000);
			}
		}
		return false;
	}

	public WebElement getTheSearchedFolder(String... terms) {
		String noOfPagesContainer = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-paginatorBottom"))
				.getText().trim();
		System.out.println(noOfPagesContainer.toString());
		int noOfPages = StringUtils.getAllIntegerNumbersFromString(
				noOfPagesContainer).get(3);
		for (int i = 0; i < noOfPages; i++) {
			List<WebElement> searchResults = getDriver().findElements(
					By.cssSelector(".filename"));
			System.out.println(searchResults.size());
			for (WebElement searchResult : searchResults) {
				System.out.println(searchResult.getText());
				boolean foundRow = true;
				if ($(searchResult).isCurrentlyVisible()) {
					for (String term : terms) {
						if (!searchResult.getText().toLowerCase()
								.contains(term.toLowerCase())) {
							foundRow = false;
						}
					}
				}
				if (foundRow)
					return searchResult;
			}
			if (i < noOfPages - 1) {
				getDriver().findElement(By.cssSelector(".yui-pg-next")).click();

				waitABit(2000);
			}
		}
		return null;
	}

	public void clickOnFolder(String... terms) {
		WebElement element = getTheSearchedFolder(terms);
		System.out.println(element.getText());
		WebElement folder = element.findElement(By.cssSelector("span a"));
		System.out.println(folder.getText());
		if (element != null) {
			folder.click();
		}
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