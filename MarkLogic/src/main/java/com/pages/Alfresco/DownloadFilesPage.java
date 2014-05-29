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

			download.click();
		}
	}

}
