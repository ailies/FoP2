package IDHPages;

import net.thucydides.core.annotations.findby.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhConfigurePage extends AbstractPage {

	public IdhConfigurePage(WebDriver driver) {
		super(driver);
	}

	public void insertProductName(String pName) {
		WebElement productNameField = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(3) > div.IndentedSubPanel > div > input[type='text']"));
		$(productNameField).waitUntilVisible();
		productNameField.clear();
		productNameField.sendKeys(pName);
	}

	public void insertAdministratorName(String adminName) {
		WebElement administratorNameField = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(4) > div.IndentedSubPanel > div:nth-child(1) > input[type='text']"));
		$(administratorNameField).waitUntilVisible();
		administratorNameField.clear();
		administratorNameField.sendKeys(adminName);
	}

	public void insertEmailAddressName(String emailAddressName) {
		WebElement emailAddressField = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(4) > div.IndentedSubPanel > div:nth-child(2) > input[type='text']"));
		$(emailAddressField).waitUntilVisible();
		emailAddressField.clear();
		emailAddressField.sendKeys(emailAddressName);
	}

	public void inputHomePageMessage(String message) {
		WebElement homePageMessage = getDriver()
				.findElement(
						By.cssSelector(".cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders"));
		getDriver().switchTo().frame(
				getDriver().findElement(By.id("mlSearchArticleIframe")));
		WebElement searchIframe = getDriver().switchTo().activeElement();
		$(searchIframe).waitUntilVisible();
		searchIframe.click();
		$(homePageMessage).waitUntilVisible();
		homePageMessage.clear();
		homePageMessage.sendKeys(message);
	}

	public void clickOnNeverDeleteOldFiles() {
		WebElement neverDeleteOldFiles = getDriver().findElement(
				By.cssSelector("input[value='Never']"));
		$(neverDeleteOldFiles).waitUntilVisible();
		neverDeleteOldFiles.click();
	}

	public void clickOnMonthlyDeleteOldFiles() {
		WebElement monthlyDeleteOldFiles = getDriver().findElement(
				By.cssSelector("input[value='Monthly']"));
		$(monthlyDeleteOldFiles).waitUntilVisible();
		monthlyDeleteOldFiles.click();
	}

	public void clickOnDailyDeleteOldFiles() {
		WebElement dailyDeleteOldFiles = getDriver().findElement(
				By.cssSelector("input[value='Daily']"));
		$(dailyDeleteOldFiles).waitUntilVisible();
		dailyDeleteOldFiles.click();
	}

	public void clickOnHourlyDeleteOldFiles() {
		WebElement hourlyDeleteOldFiles = getDriver().findElement(
				By.cssSelector("input[value='Hourly']"));
		$(hourlyDeleteOldFiles).waitUntilVisible();
		hourlyDeleteOldFiles.click();
	}

	public void inputImportPath(String importP) {
		WebElement importPath = getDriver().findElement(
				By.cssSelector("input[name='Import']"));
		$(importPath).waitUntilVisible();
		importPath.clear();
		importPath.sendKeys(importP);
	}

	public void inputExportPath(String exportP) {
		WebElement exportPath = getDriver().findElement(
				By.cssSelector("input[name='Export']"));
		$(exportPath).waitUntilVisible();
		exportPath.clear();
		exportPath.sendKeys(exportP);
	}

	public void clickOnCreateWatchedPathsLink() {
		WebElement createWatchedPathsLink = getDriver().findElement(
				By.cssSelector(""));
		$(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void inputWatchedFolderPath(String watchedP) {
		WebElement watchedFolderPath = getDriver().findElement(
				By.cssSelector("input[name='Watched']"));
		$(watchedFolderPath).waitUntilVisible();
		watchedFolderPath.sendKeys(watchedP);
	}

	public void inputOutPath(String outP) {
		WebElement outPath = getDriver().findElement(
				By.cssSelector("input[name='WatchedExport']"));
		$(outPath).waitUntilVisible();
		outPath.sendKeys(outP);
	}

	public void clickOnIncludeRadioButton() {
		WebElement includeRadioButton = getDriver().findElement(
				By.cssSelector(""));
		$(includeRadioButton).waitUntilVisible();
		includeRadioButton.click();
	}

	public void clickOnExcludeRadioButton() {
		WebElement excludeRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(9) > div.IndentedSubPanel > div:nth-child(3) > input:nth-child(4)"));
		$(excludeRadioButton).waitUntilVisible();
		excludeRadioButton.click();
	}

	public void clickOnSpreadRadioButton() {
		WebElement spreadRadioButton = getDriver().findElement(
				By.cssSelector("input[value='Spread']"));
		$(spreadRadioButton).waitUntilVisible();
		spreadRadioButton.click();
	}

	public void clickOnPageRadioButton() {
		WebElement pageRadioButton = getDriver().findElement(
				By.cssSelector("input[value='Page']"));
		$(pageRadioButton).waitUntilVisible();
		pageRadioButton.click();
	}

	public void clickOnPixelsSizeRadioButton() {
		WebElement pixelsSizeRadioButton = getDriver().findElement(
				By.cssSelector("input[value='Fixed']"));
		$(pixelsSizeRadioButton).waitUntilVisible();
		pixelsSizeRadioButton.click();
	}

	public void clickOnPercentageSizeRadioButton() {
		WebElement percentageSizeRadioButton = getDriver().findElement(
				By.cssSelector("percentageSizeRadioButton"));
		$(percentageSizeRadioButton).waitUntilVisible();
		percentageSizeRadioButton.click();
	}

	public void clickOnDoublePixelsSizeRadioButton() {
		WebElement doublePixelsSizeRadioButton = getDriver().findElement(
				By.cssSelector("input[value='DoubleFixed'"));
		$(doublePixelsSizeRadioButton).waitUntilVisible();
		doublePixelsSizeRadioButton.click();
	}

	public void clickOnIncludeImagesRadioButton() {
		WebElement includeImagesRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(9) > div.IndentedSubPanel > div:nth-child(15) > input:nth-child(2)"));
		$(includeImagesRadioButton).waitUntilVisible();
		includeImagesRadioButton.click();
	}

	public void clickOnExcludeImagesRadioButton() {
		WebElement excludeImagesRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(9) > div.IndentedSubPanel > div:nth-child(15) > input:nth-child(4)"));
		$(excludeImagesRadioButton).waitUntilVisible();
		excludeImagesRadioButton.click();
	}

	public void clickOnSingleDocumentEPubYESRadioButton() {
		WebElement singleDocumentEPubYESRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(10) > div.IndentedSubPanel > div:nth-child(1) > div:nth-child(3) > input:nth-child(2)"));
		$(singleDocumentEPubYESRadioButton).waitUntilVisible();
		singleDocumentEPubYESRadioButton.click();
	}

	public void clickOnSingleDocumentEPubNORadioButton() {
		WebElement singleDocumentEPubNORadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(10) > div.IndentedSubPanel > div:nth-child(1) > div:nth-child(3) > input:nth-child(4)"));
		$(singleDocumentEPubNORadioButton).waitUntilVisible();
		singleDocumentEPubNORadioButton.click();
	}

	public void clickOnImageOnlyRadioButton() {
		WebElement imageOnlyRadioButton = getDriver().findElement(
				By.cssSelector("input[value='NoText']"));
		$(imageOnlyRadioButton).waitUntilVisible();
		imageOnlyRadioButton.click();
	}

	public void clickOnIncludeTextRadioButton() {
		WebElement includeTextRadioButton = getDriver().findElement(
				By.cssSelector("input[value='Text']"));
		$(includeTextRadioButton).waitUntilVisible();
		includeTextRadioButton.click();
	}

	public void clickOnIncludeTinyTextRadioButton() {
		WebElement includeTinyTextRadioButton = getDriver().findElement(
				By.cssSelector("input[value='TinyText']"));
		$(includeTinyTextRadioButton).waitUntilVisible();
		includeTinyTextRadioButton.click();
	}

	public void inputPixelsPerInchField(String pixels) {
		WebElement pixelsPerInchField = getDriver().findElement(
				By.cssSelector("input[name='EPUBBResolutionSetting']"));
		$(pixelsPerInchField).waitUntilVisible();
		pixelsPerInchField.clear();
		pixelsPerInchField.sendKeys(pixels);
	}

	public void inputPublisherNameField(String publisher) {
		WebElement publisherNameField = getDriver().findElement(
				By.cssSelector("input[name='OrgName']"));
		$(publisherNameField).waitUntilVisible();
		publisherNameField.clear();
		publisherNameField.sendKeys(publisher);
	}

	public void inputAuthorNameField(String author) {
		WebElement authorNameField = getDriver().findElement(
				By.cssSelector("input[name='AuthorName']"));
		$(authorNameField).waitUntilVisible();
		authorNameField.clear();
		authorNameField.sendKeys(author);
	}

	public void clickOnExtractXMLRadioButton() {
		WebElement extractXMLRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(1) > div:nth-child(2) > input:nth-child(2)"));
		$(extractXMLRadioButton).waitUntilVisible();
		extractXMLRadioButton.clear();
		extractXMLRadioButton.click();
	}

	public void clickOnIgnoreXMLRadioButton() {
		WebElement ignoreXMLRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(1) > div:nth-child(2) > input:nth-child(4)"));
		$(ignoreXMLRadioButton).waitUntilVisible();
		ignoreXMLRadioButton.click();
	}

	public void clickOnDocumentMetadataSuppressMetadataRadioButton() {
		WebElement documentMetadataSuppressMetadataRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(3) > input:nth-child(2)"));
		$(documentMetadataSuppressMetadataRadioButton).waitUntilVisible();
		documentMetadataSuppressMetadataRadioButton.click();
	}

	public void clickOnDocumentMetadataCommentsRadioButton() {
		WebElement documentMetadataCommentsRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(3) > input:nth-child(4)"));
		$(documentMetadataCommentsRadioButton).waitUntilVisible();
		documentMetadataCommentsRadioButton.click();
	}

	public void clickOnDocumentMetadataProcessingInstructionsRadioButton() {
		WebElement documentMetadataProcessingInstructionsRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(3) > input:nth-child(6)"));
		$(documentMetadataProcessingInstructionsRadioButton).waitUntilVisible();
		documentMetadataProcessingInstructionsRadioButton.click();
	}

	public void clickOnDocumentMetadataOxygenAnnotationsRadioButton() {
		WebElement documentMetadataOxygenAnnotationsRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(3) > input:nth-child(8)"));
		$(documentMetadataOxygenAnnotationsRadioButton).waitUntilVisible();
		documentMetadataOxygenAnnotationsRadioButton.click();
	}

	public void clickOnNotesMetadataSuppressNotesRadioButton() {
		WebElement notesMetadataSuppressNotesRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(4) > input:nth-child(2)"));
		$(notesMetadataSuppressNotesRadioButton).waitUntilVisible();
		notesMetadataSuppressNotesRadioButton.click();
	}

	public void clickOnNotesMetadataCommentsRadioButton() {
		WebElement notesMetadataCommentsRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(4) > input:nth-child(4)"));
		$(notesMetadataCommentsRadioButton).waitUntilVisible();
		notesMetadataCommentsRadioButton.click();
	}

	public void clickOnNotesMetadataProcessingInstructionsRadioButton() {
		WebElement notesMetadataProcessingInstructionsRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(4) > input:nth-child(6)"));
		$(notesMetadataProcessingInstructionsRadioButton).waitUntilVisible();
		notesMetadataProcessingInstructionsRadioButton.click();
	}

	public void clickOnNotesMetadataOxygenAnnotationsRadioButton() {
		WebElement notesMetadataOxygenAnnotationsRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(4) > input:nth-child(8)"));
		$(notesMetadataOxygenAnnotationsRadioButton).waitUntilVisible();
		notesMetadataOxygenAnnotationsRadioButton.click();
	}

	public void clickOnIncludeFloatingImagesRadioButton() {
		WebElement includeFloatingImagesRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(7) > input:nth-child(2)"));
		$(includeFloatingImagesRadioButton).waitUntilVisible();
		includeFloatingImagesRadioButton.click();
	}

	public void clickOnExcludeFloatingImagesRadioButton() {
		WebElement excludeFloatingImagesRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(7) > input:nth-child(4)"));
		$(excludeFloatingImagesRadioButton).waitUntilVisible();
		excludeFloatingImagesRadioButton.click();
	}

	public void clickOnCreateElementsToRepresentUntaggedParagraphLevelAndInlineRangesYESRadioButton() {
		WebElement createElementsToRepresentUntaggedParagraphLevelAndInlineRangesYESRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(9) > div:nth-child(2) > input:nth-child(2)"));
		$(
				createElementsToRepresentUntaggedParagraphLevelAndInlineRangesYESRadioButton)
				.waitUntilVisible();
		createElementsToRepresentUntaggedParagraphLevelAndInlineRangesYESRadioButton
				.click();
	}

	public void clickOnCreateElementsToRepresentUntaggedParagraphLevelAndInlineRangesNORadioButton() {
		WebElement createElementsToRepresentUntaggedParagraphLevelAndInlineRangesNORadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(9) > div:nth-child(2) > input:nth-child(4)"));
		$(
				createElementsToRepresentUntaggedParagraphLevelAndInlineRangesNORadioButton)
				.waitUntilVisible();
		createElementsToRepresentUntaggedParagraphLevelAndInlineRangesNORadioButton
				.click();
	}

	public void clickOnMoveAnyNewlyCreatedInlineRangesYesRadioButton() {
		WebElement moveAnyNewlyCreatedInlineRangesYesRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(10) > div:nth-child(2) > input:nth-child(2)"));
		$(moveAnyNewlyCreatedInlineRangesYesRadioButton).waitUntilVisible();
		moveAnyNewlyCreatedInlineRangesYesRadioButton.click();
	}

	public void clickOnMoveAnyNewlyCreatedInlineRangesNoRadioButton() {
		WebElement moveAnyNewlyCreatedInlineRangesNoRadioButton = getDriver()
				.findElement(
						By.cssSelector("/html/body/div[1]/form/div[10]/div[3]/div[7]/div[2]/input[2]"));
		$(moveAnyNewlyCreatedInlineRangesNoRadioButton).waitUntilVisible();
		moveAnyNewlyCreatedInlineRangesNoRadioButton.click();
	}

	public void clickOnSplitAndJoinParagraphYESRadioButton() {
		WebElement splitAndJoinParagraphYESRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(12) > div:nth-child(2) > input:nth-child(2)"));
		$(splitAndJoinParagraphYESRadioButton).waitUntilVisible();
		splitAndJoinParagraphYESRadioButton.click();
	}

	public void clickOnSplitAndJoinParagraphNORadioButton() {
		WebElement splitAndJoinParagraphNORadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(12) > div:nth-child(2) > input:nth-child(4)"));
		$(splitAndJoinParagraphNORadioButton).waitUntilVisible();
		splitAndJoinParagraphNORadioButton.click();
	}

	public void clickOnMoveTextYESRadioButton() {
		WebElement moveTextYESRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(14) > div:nth-child(2) > input:nth-child(2)"));
		$(moveTextYESRadioButton).waitUntilVisible();
		moveTextYESRadioButton.click();
	}

	public void clickOnMoveTextNORadioButton() {
		WebElement moveTextNORadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(14) > div:nth-child(2) > input:nth-child(4)"));
		$(moveTextNORadioButton).waitUntilVisible();
		moveTextNORadioButton.click();
	}

	public void clickOnCreateIxxOrphanElementsYesRadioButton() {
		WebElement createIxxOrphanElementsYesRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(15) > div:nth-child(2) > input:nth-child(2)"));
		$(createIxxOrphanElementsYesRadioButton).waitUntilVisible();
		createIxxOrphanElementsYesRadioButton.click();
	}

	public void clickOnCreateIxxOrphanElementsNoRadioButton() {
		WebElement createIxxOrphanElementsNoRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(15) > div:nth-child(2) > input:nth-child(4)"));
		$(createIxxOrphanElementsNoRadioButton).waitUntilVisible();
		createIxxOrphanElementsNoRadioButton.click();
	}

	public void clickOnIncludeCSSStylesWithinElementsYesRadioButton() {
		WebElement includeCSSStylesWithinElementsYesRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(17) > div:nth-child(2) > input:nth-child(2)"));
		$(includeCSSStylesWithinElementsYesRadioButton).waitUntilVisible();
		includeCSSStylesWithinElementsYesRadioButton.click();
	}

	public void clickOnIncludeCSSStylesWithinElementsNoRadioButton() {
		WebElement includeCSSStylesWithinElementsNoRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(17) > div:nth-child(2) > input:nth-child(4)"));
		$(includeCSSStylesWithinElementsNoRadioButton).waitUntilVisible();
		includeCSSStylesWithinElementsNoRadioButton.click();
	}

	public void clickOnRepresentLineBreaksWithLineFeedRadioButton() {
		WebElement representLineBreaksWithLineFeedRadioButton = getDriver()
				.findElement(By.cssSelector("input[value='LineFeed']"));
		$(representLineBreaksWithLineFeedRadioButton).waitUntilVisible();
		representLineBreaksWithLineFeedRadioButton.click();
	}

	public void clickOnRepresentLineBreaksWithBreakTagRadioButton() {
		WebElement representLineBreaksWithBreakTagRadioButton = getDriver()
				.findElement(By.cssSelector("input[value='BreakTag']"));
		$(representLineBreaksWithBreakTagRadioButton).waitUntilVisible();
		representLineBreaksWithBreakTagRadioButton.click();
	}

	public void clickOnRepresentLineBreaksWithLineFeedAndBreakTagRadioButton() {
		WebElement representLineBreaksWithLineFeedAndBreakTagRadioButton = getDriver()
				.findElement(By.cssSelector("input[value='Both']"));
		$(representLineBreaksWithLineFeedAndBreakTagRadioButton)
				.waitUntilVisible();
		representLineBreaksWithLineFeedAndBreakTagRadioButton.click();
	}

	public void clickOnIncludeIdBasedCSSRulesRadioButton() {
		WebElement includeIdBasedCSSRulesRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(12) > div.IndentedSubPanel > div:nth-child(1) > div:nth-child(2) > input:nth-child(2)"));
		$(includeIdBasedCSSRulesRadioButton).waitUntilVisible();
		includeIdBasedCSSRulesRadioButton.click();
	}

	public void clickOnExcludeIdBasedCSSRulesRadioButton() {
		WebElement excludeIdBasedCSSRulesRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(12) > div.IndentedSubPanel > div:nth-child(1) > div:nth-child(2) > input:nth-child(4)"));
		$(excludeIdBasedCSSRulesRadioButton).waitUntilVisible();
		excludeIdBasedCSSRulesRadioButton.click();
	}

	public void clickOnIncludeClassBasedCSSRulesRadioButton() {
		WebElement includeClassBasedCSSRulesRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(12) > div.IndentedSubPanel > div:nth-child(3) > div:nth-child(2) > input:nth-child(2)"));
		$(includeClassBasedCSSRulesRadioButton).waitUntilVisible();
		includeClassBasedCSSRulesRadioButton.click();
	}

	public void clickOnExcludeClassBasedCSSRulesRadioButton() {
		WebElement excludeClassBasedCSSRulesRadioButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(12) > div.IndentedSubPanel > div:nth-child(3) > div:nth-child(2) > input:nth-child(4)"));
		$(excludeClassBasedCSSRulesRadioButton).waitUntilVisible();
		excludeClassBasedCSSRulesRadioButton.click();
	}

	public void clickOnImagesPathField() {
		WebElement imagesPathField = getDriver().findElement(
				By.cssSelector("input[name='ImagePath']"));
		$(imagesPathField).waitUntilVisible();
		imagesPathField.click();
	}

	public void clickOnremoteSystemUsernameField() {
		WebElement remoteSystemUsernameField = getDriver().findElement(
				By.cssSelector("input[name='WebServicesCallBackUserName']"));
		$(remoteSystemUsernameField).waitUntilVisible();
		remoteSystemUsernameField.click();
	}

	public void clickOnRemoteSystemPasswordField() {
		WebElement remoteSystemPasswordField = getDriver().findElement(
				By.cssSelector("input[name='WebServicesCallBackPassword']"));
		$(remoteSystemPasswordField).waitUntilVisible();
		remoteSystemPasswordField.click();
	}

	public void clickOnSendEmailYes() {
		WebElement sendEmailYes = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(14) > div:nth-child(3) > div > div:nth-child(2) > input:nth-child(2)"));
		$(sendEmailYes).waitUntilVisible();
		sendEmailYes.click();
	}

	public void clickOnSendEmailNo() {
		WebElement sendEmailNo = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(14) > div:nth-child(3) > div > div:nth-child(2) > input:nth-child(4)"));
		$(sendEmailNo).waitUntilVisible();
		sendEmailNo.click();
	}

	public void clickOnSaveChangesTopButton() {
		WebElement saveChangesTopButton = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(2) > div.Para > input[type='button']"));
		$(saveChangesTopButton).waitUntilVisible();
		saveChangesTopButton.click();
	}

	public void clickOnSaveChangesBottomBtn() {
		WebElement saveChangesBottomBtn = getDriver()
				.findElement(
						By.cssSelector("body > div.Screen > form > div:nth-child(15) > div.Para > input[type='button']"));
		$(saveChangesBottomBtn).waitUntilVisible();
		saveChangesBottomBtn.click();
	}

}
