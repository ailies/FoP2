package com.steps;

import com.pages.SearchAndImportWikiDocumentPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SearchAndImportWikiDocumentSteps extends ScenarioSteps {

	public SearchAndImportWikiDocumentSteps(Pages pages) {
		super(pages);
	}

	SearchAndImportWikiDocumentPage searchAndImportWikiDocument;

	@Step
	public void clickOnResearchFolder() {
		searchAndImportWikiDocument.clickOnResearchFolder();
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
	public void clickOnForwardArrow() {
		searchAndImportWikiDocument.clickOnForwardArrow();
	}

	@Step
	public void clickOnBackwardArrow() {
		searchAndImportWikiDocument.clickOnBackwardArrow();
	}

//	@Step
//	public void selectRandomDocumentAndClickOnIt() {
//		searchAndImportWikiDocument.selectRandomDocumentAndClickOnIt();
//	}

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
	public void SearchAndImportWikiDocument() {
		clickOnResearchFolder();
		clickOnMarkLogicSearch();
		inputSearchTerm("testing");
		clickOnResearchBtn();
		clickOnDocumentContainer();
		clickOnForwardArrow();
		clickOnBackwardArrow();
//		selectRandomDocumentAndClickOnIt();
		clickOnViewFullContent();
		clickOnAddFullContent();
		clickOnImportDocuments();
	}
}
