package com.steps;

import tools.AbstractSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;

@SuppressWarnings("serial")
public class UploadVideoSteps extends AbstractSteps {

	public UploadVideoSteps(Pages pages) {
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

	@StepGroup
	public void uploadVideo(String term) {
		uploadDocument("C:/Users/seleniumadmin/Videos/Sample Videos/Wildlife.wmv");
		verifyIfVideoExists("Wildlife.wmv");
	}

}
