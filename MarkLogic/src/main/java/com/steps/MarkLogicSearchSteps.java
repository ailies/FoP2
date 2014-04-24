package com.steps;

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

	@Step
	public void clickOnResearchFolder() {
		searchAndImportWikiDocument.clickOnResearchFolder();
	}

	@Step
	public void clickOnMore(String fileName) {
		searchAndImportWikiDocument.clickOnMore(fileName);
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
	
	/*@Step
	public String getARandomLink() {
		return searchAndImportWikiDocument.getARandomLink();
	}*/


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

	@StepGroup
	public void searchAndImportWikiDocument(String fileName, String searchTerm) {
//		clickOnMore(fileName);
		clickOnMarkLogicSearch();
		inputSearchTerm(searchTerm);
		clickOnResearchBtn();
		clickOnDocumentContainer();
//		getARandomLink();
//		selectRandomDocumentAndClickOnIt();
		clickOnViewFullContent();
		clickOnAddFullContent();
		clickOnImportDocuments();
	}
}
