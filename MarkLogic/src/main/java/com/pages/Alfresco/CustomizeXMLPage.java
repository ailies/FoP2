package com.pages.Alfresco;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.AbstractPage;

public class CustomizeXMLPage extends AbstractPage {

	public CustomizeXMLPage(WebDriver driver) {
		super(driver);
	}

	public WebElement verifyIfRenditionsExists() {
		List<WebElement> searchResults = getDriver()
				.findElement(
						By.id("template_x002e_document-metadata_x002e_document-details_x0023_default-formContainer_assoc_rn_rendition-cntrl"))
				.findElements(By.cssSelector("a"));

		if (searchResults.size() == 3) {
			System.out.println(searchResults.size());

		} else {
			System.out.println("Less than 3 renditions were generated!");
		}
		return null;

	}

	public void clickOnRendition() {
		List<WebElement> searchResultList = getDriver()
				.findElements(
						By.cssSelector("#template_x002e_document-metadata_x002e_document-details_x0023_default-formContainer_assoc_rn_rendition-cntrl a"));
		for (WebElement searchResult : searchResultList) {
			searchResult.click();
			waitABit(2000);
			checkTheMimetype();
			waitABit(2000);
			navigateBack();

		}
	}

	public void checkTheMimetype() {
		WebElement mimetype = getDriver().findElement(
				By.cssSelector("div:nth-child(4) > div > span.viewmode-value"));
		if (mimetype.getText().contains("Adobe PDF Document")) {
			System.out.println("PDF rendition was generated");
		} else {
			if (mimetype.getText().contains("HTML")) {
				System.out.println("HTML rendition was generated");
			} else {
				if (mimetype.getText().contains(
						"{http://www.alfresco.org/model/content/1.0}content")) {
					System.out.println("Thumbnail is visible");
				} else {
					System.out.println("F*** you");
				}
			}
		}
	}

	public void navigateBack() {
		getDriver().navigate().back();

	}

	// ------------generate master xml with assembly view----------------
	public void clickOnAssemblyView() {
		WebElement assemblyViewButton = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-assembly-view-button-button"));
		assemblyViewButton.click();
	}

	public void verifyIfAssemblyViewTreeIsDisplayed() {
		WebElement assemblyViewTree = getDriver().findElement(
				By.cssSelector("div#assembly-view-tree"));
		element(assemblyViewTree).shouldBeVisible();
	}

	public void reorderXMLFilesInTree(String fileTitle) {
		WebElement files = getElementWithSpecifiedTextFromList(
				By.cssSelector(".dynatree-node.dynatree-exp-c.dynatree-ico-c a"),
				false, false, fileTitle).findElement(By.tagName(".xml"));
		WebElement xmlFile = getDriver().findElement(
				By.cssSelector("div.current-pages > ul.page-list"));
		Actions action = new Actions(getDriver());
		action.dragAndDrop(files, xmlFile).build().perform();
	}

}
