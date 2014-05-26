package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class CropImageSteps extends AbstractSteps {

	public CropImageSteps(Pages pages) {
		super(pages);
	}

	@Step
	public boolean verifyIfImagesExists(String term) {
		return generateRenditionsPage().verifyIfElementExists(term);
	}

	@Step
	public void clickOnImage(String terms) {
		alfrescoCreateNewFolderPage().clickOnFolder(terms);
	}

	@Step
	public void clickOnCropImage() {
		cropImagePage().clickOnCropImage();
	}

	@Step
	public void selectCaptureSize() {
		cropImagePage().selectCaptureSize();
	}

	@Step
	public void clickOnSaveCroppedImageBtn() {
		cropImagePage().clickOnSaveCroppedImageBtn();
	}

	@StepGroup
	public void cropImage() {
		verifyIfImagesExists(".jpg");
		clickOnImage(".jpg");
		clickOnCropImage();
		selectCaptureSize();
		clickOnSaveCroppedImageBtn();
	}
}
