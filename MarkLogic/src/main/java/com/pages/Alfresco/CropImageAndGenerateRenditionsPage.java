package com.pages.Alfresco;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class CropImageAndGenerateRenditionsPage extends PageObject {

	@FindBy(id = "")
	WebElement image;

	@FindBy(id = "")
	WebElement generateImageRenditions;

	@FindBy(id = "")
	WebElement cropImage;

	@FindBy(id = "")
	WebElement saveCroppedImageBtn;

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
