package AlfrescoSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class CreateFolderSteps extends AbstractSteps {

	public CreateFolderSteps(Pages pages) {
		super(pages);
	}

	@Step
	public boolean verifyIfFolderExists(String term) {
		return alfrescoCreateNewFolderPage().verifyIfElementExists(term);
	}

	@Step
	public void clickOnFolder(String... terms) {
		alfrescoCreateNewFolderPage().clickOnElement(terms);
	}

	@StepGroup
	public void createFolderFromTemplate(String contentFolderName,
			String folderName, String... nodes) {
		alfrescoActionsPage().clickOnCreateDropDown();
		alfrescoActionsPage().clickOnCreateFolderFromTemplate();
		alfrescoActionsPage().clickOnCreateContentFolder();
		alfrescoActionsPage().inputContentFolderName("Demo");
		alfrescoActionsPage().clickOnSaveContentFolder();
		waitABit(10000);
		clickOnFolder("Demo");
		alfrescoCreateNewFolderPage().verifyIfNodesExistInBreadcrumbs("Demo");

	}

	@StepGroup
	public void createNewFolderTest(String folderName,
			String contentFolderName, String term, String... nodes) {
		if (!verifyIfFolderExists(term)) {
			alfrescoCreateNewFolderPage().clickOnCreate();
			alfrescoCreateNewFolderPage().clickOnCreateFolder();
			alfrescoCreateNewFolderPage().inputFolderName(folderName);
			alfrescoCreateNewFolderPage().clickOnCreateFolderBtn();
			clickOnFolder(folderName);
			alfrescoCreateNewFolderPage().verifyIfNodesExistInBreadcrumbs(
					"Test");
			createFolderFromTemplate(contentFolderName, folderName, nodes);
		} else {
			clickOnFolder(folderName);
			alfrescoCreateNewFolderPage().verifyIfNodesExistInBreadcrumbs(
					"Test");
			createFolderFromTemplate(contentFolderName, contentFolderName,
					nodes);
		}

	}

	@StepGroup
	public void getToResearchFolder(String folderName, String... nodes) {
		clickOnFolder(folderName);
		alfrescoCreateNewFolderPage().verifyIfNodesExistInBreadcrumbs(
				folderName);
		clickOnFolder(folderName);
		alfrescoCreateNewFolderPage().verifyIfNodesExistInBreadcrumbs(nodes);
		clickOnFolder("Research");
		alfrescoCreateNewFolderPage().verifyIfNodesExistInBreadcrumbs(
				"Research");
	}
}