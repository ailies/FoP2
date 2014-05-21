package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class GenerateImageRenditionsSteps extends AbstractSteps {

	public GenerateImageRenditionsSteps(Pages pages) {
		super(pages);
	}

	@Step
	public boolean verifyIfImagesExists(String term) {
		return generateRenditionsPage().verifyIfImagesExists(term);
	}

	@Step
	public void clickOnImage(String terms) {
		alfrescoCreateNewFolderPage().clickOnFolder(terms);
	}

	@Step
	public void clickOnGenerateImageRenditions() {
		generateRenditionsPage().clickOnGenerateImageRenditions();
	}

	@Step
	public void verifyIfImageRenditionsWereGenerated() {
		generateRenditionsPage().verifyIfImageRenditionsWereGenerated();
	}

	@Step
	public void scrollToPageBottom() {
		generateRenditionsPage().scrollToPageBottom();
	}

	@Step
	public void scrollToPageTop() {
		generateRenditionsPage().scrollToPageTop();
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
		verifyIfImageRenditionsWereGenerated();
	}
}
