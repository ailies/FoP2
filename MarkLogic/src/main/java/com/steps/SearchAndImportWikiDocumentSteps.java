/*package com.steps;

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
	public void clickResearchFolderMore() {
		searchAndImportWikiDocument.clickResearchFolderMore();
	}

	@Step
	public void selectMarkLogicSearch() {
		searchAndImportWikiDocument.selectMarkLogicSearch();
	}

	@Step
	public void searchTerm(String term) {
		searchAndImportWikiDocument.searchTerm(term);
	}

	@Step
	public void searchDocuments() {
		searchAndImportWikiDocument.searchDocuments();
	}

	@Step
	public void pickFirstDocument() {
		searchAndImportWikiDocument.pickFirstDocument();
	}

	@Step
	public void pickSecondDocument() {
		searchAndImportWikiDocument.pickSecondDocument();
	}

	@Step
	public void pickThirdDocument() {
		searchAndImportWikiDocument.pickThirdDocument();
	}

	@Step
	public void selectViewFullContent() {
		searchAndImportWikiDocument.selectViewFullContent();
	}

	@Step
	public void selectAddFullContent() {
		searchAndImportWikiDocument.selectAddFullContent();
	}

	@Step
	public void selectImportDocuments() {
		searchAndImportWikiDocument.selectImportDocuments();
	}

	
	 * @Step public void () { searchAndImportWikiDocument.(); }
	 

	@StepGroup
	public void SearchAndImportWikiDocument() {
		clickResearchFolderMore();
		selectMarkLogicSearch();
		searchTerm("testing");
		searchDocuments();
		pickFirstDocument();
		pickSecondDocument();
		pickThirdDocument();
		selectViewFullContent();
		selectAddFullContent();
		selectImportDocuments();

	}
}
*/