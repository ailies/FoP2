package BuildMyBookPages;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.16.10.116:9002/")
public class BuildMyBookActionsPage extends PageObject {

	@FindBy(css = "div.module.module-latest-publication > div > div.row > div.col.col-2 > div > p.button-container > a")
	WebElement viewLatestPublication;

	@FindBy(css = "input[id='searchTermInput']")
	WebElement searchTermInput;

	@FindBy(css = "select#filter")
	WebElement searchOptionDropDown;

	@FindBy(css = "option:nth-child(1)")
	WebElement searchWithinAll;

	@FindBy(css = "option:nth-child(2)")
	WebElement searchWithinTitle;

	@FindBy(css = "option:nth-child(3)")
	WebElement searchWithinSummary;

	@FindBy(css = "option:nth-child(4)")
	WebElement searchWithinContent;

	@FindBy(css = "option:nth-child(5)")
	WebElement searchWithinCategories;

	@FindBy(css = ".col.col-2>button")
	WebElement searchBtn;

	@FindBy(css = "div:nth-child(1) > div > div.col.col-7 > p > a.button.view-article")
	WebElement viewArticleContent;

	@FindBy(css = ".button.add-to-my-book")
	WebElement addArticleToCollection;

	@FindBy(css = ".button.back-to-summary")
	WebElement backToResultsBtn;

	@FindBy(css = "div.content-container > div:nth-child(3) > div > div > ul > li:nth-child(2) > a")
	WebElement addArticle;

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

	public void clickOnViewLatestPublication() {
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

	public void clickOnAddArticle() {
		addArticle.click();
		addArticle.click();
		waitABit(2000);
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
