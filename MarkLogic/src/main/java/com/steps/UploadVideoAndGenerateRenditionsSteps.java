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
	public void clickOnUploadBtn() {
		uploadVideoAndGenerateFramesPage().clickOnUploadBtn();
	}

	@Step
	public void clickOnSelectFilesToUpload() {
		uploadVideoAndGenerateFramesPage().clickOnSelectFilesToUpload();
	}

	@Step
	public void uploadVideoToResearchFolder() {
		uploadVideoAndGenerateFramesPage().uploadVideoToResearchFolder();
	}

	@Step
	public void verifyIfVideoExists(String term) {
		uploadVideoAndGenerateFramesPage().verifyIfVideoExists(term);
	}

	@Step
	public void clickOnVideo() {
		uploadVideoAndGenerateFramesPage().clickOnVideo();
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
		clickOnUploadBtn();
		clickOnSelectFilesToUpload();
//		uploadVideoToResearchFolder();
//		verifyIfVideoExists(term);
//		clickOnVideo();
//		clickOnGenerateVideoFrames();
//		verifyIfVideoFramesWereGenerated();
	}
}
