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
		alfrescoCreateNewFolderPage().verifyIfElementExists(term);
	}

	@Step
	public void clickOnVideo(String... terms) {
		alfrescoCreateNewFolderPage().clickOnFolder(terms);
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
	public void uploadVideo(String term) {
		uploadDocument("C:/Users/seleniumadmin/Videos/Sample Videos/Wildlife.wmv");
		verifyIfVideoExists("Wildlife.wmv");
	}
	
	@StepGroup
	public void generateVideoFrames(String term) {
		verifyIfVideoExists("Wildlife.wmv");
		clickOnVideo("Wildlife.wmv");
		clickOnGenerateVideoFrames();
//		verifyIfVideoFramesWereGenerated();
	}
}
