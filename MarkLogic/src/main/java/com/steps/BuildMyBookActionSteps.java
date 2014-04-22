package com.steps;

import com.pages.BuildMyBookActionsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class BuildMyBookActionSteps extends ScenarioSteps{

	BuildMyBookActionsPage buildMyBook;
	
	@Step
	public void clickOnViewArticleContent(){
		buildMyBook.clickOnViewArticleContent();
	}
	
	@Step
	public void inputOnSearchTermInput(String searchTerm){
		buildMyBook.inputOnSearchTermInput(searchTerm);
	}
	
	@Step
	public void clickOnSearchOptionDropDown(){
		buildMyBook.clickOnSearchOptionDropDown();
	}
	
	@Step
	public void clickOnSearchWithinAll(){
		buildMyBook.clickOnSearchWithinAll();
	}
	
	@Step
	public void clickOnSearchWithintTitle(){
		buildMyBook.clickOnSearchWithintTitle();
	}
	
	@Step
	public void clickOnSearchWithinSummary(){
		buildMyBook.clickOnSearchWithinSummary();
	}
	
	@Step
	public void clickOnSearchWithinContent(){
		buildMyBook.clickOnSearchWithinContent();
	}
	
	@Step
	public void clickOnSearchWithinCategories(){
		buildMyBook.clickOnSearchWithinCategories();
	}
	
	@Step
	public void clickOnSearchBtn(){
		buildMyBook.clickOnSearchBtn();
	}
	
	@Step
	public void clickOnAddArticleToCollection(){
		buildMyBook.clickOnAddArticleToCollection();
	}
	
	@Step
	public void clickOnBackToResultsBtn(){
		buildMyBook.clickOnBackToResultsBtn();
	}
	
	@Step
	public void clickOnAddAricle(){
		buildMyBook.clickOnAddAricle();
	}
	
	@Step
	public void clickOnMyCollectionContainer(){
		buildMyBook.clickOnMyCollectionContainer();
	}
	
	@Step
	public void clickOnCloseMyCollection(){
		buildMyBook.clickOnCloseMyCollection();
	}
	
	@Step
	public void clickOnArticleTitleFromMyCollection(){
		buildMyBook.clickOnArticleTitleFromMyCollection();
	}
	
	@Step
	public void clickOnRemoveArticleFromMyCollection(){
		buildMyBook.clickOnRemoveArticleFromMyCollection();
	}
	
	@Step
	public void clickOnMoveUpArticle(){
		buildMyBook.clickOnMoveUpArticle();
	}
	
	@Step
	public void clickOnMoveDownArticle(){
		buildMyBook.clickOnMoveDownArticle();
	}
	
	@Step
	public void clickOnFormatPDF(){
		buildMyBook.clickOnFormatPDF();
	}
	
	@Step
	public void clickOnFormatKindle(){
		buildMyBook.clickOnFormatKindle();
	}
	
	@Step
	public void clickOnFormatEPUB(){
		buildMyBook.clickOnFormatEPUB();
	}
	
	@Step
	public void clickOnFormatMobi(){
		buildMyBook.clickOnFormatMobi();
	}
	
	@Step
	public void inputPublicationTitle(String setPublicationTitle){
		buildMyBook.inputPublicationTitle(setPublicationTitle);
	}
	
	@Step
	public void clickOnGeneratePublicationBtn(){
		buildMyBook.clickOnGeneratePublicationBtn();
	}
}
