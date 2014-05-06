package com.steps;

import com.pages.Alfresco.AlfrescoCreateNewFolderPage;
import com.pages.Alfresco.MarkLogicSearchPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class MarkLogicSearchSteps extends ScenarioSteps {

	public MarkLogicSearchSteps(Pages pages) {
		super(pages);
	}

	AlfrescoCreateNewFolderPage createNewFolder;
	MarkLogicSearchPage searchAndImportWikiDocument;

	@Step
	public void clickOnMoreOptions(String term) {
		searchAndImportWikiDocument.clickOnMoreOptions(term);
	}

	@Step
	public void inputSearchTerm(String term) {
		searchAndImportWikiDocument.inputSearchTerm(term);
	}

	/*
	 * @Step public void clickOnARandomLink() {
	 * searchAndImportWikiDocument.clickOnARandomLink(); }
	 */

	@Step
	public void getARandomLink() {
		searchAndImportWikiDocument.getARandomLink();
	}

	@Step
	public void clickOnDocumentContainer() {
		searchAndImportWikiDocument.clickOnDocumentContainer();
	}

	@Step
	public void clickOnViewFullContent() {
		searchAndImportWikiDocument.clickOnViewFullContent();
	}

	@Step
	public void clickOnAddFullContent() {
		searchAndImportWikiDocument.clickOnAddFullContent();
	}

	@Step
	public void clickOnImportDocuments() {
		searchAndImportWikiDocument.clickOnImportDocuments();
	}

	@Step
	public boolean verifyIfFolderExists(String term) {
		return createNewFolder.verifyIfFolderExists(term);
	}

	@StepGroup
	public void searchAndImportWikiDocument(String fileName, String searchTerm) {
		clickOnMoreOptions("Research");
		inputSearchTerm("development");
		clickOnDocumentContainer();
		getARandomLink();
		clickOnViewFullContent();
		clickOnAddFullContent();
		getARandomLink();
		clickOnViewFullContent();
		clickOnAddFullContent();
		getARandomLink();
		clickOnViewFullContent();
		clickOnAddFullContent();
		clickOnImportDocuments();
	}
}
