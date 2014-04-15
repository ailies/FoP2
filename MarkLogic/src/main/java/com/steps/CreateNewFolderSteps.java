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
	public void SelectCreateMenuOption() {
		createNewFolder.SelectCreateMenuOption();
	}

	@Step
	public void SelectCreateFolder() {
		createNewFolder.SelectCreateFolder();
	}

	@Step
	public void InsertNewFolderName(String name) {
		createNewFolder.InsertNewFolderName(name);
	}

	@Step
	public void ClickCreateFolderBtn() {
		createNewFolder.ClickCreateFolderBtn();
	}
	
	@Step
    public void CheckNotificationMessage(String msg) {
		createNewFolder.CheckNotificationMessage(msg);
    }
	
	/*@Step
	public void CheckThatTheNewFolderWasCreated(String string){
		createNewFolder.CheckThatTheNewFolderWasCreated(string);
	}*/

	@Step
    public void OpenFolder() {
		createNewFolder.OpenFolder();
    }
	
	@Step
    public void SelectCreateFolderFromTemplate() {
		createNewFolder.SelectCreateFolderFromTemplate();
    }
	
	@Step
    public void SelectContentFolder() {
		createNewFolder.SelectContentFolder();
    }
	
	@Step
	public void InsertContentFolderName(String contentName) {
		createNewFolder.InsertContentFolderName(contentName);
	}
	
	@Step
	public void SaveContentFolder() {
		createNewFolder.SaveContentFolder();
	}
		
	@StepGroup
	public void CreateNewFolder() {
		// mainFolder();
		SelectCreateMenuOption();
		SelectCreateFolder();
		InsertNewFolderName("Test");
		ClickCreateFolderBtn();
		CheckNotificationMessage("");
//		CheckThatTheNewFolderWasCreated("");
		OpenFolder();
		SelectCreateMenuOption();
		SelectCreateFolderFromTemplate();
		SelectContentFolder();
		InsertContentFolderName("DemoTesting");
		SaveContentFolder();
	}}