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
	public boolean verifyIfImagesExists(String term){
		return cropImageAndGenerateRenditionsPage().verifyIfImagesExists(term);
	}

	@Step
	public void clickOnImage(String terms) {
		alfrescoCreateNewFolderPage().clickOnFolder(terms);
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
	
	@Step
	public boolean verifyIfFolderExists(String term) {
		return alfrescoCreateNewFolderPage().verifyIfElementExists(term);
	}

	@Step
	public void clickOnFolder(String... terms) {
		alfrescoCreateNewFolderPage().clickOnFolder(terms);
	}

	@StepGroup
	public void GenerateImageRenditions() {
		clickOnFolder("Test");
		clickOnFolder("DemoTesting");
		verifyIfFolderExists("Research");
		clickOnFolder("Research");
		verifyIfImagesExists(".jpg");
		clickOnImage(".jpg");
		clickOnGenerateImageRenditions();
		waitABit(2000);
		/*clickOnCropImage();
		scrollToPageBottom();
		clickOnSaveCroppedImageBtn();*/
	}
}
