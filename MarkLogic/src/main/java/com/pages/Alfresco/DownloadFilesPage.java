package com.pages.Alfresco;

import net.thucydides.core.annotations.findby.By;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.AbstractPage;

public class DownloadFilesPage extends AbstractPage {

	public DownloadFilesPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnDownload(String term) {
		WebElement element = getTheSearchedElement(term);
		if (element == null) {
			Assert.fail("No element matching the given terms was found in the table!");
		} else {
			Actions mouseOver = new Actions(getDriver());
			mouseOver.moveToElement(element).build().perform();
			WebElement download = element.findElement(By
					.cssSelector("a[title='Download']"));
			mouseOver.click(element).build().perform();
			element(download).waitUntilVisible();
			download.click();
		}
	}

	public void clickOnSelect() {
		WebElement selectButton = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_repository_x0023_default-fileSelect-button-button"));
		element(selectButton).waitUntilVisible();
		selectButton.click();
	}

	public void clickOnAll() {
		WebElement allButton = getDriver().findElement(
				By.cssSelector(".selectAll"));
		element(allButton).waitUntilVisible();
		allButton.click();
	}

	public void clickOnSelectedItems() {
		WebElement selectedItems = getDriver()
				.findElement(
						By.cssSelector("#template_x002e_documentlist_v2_x002e_repository_x0023_default-selectedItems-button-button"));
		element(selectedItems).waitUntilVisible();
		selectedItems.click();
	}

	public void clickOnDownloadAsZIP() {
		WebElement downloadAsZIP = getDriver().findElement(
				By.cssSelector(".onActionDownload"));
		element(downloadAsZIP).waitUntilVisible();
		downloadAsZIP.click();
	}

}
