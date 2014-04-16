package com.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlfrescoActionsPage extends PageObject {

	public AlfrescoActionsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "div.action-set")
	private WebElement documentActionsContainer;

	@FindBy(css = "div[id*='default-actionSet']")
	private WebElement docActionsContainer;

	// -----------folder actions -------------
	@FindBy(css = "a[title='Download as Zip']")
	private WebElement downloadAsZip;

	@FindBy(css = "a[title='View Details]")
	private WebElement viewDetails;

	@FindBy(css = "a[title='Edit Properties']")
	private WebElement editProperties;

	@FindBy(css = "a[title='Copy to']")
	private WebElement copyTo;

	@FindBy(css = "a[title*='Move to']")
	private WebElement moveTo;

	@FindBy(css = "a[title='Link To']")
	private WebElement linkTo;

	@FindBy(css = "div.action-set")
	private WebElement manageRules;

	@FindBy(css = "div.action-set")
	private WebElement deleteFolder;

	@FindBy(css = "a[title='Manage Permissions']")
	private WebElement managePermissions;

	@FindBy(css = "div.action-set")
	private WebElement manageAspects;

	@FindBy(css = "div.action-set")
	private WebElement markLogicSearch;

	// --------------document actions -----------

	@FindBy(css = "a[title='Download']")
	private WebElement download;

	@FindBy(css = "a[title='Find Duplicates']")
	private WebElement findDuplicates;

	@FindBy(css = "a[title='View In Browser']")
	private WebElement viewInBrowser;

	@FindBy(css = "a[title='Upload New Version']")
	private WebElement uploadNewVersion;

	@FindBy(css = "a[title='Inline Edit']")
	private WebElement inlineEdit;

	@FindBy(css = "a[title='Edit Offline']")
	private WebElement editOffline;

	@FindBy(css = "a[title='Delete Document']")
	private WebElement deleteDocument;

	@FindBy(css = "a[title='Start Workflow']")
	private WebElement startWorkFlow;

	@FindBy(css = "a[title='Publish']")
	private WebElement publish;

	@FindBy(css = "a[title='Automatically Tag']")
	private WebElement automaticallyTag;

	@FindBy(css = "a[title='Submit to review']")
	private WebElement submitToReview;

	@FindBy(css = "a[title='Submit to publish']")
	private WebElement submitToPublish;

	// ------------folder methods--------------
	public void clickOnDownloadAsZip() {
		element(downloadAsZip).waitUntilVisible();
		downloadAsZip.click();
	}

	public void clickOnViewDetails() {
		element(viewDetails).waitUntilVisible();
		viewDetails.click();
	}

	public void clickOnEditProperties() {
		element(editProperties).waitUntilVisible();
		editProperties.click();
	}

	public void clickOnCopyTo() {
		element(copyTo).waitUntilVisible();
		copyTo.click();
	}

	public void clickOnMoveTo() {
		element(moveTo).waitUntilVisible();
		moveTo.click();
	}

	public void clickOnLinkTo() {
		element(linkTo).waitUntilVisible();
		linkTo.click();
	}

	public void clickOnManageRules() {
		element(manageRules).waitUntilVisible();
		manageRules.click();
	}

	public void clickOnDeleteFolder() {
		element(deleteFolder).waitUntilVisible();
		deleteFolder.click();
	}

	public void clickOnManagePermissions() {
		element(managePermissions).waitUntilVisible();
		managePermissions.click();
	}

	public void clickOnManageAspects() {
		element(manageAspects).waitUntilVisible();
		manageAspects.click();
	}

	public void clickOnMarkLogicSearch() {
		element(markLogicSearch).waitUntilVisible();
		markLogicSearch.click();
	}

	// ------------document methods-----------
	public void clickOnDownload() {
		element(download).waitUntilVisible();
		download.click();
	}

	public void clickOnFindeDuplicates() {
		element(findDuplicates).waitUntilVisible();
		findDuplicates.click();
	}

	public void clickOnViewInBrowser() {
		element(viewInBrowser).waitUntilVisible();
		viewInBrowser.click();
	}

	public void clickOnUploadNewVersion() {
		element(uploadNewVersion).waitUntilVisible();
		uploadNewVersion.click();
	}

	public void clickOnInlineEdit() {
		element(inlineEdit).waitUntilVisible();
		inlineEdit.click();
	}

	public void clickOnEditOffline() {
		element(editOffline).waitUntilVisible();
		editOffline.click();
	}

	public void clickOnDeleteDocument() {
		element(deleteDocument).waitUntilVisible();
		deleteDocument.click();
	}

	public void clickOnStartWorkFlow() {
		element(startWorkFlow).waitUntilVisible();
		startWorkFlow.click();
	}

	public void clickOnPublish() {
		element(publish).waitUntilVisible();
		publish.click();
	}

	public void clickOnAutomaticallyTag() {
		element(automaticallyTag).waitUntilVisible();
		automaticallyTag.click();
	}

	public void clickOnSubmitToReview() {
		element(submitToReview).waitUntilVisible();
		submitToReview.click();
	}

	public void clickOnSubmitToPublish() {
		element(submitToPublish).waitUntilVisible();
		submitToPublish.click();
	}
}