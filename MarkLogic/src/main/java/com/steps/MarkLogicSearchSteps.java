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

	MarkLogicSearchPage searchAndImportWikiDocument;

	AlfrescoCreateNewFolderPage createNewFolder;

	@Step
	public void clickOnResearchFolder() {
		searchAndImportWikiDocument.clickOnResearchFolder();
	}

	@Step
	public void clickOnMoreResearch(String fileName) {
		searchAndImportWikiDocument.clickOnMoreResearch(fileName);
	}

	@Step
	public void clickOnMarkLogicSearch() {
		searchAndImportWikiDocument.clickOnMarkLogicSearch();
	}

	@Step
	public void inputSearchTerm(String term) {
		searchAndImportWikiDocument.inputSearchTerm(term);
	}

	@Step
	public void clickOnResearchBtn() {
		searchAndImportWikiDocument.clickOnResearchBtn();
	}

	@Step
	public void clickOnDocumentContainer() {
		searchAndImportWikiDocument.clickOnDocumentContainer();
	}

	
	@Step 
	public void clickOnMoreOptions(String term){
		searchAndImportWikiDocument.clickOnMoreOptions(term);
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
	
	@Step
	public void clickOnSortDescending(){
		searchAndImportWikiDocument.clickOnSortDescending();
	}

	@StepGroup
	public void searchAndImportWikiDocument(String fileName, String searchTerm) {
		
//		clickOnSortDescending();
//		clickOnMoreResearch(fileName);
		clickOnMoreOptions("Research");
		inputSearchTerm(searchTerm);
		clickOnResearchBtn();
		clickOnDocumentContainer();
		// getARandomLink();
		// selectRandomDocumentAndClickOnIt();
		clickOnViewFullContent();
		clickOnAddFullContent();
		clickOnImportDocuments();
	}
}
