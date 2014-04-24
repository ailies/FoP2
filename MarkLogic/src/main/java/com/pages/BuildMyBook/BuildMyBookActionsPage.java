package com.pages.BuildMyBook;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class BuildMyBookActionsPage extends PageObject {

	@FindBy(css = "a[title='View Latest Publications']")
	WebElement viewLatestPublication;

	@FindBy(css = "input[id='searchTermInput']")
	WebElement searchTermInput;

	@FindBy(id = "searchType")
	WebElement searchOptionDropDown;

	@FindBy(css = "a[title='All']")
	WebElement searchWithinAll;

	@FindBy(css = "a[title='Title']")
	WebElement searchWithinTitle;

	@FindBy(css = "a[title='Summary']")
	WebElement searchWithinSummary;

	@FindBy(css = "a[title='Content']")
	WebElement searchWithinContent;

	@FindBy(css = "a[title='Categories']")
	WebElement searchWithinCategories;

	@FindBy(css = ".col.col-2>button")
	WebElement searchBtn;

	@FindBy(css = ".button.view-article")
	WebElement viewArticleContent;

	@FindBy(css = ".button.add-to-my-book")
	WebElement addArticleToCollection;

	@FindBy(css = ".button.back-to-summary")
	WebElement backToResultsBtn;

	@FindBy(css = ".button.add-article")
	WebElement addAricle;

	@FindBy(css = ".module.module-my-book")
	WebElement myCollectionContainer;

	@FindBy(css = ".close")
	WebElement closeMyCollection;

	@FindBy(css = ".title")
	WebElement articleTitleFromMyCollection;

	@FindBy(css = ".remove>a")
	WebElement removeArticleFromMyCollection;

	@FindBy(css = ".move.up>a")
	WebElement moveUpArticle;

	@FindBy(css = ".move.down>a")
	WebElement moveDownArticle;

	@FindBy(css = "input[id='format-1']")
	WebElement formatPDF;

	@FindBy(css = "input[id='format-2']")
	WebElement formatKindle;

	@FindBy(css = "input[id='format-3']")
	WebElement formatEPUB;

	@FindBy(css = "input[id='format-4']")
	WebElement formatMobi;

	@FindBy(css = "input[id='publicationTitle']")
	WebElement publicationTitle;

	@FindBy(css = "button.generate")
	WebElement generatePublicationBtn;
	
	public void clickOnViewLatestPublication(){
		viewLatestPublication.click();
	}

	public void clickOnViewArticleContent() {
		viewArticleContent.click();
	}

	public void inputOnSearchTermInput(String searchTerm) {
		searchTermInput.sendKeys(searchTerm);
	}

	public void clickOnSearchOptionDropDown() {
		searchOptionDropDown.click();
	}

	public void clickOnSearchWithinAll() {
		searchWithinAll.click();
	}

	public void clickOnSearchWithintTitle() {
		searchWithinTitle.click();
	}

	public void clickOnSearchWithinSummary() {
		searchWithinSummary.click();
	}

	public void clickOnSearchWithinContent() {
		searchWithinContent.click();
	}

	public void clickOnSearchWithinCategories() {
		searchWithinCategories.click();
	}

	public void clickOnSearchBtn() {
		searchBtn.click();
	}

	public void clickOnAddArticleToCollection() {
		addArticleToCollection.click();
	}

	public void clickOnBackToResultsBtn() {
		backToResultsBtn.click();
	}

	public void clickOnAddAricle() {
		addAricle.click();
	}

	public void clickOnMyCollectionContainer() {
		myCollectionContainer.click();
	}

	public void clickOnCloseMyCollection() {
		closeMyCollection.click();
	}

	public void clickOnArticleTitleFromMyCollection() {
		articleTitleFromMyCollection.click();
	}

	public void clickOnRemoveArticleFromMyCollection() {
		removeArticleFromMyCollection.click();
	}

	public void clickOnMoveUpArticle() {
		moveUpArticle.click();
	}

	public void clickOnMoveDownArticle() {
		moveDownArticle.click();
	}

	public void clickOnFormatPDF() {
		formatPDF.click();
	}

	public void clickOnFormatKindle() {
		formatKindle.click();
	}

	public void clickOnFormatEPUB() {
		formatEPUB.click();
	}

	public void clickOnFormatMobi() {
		formatMobi.click();
	}

	public void inputPublicationTitle(String setPublicationTitle) {
		publicationTitle.sendKeys(setPublicationTitle);
	}

	public void clickOnGeneratePublicationBtn() {
		generatePublicationBtn.click();
	}
}
