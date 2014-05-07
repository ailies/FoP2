package com.steps;

import tools.AbstractSteps;

import com.pages.BuildMyBook.BuildMyBookActionsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class BuildMyBookActionSteps extends AbstractSteps {

	public BuildMyBookActionSteps(Pages pages) {
		super(pages);
	}

	@Step
	public void clickOnViewLatestPublication() {
		buildMyBookActionsPage().clickOnViewLatestPublication();
	}

	@Step
	public void clickOnViewArticleContent() {
		buildMyBookActionsPage().clickOnViewArticleContent();
	}

	@Step
	public void inputOnSearchTermInput(String searchTerm) {
		buildMyBookActionsPage().inputOnSearchTermInput(searchTerm);
	}

	@Step
	public void clickOnSearchOptionDropDown() {
		buildMyBookActionsPage().clickOnSearchOptionDropDown();
	}

	@Step
	public void clickOnSearchWithinAll() {
		buildMyBookActionsPage().clickOnSearchWithinAll();
	}

	@Step
	public void clickOnSearchWithintTitle() {
		buildMyBookActionsPage().clickOnSearchWithintTitle();
	}

	@Step
	public void clickOnSearchWithinSummary() {
		buildMyBookActionsPage().clickOnSearchWithinSummary();
	}

	@Step
	public void clickOnSearchWithinContent() {
		buildMyBookActionsPage().clickOnSearchWithinContent();
	}

	@Step
	public void clickOnSearchWithinCategories() {
		buildMyBookActionsPage().clickOnSearchWithinCategories();
	}

	@Step
	public void clickOnSearchBtn() {
		buildMyBookActionsPage().clickOnSearchBtn();
	}

	@Step
	public void clickOnAddArticleToCollection() {
		buildMyBookActionsPage().clickOnAddArticleToCollection();
	}

	@Step
	public void clickOnBackToResultsBtn() {
		buildMyBookActionsPage().clickOnBackToResultsBtn();
	}

	@Step
	public void clickOnAddAricle() {
		buildMyBookActionsPage().clickOnAddAricle();
	}

	@Step
	public void clickOnMyCollectionContainer() {
		buildMyBookActionsPage().clickOnMyCollectionContainer();
	}

	@Step
	public void clickOnCloseMyCollection() {
		buildMyBookActionsPage().clickOnCloseMyCollection();
	}

	@Step
	public void clickOnArticleTitleFromMyCollection() {
		buildMyBookActionsPage().clickOnArticleTitleFromMyCollection();
	}

	@Step
	public void clickOnRemoveArticleFromMyCollection() {
		buildMyBookActionsPage().clickOnRemoveArticleFromMyCollection();
	}

	@Step
	public void clickOnMoveUpArticle() {
		buildMyBookActionsPage().clickOnMoveUpArticle();
	}

	@Step
	public void clickOnMoveDownArticle() {
		buildMyBookActionsPage().clickOnMoveDownArticle();
	}

	@Step
	public void clickOnFormatPDF() {
		buildMyBookActionsPage().clickOnFormatPDF();
	}

	@Step
	public void clickOnFormatKindle() {
		buildMyBookActionsPage().clickOnFormatKindle();
	}

	@Step
	public void clickOnFormatEPUB() {
		buildMyBookActionsPage().clickOnFormatEPUB();
	}

	@Step
	public void clickOnFormatMobi() {
		buildMyBookActionsPage().clickOnFormatMobi();
	}

	@Step
	public void inputPublicationTitle(String setPublicationTitle) {
		buildMyBookActionsPage().inputPublicationTitle(setPublicationTitle);
	}

	@Step
	public void clickOnGeneratePublicationBtn() {
		buildMyBookActionsPage().clickOnGeneratePublicationBtn();
	}

	@StepGroup
	public void buildMyBook(String searchTerm) {
		clickOnViewLatestPublication();
		clickOnViewArticleContent();
		clickOnAddAricle();
		inputOnSearchTermInput(searchTerm);
		clickOnSearchBtn();
		clickOnViewArticleContent();

	}
}
