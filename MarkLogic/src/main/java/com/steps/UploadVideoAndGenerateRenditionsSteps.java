package com.steps;

import tools.AbstractSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;

@SuppressWarnings("serial")
public class UploadVideoAndGenerateRenditionsSteps extends AbstractSteps {

	public UploadVideoAndGenerateRenditionsSteps(Pages pages) {
		super(pages);
	}

	@Step
	public void uploadDocument(String filePath) {
		uploadVideoAndGenerateFramesPage().uploadDocument(filePath);
	}

	@Step
	public void verifyIfVideoExists(String term) {
		uploadVideoAndGenerateFramesPage().verifyIfVideoExists(term);
	}

	@Step
	public void clickOnVideo(String... terms) {
		uploadVideoAndGenerateFramesPage().clickOnVideo(terms);
	}

	@Step
	public void clickOnGenerateVideoFrames() {
		uploadVideoAndGenerateFramesPage().clickOnGenerateVideoFrames();
	}

	@Step
	public void verifyIfVideoFramesWereGenerated() {
		uploadVideoAndGenerateFramesPage().verifyIfVideoFramesWereGenerated();
	}

	@StepGroup
	public void Video(String term) {
//		uploadDocument("C:/Users/seleniumadmin/Videos/Sample Videos/Wildlife.wmv");
		verifyIfVideoExists("Wildlife.wmv");
		clickOnVideo("Wildlife.wmv");
		clickOnGenerateVideoFrames();
		verifyIfVideoFramesWereGenerated();
	}
}
