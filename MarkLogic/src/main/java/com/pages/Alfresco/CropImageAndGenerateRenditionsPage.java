package com.pages.Alfresco;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tools.StringUtils;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class CropImageAndGenerateRenditionsPage extends PageObject {

	@FindBy(css = "[attribute*='value']" )
	WebElement image;

	@FindBy(id = "")
	WebElement generateImageRenditions;

	@FindBy(id = "")
	WebElement cropImage;

	@FindBy(id = "")
	WebElement saveCroppedImageBtn;
	
	public WebElement selectAPicture(String... terms) {
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

	public void clickOnImage() {
		element(image).waitUntilVisible();
		image.click();
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
