package AlfrescoPages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.thucydides.core.annotations.findby.By;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.AbstractPage;
import tools.StringUtils;

public class MarkLogicSearchPage extends AbstractPage {

	public MarkLogicSearchPage(WebDriver driver) {
		super(driver);
	}

	public void getToURL() {
		WebElement link = getDriver()
				.findElement(
						By.linkText("http://172.16.10.115:8080/share/page/site/test-site/mlsearch?nodeRef=workspace://SpacesStore/abca693e-a8bc-4f2f-9b7a-f2b3b5b4779a&#filter=path|/Test/DemoTesting|&page=1"));
		link.submit();
	}

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
					.cssSelector("#onActionShowMore a"));
			mouseOver.click(element).build().perform();

			moreButton.click();

			WebElement markLogicSearch = element.findElement(By
					.cssSelector("a[title='MarkLogic Search']"));

			markLogicSearch.isDisplayed();
			waitABit(2000);
			$(markLogicSearch).waitUntilVisible();
			markLogicSearch.click();
			waitABit(2000);
		}
	}

	public void inputSearchTerm(String term) {
		getDriver().switchTo().frame(
				getDriver().findElement(By.id("mlSearchArticleIframe")));
		WebElement searchIframe = getDriver().switchTo().activeElement();
		$(searchIframe).waitUntilVisible();
		searchIframe.click();
		WebElement inputSearch = getDriver().findElement(
				By.cssSelector("input#searchTermInput"));
		$(inputSearch).waitUntilVisible();
		inputSearch.sendKeys(term);
		WebElement researchBtn = getDriver().findElement(
				By.cssSelector("button:nth-child(1) > span"));
		researchBtn.click();
	}

	public void clickOnDocumentContainer() {
		WebElement documentContainer = getDriver().findElement(
				By.cssSelector(".view"));
		$(documentContainer).waitUntilVisible();
		documentContainer.click();
	}

	public void getARandomLink() {
		List<WebElement> listOfLinks = new ArrayList<WebElement>();
		Random r = new Random();

		listOfLinks.addAll(getDriver().findElements(
				By.cssSelector(".block.articles .view ul li")));
		int listSize = listOfLinks.size();
		System.out.println(String.valueOf(listSize));

		int index = r.nextInt(listSize);
		System.out.println(listOfLinks.get(index).getText());
		String compare = listOfLinks.get(index).getText().toLowerCase()
				.toString();

		List<WebElement> searchResults = getDriver().findElements(
				By.cssSelector(".block.articles .view ul li"));
		try {
			for (WebElement searchResult : searchResults) {
				String var = searchResult.getText().toLowerCase().toString();
				System.out.println(var);

				if (var.contains(compare)) {
					System.out.println(searchResult);
					searchResult.findElement(By.cssSelector("a")).click();

				} else {

					System.out.println("Element not found!");
				}
			}
		} catch (Exception e) {

		}
	}

	public void clickOnViewFullContent() {
		WebElement viewFullContent = getDriver().findElement(
				By.cssSelector(".button.view-article"));
		$(viewFullContent).waitUntilVisible();
		viewFullContent.click();
	}

	public void clickOnAddFullContent() {
		WebElement addFullContent = getDriver().findElement(
				By.cssSelector(".button.add-article"));
		$(addFullContent).waitUntilVisible();
		addFullContent.click();
	}

	public void clickOnUpArrow() {
		WebElement upArrow = getDriver().findElement(
				By.cssSelector(".actions .move.up"));
		$(upArrow).waitUntilVisible();
		upArrow.click();
	}

	public void clickOnRemoveArticle() {
		WebElement removeArticle = getDriver().findElement(
				By.cssSelector(".list .remove"));
		$(removeArticle).waitUntilVisible();
		removeArticle.click();
	}

	public void clickOnClearSearchBtn() {
		WebElement clearSearchBtn = getDriver().findElement(
				By.cssSelector(".clear"));
		$(clearSearchBtn).waitUntilVisible();
		clearSearchBtn.click();
	}

	public void clickOnImportDocuments() {
		WebElement importDocuments = getDriver().findElement(
				By.cssSelector(".button.generate"));
		$(importDocuments).waitUntilVisible();
		importDocuments.click();
		waitABit(2000);
	}
}
