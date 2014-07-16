package IDHPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhSelectedPage extends AbstractPage {

	public IdhSelectedPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnDownloadIDMLButton() {
		WebElement downloadIDMLButton = getDriver().findElement(
				By.cssSelector("a[href*='DownloadIDML']"));
		$(downloadIDMLButton).waitUntilVisible();
		downloadIDMLButton.click();
	}

	public void clickOnDeleteIDMLButton() {
		WebElement deleteIDMLButton = getDriver().findElement(
				By.cssSelector(".Red"));
		$(deleteIDMLButton).waitUntilVisible();
		deleteIDMLButton.click();
	}

	public void clickOnAddToBookDropDown() {
		WebElement addToBookDropDown = getDriver().findElement(
				By.cssSelector("select[name='WhichBook']"));
		$(addToBookDropDown).waitUntilVisible();
		addToBookDropDown.click();
	}

	public void clickOnUpdateButton() {
		WebElement updateButton = getDriver().findElement(
				By.cssSelector("input[value='Update']"));
		$(updateButton).waitUntilVisible();
		updateButton.click();
	}

	public void clickOnViewXMLReportLink() {
		WebElement viewXMLReportLink = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > div:nth-child(3) > table > tbody > tr > td:nth-child(1) > div:nth-child(1) > div:nth-child(2) > b:nth-child(1) > a"));
		$(viewXMLReportLink).waitUntilVisible();
		viewXMLReportLink.click();
	}

	public void clickOnHTMLReportLink() {
		WebElement HTMLReportLink = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > div:nth-child(3) > table > tbody > tr > td:nth-child(1) > div:nth-child(1) > div:nth-child(2) > b:nth-child(2) > a"));
		$(HTMLReportLink).waitUntilVisible();
		HTMLReportLink.click();
	}

	public void clickOnDownloadReport() {
		WebElement downloadReport = getDriver().findElement(
				By.cssSelector("a[href*='DownloadXML']"));
		$(downloadReport).waitUntilVisible();
		downloadReport.click();
	}

	public void clickOnViewHTMLLink() {
		WebElement viewHTMLLink = getDriver().findElement(
				By.cssSelector("a[href*='ViewFile']"));
		$(viewHTMLLink).waitUntilVisible();
		viewHTMLLink.click();
	}

	public void clickOnDownloadHTMLLink() {
		WebElement downloadHTMLLink = getDriver().findElement(
				By.cssSelector("a[href*='DownloadHTML.']"));
		$(downloadHTMLLink).waitUntilVisible();
		downloadHTMLLink.click();
	}

	public void clickOnViewXMLLink() {
		WebElement viewXMLLink = getDriver().findElement(
				By.cssSelector("a[href*='ViewXMLFile.']"));
		$(viewXMLLink).waitUntilVisible();
		viewXMLLink.click();
	}

	public void clickOnDownloadXMLLink() {
		WebElement downloadXMLLink = getDriver().findElement(
				By.cssSelector("a[href*='idml.xml']"));
		$(downloadXMLLink).waitUntilVisible();
		downloadXMLLink.click();
	}

	public void clickOnViewCSSLink() {
		WebElement viewCSSLink = getDriver().findElement(
				By.cssSelector("a[href*='ViewCSSFile']"));
		$(viewCSSLink).waitUntilVisible();
		viewCSSLink.click();
	}

	public void clickOnDownloadCSSLink() {
		WebElement downloadCSSLink = getDriver().findElement(
				By.cssSelector("a[href*='idml.css']"));
		$(downloadCSSLink).waitUntilVisible();
		downloadCSSLink.click();
	}

	public void inputBookIDCreateEPUBField(String id) {
		WebElement bookIDCreateEPUBField = getDriver().findElement(
				By.cssSelector("input[name='ID']"));
		$(bookIDCreateEPUBField).waitUntilVisible();
		bookIDCreateEPUBField.clear();
		bookIDCreateEPUBField.sendKeys(id);
	}

	public void inputTitleCreateEPUBField(String epubTitle) {
		WebElement titleCreateEPUBField = getDriver().findElement(
				By.cssSelector("input[name='DocumentTitle']"));
		$(titleCreateEPUBField).waitUntilVisible();
		titleCreateEPUBField.clear();
		titleCreateEPUBField.sendKeys(epubTitle);
	}

	public void inputOnAuthorCreateEPUBField(String author) {
		WebElement authorCreateEPUBField = getDriver().findElement(
				By.cssSelector("input[name='AuthorName']"));
		$(authorCreateEPUBField).waitUntilVisible();
		authorCreateEPUBField.clear();
		authorCreateEPUBField.sendKeys(author);
	}

	public void clickOnPublisherCreateEPUBField() {
		WebElement publisherCreateEPUBField = getDriver().findElement(
				By.cssSelector("input[name='Publisher']"));
		$(publisherCreateEPUBField).waitUntilVisible();
		publisherCreateEPUBField.clear();
		publisherCreateEPUBField.click();
	}

	public void inputOnPublishDateCreateEPUBField(String publisher) {
		WebElement publishDateCreateEPUBField = getDriver().findElement(
				By.cssSelector("input[name='PublishDate']"));
		$(publishDateCreateEPUBField).waitUntilVisible();
		publishDateCreateEPUBField.clear();
		publishDateCreateEPUBField.sendKeys(publisher);
	}

	public void inputOnUpdateDateCreateEPUBField(String publishDate) {
		WebElement updateDateCreateEPUBField = getDriver().findElement(
				By.cssSelector("input[name='UpdateDate']"));
		$(updateDateCreateEPUBField).waitUntilVisible();
		updateDateCreateEPUBField.clear();
		updateDateCreateEPUBField.sendKeys(publishDate);
	}

	public void inputOnUpdateMetadataButton(String updateDate) {
		WebElement updateMetadataButton = getDriver().findElement(
				By.cssSelector("input[value='Update Metadata']"));
		$(updateMetadataButton).waitUntilVisible();
		updateMetadataButton.clear();
		updateMetadataButton.sendKeys(updateDate);
	}

	public void inputTocEntryField(String toc) {
		WebElement tocEntryField = getDriver()
				.findElement(
						By.cssSelector("div.IndentedSubPanel > table > tbody >tr > td > div > form >  input[name='ReplacementHeading']"));
		$(tocEntryField).waitUntilVisible();
		tocEntryField.clear();
		tocEntryField.sendKeys(toc);
	}

	public void clickOnUpdateTocEntryButton() {
		WebElement updateTocEntryButton = getDriver()
				.findElement(
						By.cssSelector("div.IndentedSubPanel > table > tbody >tr > td > div > form >  input[value='Update']"));
		$(updateTocEntryButton).waitUntilVisible();
		updateTocEntryButton.click();
	}

	public void clickOnDownloadEPUBLink() {
		WebElement downloadEPUBLink = getDriver().findElement(
				By.cssSelector("a[href*='DownloadEPub']"));
		$(downloadEPUBLink).waitUntilVisible();
		downloadEPUBLink.click();
	}

	public void clickOnShowParagraphStylesLink() {
		WebElement showParagraphStylesLink = getDriver().findElement(
				By.cssSelector("div[onclick*='Paragraph Styles']"));
		$(showParagraphStylesLink).waitUntilVisible();
		showParagraphStylesLink.click();
	}

	public void clickOnShowCharacterStylesLink() {
		WebElement showCharacterStylesLink = getDriver().findElement(
				By.cssSelector("div[onclick*='Character Styles']"));
		$(showCharacterStylesLink).waitUntilVisible();
		showCharacterStylesLink.click();
	}

	public void clickOnReportSummary() {
		WebElement reportSummary = getDriver().findElement(
				By.cssSelector("a[href*='ReportSummaryPanel']"));
		$(reportSummary).waitUntilVisible();
		reportSummary.click();
	}

	public void clickOnDebugging() {
		WebElement debugging = getDriver().findElement(
				By.cssSelector("DebuggingPanel"));
		$(debugging).waitUntilVisible();
		debugging.click();
	}
}
