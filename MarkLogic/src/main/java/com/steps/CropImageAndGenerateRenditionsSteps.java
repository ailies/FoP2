package com.steps;

import com.pages.CropImageAndGenerateRenditionsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class CropImageAndGenerateRenditionsSteps extends ScenarioSteps {

	CropImageAndGenerateRenditionsPage cropImageAngGenerateRenditions;

	@Step
	public void clickOnImage() {
		cropImageAngGenerateRenditions.clickOnImage();
	}

	@Step
	public void clickOnGenerateImageRenditions() {
		cropImageAngGenerateRenditions.clickOnGenerateImageRenditions();
	}

	@Step
	public void clickOnCropImage() {
		cropImageAngGenerateRenditions.clickOnCropImage();
	}

	@Step
	public void scrollToPageBottom() {
		cropImageAngGenerateRenditions.scrollToPageBottom();
	}

	@Step
	public void scrollToPageTop() {
		cropImageAngGenerateRenditions.scrollToPageTop();
	}

	@Step
	public void clickOnSaveCroppedImageBtn() {
		cropImageAngGenerateRenditions.clickOnSaveCroppedImageBtn();
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
