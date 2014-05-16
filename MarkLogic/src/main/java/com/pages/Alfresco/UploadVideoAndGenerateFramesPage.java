package com.pages.Alfresco;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.List;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.StringUtils;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class UploadVideoAndGenerateFramesPage extends PageObject {

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-fileUpload-button-button")
	WebElement uploadBtn;

	@FindBy(css = ".dnd-file-selection-button")
	WebElement selectFilesToUpload;

	@FindBy(id = "template_x002e_dnd-upload_x002e_documentlibrary_x0023_default-cancelOk-button-button")
	WebElement cancelUploadFiles;
	
	@FindBy(id = "#generateFrames > a > span")
	WebElement generateFramesBtn;

	public void clickOnUploadBtn() {
		uploadBtn.click();
	}

	public void selectFilesToUpload() {
		uploadBtn.click();
	}

	public void uploadVideoToResearchFolder() {
		getDriver().findElement(By.id("urid")).sendKeys("Videos\\Wildlife.wmv");

		WebElement element = getDriver().findElement(By.name(""));
		WebElement target = getDriver().findElement(By.name("Wildlife"));
		(new Actions(getDriver())).dragAndDrop(element, target).perform();
	}

	public static void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(stringSelection, null);
	}

	public void uploadDocument(String fileName) {
		// disableFlash();

		// element(uploadBtn).waitUntilVisible();
		// uploadBtn.click();
		// uploadBtn.sendKeys(" ");
		//
		// System.out.println("File path absolute : " + fileName);
		// element(uploadInputNoFlash).waitUntilVisible();
		//
		// uploadInputNoFlash.sendKeys(fileName);
		//
		// element(uploadBtn).waitUntilPresent();
		// uploadBtn.click();
		// waitABit(Constants.WAIT_TIME_LONG);
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

	public WebElement selectVideo(String... terms) {
		String noOfPagesContainer = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-paginatorBottom"))
				.getText().trim();
		int noOfPages = StringUtils.getAllIntegerNumbersFromString(
				noOfPagesContainer).get(3);
		for (int i = 0; i < noOfPages; i++) {
			List<WebElement> searchResults = getDriver().findElements(
					By.cssSelector("a[title*='.wmv']"));
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

	@SuppressWarnings("unused")
	public void clickOnVideo(String... terms) {
		WebElement element = selectVideo(terms);
		System.out.println(element.getText());
		WebElement video = element.findElement(By.cssSelector("span a"));
		System.out.println(video.getText());
		if (element != null) {
			video.click();
		} else {
			Assert.fail("Video was not found!!!!");
		}	
	}
	
	public void clickOnGenerateVideoFrames(){
		generateFramesBtn.click();
		generateFramesBtn.click();
		waitABit(10000);
	}
	
	public WebElement verifyIfVideoFramesWereGenerated() {
		List<WebElement> frames = getDriver()
				.findElement(
						By.id("template_x002e_document-metadata_x002e_document-details_x0023_default-formContainer_assoc_ixpdc_frames-cntrl"))
				.findElements(By.cssSelector("a"));
		System.out.println(frames.size() + "video frames were generated");
		return null;

	}
}
