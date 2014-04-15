package com.steps;

import com.pages.UploadVideoAndGenerateFramesPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class UploadVideoAndGenerateRenditionsSteps extends ScenarioSteps{

	UploadVideoAndGenerateFramesPage uploadVideoAndGenerateFrames;
	
	@Step
	public void clickVideo(){
		uploadVideoAndGenerateFrames.clickVideo();
	}
	
	@Step
	public void clickGenerateFrames(){
		uploadVideoAndGenerateFrames.clickGenerateFrames();
	}
	
	@StepGroup
	public void Video(){
		clickVideo();
		clickGenerateFrames();
	}
}
