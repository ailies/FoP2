package com.pages.Alfresco;

import java.util.List;

import net.thucydides.core.annotations.findby.By;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.AbstractPage;
import tools.StringUtils;

public class PublishArticlePage extends AbstractPage {

	public PublishArticlePage(WebDriver driver) {
		super(driver);
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
					.cssSelector("a[title='Submit to publish']"));

			markLogicSearch.isDisplayed();
			waitABit(2000);
			markLogicSearch.click();
		}
	}

}
