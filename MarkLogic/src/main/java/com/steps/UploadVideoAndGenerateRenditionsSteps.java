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
	public void clickVideo() {
		uploadVideoAndGenerateFramesPage().clickVideo();
	}

	@Step
	public void clickGenerateFrames() {
		uploadVideoAndGenerateFramesPage().clickGenerateFrames();
	}

	@StepGroup
	public void Video() {
		clickVideo();
		clickGenerateFrames();
	}
}
