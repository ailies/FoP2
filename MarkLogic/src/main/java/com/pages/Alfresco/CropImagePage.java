package com.pages.Alfresco;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.AbstractPage;

public class CropImagePage extends AbstractPage{

	public CropImagePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "#cropImage > a")
	WebElement cropImage;

	@FindBy(id = "save-crop-button")
	WebElement saveCroppedImageBtn;
	
	public void clickOnCropImage() {
		element(cropImage).waitUntilVisible();
		cropImage.click();
	}

	public void selectCaptureSize() {
		WebElement image = getDriver().findElement(
				By.cssSelector("#bd > div.yui-gc > div > div.jcrop-tracker"));
		Actions crop = new Actions(getDriver());
		crop.moveToElement(image, 10, 10);
		crop.clickAndHold();
		crop.moveToElement(image, 90, 90);
		crop.release();
		crop.build();
		crop.perform();
	}



	public void clickOnSaveCroppedImageBtn() {
		element(saveCroppedImageBtn).waitUntilVisible();
		saveCroppedImageBtn.click();
	}
}
