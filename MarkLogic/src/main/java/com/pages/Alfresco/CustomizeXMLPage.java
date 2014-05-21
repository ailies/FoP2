package com.pages.Alfresco;

import java.util.List;

import net.thucydides.core.annotations.DefaultUrl;

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
		WebElement element = verifyIfRenditionsExists();
		System.out.println(element.getText());
		WebElement rendition = element
				.findElement(By
						.cssSelector("#template_x002e_document-metadata_x002e_document-details_x0023_default-formContainer_assoc_rn_rendition-cntrl > a > img:nht-child(1)"));

		if (element != null) {
			rendition.click();

		}

	}

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
