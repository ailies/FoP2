package AlfrescoPages;

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

	// ---------------------------------------

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-fileSelect-button-button")
	WebElement selectDropDown;

	@FindBy(css = ".selectDocuments")
	WebElement selectDocuments;

	@FindBy(css = ".selectFolders")
	WebElement selectFolders;

	@FindBy(css = ".selectAll")
	WebElement selectALL;

	@FindBy(css = ".selectInvert")
	WebElement selectInvertSelection;

	@FindBy(css = ".selectNone")
	WebElement selectNone;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createContent-button-button")
	WebElement createDropDown;

	@FindBy(css = ".folder-file")
	WebElement createFolder;

	@FindBy(css = ".text-file")
	WebElement createPlainText;

	@FindBy(css = ".html-file")
	WebElement createHTML;

	@FindBy(css = ".xml-file")
	WebElement createXML;

	@FindBy(css = "")
	WebElement createDocumentFromTemplate;

	@FindBy(css = ".yuimenu.yui-module.yui-overlay.yui-button-menu.yui-menu-button-menu.visible >.bd ul:nth-child(2) li:nth-child(2) a")
	WebElement createFolderFromTemplate;

	@FindBy(css = "span[title='']")
	WebElement createContentFolder;

	@FindBy(css = "#template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder_prop_cm_name")
	private WebElement contentFolderName;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder-form-submit-button")
	private WebElement saveContentFolderBtn;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-fileUpload-button-button")
	WebElement uploadOption;

	@FindBy(css = "#template_x002e_dnd-upload_x002e_documentlibrary_x0023_default-upload-button-button")
	WebElement selectFilesToUpload;

	@FindBy(css = "#template_x002e_dnd-upload_x002e_documentlibrary_x0023_default-cancelOk-button-button")
	WebElement cancelUpload;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-syncToCloud-button")
	WebElement syncToCloud;

	@FindBy(css = "input[id='username']")
	WebElement emailField;

	@FindBy(css = "input[id='password']")
	WebElement passwordField;

	@FindBy(css = "#alf-id111-authForm-button-ok-button")
	WebElement connectToCloudButton;

	@FindBy(css = "#alf-id111-authForm-button-cancel-button")
	WebElement cancelConnectionToCloudButton;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-selectedItems-button-button")
	WebElement selectedItemDropDown;

	@FindBy(css = ".onActionDownload")
	WebElement downloadAsZipSelectedItems;

	@FindBy(css = ".onActionCopyTo")
	WebElement copySelectedItems;

	@FindBy(css = ".onActionMoveTo")
	WebElement moveToSelectedItems;

	@FindBy(css = ".onActionAssignWorkflow")
	WebElement startWorkflowForSelectedItems;

	@FindBy(css = ".onActionDelete")
	WebElement deleteSelectedItems;

	@FindBy(css = ".onActionCloudSync")
	WebElement syncToCloudSelectedItems;

	@FindBy(css = ".onActionLinkTo")
	WebElement linkToSelectedItems;

	@FindBy(css = ".onActionAnnotate")
	WebElement annotationsForSelectedItems;

	@FindBy(css = ".onActionDeselectAll")
	WebElement deselectAllSelectedItems;

	public void clickOnSelectDropDown() {
		element(selectDropDown).waitUntilVisible();
		selectDropDown.click();
	}

	public void clickOnSelectDocuments() {
		element(selectDocuments).waitUntilVisible();
		selectDocuments.click();
	}

	public void clickOnSelectFolders() {
		element(selectFolders).waitUntilVisible();
		selectFolders.click();
	}

	public void clickOnSelectALL() {
		element(selectALL).waitUntilVisible();
		selectALL.click();
	}

	public void clickOnSelectInvertSelection() {
		element(selectInvertSelection).waitUntilVisible();
		selectInvertSelection.click();
	}

	public void clickOnSelectNone() {
		element(selectNone).waitUntilVisible();
		selectNone.click();
	}

	public void clickOnCreateDropDown() {
		element(createDropDown).waitUntilVisible();
		createDropDown.click();
	}

	public void clickOnCreateFolder() {
		element(createFolder).waitUntilVisible();
		createFolder.click();
	}

	public void clickOnCreatePlainText() {
		element(createPlainText).waitUntilVisible();
		createPlainText.click();
	}

	public void clickOnCreateHTML() {
		element(createHTML).waitUntilVisible();
		createHTML.click();
	}

	public void clickOnCreateXML() {
		element(createXML).waitUntilVisible();
		createXML.click();
	}

	public void clickOnCreateDocumentFromTemplate() {
		element(createDocumentFromTemplate).waitUntilVisible();
		createDocumentFromTemplate.click();
	}

	public void clickOnCreateFolderFromTemplate() {
		element(createFolderFromTemplate).waitUntilVisible();
		createFolderFromTemplate.click();
	}

	public void clickOnCreateContentFolder() {
		element(createContentFolder).waitUntilVisible();
		element(createContentFolder).click();
	}

	public void inputContentFolderName(String contentName) {
		element(contentFolderName).waitUntilVisible();
		contentFolderName.clear();
		contentFolderName.sendKeys(contentName);
	}

	public void clickOnSaveContentFolder() {
		element(saveContentFolderBtn).waitUntilVisible();
		saveContentFolderBtn.click();
	}

	public void clickOnUploadOption() {
		element(uploadOption).waitUntilVisible();
		uploadOption.click();
	}

	public void clickOnSelectFilesToUpload() {
		element(selectFilesToUpload).waitUntilVisible();
		selectFilesToUpload.click();
	}

	public void clickOnCancelUpload() {
		element(cancelUpload).waitUntilVisible();
		cancelUpload.click();
	}

	public void clickOnSyncToCloud() {
		element(syncToCloud).waitUntilVisible();
		syncToCloud.click();
	}

	public void inputEmail(String em) {
		element(emailField).waitUntilVisible();
		emailField.clear();
		emailField.sendKeys(em);
	}

	public void inputPassword(String ps) {
		element(passwordField).waitUntilVisible();
		passwordField.clear();
		passwordField.sendKeys(ps);
	}

	public void clickOnConnectToCloudButton() {
		element(connectToCloudButton).waitUntilVisible();
		connectToCloudButton.click();
	}

	public void clickOnCancelConnectionToCloudButton() {
		element(cancelConnectionToCloudButton).waitUntilVisible();
		cancelConnectionToCloudButton.click();
	}

	public void clickOnSelectedItemDropDown() {
		element(selectedItemDropDown).waitUntilVisible();
		selectedItemDropDown.click();
	}

	public void clickOnDownloadAsZipSelectedItems() {
		element(downloadAsZipSelectedItems).waitUntilVisible();
		downloadAsZipSelectedItems.click();
	}

	public void clickOnCopySelectedItems() {
		element(copySelectedItems).waitUntilVisible();
		copySelectedItems.click();
	}

	public void clickOnMoveToSelectedItems() {
		element(moveToSelectedItems).waitUntilVisible();
		moveToSelectedItems.click();
	}

	public void clickOnStartWorkflowForSelectedItems() {
		element(startWorkflowForSelectedItems).waitUntilVisible();
		startWorkflowForSelectedItems.click();
	}

	public void clickOnDeleteSelectedItems() {
		element(deleteSelectedItems).waitUntilVisible();
		deleteSelectedItems.click();
	}

	public void clickOnSyncToCloudSelectedItems() {
		element(syncToCloudSelectedItems).waitUntilVisible();
		syncToCloudSelectedItems.click();
	}

	public void clickOnLinkToSelectedItems() {
		element(linkToSelectedItems).waitUntilVisible();
		linkToSelectedItems.click();
	}

	public void clickOnAnnotationsForSelectedItems() {
		element(annotationsForSelectedItems).waitUntilVisible();
		annotationsForSelectedItems.click();
	}

	public void clickOnDeselectAllSelectedItems() {
		element(deselectAllSelectedItems).waitUntilVisible();
		deselectAllSelectedItems.click();
	}

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

	@FindBy(css = "a[title='Change Type']")
	private WebElement changeType;

	@FindBy(css = "#onActionAnnotate > a > span")
	private WebElement annotations;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-assembly-view-button-button")
	private WebElement assemblyView;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-sortAscending-button-button")
	private WebElement sortBtn;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-sortField-button-button")
	private WebElement sortFieldByName;

	@FindBy(css = "a[title='Name']")
	private WebElement sortByName;

	@FindBy(css = "a[title='Popularity']")
	private WebElement sortByPopularity;

	@FindBy(css = "a[title='Title']")
	private WebElement sortByTitle;

	@FindBy(css = "a[title='Description']")
	private WebElement sortByDescription;

	@FindBy(css = "a[title='Created']")
	private WebElement sortByCreated;

	@FindBy(css = "a[title='Creator']")
	private WebElement sortByCreator;

	@FindBy(css = "a[title='Modified']")
	private WebElement sortByModified;

	@FindBy(css = "a[title='Modifier']")
	private WebElement sortByModifier;

	@FindBy(css = "a[title='Size']")
	private WebElement sortBySize;

	@FindBy(css = "a[title='Mimetype']")
	private WebElement sortByMimetype;

	@FindBy(css = "a[title='Type']")
	private WebElement sortByType;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-options-button-button")
	private WebElement defaultOptionsBtn;

	@FindBy(css = ".hideFolders")
	private WebElement hideFolders;

	@FindBy(css = ".hidePath")
	private WebElement hideBreadCrumb;

	@FindBy(css = ".rss")
	private WebElement RSSFeed;

	@FindBy(css = ".fullWindow")
	private WebElement fullWindow;

	@FindBy(css = ".yuimenuitemlabel .fullScreen")
	private WebElement fullScreen;

	@FindBy(css = ".view.simple")
	private WebElement simpleView;

	@FindBy(css = ".view.detailed")
	private WebElement detailedView;

	@FindBy(css = ".view.gallery")
	private WebElement galleryView;

	@FindBy(css = ".view.gallery")
	private WebElement filmstripView;

	@FindBy(css = ".view.gallery")
	private WebElement tableView;

	@FindBy(css = ".view.gallery")
	private WebElement audioView;

	@FindBy(css = ".view.gallery")
	private WebElement mediaView;

	@FindBy(css = ".bottomscrollbar.bottomscrollbar_disabled")
	private WebElement bottomScrollBar;

	@FindBy(css = ".hd.topscrollbar")
	private WebElement topScrollBar;

	@FindBy(css = ".view.gallery")
	private WebElement DetailedViewAsDefaultForThisFolder;

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

	public void clickOnAnnotations() {
		element(annotations).waitUntilVisible();
		annotations.click();
	}

	public void clickOnAssemblyView() {
		element(assemblyView).waitUntilVisible();
		assemblyView.click();
	}

	public void clickOnSortBtn() {
		sortBtn.click();
	}

	public void clickOnSortFieldByName() {
		sortFieldByName.click();
	}

	public void clickOnSortByName() {
		sortByName.click();
	}

	public void clickOnSortByPopularity() {
		sortByPopularity.click();
	}

	public void clickOnSortByTitle() {
		sortByTitle.click();
	}

	public void clickOnSortByDescription() {
		sortByDescription.click();
	}

	public void clickOnSortByCreated() {
		sortByCreated.click();
	}

	public void clickOnSortByCreator() {
		sortByCreator.click();
	}

	public void clickOnSortByModified() {
		sortByModified.click();
	}

	public void clickOnSortByModifier() {
		sortByModifier.click();
	}

	public void clickOnSortBySize() {
		sortBySize.click();
	}

	public void clickOnSortByMimetype() {
		sortByMimetype.click();
	}

	public void clickOnSortByType() {
		sortByType.click();
	}

	public void clickOnDefaultOptionsBtn() {
		defaultOptionsBtn.click();
	}

	public void clickOnHideFolders() {
		hideFolders.click();
	}

	public void clickOnHideBreadcrumb() {
		hideBreadCrumb.click();
	}

	public void clickOnRSSFeed() {
		RSSFeed.click();
	}

	public void clickOnFullWindow() {
		fullWindow.click();
	}

	public void clickOnFullScreen() {
		fullScreen.click();
	}

	public void clickOnSimpleView() {
		simpleView.click();
	}

	public void clickOnDetailedView() {
		detailedView.click();
	}

	public void clickOnGalleryView() {
		galleryView.click();
	}

	public void clickOnFilmstripView() {
		filmstripView.click();
	}

	public void clickOnTableView() {
		tableView.click();
	}

	public void clickOnAudioView() {
		audioView.click();
	}

	public void clickOnMediaView() {
		mediaView.click();
	}

	public void clickOnDetailedViewAsDefaultForThisFolder() {
		DetailedViewAsDefaultForThisFolder.click();
	}

}