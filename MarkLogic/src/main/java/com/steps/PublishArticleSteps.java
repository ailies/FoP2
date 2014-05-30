package com.steps;

import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class PublishArticleSteps extends AbstractSteps {

	public PublishArticleSteps(Pages pages) {
		super(pages);
	}

	@StepGroup
	public void publishArticle(String assignee) {
		publishOnBuildMyBookPage().clickOnSubmitToPublish();
		waitABit(2000);

		publishOnBuildMyBookPage().clickOnWorkflowDropDown();
		publishOnBuildMyBookPage().clickOnWorkflowType();
		publishOnBuildMyBookPage().clickOnSelectAssignee();
		publishOnBuildMyBookPage().inputOnSearchAssigneeLabel(assignee);
		publishOnBuildMyBookPage().clickOnSearchAssigneeButton();
		publishOnBuildMyBookPage().clickOnGroupAssignee();
		publishOnBuildMyBookPage().clickOnGroupAssigneeOkButton();
		publishOnBuildMyBookPage().clickOnStartWorkflowButton();

		// publishOnBuildMyBookPage().clickOnTasksMenu();
		// publishOnBuildMyBookPage().clickOnWorkflowsStartedSubmenu();
		// abstractPage().scrollToPageBottom();
		// publishOnBuildMyBookPage().clickOnTask();
		// abstractPage().scrollToPageBottom();
		// publishOnBuildMyBookPage().clickOnEditCurrentTask();
		// abstractPage().scrollToPageBottom();
		// publishOnBuildMyBookPage().clickOnEditBtn();
		// publishOnBuildMyBookPage().editWorkflowStatus();
		// publishOnBuildMyBookPage().clickOnPublishBtn();
	}
}
