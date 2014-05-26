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
	public void clickOnSubmitToPublish() {
		publishOnBuildMyBookPage().clickOnSubmitToPublish();
	}

	@Step
	public void clickOnTasksMenu() {
		publishOnBuildMyBookPage().clickOnTasksMenu();
	}

	@Step
	public void clickOnWorkflowsStartedSubmenu() {
		publishOnBuildMyBookPage().clickOnWorkflowsStartedSubmenu();
	}

	@Step
	public void verifyCurrentTaskStatus(String workflowApproved) {
		publishOnBuildMyBookPage().verifyCurrentTaskStatus(workflowApproved);
	}

	@Step
	public void clickOnTask() {
		publishOnBuildMyBookPage().clickOnTask();
	}

	@Step
	public void clickOnEditCurrentTask() {
		publishOnBuildMyBookPage().clickOnEditCurrentTask();
	}

	@Step
	public void clickOnEditBtn() {
		publishOnBuildMyBookPage().clickOnEditBtn();
	}

	@Step
	public void editWorkflowStatus() {
		publishOnBuildMyBookPage().editWorkflowStatus();
	}

	@Step
	public void clickOnPublishBtn() {
		publishOnBuildMyBookPage().clickOnPublishBtn();
	}

	@Step
	public void scrollToBottom() {
		abstractPage().scrollToPageBottom();
	}

	@StepGroup
	public void publishArticle() {
		clickOnSubmitToPublish();
		waitABit(2000);
		clickOnTasksMenu();
		clickOnWorkflowsStartedSubmenu();
		scrollToBottom();
		clickOnTask();
		scrollToBottom();
		clickOnEditCurrentTask();
		scrollToBottom();
		clickOnEditBtn();
		editWorkflowStatus();
		clickOnPublishBtn();
		waitABit(2000);
	}
}
