package IDHPages;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class idhSelectedPage extends AbstractPage {

	public idhSelectedPage(WebDriver driver) {
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

	@FindBy(css = "")
	WebElement viewHTMLLink;

	@FindBy(css = "")
	WebElement downloadHTMLLink;

	@FindBy(css = "")
	WebElement viewXMLLink;

	@FindBy(css = "")
	WebElement downloadXMLLink;

	@FindBy(css = "")
	WebElement viewCSSLink;

	@FindBy(css = "")
	WebElement downloadCSSLink;

	@FindBy(css = "")
	WebElement bookIDCreateEPUBField;

	@FindBy(css = "")
	WebElement titleCreateEPUBField;

	@FindBy(css = "")
	WebElement authorCreateEPUBField;

	@FindBy(css = "")
	WebElement publisherCreateEPUBField;

	@FindBy(css = "")
	WebElement publishDateCreateEPUBField;

	@FindBy(css = "")
	WebElement updateDateCreateEPUBField;

	@FindBy(css = "")
	WebElement updateMetadataButton;

	@FindBy(css = "")
	WebElement tocEntryField;

	@FindBy(css = "")
	WebElement updateTocEntryButton;

	@FindBy(css = "")
	WebElement downloadEPUBLink;

	@FindBy(css = "")
	WebElement showParagraphStylesLink;

	@FindBy(css = "")
	WebElement showCharacterStylesLink;

	@FindBy(css = "")
	WebElement reportSummary;

	@FindBy(css = "")
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
