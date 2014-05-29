package com.steps;

import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class BuildMyBookActionSteps extends AbstractSteps {

	public BuildMyBookActionSteps(Pages pages) {
		super(pages);
	}

	@StepGroup
	public void buildMyBook(String searchTerm) {
		getDriver().manage().window().maximize();
		getDriver().get("http://172.16.10.116:9002/");

		buildMyBookActionsPage().clickOnViewLatestPublication();
		buildMyBookActionsPage().clickOnViewArticleContent();
		buildMyBookActionsPage().clickOnAddArticle();
		buildMyBookActionsPage().inputOnSearchTermInput(searchTerm);
		buildMyBookActionsPage().clickOnSearchBtn();
		// buildMyBookActionsPage().clickOnViewArticleContent();
		// buildMyBookActionsPage().clickOnAddArticle();
		// buildMyBookActionsPage().inputPublicationTitle("test");
		// buildMyBookActionsPage().clickOnFormatPDF();
		// buildMyBookActionsPage().clickOnGeneratePublicationBtn();
	}
}
