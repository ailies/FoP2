package com.steps;

import tools.AbstractSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;

@SuppressWarnings("serial")
public class GenerateVideoFramesSteps extends AbstractSteps {

	public GenerateVideoFramesSteps(Pages pages) {
		super(pages);
	}

	@Step
	public void verifyIfVideoExists(String term) {
		alfrescoCreateNewFolderPage().verifyIfElementExists(term);
	}

	@Step
	public void clickOnVideo(String... terms) {
		alfrescoCreateNewFolderPage().clickOnElement(terms);
	}

	@Step
	public void clickOnGenerateVideoFrames() {
		generateVideoFramesPage().clickOnGenerateVideoFrames();
	}

	@Step
	public void verifyIfVideoFramesWereGenerated() {
		generateVideoFramesPage().verifyIfVideoFramesWereGenerated();
	}

	@StepGroup
	public void generateVideoFrames(String term) {
		verifyIfVideoExists("Wildlife.wmv");
		clickOnVideo("Wildlife.wmv");
		clickOnGenerateVideoFrames();
	}

}
