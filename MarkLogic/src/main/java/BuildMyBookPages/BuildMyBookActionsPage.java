package BuildMyBookPages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://172.16.10.116:9002/")
public class BuildMyBookActionsPage extends PageObject {

	public void clickOnViewLatestPublication() {
		WebElement viewLatestPublication = getDriver()
				.findElement(
						By.cssSelector("div.module.module-latest-publication > div > div.row > div.col.col-2 > div > p.button-container > a"));
		viewLatestPublication.click();
	}

	public void clickOnViewArticleContent() {
		WebElement viewArticleContent = getDriver()
				.findElement(
						By.cssSelector("div:nth-child(1) > div > div.col.col-7 > p > a.button.view-article"));
		viewArticleContent.click();
	}

	public void inputOnSearchTermInput(String searchTerm) {
		WebElement searchTermInput = getDriver().findElement(
				By.cssSelector("input[id='searchTermInput']"));
		searchTermInput.sendKeys(searchTerm);
	}

	public void clickOnSearchOptionDropDown() {
		WebElement searchOptionDropDown = getDriver().findElement(
				By.cssSelector("select#filter"));
		searchOptionDropDown.click();
	}

	public void clickOnSearchWithinAll() {
		WebElement searchWithinAll = getDriver().findElement(
				By.cssSelector("option:nth-child(1)"));
		searchWithinAll.click();
	}

	public void clickOnSearchWithintTitle() {
		WebElement searchWithinTitle = getDriver().findElement(
				By.cssSelector("option:nth-child(2)"));
		searchWithinTitle.click();
	}

	public void clickOnSearchWithinSummary() {
		WebElement searchWithinSummary = getDriver().findElement(
				By.cssSelector("option:nth-child(3)"));
		searchWithinSummary.click();
	}

	public void clickOnSearchWithinContent() {
		WebElement searchWithinContent = getDriver().findElement(
				By.cssSelector("option:nth-child(4)"));
		searchWithinContent.click();
	}

	public void clickOnSearchWithinCategories() {
		WebElement searchWithinCategories = getDriver().findElement(
				By.cssSelector("option:nth-child(5)"));
		searchWithinCategories.click();
	}

	public void clickOnSearchBtn() {
		WebElement searchBtn = getDriver().findElement(
				By.cssSelector(".col.col-2>button"));
		searchBtn.click();
	}

	public void clickOnAddArticleToCollection() {
		WebElement addArticleToCollection = getDriver().findElement(
				By.cssSelector(".button.add-to-my-book"));
		addArticleToCollection.click();
	}

	public void clickOnBackToResultsBtn() {
		WebElement backToResultsBtn = getDriver().findElement(
				By.cssSelector(".button.back-to-summary"));
		backToResultsBtn.click();
	}

	public void clickOnAddArticle() {
		WebElement addArticle = getDriver()
				.findElement(
						By.cssSelector("div.content-container > div:nth-child(3) > div > div > ul > li:nth-child(2) > a"));
		addArticle.click();
		addArticle.click();
		waitABit(2000);
	}

	public void clickOnMyCollectionContainer() {
		WebElement myCollectionContainer = getDriver().findElement(
				By.cssSelector(".module.module-my-book"));
		myCollectionContainer.click();
	}

	public void clickOnCloseMyCollection() {
		WebElement closeMyCollection = getDriver().findElement(
				By.cssSelector(".close"));
		closeMyCollection.click();
	}

	public void clickOnArticleTitleFromMyCollection() {
		WebElement articleTitleFromMyCollection = getDriver().findElement(
				By.cssSelector(".title"));
		articleTitleFromMyCollection.click();
	}

	public void clickOnRemoveArticleFromMyCollection() {
		WebElement removeArticleFromMyCollection = getDriver().findElement(
				By.cssSelector(".remove>a"));
		removeArticleFromMyCollection.click();
	}

	public void clickOnMoveUpArticle() {
		WebElement moveUpArticle = getDriver().findElement(
				By.cssSelector(".move.up>a"));
		moveUpArticle.click();
	}

	public void clickOnMoveDownArticle() {
		WebElement moveDownArticle = getDriver().findElement(
				By.cssSelector(".move.down>a"));
		moveDownArticle.click();
	}

	public void clickOnFormatPDF() {
		WebElement formatPDF = getDriver().findElement(
				By.cssSelector("input[id='format-1']"));
		formatPDF.click();
	}

	public void clickOnFormatKindle() {
		WebElement formatKindle = getDriver().findElement(
				By.cssSelector("input[id='format-2']"));
		formatKindle.click();
	}

	public void clickOnFormatEPUB() {
		WebElement formatEPUB = getDriver().findElement(
				By.cssSelector("input[id='format-3']"));
		formatEPUB.click();
	}

	public void clickOnFormatMobi() {
		WebElement formatMobi = getDriver().findElement(
				By.cssSelector("input[id='format-4']"));
		formatMobi.click();
	}

	public void inputPublicationTitle(String setPublicationTitle) {
		WebElement publicationTitle = getDriver().findElement(
				By.cssSelector("input[id='publicationTitle']"));
		publicationTitle.sendKeys(setPublicationTitle);
	}

	public void clickOnGeneratePublicationBtn() {
		WebElement generatePublicationBtn = getDriver().findElement(
				By.cssSelector("button.generate"));
		generatePublicationBtn.click();
	}
}
