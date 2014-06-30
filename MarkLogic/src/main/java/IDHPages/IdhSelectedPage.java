package IDHPages;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhSelectedPage extends AbstractPage {

	public IdhSelectedPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a[href*='DownloadIDML']")
	WebElement downloadIDMLButton;

	@FindBy(css = ".Red")
	WebElement deleteIDMLButton;

	@FindBy(css = "select[name='WhichBook']")
	WebElement addToBookDropDown;

	@FindBy(css = "input[value='Update']")
	WebElement updateButton;

	@FindBy(css = "body > div.Screen > div:nth-child(3) > table > tbody > tr > td:nth-child(1) > div:nth-child(1) > div:nth-child(2) > b:nth-child(1) > a")
	WebElement viewXMLReportLink;

	@FindBy(css = "body > div.Screen > div:nth-child(3) > table > tbody > tr > td:nth-child(1) > div:nth-child(1) > div:nth-child(2) > b:nth-child(2) > a")
	WebElement HTMLReportLink;

	@FindBy(css = "a[href*='DownloadXML']")
	WebElement downloadReport;

	@FindBy(css = "a[href*='ViewFile']")
	WebElement viewHTMLLink;

	@FindBy(css = "a[href*='DownloadHTML.']")
	WebElement downloadHTMLLink;

	@FindBy(css = "a[href*='ViewXMLFile.']")
	WebElement viewXMLLink;

	@FindBy(css = "a[href*='idml.xml']")
	WebElement downloadXMLLink;

	@FindBy(css = "a[href*='ViewCSSFile']")
	WebElement viewCSSLink;

	@FindBy(css = "a[href*='idml.css']")
	WebElement downloadCSSLink;

	@FindBy(css = "input[name='ID']")
	WebElement bookIDCreateEPUBField;

	@FindBy(css = "input[name='DocumentTitle']")
	WebElement titleCreateEPUBField;

	@FindBy(css = "input[name='AuthorName']")
	WebElement authorCreateEPUBField;

	@FindBy(css = "input[name='Publisher']")
	WebElement publisherCreateEPUBField;

	@FindBy(css = "input[name='PublishDate']")
	WebElement publishDateCreateEPUBField;

	@FindBy(css = "input[name='UpdateDate']")
	WebElement updateDateCreateEPUBField;

	@FindBy(css = "input[value='Update Metadata']")
	WebElement updateMetadataButton;

	@FindBy(css = "div.IndentedSubPanel > table > tbody >tr > td > div > form >  input[name='ReplacementHeading']")
	WebElement tocEntryField;

	@FindBy(css = "div.IndentedSubPanel > table > tbody >tr > td > div > form >  input[value='Update']")
	WebElement updateTocEntryButton;

	@FindBy(css = "a[href*='DownloadEPub']")
	WebElement downloadEPUBLink;

	@FindBy(css = "div[onclick*='Paragraph Styles']")
	WebElement showParagraphStylesLink;

	@FindBy(css = "div[onclick*='Character Styles']")
	WebElement showCharacterStylesLink;

	@FindBy(css = "a[href*='ReportSummaryPanel']")
	WebElement reportSummary;

	@FindBy(css = "DebuggingPanel")
	WebElement debugging;

	public void clickOnDownloadIDMLButton() {
		element(downloadIDMLButton).waitUntilVisible();
		downloadIDMLButton.click();
	}

	public void clickOnDeleteIDMLButton() {
		element(deleteIDMLButton).waitUntilVisible();
		deleteIDMLButton.click();
	}

	public void clickOnAddToBookDropDown() {
		element(addToBookDropDown).waitUntilVisible();
		addToBookDropDown.click();
	}

	public void clickOnUpdateButton() {
		element(updateButton).waitUntilVisible();
		updateButton.click();
	}

	public void clickOnViewXMLReportLink() {
		element(viewXMLReportLink).waitUntilVisible();
		viewXMLReportLink.click();
	}

	public void clickOnHTMLReportLink() {
		element(HTMLReportLink).waitUntilVisible();
		HTMLReportLink.click();
	}

	public void clickOnDownloadReport() {
		element(downloadReport).waitUntilVisible();
		downloadReport.click();
	}

	public void clickOnViewHTMLLink() {
		element(viewHTMLLink).waitUntilVisible();
		viewHTMLLink.click();
	}

	public void clickOnDownloadHTMLLink() {
		element(downloadHTMLLink).waitUntilVisible();
		downloadHTMLLink.click();
	}

	public void clickOnViewXMLLink() {
		element(viewXMLLink).waitUntilVisible();
		viewXMLLink.click();
	}

	public void clickOnDownloadXMLLink() {
		element(downloadXMLLink).waitUntilVisible();
		downloadXMLLink.click();
	}

	public void clickOnViewCSSLink() {
		element(viewCSSLink).waitUntilVisible();
		viewCSSLink.click();
	}

	public void clickOnDownloadCSSLink() {
		element(downloadCSSLink).waitUntilVisible();
		downloadCSSLink.click();
	}

	public void inputBookIDCreateEPUBField(String id) {
		element(bookIDCreateEPUBField).waitUntilVisible();
		bookIDCreateEPUBField.clear();
		bookIDCreateEPUBField.sendKeys(id);
	}

	public void inputTitleCreateEPUBField(String epubTitle) {
		element(titleCreateEPUBField).waitUntilVisible();
		titleCreateEPUBField.clear();
		titleCreateEPUBField.sendKeys(epubTitle);
	}

	public void inputOnAuthorCreateEPUBField(String author) {
		element(authorCreateEPUBField).waitUntilVisible();
		authorCreateEPUBField.clear();
		authorCreateEPUBField.sendKeys(author);
	}

	public void clickOnPublisherCreateEPUBField() {
		element(publisherCreateEPUBField).waitUntilVisible();
		publisherCreateEPUBField.clear();
		publisherCreateEPUBField.click();
	}

	public void inputOnPublishDateCreateEPUBField(String publisher) {
		element(publishDateCreateEPUBField).waitUntilVisible();
		publishDateCreateEPUBField.clear();
		publishDateCreateEPUBField.sendKeys(publisher);
	}

	public void inputOnUpdateDateCreateEPUBField(String publishDate) {
		element(updateDateCreateEPUBField).waitUntilVisible();
		updateDateCreateEPUBField.clear();
		updateDateCreateEPUBField.sendKeys(publishDate);
	}

	public void inputOnUpdateMetadataButton(String updateDate) {
		element(updateMetadataButton).waitUntilVisible();
		updateMetadataButton.clear();
		updateMetadataButton.sendKeys(updateDate);
	}

	public void inputTocEntryField(String toc) {
		element(tocEntryField).waitUntilVisible();
		tocEntryField.clear();
		tocEntryField.sendKeys(toc);
	}

	public void clickOnUpdateTocEntryButton() {
		element(updateTocEntryButton).waitUntilVisible();
		updateTocEntryButton.click();
	}

	public void clickOnDownloadEPUBLink() {
		element(downloadEPUBLink).waitUntilVisible();
		downloadEPUBLink.click();
	}

	public void clickOnShowParagraphStylesLink() {
		element(showParagraphStylesLink).waitUntilVisible();
		showParagraphStylesLink.click();
	}

	public void clickOnShowCharacterStylesLink() {
		element(showCharacterStylesLink).waitUntilVisible();
		showCharacterStylesLink.click();
	}

	public void clickOnReportSummary() {
		element(reportSummary).waitUntilVisible();
		reportSummary.click();
	}

	public void clickOnDebugging() {
		element(debugging).waitUntilVisible();
		debugging.click();
	}
}
