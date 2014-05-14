package com.steps;

import tools.AbstractSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;

@SuppressWarnings("serial")
public class CreateNewFolderSteps extends AbstractSteps {

	public CreateNewFolderSteps(Pages pages) {
		super(pages);
	}

	@Step
	public void verifyIfNodesExistInBreadcrumbs(String... terms) {
		alfrescoCreateNewFolderPage().verifyIfNodesExistInBreadcrumbs(terms);
	}

	@Step
	public boolean verifyIfFolderExists(String term) {
		return alfrescoCreateNewFolderPage().verifyIfElementExists(term);
	}

	@Step
	public void clickOnFolder(String... terms) {
		alfrescoCreateNewFolderPage().clickOnFolder(terms);
	}

	@Step
	public void clickOnCreate() {
		alfrescoCreateNewFolderPage().clickOnCreate();
	}

	@Step
	public void clickOnCreateFolder() {
		alfrescoCreateNewFolderPage().clickOnCreateFolder();
	}

	@Step
	public void inputFolderName(String name) {
		alfrescoCreateNewFolderPage().inputFolderName(name);
	}

	@Step
	public void clickOnCreateFolderBtn() {
		alfrescoCreateNewFolderPage().clickOnCreateFolderBtn();
	}

	@Step
	public void clickOnCreateFolderFromTemplate() {
		alfrescoCreateNewFolderPage().clickOnCreateFolderFromTemplate();
	}

	@Step
	public void clickOnCreateContentFolder() {
		alfrescoCreateNewFolderPage().clickOnCreateContentFolder();
	}

	@Step
	public void inputContentFolderName(String contentName) {
		alfrescoCreateNewFolderPage().inputContentFolderName(contentName);
	}

	@Step
	public void clickOnSaveContentFolder() {
		alfrescoCreateNewFolderPage().clickOnSaveContentFolder();
	}

	@StepGroup
	public void createFolderFromTemplate(String contentFolderName,
			String folderName, String... nodes) {
		clickOnCreate();
		clickOnCreateFolderFromTemplate();
		clickOnCreateContentFolder();
		inputContentFolderName("DemoTesting");
		clickOnSaveContentFolder();
		waitABit(10000);
		clickOnFolder("DemoTesting");
		verifyIfNodesExistInBreadcrumbs("DemoTesting");

	}

	@StepGroup
	public void createNewFolderTest(String folderName,
			String contentFolderName, String term, String... nodes) {
		if (!verifyIfFolderExists(term)) {
			System.out.println("Create Test folder");
			clickOnCreate();
			clickOnCreateFolder();
			inputFolderName(folderName);
			clickOnCreateFolderBtn();
			clickOnFolder(folderName);
			verifyIfNodesExistInBreadcrumbs("Test");
			createFolderFromTemplate(contentFolderName, folderName, nodes);
		} else {
			System.out.println("Folder is created");
			clickOnFolder(folderName);
			verifyIfNodesExistInBreadcrumbs("Test");
			createFolderFromTemplate("DemoTesting", "DemoTesting", nodes);
		}

	}

	@StepGroup
	public void getToResearchFolder(String folderName, String... nodes) {
		clickOnFolder(folderName);
		verifyIfNodesExistInBreadcrumbs("Test");
		clickOnFolder(folderName);
		verifyIfNodesExistInBreadcrumbs("DemoTesting");
		clickOnFolder("Research");
		verifyIfNodesExistInBreadcrumbs("Research");
	}
}