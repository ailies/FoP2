package com.steps;

import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class UploadVideoSteps extends AbstractSteps {

	public UploadVideoSteps(Pages pages) {
		super(pages);
	}

	@StepGroup
	public void uploadVideo(String filePath, String term) {
		uploadFile().uploadDocument(filePath);
		alfrescoCreateNewFolderPage().verifyIfElementExists(term);
	}

}
