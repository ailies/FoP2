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
	public void clickOnTestingFolder() {
		createNewFolder.clickOnTestingFolder();
	}

	@Step
	public void checkFolderFromTemplateWasCreated() {
		createNewFolder.checkFolderFromTemplateWasCreated();
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
	public void checkContentFolderWasCreated() {
		createNewFolder.checkContentFolderWasCreated();
	}

	@Step
	public void clickOnDemoTestingFolder() {
		createNewFolder.clickOnDemoTestingFolder();
	}

	@StepGroup
	public void CreateNewFolder() {
		clickOnCreate();
		clickOnCreateFolder();
		inputFolderName("Test");
		clickOnCreateFolderBtn();
		checkFolderFromTemplateWasCreated();
		clickOnTestingFolder();
		clickOnCreateFolderFromTemplate();
		clickOnCreateContentFolder();
		inputContentFolderName("DemoTesting");
		clickOnSaveContentFolder();
		checkContentFolderWasCreated();
		clickOnDemoTestingFolder();
	}
}