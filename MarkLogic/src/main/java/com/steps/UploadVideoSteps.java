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
		uploadFile().uploadDocument(filePath);
	}

	@Step
	public void verifyIfVideoExists(String term) {
		alfrescoCreateNewFolderPage().verifyIfElementExists(term);
	}

	@StepGroup
	public void uploadVideo(String filePath, String term) {
		uploadDocument(filePath);
		verifyIfVideoExists(term);
	}

}
