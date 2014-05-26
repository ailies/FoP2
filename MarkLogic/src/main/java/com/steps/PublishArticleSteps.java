package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class PublishArticleSteps extends AbstractSteps {

	public PublishArticleSteps(Pages pages) {
		super(pages);
	}
	
	@Step
	public void clickOnMoreOptions(String term) {
		publishOnBuildMyBookPage().clickOnMoreOptions(term);
	}
	
	@Step
	public void clickOnSubmitToPublish(){
		publishOnBuildMyBookPage().clickOnSubmitToPublish();
	}
	
	@Step
	public void verifyPopupMessage(String message){
		abstractPage().verifyPopupMessage(message);
	}
	
	@StepGroup
	public void publishArticle(String message){
		clickOnSubmitToPublish();
		waitABit(2000);
		verifyPopupMessage(message);
	}
	

}
