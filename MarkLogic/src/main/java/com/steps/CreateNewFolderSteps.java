package com.steps;

import com.pages.CreateNewFolderPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class CreateNewFolderSteps extends ScenarioSteps {

	public CreateNewFolderSteps(Pages pages) {
		super(pages);
	}

	CreateNewFolderPage createNewFolder;

	// @Step public void mainFolder(){ login.mainFolder(); }

	@Step
	public void clickCreateFolderDropDown() {
		createNewFolder.clickCreateFolderDropDown();
	}

	@Step
	public void clickCreateFolder() {
		createNewFolder.clickCreateFolder();
	}

	@Step
	public void insertFolderName(String name) {
		createNewFolder.insertFolderName(name);
	}

	@Step
	public void clickCreateFolderBtn() {
		createNewFolder.clickCreateFolderBtn();
	}

	@Step
	public void clickNewFolder() {
		createNewFolder.clickNewFolder();
	}

	@Step
	public void clickCreateFolderFromTemplate() {
		createNewFolder.clickCreateFolderFromTemplate();
	}

	@Step
	public void clickContentFolder() {
		createNewFolder.clickContentFolder();
	}

	@Step
	public void typeContentFolderName(String folderName) {
		createNewFolder.typeContentFolderName(folderName);
	}

	@Step
	public void saveContentFolder() {
		createNewFolder.saveContentFolder();
	}

	@StepGroup
	public void CreateNewFolder() {
		// mainFolder();
		clickCreateFolderDropDown();
		clickCreateFolder();
		insertFolderName("Test");
		clickCreateFolderBtn();
		clickNewFolder();
		clickCreateFolderDropDown();
		saveContentFolder();
	}
}