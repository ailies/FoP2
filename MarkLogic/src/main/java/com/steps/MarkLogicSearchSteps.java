package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class MarkLogicSearchSteps extends AbstractSteps {

	public MarkLogicSearchSteps(Pages pages) {
		super(pages);
	}

	@Step
	public void clickOnMoreOptions(String term) {
		markLogicSearchPage().clickOnMoreOptions(term);
	}

	@Step
	public void inputSearchTerm(String term) {
		markLogicSearchPage().inputSearchTerm(term);
	}

	@Step
	public void getARandomLink() {
		markLogicSearchPage().getARandomLink();
	}

	@Step
	public void clickOnDocumentContainer() {
		markLogicSearchPage().clickOnDocumentContainer();
	}

	@Step
	public void clickOnViewFullContent() {
		markLogicSearchPage().clickOnViewFullContent();
	}

	@Step
	public void clickOnAddFullContent() {
		markLogicSearchPage().clickOnAddFullContent();
	}

	@Step
	public void clickOnUpArrow() {
		markLogicSearchPage().clickOnUpArrow();
	}

	@Step
	public void clickOnRemoveArticle() {
		markLogicSearchPage().clickOnRemoveArticle();
	}

	@Step
	public void clickOnClearSearchBtn() {
		markLogicSearchPage().clickOnClearSearchBtn();
	}

	@Step
	public void clickOnImportDocuments() {
		markLogicSearchPage().clickOnImportDocuments();
	}

	@Step
	public boolean verifyIfXMLFileExists(String term) {
		return alfrescoCreateNewFolderPage().verifyIfElementExists(term);
	}

	@Step
	public void clickOnFolder(String... terms) {
		alfrescoCreateNewFolderPage().clickOnFolder(terms);
	}

	@StepGroup
	public void searchAndImportWikiDocument(String fileName, String searchTerm,
			String term) {

		clickOnMoreOptions("Research");

		inputSearchTerm("music");
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
		waitABit(2000);

		if (!verifyIfXMLFileExists(term)) {

			clickOnFolder("DemoTesting.xml");

		} else {

			System.out.println("Master XML does not exist!");

		}
	}
}
