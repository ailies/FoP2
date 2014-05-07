package com.steps;

import tools.AbstractSteps;

import com.pages.Alfresco.CropImageAndGenerateRenditionsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;

@SuppressWarnings("serial")
public class CropImageAndGenerateRenditionsSteps extends AbstractSteps {

	public CropImageAndGenerateRenditionsSteps(Pages pages) {
		super(pages);
	}

	CropImageAndGenerateRenditionsPage cropImageAngGenerateRenditions;

	@Step
	public void clickOnImage() {
		cropImageAndGenerateRenditionsPage().clickOnImage();
	}

	@Step
	public void clickOnGenerateImageRenditions() {
		cropImageAndGenerateRenditionsPage().clickOnGenerateImageRenditions();
	}

	@Step
	public void clickOnCropImage() {
		cropImageAndGenerateRenditionsPage().clickOnCropImage();
	}

	@Step
	public void scrollToPageBottom() {
		cropImageAndGenerateRenditionsPage().scrollToPageBottom();
	}

	@Step
	public void scrollToPageTop() {
		cropImageAndGenerateRenditionsPage().scrollToPageTop();
	}

	@Step
	public void clickOnSaveCroppedImageBtn() {
		cropImageAndGenerateRenditionsPage().clickOnSaveCroppedImageBtn();
	}

	@StepGroup
	public void CropImageAndCreateImageRenditions() {
		clickOnImage();
		clickOnGenerateImageRenditions();
		clickOnCropImage();
		scrollToPageBottom();
		clickOnSaveCroppedImageBtn();
	}
}
