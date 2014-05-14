package com.pages.Alfresco;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;
import tools.StringUtils;
import net.thucydides.core.annotations.findby.FindBy;

public class CropImageAndGenerateRenditionsPage extends AbstractPage {

	public CropImageAndGenerateRenditionsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "[attribute*='value']")
	WebElement image;

	@FindBy(css = ".#generateImgRenditions > a")
	WebElement generateImageRenditions;

	@FindBy(id = "")
	WebElement cropImage;

	@FindBy(id = "")
	WebElement saveCroppedImageBtn;

	public boolean verifyIfImagesExists(String term) {
		String noOfPagesContainer = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-paginatorBottom"))
				.getText().trim();
		int noOfPages = StringUtils.getAllIntegerNumbersFromString(
				noOfPagesContainer).get(3);
		for (int i = 0; i < noOfPages; i++) {
			List<WebElement> searchResults = getDriver().findElements(
					By.cssSelector("img[alt='.jpg']"));
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

	public WebElement selectImage(String... terms) {
		String noOfPagesContainer = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-paginatorBottom"))
				.getText().trim();
		int noOfPages = StringUtils.getAllIntegerNumbersFromString(
				noOfPagesContainer).get(3);
		for (int i = 0; i < noOfPages; i++) {
			List<WebElement> searchResults = getDriver().findElements(
					By.cssSelector("a[title*='.jpg']"));
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

	public void clickOnImage(String... terms) {
		WebElement element = selectImage(terms);
		System.out.println(element.getText());
		WebElement folder = element.findElement(By.cssSelector("span a"));
		System.out.println(folder.getText());
		if (element != null) {
			folder.click();
		} else {
			Assert.fail("Images were not found!!!!");
		}
	}

	public void clickOnGenerateImageRenditions() {
		element(generateImageRenditions).waitUntilVisible();
		generateImageRenditions.click();
	}

	public void clickOnCropImage() {
		element(cropImage).waitUntilVisible();
		cropImage.click();
	}

	public void scrollToPageBottom() {
		evaluateJavascript("window.scrollTo(0,document.body.scrollHeight);");
	}

	public void scrollToPageTop() {
		evaluateJavascript("window.scrollTo(0,document.body.scrollTop);");
	}

	public void clickOnSaveCroppedImageBtn() {
		element(saveCroppedImageBtn).waitUntilVisible();
		saveCroppedImageBtn.click();
	}

}
