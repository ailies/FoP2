package com.pages.Alfresco;

import java.io.File;
import java.util.List;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;
import tools.Constants;
import tools.StringUtils;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class UploadFilePage extends AbstractPage {

	public UploadFilePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-fileUpload-button-button")
	WebElement uploadButton;

	@FindBy(css = "input.dnd-file-selection-button")
	WebElement selectFilesToUpload;

	@FindBy(id = "template_x002e_dnd-upload_x002e_documentlibrary_x0023_default-cancelOk-button-button")
	WebElement cancelUploadFiles;

	public void uploadDocument(String filePath) {
		disableFlash();
		element(uploadButton).waitUntilVisible();
		uploadButton.click();
		uploadButton.sendKeys(" ");
		File fNewTwo = new File(filePath);
		String fileName1 = fNewTwo.getAbsolutePath();
		System.out.println("File path absolute : " + fileName1);
		getDriver().findElement(
				By.cssSelector("input.dnd-file-selection-button")).sendKeys(
				fileName1);
		waitABit(Constants.WAIT_TIME_LONG);
	}

	public boolean verifyIfVideoExists(String term) {
		String noOfPagesContainer = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-paginatorBottom"))
				.getText().trim();
		int noOfPages = StringUtils.getAllIntegerNumbersFromString(
				noOfPagesContainer).get(3);
		for (int i = 0; i < noOfPages; i++) {
			List<WebElement> searchResults = getDriver().findElements(
					By.cssSelector("img[alt='.wmv']"));
			for (WebElement searchResult : searchResults) {
				boolean foundRow = true;
				if ($(searchResult).isCurrentlyVisible()) {

					if (!searchResult.getText().toLowerCase()
							.contains(term.toLowerCase())) {
						foundRow = false;
					}

				}
				if (foundRow)
					return true;
			}
			if (i < noOfPages - 1) {
				getDriver().findElement(By.cssSelector(".yui-pg-next")).click();

				waitABit(2000);
			}
		}
		return false;
	}

}
