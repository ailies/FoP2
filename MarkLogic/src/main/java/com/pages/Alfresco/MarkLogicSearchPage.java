package com.pages.Alfresco;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.apache.xpath.FoundIndex;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.AbstractPage;
import tools.Constants;
import tools.Delay;
import tools.StringUtils;

public class MarkLogicSearchPage extends AbstractPage {

	public MarkLogicSearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-sortAscending-button-button")
	private WebElement sortDescending;

	@FindBy(id = "yuievtautoid-0")
	WebElement documentsListContainer;

	@FindBy(css = ".more-actions.hidden")
	WebElement researchFolder;

	@FindBy(id = "mlSearch")
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

	@FindBy(css = ".yui-dt29-col-actions.yui-dt-col-actions.yui-dt-last .yui-dt-liner .hidden .action-set .internal-show-more .show-more")
	WebElement moremoremore;

	@FindBy(id = "button.generate")
	WebElement importDocuments;

	public WebElement getTheSearchedElement(String... terms) {
		String noOfPagesContainer = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-paginatorBottom"))
				.getText().trim();
		System.out.println(noOfPagesContainer.toString());
		int noOfPages = StringUtils.getAllIntegerNumbersFromString(
				noOfPagesContainer).get(3);
		for (int i = 0; i < noOfPages; i++) {
			List<WebElement> searchResults = getDriver().findElements(
					By.cssSelector(".yui-dt-rec"));
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

	public void clickOnMoreOptions(String term) {
		WebElement element = getTheSearchedElement(term);
		if (element == null) {
			Assert.fail("No element matching the given terms was found in the table!");
		} else {
			Actions mouseOver = new Actions(getDriver());
			mouseOver.moveToElement(element).build().perform();
			WebElement moreButton = element.findElement(By
					.id("onActionShowMore"));
			// .yui-dt29-col-actions.yui-dt-col-actions.yui-dt-last .yui-dt-liner .action-set .internal-show-more

			
			moreButton.sendKeys();
			moreButton.click();

			element(markLogicSearch).waitUntilVisible();
			markLogicSearch.click();
		}

	}

	public void clickOnResearchFolder() {
		element(researchFolder).waitUntilVisible();
		researchFolder.click();
	}

	public void clickOnSortDescending() {
		sortDescending.click();
		waitABit(2000);
	}

	public void clickOnMoreResearch(String fileName) {
		System.out.println("(FUK YOU!)");
		if (element(documentsListContainer).isDisplayed()) {
			System.out.print("MATA");
		} else {
			System.out.println("(-!-)");
			element(documentsListContainer).waitUntilVisible();
		}
		waitABit(2000);

		List<WebElement> documentList = documentsListContainer.findElements(By
				.cssSelector("tr[class*='yui-dt-rec']"));

		// for(Integer i=0; i <= documentList.size(); i++ )
		// {
		// System.out.println(documentList.toString());
		// }

		for (WebElement documentNow : documentList) {

			WebElement docDetails = documentNow.findElement(By
					.cssSelector("h3.filename"));

			if (docDetails.getText().contains(fileName)) {
				System.out.println("fuckin' succes");
				String elemHeader = docDetails.getCssValue("class");
				elementjQueryMouseOver("div.internal-show-more a span");
				waitABit(2000);

				elementjQueryClick("div.internal-show-more a span");
				waitABit(2000);

				WebElement moreListContainer = documentNow.findElement(By
						.cssSelector("div.more-actions div.mlsearch"));
				System.out.println(("Searched elem ID: " + moreListContainer
						.getAttribute("id")));
				waitABit(Constants.WAIT_TIME_SHORT);
				moreListContainer.sendKeys("");
				moreListContainer.sendKeys(" ");
				moreListContainer.findElement(By.tagName("a")).click();
				waitABit(Constants.WAIT_TIME_LONG);

				break;
			}
		}
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

	/*
	 * public String getARandomLink() { List<WebElement> listOfLinks = new
	 * ArrayList<WebElement>(); Random r = new Random(); String
	 * noOfPagesContainer = getDriver()
	 * .findElement(By.cssSelector(".margin-bottom:15px")).getText() .trim();
	 * int noOfPages = StringUtils.getAllIntegerNumbersFromString(
	 * noOfPagesContainer).get(1); for (int i = 0; i < noOfPages; i++) {
	 * listOfLinks.addAll(getDriver().findElements(
	 * By.cssSelector(".block.articles .view ul li")));
	 * 
	 * if (i < noOfPages - 1) { getDriver().findElement(
	 * By.cssSelector(".ui-icon.ui-icon-seek-next")).click(); waitABit(2000); }
	 * } int listSize = listOfLinks.size();
	 * System.out.println(String.valueOf(listSize)); int index =
	 * r.nextInt(listSize);
	 * 
	 * return (listOfLinks.get(index)).toString();
	 * 
	 * }
	 * 
	 * String link = getARandomLink();
	 * 
	 * public void clickOnARandomLink(String term) { String noOfPagesContainer =
	 * getDriver() .findElement(By.id(".margin-bottom:15px")).getText().trim();
	 * int noOfPages = StringUtils.getAllIntegerNumbersFromString(
	 * noOfPagesContainer).get(0); boolean foundTerms = false; for (int i = 0; i
	 * < noOfPages; i++) { List<WebElement> searchResults =
	 * getDriver().findElements( By.cssSelector(".block.articles .view ul li"));
	 * for (WebElement searchResult : searchResults) { if
	 * (searchResult.getText().toLowerCase() .contains(term.toLowerCase())) {
	 * foundTerms = true; searchResult.click(); break; } } if (i < noOfPages - 1
	 * && !foundTerms) { getDriver().findElement(
	 * By.cssSelector(".ui-icon.ui-icon-seek-next")).click(); } else break; }
	 * Assert.assertTrue("The link was not found!", foundTerms); }
	 */

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
