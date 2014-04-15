package com.pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;

import Tools.StringUtils;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class SearchAndImportWikiDocumentPage extends PageObject {

	@FindBy(css = ".more-actions.hidden")
	WebElement researchFolderMore;

	@FindBy(id = "mlSearch")
	WebElement markLogicSearch;

	@FindBy(id = "searchTermInput")
	WebElement searchTerm;

	@FindBy(tagName = "Research")
	WebElement researchBtn;

	@FindBy(css = ".view")
	WebElement documentContainer;

	@FindBy(tagName = "Next Content Result")
	WebElement forwardPag;

	@FindBy(css = ".margin-bottom:15px")
	WebElement pageContainer;

	@FindBy(tagName = "Previous Content Result")
	WebElement backwardPag;

	@FindBy(css = ".block.articles .view ul li")
	WebElement documentLink;

	@FindBy(css = "button.view-article")
	WebElement viewFullContent;

	@FindBy(css = "button.add-article")
	WebElement addFullContent;

	@FindBy(id = "button.generate")
	WebElement importDocuments;

	public void clickResearchFolderMore() {
		element(researchFolderMore).waitUntilVisible();
		researchFolderMore.click();
	}

	public void selectMarkLogicSearch() {
		element(markLogicSearch).waitUntilVisible();
		markLogicSearch.click();
	}

	public void searchTerm(String term) {
		element(searchTerm).waitUntilVisible();
		searchTerm.sendKeys(term);
	}

	public void researchBtn() {
		element(researchBtn).waitUntilVisible();
		researchBtn.click();
	}

	public void selectDocumentContainer() {
		element(documentContainer).waitUntilVisible();
		documentContainer.click();
	}

	public void forwardPag() {
		element(forwardPag).waitUntilVisible();
		forwardPag.click();
	}

	public void backwardPag() {
		element(backwardPag).waitUntilVisible();
		backwardPag.click();
	}

	private void SelectRandomDocumentAndClickOnIt() {
		List<WebElement> searchResults = null;
		Random r = new Random();
		String noOfPagesContainer = getDriver()
				.findElement(By.cssSelector(".margin-bottom:15px")).getText()
				.trim();
		int noOfPages = StringUtils.getAllIntegerNumbersFromString(
				noOfPagesContainer).get(1);
		for (int i = 0; i < noOfPages; i++) {
			searchResults = getDriver().findElements(
					By.cssSelector(".block.articles .view ul li"));

			if (i < noOfPages - 1) {
				getDriver().findElement(
						By.cssSelector(".ui-icon.ui-icon-seek-next")).click();
				waitABit(2000);
			}
		}
		int listSize = searchResults.size();
		System.out.println(String.valueOf(listSize));
		int index = r.nextInt(listSize);
		searchResults.get(index).click();

	}

	public void selectViewFullContent() {
		element(viewFullContent).waitUntilVisible();
		viewFullContent.click();
	}

	public void selectAddFullContent() {
		element(addFullContent).waitUntilVisible();
		addFullContent.click();
	}

	public void selectImportDocuments() {
		element(importDocuments).waitUntilVisible();
		importDocuments.click();
	}
}
