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
	public boolean verifyIfXMLFileExists(String term) {
		return alfrescoCreateNewFolderPage().verifyIfElementExists(term);
	}

	@StepGroup
	public void searchAndImportWikiDocument(String fileName, String searchTerm,
			String term) {

		markLogicSearchPage().clickOnMoreOptions(fileName);

		markLogicSearchPage().inputSearchTerm(searchTerm);
		markLogicSearchPage().clickOnDocumentContainer();

		markLogicSearchPage().getARandomLink();
		markLogicSearchPage().clickOnViewFullContent();
		markLogicSearchPage().clickOnAddFullContent();

		markLogicSearchPage().getARandomLink();
		markLogicSearchPage().clickOnViewFullContent();
		markLogicSearchPage().clickOnAddFullContent();

		markLogicSearchPage().getARandomLink();
		markLogicSearchPage().clickOnViewFullContent();
		markLogicSearchPage().clickOnAddFullContent();

		markLogicSearchPage().clickOnImportDocuments();
		waitABit(6000);

//		if (verifyIfXMLFileExists(term)) {
//
//			alfrescoCreateNewFolderPage().clickOnElement("Demo.xml");
//
//		} else {
//
//			System.out.println("Master XML does not exist!");
//
//		}
	}
}
