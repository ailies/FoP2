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
	public void selectFilesToUpload() {
		uploadVideoAndGenerateFramesPage().selectFilesToUpload();
	}
	
	@Step
	public void uploadVideoToResearchFolder() {
		uploadVideoAndGenerateFramesPage().uploadVideoToResearchFolder();
	}


	@StepGroup
	public void Video() {
		clickOnUploadBtn();
		selectFilesToUpload();
		uploadVideoToResearchFolder();
	}
}
