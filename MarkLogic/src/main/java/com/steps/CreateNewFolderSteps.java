package com.steps;

import com.pages.Alfresco.AlfrescoCreateNewFolderPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class CreateNewFolderSteps extends ScenarioSteps {

	public CreateNewFolderSteps(Pages pages) {
		super(pages);
	}

	AlfrescoCreateNewFolderPage createNewFolder;
	
	@Step
	public void verifyIfNodesExistInBreadcrumbs(String... terms) {
		  createNewFolder.verifyIfNodesExistInBreadcrumbs(terms);
	}
	
	@Step
	public boolean verifyIfFolderExists(String term) {
		 return createNewFolder.verifyIfFolderExists(term);
	}
	
	@Step
	public void clickOnFolder(String... terms) {
		 createNewFolder.clickOnFolder(terms);
	}
	@Step
	public void clickOnCreate() {
		createNewFolder.clickOnCreate();
	}

	@Step
	public void clickOnCreateFolder() {
		createNewFolder.clickOnCreateFolder();
	}

	@Step
	public void inputFolderName(String name) {
		createNewFolder.inputFolderName(name);
	}

	@Step
	public void clickOnCreateFolderBtn() {
		createNewFolder.clickOnCreateFolderBtn();
	}

	@Step
	public void clickOnCreateFolderFromTemplate() {
		createNewFolder.clickOnCreateFolderFromTemplate();
	}

	@Step
	public void clickOnCreateContentFolder() {
		createNewFolder.clickOnCreateContentFolder();
	}

	@Step
	public void inputContentFolderName(String contentName) {
		createNewFolder.inputContentFolderName(contentName);
	}

	@Step
	public void clickOnSaveContentFolder() {
		createNewFolder.clickOnSaveContentFolder();
	}
	
	@StepGroup
	public void createFolderFromTemplate(String contentFolderName, String folderName, String... nodes ) {
		/*clickOnCreate();
		clickOnCreateFolderFromTemplate();
		clickOnCreateContentFolder();
		inputContentFolderName(contentFolderName);
		clickOnSaveContentFolder();*/
		clickOnFolder(folderName);
		verifyIfNodesExistInBreadcrumbs(nodes);

	}


	@StepGroup
	public void createNewFolderTest(String folderName,String contentFolderName, String term, String... nodes) {
		if(!verifyIfFolderExists(term)){
			System.out.println("Create Test folder");
			clickOnCreate();
			clickOnCreateFolder();
			inputFolderName(folderName);
			clickOnCreateFolderBtn();
			clickOnFolder(folderName);
			createFolderFromTemplate(contentFolderName, folderName);
		} else{
			System.out.println("Folder is created");
			clickOnFolder(folderName);
			verifyIfNodesExistInBreadcrumbs(nodes);
			createFolderFromTemplate(contentFolderName, folderName, nodes);
		}
		
			
	}
}