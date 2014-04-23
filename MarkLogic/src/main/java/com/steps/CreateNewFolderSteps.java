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
	public boolean verifyIfFolderExists(String... terms) {
		 return createNewFolder.verifyIfFolderExists(terms);
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

	@Step
	public void clickOnContentFolder(String...terms) {
		createNewFolder.clickOnContentFolder(terms);
	}
	
	@StepGroup
	public void contentFolder(String contentFolder){
		clickOnContentFolder(contentFolder);
	}
	
	@StepGroup
	public void CreateFolderFromTemplate(String contentFolderName, String contentFolder ) {
		/*clickOnCreate();
		clickOnCreateFolderFromTemplate();
		clickOnCreateContentFolder();
		inputContentFolderName(contentFolderName);
		clickOnSaveContentFolder();*/
		contentFolder(contentFolder);
	}


	@StepGroup
	public void CreateNewFolderTest(String folderName,String contentFolderName, String contentFolder, String... terms) {
		if(!verifyIfFolderExists(terms)){
			System.out.println("Folder is created");
			clickOnFolder(folderName);
			CreateFolderFromTemplate(contentFolderName, contentFolder);
		} else{
			System.out.println("Create Test folder");
			clickOnCreate();
			clickOnCreateFolder();
			inputFolderName(folderName);
			clickOnCreateFolderBtn();
			clickOnFolder(folderName);
			
			CreateFolderFromTemplate(contentFolderName, contentFolder);
		}
		
			
	}
}