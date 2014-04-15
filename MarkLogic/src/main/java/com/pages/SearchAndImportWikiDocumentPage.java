package com.pages;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
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

	@FindBy(css = ".view")
	WebElement searchDocuments;

	@FindBy(id = "")
	WebElement firstDocument;

	@FindBy(id = "")
	WebElement secondDocument;

	@FindBy(id = "")
	WebElement thirdDocument;

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

	public void searchDocuments() {
		element(searchDocuments).waitUntilVisible();
		searchDocuments.click();
	}
	
/*	List<WebElement> = driver.findElements
			(By.xpath("//table[@id='mytable']/tr/td")); */
	
/*	List <WebElement> = driver.findElements
			(By.xpath("table[@id='mytable']/tr[1]/td"));*/ 

	public void pickFirstDocument() {
		element(firstDocument).waitUntilVisible();
		firstDocument.click();
	}

	public void pickSecondDocument() {
		element(secondDocument).waitUntilVisible();
		secondDocument.click();
	}

	public void pickThirdDocument() {
		element(thirdDocument).waitUntilVisible();
		thirdDocument.click();
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
