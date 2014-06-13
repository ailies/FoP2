/*package IDHPages;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class IdhConfigurePage extends AbstractPage {

	public IdhConfigurePage(WebDriver driver) {
		super(driver);
	}

	// product name
	@FindBy(css = "body > div.Screen > form > div:nth-child(3) > div.IndentedSubPanel > div > input[type='text']")
	WebElement productNameField;

	// admin details
	@FindBy(css = "body > div.Screen > form > div:nth-child(4) > div.IndentedSubPanel > div:nth-child(1) > input[type='text']")
	WebElement administratorNameField;

	@FindBy(css = "body > div.Screen > form > div:nth-child(4) > div.IndentedSubPanel > div:nth-child(2) > input[type='text']")
	WebElement emailAddressField;

	// Home Page Message
	@FindBy(css = ".cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders")
	WebElement homePageMessage;

	// Delete Old Files
	@FindBy(css = "input[value='Never']")
	WebElement neverDeleteOldFiles;

	@FindBy(css = "input[value='Monthly']")
	WebElement monthlyDeleteOldFiles;

	@FindBy(css = "input[value='Daily']")
	WebElement dailyDeleteOldFiles;

	@FindBy(css = "input[value='Hourly']")
	WebElement hourlyDeleteOldFiles;

	// In and Out Folders
	@FindBy(css = "input[name='Import']")
	WebElement importPath;

	@FindBy(css = "input[name='Export']")
	WebElement exportPath;

	public void inputImportPath(String importP) {
		element(importPath).waitUntilVisible();
		importPath.clear();
		importPath.sendKeys(importP);
	}

	public void inputExportPath(String exportP) {
		element(exportPath).waitUntilVisible();
		exportPath.clear();
		exportPath.sendKeys(exportP);
	}

	// Watched In and Out Folder Pairings
	@FindBy(css = "")
	WebElement createWatchedPathsLink;

	@FindBy(css = "input[name='Watched']")
	WebElement watchedFolderPath;

	@FindBy(css = "input[name='WatchedExport']")
	WebElement outPath;

	public void clickOnCreateWatchedPathsLink() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void inputWatchedFolderPath(String watchedP) {
		element(watchedFolderPath).waitUntilVisible();
		watchedFolderPath.sendKeys(watchedP);
	}

	public void inputOutPath(String outP) {
		element(outPath).waitUntilVisible();
		outPath.sendKeys(outP);
	}

	// HTML Output
	@FindBy(css = "body > div.Screen > form > div:nth-child(9) > div.IndentedSubPanel > div:nth-child(3) > input:nth-child(2)")
	WebElement includeRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(9) > div.IndentedSubPanel > div:nth-child(3) > input:nth-child(4)")
	WebElement excludeRadioButton;

	@FindBy(css = "input[value='Spread']")
	WebElement spreadRadioButton;

	@FindBy(css = "input[value='Page']")
	WebElement pageRadioButton;

	@FindBy(css = "input[value='Fixed']")
	WebElement pixelsSizeRadioButton;

	@FindBy(css = "input[value='Percent']")
	WebElement percentageSizeRadioButton;

	@FindBy(css = "input[value='DoubleFixed']")
	WebElement doublePixelsSizeRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(9) > div.IndentedSubPanel > div:nth-child(15) > input:nth-child(2)")
	WebElement includeImagesRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(9) > div.IndentedSubPanel > div:nth-child(15) > input:nth-child(4)")
	WebElement excludeImagesRadioButton;

	public void clickOnIncludeRadioButton() {
		element(includeRadioButton).waitUntilVisible();
		includeRadioButton.click();
	}

	public void clickOnExcludeRadioButton() {
		element(excludeRadioButton).waitUntilVisible();
		excludeRadioButton.click();
	}

	public void clickOnSpreadRadioButton() {
		element(spreadRadioButton).waitUntilVisible();
		spreadRadioButton.click();
	}

	public void clickOnPageRadioButton() {
		element(pageRadioButton).waitUntilVisible();
		pageRadioButton.click();
	}

	public void clickOnPixelsSizeRadioButton() {
		element(pixelsSizeRadioButton).waitUntilVisible();
		pixelsSizeRadioButton.click();
	}

	public void clickOnPercentageSizeRadioButton() {
		element(percentageSizeRadioButton).waitUntilVisible();
		percentageSizeRadioButton.click();
	}

	public void clickOnDoublePixelsSizeRadioButton() {
		element(doublePixelsSizeRadioButton).waitUntilVisible();
		doublePixelsSizeRadioButton.click();
	}

	public void clickOnIncludeImagesRadioButton() {
		element(includeImagesRadioButton).waitUntilVisible();
		includeImagesRadioButton.click();
	}

	public void clickOnExcludeImagesRadioButton() {
		element(excludeImagesRadioButton).waitUntilVisible();
		excludeImagesRadioButton.click();
	}

	// Image-Based ePub Output
	@FindBy(css = "body > div.Screen > form > div:nth-child(10) > div.IndentedSubPanel > div:nth-child(1) > div:nth-child(3) > input:nth-child(2)")
	WebElement singleDocumentEPubYESRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(10) > div.IndentedSubPanel > div:nth-child(1) > div:nth-child(3) > input:nth-child(4)")
	WebElement singleDocumentEPubNORadioButton;

	@FindBy(css = "input[value='NoText']")
	WebElement imageOnlyRadioButton;

	@FindBy(css = "input[value='Text']")
	WebElement includeTextRadioButton;

	@FindBy(css = "input[value='TinyText']")
	WebElement includeTinyTextRadioButton;

	@FindBy(css = "input[name='EPUBBResolutionSetting']")
	WebElement pixelsPerInchField;

	@FindBy(css = "input[name='OrgName']")
	WebElement publisherNameField;

	@FindBy(css = "input[name='AuthorName']")
	WebElement authorNameField;

	public void clickOnSingleDocumentEPubYESRadioButton() {
		element(singleDocumentEPubYESRadioButton).waitUntilVisible();
		singleDocumentEPubYESRadioButton.click();
	}

	public void clickOnSingleDocumentEPubNORadioButton() {
		element(singleDocumentEPubNORadioButton).waitUntilVisible();
		singleDocumentEPubNORadioButton.click();
	}

	public void clickOnImageOnlyRadioButton() {
		element(imageOnlyRadioButton).waitUntilVisible();
		imageOnlyRadioButton.click();
	}

	public void clickOnIncludeTextRadioButton() {
		element(includeTextRadioButton).waitUntilVisible();
		includeTextRadioButton.click();
	}

	public void clickOnIncludeTinyTextRadioButton() {
		element(includeTinyTextRadioButton).waitUntilVisible();
		includeTinyTextRadioButton.click();
	}

	public void inputPixelsPerInchField(String pixels) {
		element(pixelsPerInchField).waitUntilVisible();
		pixelsPerInchField.clear();
		pixelsPerInchField.sendKeys(pixels);
	}

	public void inputPublisherNameField(String publisher) {
		element(publisherNameField).waitUntilVisible();
		publisherNameField.clear();
		publisherNameField.sendKeys(publisher);
	}

	public void inputAuthorNameField(String author) {
		element(authorNameField).waitUntilVisible();
		authorNameField.clear();
		authorNameField.sendKeys(author);
	}

	// XML Output
	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(1) > div:nth-child(2) > input:nth-child(2)")
	WebElement extractXMLRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(1) > div:nth-child(2) > input:nth-child(4)")
	WebElement ignoreXMLRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(3) > input:nth-child(2)")
	WebElement documentMetadataSuppressMetadataRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(3) > input:nth-child(4)")
	WebElement documentMetadataCommentsRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(3) > input:nth-child(6)")
	WebElement documentMetadataProcessingInstructionsRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(3) > input:nth-child(8)")
	WebElement documentMetadataOxygenAnnotationsRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(4) > input:nth-child(2)")
	WebElement notesMetadataSuppressNotesRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(4) > input:nth-child(4)")
	WebElement notesMetadataCommentsRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(4) > input:nth-child(6)")
	WebElement notesMetadataProcessingInstructionsRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(4) > input:nth-child(8)")
	WebElement notesMetadataOxygenAnnotationsRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(7) > input:nth-child(2)")
	WebElement includeFloatingImagesRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(7) > input:nth-child(4)")
	WebElement excludeFloatingImagesRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(9) > div:nth-child(2) > input:nth-child(2)")
	WebElement createElementsToRepresentUntaggedParagraphLevelAndInlineRangesYESRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(9) > div:nth-child(2) > input:nth-child(4)")
	WebElement createElementsToRepresentUntaggedParagraphLevelAndInlineRangesNORadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(10) > div:nth-child(2) > input:nth-child(2)")
	WebElement moveAnyNewlyCreatedInlineRangesYesRadioButton;

	@FindBy(css = "/html/body/div[1]/form/div[10]/div[3]/div[7]/div[2]/input[2]")
	WebElement moveAnyNewlyCreatedInlineRangesNoRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(12) > div:nth-child(2) > input:nth-child(2)")
	WebElement splitAndJoinParagraphYESRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(12) > div:nth-child(2) > input:nth-child(4)")
	WebElement splitAndJoinParagraphNORadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(14) > div:nth-child(2) > input:nth-child(2)")
	WebElement moveTextYESRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(14) > div:nth-child(2) > input:nth-child(4)")
	WebElement moveTextNORadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(15) > div:nth-child(2) > input:nth-child(2)")
	WebElement createIxxOrphanElementsYesRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(15) > div:nth-child(2) > input:nth-child(4)")
	WebElement createIxxOrphanElementsNoRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(17) > div:nth-child(2) > input:nth-child(2)")
	WebElement includeCSSStylesWithinElementsYesRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(11) > div.IndentedSubPanel > div:nth-child(17) > div:nth-child(2) > input:nth-child(4)")
	WebElement includeCSSStylesWithinElementsNoRadioButton;

	@FindBy(css = "input[value='LineFeed']")
	WebElement representLineBreaksWithLineFeedRadioButton;

	@FindBy(css = "input[value='BreakTag']")
	WebElement representLineBreaksWithBreakTagRadioButton;

	@FindBy(css = "input[value='Both']")
	WebElement representLineBreaksWithLineFeedAndBreakTagRadioButton;
	
	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}
	
	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}
	
	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}
	
	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}
	
	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}
	
	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	// CSS Output
	@FindBy(css = "body > div.Screen > form > div:nth-child(12) > div.IndentedSubPanel > div:nth-child(1) > div:nth-child(2) > input:nth-child(2)")
	WebElement includeIdBasedCSSRulesRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(12) > div.IndentedSubPanel > div:nth-child(1) > div:nth-child(2) > input:nth-child(4)")
	WebElement excludeIdBasedCSSRulesRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(12) > div.IndentedSubPanel > div:nth-child(3) > div:nth-child(2) > input:nth-child(2)")
	WebElement includeClassBasedCSSRulesRadioButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(12) > div.IndentedSubPanel > div:nth-child(3) > div:nth-child(2) > input:nth-child(4)")
	WebElement excludeClassBasedCSSRulesRadioButton;
	
	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}
	
	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	// Images
	@FindBy(css = "input[name='ImagePath']")
	WebElement imagesPathField;
	
	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	// Web Services
	@FindBy(css = "input[name='WebServicesCallBackUserName']")
	WebElement remoteSystemUsernameField;

	@FindBy(css = "input[name='WebServicesCallBackPassword']")
	WebElement remoteSystemPasswordField;

	@FindBy(css = "body > div.Screen > form > div:nth-child(14) > div:nth-child(3) > div > div:nth-child(2) > input:nth-child(2)")
	WebElement sendEmailYes;

	@FindBy(css = "body > div.Screen > form > div:nth-child(14) > div:nth-child(3) > div > div:nth-child(2) > input:nth-child(4)")
	WebElement sendEmailNo;
	
	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}
	
	public void clickOn() {
		element(createWatchedPathsLink).waitUntilVisible();
		createWatchedPathsLink.click();
	}

	// Submit changes
	@FindBy(css = "body > div.Screen > form > div:nth-child(2) > div.Para > input[type='button']")
	WebElement saveChangesTopButton;

	@FindBy(css = "body > div.Screen > form > div:nth-child(15) > div.Para > input[type='button']")
	WebElement saveChangesBottomBtn;

	public void updateProductName(String product) {
		element(productNameField).waitUntilVisible();
		productNameField.clear();
		productNameField.sendKeys(product);
	}

	public void updateaAministratorName(String admin) {
		element(administratorNameField).waitUntilVisible();
		administratorNameField.clear();
		administratorNameField.sendKeys(admin);
	}

	public void updateEmailAddress(String email) {
		element(emailAddressField).waitUntilVisible();
		emailAddressField.clear();
		emailAddressField.sendKeys(email);
	}

	public void inputHomePageMessage(String message) {
		getDriver().switchTo().frame(
				getDriver().findElement(By.id("mlSearchArticleIframe")));
		WebElement searchIframe = getDriver().switchTo().activeElement();
		element(searchIframe).waitUntilVisible();
		searchIframe.click();
		element(homePageMessage).waitUntilVisible();
		homePageMessage.clear();
		homePageMessage.sendKeys(message);
	}

	public void checkMonthlyDeleteOldFilesRadioButton() {
		element(neverDeleteOldFiles).waitUntilVisible();
		neverDeleteOldFiles.click();
	}

	public void checkDailyDeleteOldFilesRadioButton() {
		element(monthlyDeleteOldFiles).waitUntilVisible();
		monthlyDeleteOldFiles.click();
	}

	public void checkHourlyDeleteOldFilesRadioButton() {
		element(dailyDeleteOldFiles).waitUntilVisible();
		dailyDeleteOldFiles.click();
	}

	public void checkNeverDeleteOldFilesRadioButton() {
		element(hourlyDeleteOldFiles).waitUntilVisible();
		hourlyDeleteOldFiles.click();
	}

}
*/