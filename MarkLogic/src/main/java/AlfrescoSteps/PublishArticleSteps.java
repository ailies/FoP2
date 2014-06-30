package AlfrescoSteps;

import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class PublishArticleSteps extends AbstractSteps {

	public PublishArticleSteps(Pages pages) {
		super(pages);
	}

	@StepGroup
	public void publishArticle(String term) {
//		publishOnBuildMyBookPage().clickOnSubmitToPublishOption(term);
//		waitABit(2000);
		publishOnBuildMyBookPage().clickOnTasksMenu();
		publishOnBuildMyBookPage().clickOnWorkflowsStartedSubmenu();
		publishOnBuildMyBookPage().clickOnWorkflow();
		publishOnBuildMyBookPage().clickOnEditWorkflow();
		publishOnBuildMyBookPage().clickOnDropDownStatus();
		publishOnBuildMyBookPage().clickOnPublishEditedWorkflowBtn();
		publishOnBuildMyBookPage().clickOnEditWorkflow();
		publishOnBuildMyBookPage().clickOnDropDownStatus();
		publishOnBuildMyBookPage().clickOnTaskDoneBtn();
	}
}
