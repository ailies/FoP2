package com.pages.Alfresco;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.StringUtils;

public class MarkLogicSearchPage extends PageObject {

	public MarkLogicSearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".more-actions.hidden")
	WebElement researchFolder;

	@FindBy(id = "yui-gen113")
	WebElement markLogicSearch;

	@FindBy(id = "searchTermInput")
	WebElement searchTerm;

	@FindBy(tagName = "Research")
	WebElement researchBtn;

	@FindBy(css = ".view")
	WebElement documentContainer;

	@FindBy(css = "input[name='Next Content Result']")
	WebElement forwardArrow;

	@FindBy(css = ".margin-bottom:15px")
	WebElement pageContainer;

	@FindBy(css = "input[name='Previous Content Result']")
	WebElement backwardArrow;

	@FindBy(css = ".block.articles .view ul li")
	WebElement documentLink;

	@FindBy(css = "button.view-article")
	WebElement viewFullContent;

	@FindBy(css = "button.add-article")
	WebElement addFullContent;

	@FindBy(id = "button.generate")
	WebElement importDocuments;

	public void clickOnResearchFolder() {
		element(researchFolder).waitUntilVisible();
		researchFolder.click();
	}

	public void clickOnMarkLogicSearch() {
		element(markLogicSearch).waitUntilVisible();
		markLogicSearch.click();
	}

	public void inputSearchTerm(String term) {
		element(searchTerm).waitUntilVisible();
		searchTerm.sendKeys(term);
	}

	public void clickOnResearchBtn() {
		element(researchBtn).waitUntilVisible();
		researchBtn.click();
	}

	public void clickOnDocumentContainer() {
		element(documentContainer).waitUntilVisible();
		documentContainer.click();
	}

/*	public String getARandomLink() {
		List<WebElement> listOfLinks = new ArrayList<WebElement>();
		Random r = new Random();
		String noOfPagesContainer = getDriver()
				.findElement(By.cssSelector(".margin-bottom:15px")).getText()
				.trim();
		int noOfPages = StringUtils.getAllIntegerNumbersFromString(
				noOfPagesContainer).get(1);
		for (int i = 0; i < noOfPages; i++) {
			listOfLinks.addAll(getDriver().findElements(
					By.cssSelector(".block.articles .view ul li")));

			if (i < noOfPages - 1) {
				getDriver().findElement(
						By.cssSelector(".ui-icon.ui-icon-seek-next")).click();
				waitABit(2000);
			}
		}
		int listSize = listOfLinks.size();
		System.out.println(String.valueOf(listSize));
		int index = r.nextInt(listSize);

		return (listOfLinks.get(index)).toString();

	}

	String link = getARandomLink();

	public void clickOnARandomLink(String term) {
		String noOfPagesContainer = getDriver()
				.findElement(By.id(".margin-bottom:15px")).getText().trim();
		int noOfPages = StringUtils.getAllIntegerNumbersFromString(
				noOfPagesContainer).get(0);
		boolean foundTerms = false;
		for (int i = 0; i < noOfPages; i++) {
			List<WebElement> searchResults = getDriver().findElements(
					By.cssSelector(".block.articles .view ul li"));
			for (WebElement searchResult : searchResults) {
				if (searchResult.getText().toLowerCase()
						.contains(term.toLowerCase())) {
					foundTerms = true;
					searchResult.click();
					break;
				}
			}
			if (i < noOfPages - 1 && !foundTerms) {
				getDriver().findElement(
						By.cssSelector(".ui-icon.ui-icon-seek-next")).click();
			} else
				break;
		}
		Assert.assertTrue("The link was not found!", foundTerms);
	}*/

	public void clickOnViewFullContent() {
		element(viewFullContent).waitUntilVisible();
		viewFullContent.click();
	}

	public void clickOnAddFullContent() {
		element(addFullContent).waitUntilVisible();
		addFullContent.click();
	}

	public void clickOnImportDocuments() {
		element(importDocuments).waitUntilVisible();
		importDocuments.click();
	}
}
