package AlfrescoPages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
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

	// ---------Documents Container Menu-------------

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

	@FindBy(css = ".yuimenuitemlabel .folder-file")
	WebElement createFolder;

	@FindBy(css = ".text-file")
	WebElement createPlainText;

	@FindBy(css = ".html-file")
	WebElement createHTML;

	@FindBy(css = ".xml-file")
	WebElement createXML;

	@FindBy(css = "")
	WebElement createDocumentFromTemplate;

	@FindBy(css = ".yuimenu.yui-module.yui-overlay.yui-button-menu.yui-menu-button-menu.visible >.bd ul:nth-child(2) > li:nth-child(2) > a")
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

	public void clickOnSelectDropDown() {
		WebElement selectDropDown = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-fileSelect-button-button"));
		$(selectDropDown).waitUntilVisible();
		selectDropDown.click();
	}

	public void clickOnSelectDocuments() {
		WebElement selectDocuments = getDriver().findElement(
				By.cssSelector(".selectDocuments"));
		$(selectDocuments).waitUntilVisible();
		selectDocuments.click();
	}

	public void clickOnSelectFolders() {
		WebElement selectFolders = getDriver().findElement(
				By.cssSelector(".selectFolders"));
		$(selectFolders).waitUntilVisible();
		selectFolders.click();
	}

	public void clickOnSelectALL() {
		WebElement selectALL = getDriver().findElement(
				By.cssSelector(".selectAll"));
		$(selectALL).waitUntilVisible();
		selectALL.click();
	}

	public void clickOnSelectInvertSelection() {
		WebElement selectInvertSelection = getDriver().findElement(
				By.cssSelector("selectInvert"));
		$(selectInvertSelection).waitUntilVisible();
		selectInvertSelection.click();
	}

	public void clickOnSelectNone() {
		WebElement selectNone = getDriver().findElement(
				By.cssSelector(".selectNone"));
		$(selectNone).waitUntilVisible();
		selectNone.click();
	}

	public void clickOnCreateDropDown() {
		WebElement createDropDown = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createContent-button-button"));
		$(createDropDown).waitUntilVisible();
		createDropDown.click();
	}

	public void clickOnCreateFolder() {
		WebElement createFolder = getDriver().findElement(
				By.cssSelector(".yuimenuitemlabel .folder-file"));
		$(createFolder).waitUntilVisible();
		createFolder.click();
	}

	public void clickOnCreatePlainText() {
		WebElement createPlainText = getDriver().findElement(
				By.cssSelector(".text-file"));
		$(createPlainText).waitUntilVisible();
		createPlainText.click();
	}

	public void clickOnCreateHTML() {
		WebElement createHTML = getDriver().findElement(
				By.cssSelector(".html-file"));
		$(createHTML).waitUntilVisible();
		createHTML.click();
	}

	public void clickOnCreateXML() {
		WebElement createXML = getDriver().findElement(
				By.cssSelector(".xml-file"));
		$(createXML).waitUntilVisible();
		createXML.click();
	}

	public void clickOnCreateDocumentFromTemplate() {
		WebElement createDropDown = getDriver().findElement(By.cssSelector(""));
		$(createDropDown).waitUntilVisible();
		createDropDown.click();
	}

	public void clickOnCreateFolderFromTemplate() {
		WebElement createFolderFromTemplate = getDriver()
				.findElement(
						By.cssSelector(".yuimenu.yui-module.yui-overlay.yui-button-menu.yui-menu-button-menu.visible >.bd ul:nth-child(2) > li:nth-child(2) > a"));
		$(createFolderFromTemplate).waitUntilVisible();
		createFolderFromTemplate.click();
	}

	public void clickOnCreateContentFolder() {
		WebElement createContentFolder = getDriver().findElement(
				By.cssSelector("span[title='']"));
		$(createContentFolder).waitUntilVisible();
		createContentFolder.click();
	}

	public void inputContentFolderName(String contentName) {
		WebElement contentFolderName = getDriver()
				.findElement(
						By.cssSelector("#template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder_prop_cm_name"));
		$(contentFolderName).waitUntilVisible();
		contentFolderName.clear();
		contentFolderName.sendKeys(contentName);
	}

	public void clickOnSaveContentFolder() {
		WebElement saveContentFolderBtn = getDriver()
				.findElement(
						By.cssSelector("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder-form-submit-button"));
		$(saveContentFolderBtn).waitUntilVisible();
		saveContentFolderBtn.click();
	}

	public void clickOnUploadOption() {
		WebElement uploadOption = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-fileUpload-button-button"));
		$(uploadOption).waitUntilVisible();
		uploadOption.click();
	}

	public void clickOnSelectFilesToUpload() {
		WebElement selectFilesToUpload = getDriver()
				.findElement(
						By.cssSelector("#template_x002e_dnd-upload_x002e_documentlibrary_x0023_default-upload-button-button"));
		$(selectFilesToUpload).waitUntilVisible();
		selectFilesToUpload.click();
	}

	public void clickOnCancelUpload() {
		WebElement cancelUpload = getDriver()
				.findElement(
						By.cssSelector("#template_x002e_dnd-upload_x002e_documentlibrary_x0023_default-cancelOk-button-button"));
		$(cancelUpload).waitUntilVisible();
		cancelUpload.click();
	}

	public void clickOnSyncToCloud() {
		WebElement syncToCloud = getDriver()
				.findElement(
						By.cssSelector("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-syncToCloud-button"));
		$(syncToCloud).waitUntilVisible();
		syncToCloud.click();
	}

	public void inputEmail(String em) {
		WebElement emailField = getDriver().findElement(
				By.cssSelector("input[id='username']"));
		$(emailField).waitUntilVisible();
		emailField.clear();
		emailField.sendKeys(em);
	}

	public void inputPassword(String ps) {
		WebElement passwordField = getDriver().findElement(
				By.cssSelector("input[id='password']"));
		$(passwordField).waitUntilVisible();
		passwordField.clear();
		passwordField.sendKeys(ps);
	}

	public void clickOnConnectToCloudButton() {
		WebElement connectToCloudButton = getDriver().findElement(
				By.cssSelector("#alf-id111-authForm-button-ok-button"));
		$(connectToCloudButton).waitUntilVisible();
		connectToCloudButton.click();
	}

	public void clickOnCancelConnectionToCloudButton() {
		WebElement cancelConnectionToCloudButton = getDriver().findElement(
				By.cssSelector("#alf-id111-authForm-button-cancel-button"));
		element(cancelConnectionToCloudButton).waitUntilVisible();
		cancelConnectionToCloudButton.click();
	}

	public void clickOnSelectedItemDropDown() {
		WebElement selectedItemDropDown = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-selectedItems-button-button"));
		element(selectedItemDropDown).waitUntilVisible();
		selectedItemDropDown.click();
	}

	public void clickOnDownloadAsZipSelectedItems() {
		WebElement downloadAsZipSelectedItems = getDriver().findElement(
				By.cssSelector(".onActionDownload"));
		$(downloadAsZipSelectedItems).waitUntilVisible();
		downloadAsZipSelectedItems.click();
	}

	public void clickOnCopySelectedItems() {
		WebElement copySelectedItems = getDriver().findElement(
				By.cssSelector(".onActionCopyTo"));
		$(copySelectedItems).waitUntilVisible();
		copySelectedItems.click();
	}

	public void clickOnMoveToSelectedItems() {
		WebElement moveToSelectedItems = getDriver().findElement(
				By.cssSelector("onActionMoveTo"));
		$(moveToSelectedItems).waitUntilVisible();
		moveToSelectedItems.click();
	}

	public void clickOnStartWorkflowForSelectedItems() {
		WebElement startWorkflowForSelectedItems = getDriver().findElement(
				By.cssSelector(".onActionAssignWorkflow"));
		$(startWorkflowForSelectedItems).waitUntilVisible();
		startWorkflowForSelectedItems.click();
	}

	public void clickOnDeleteSelectedItems() {
		WebElement deleteSelectedItems = getDriver().findElement(
				By.cssSelector(".onActionDelete"));
		$(deleteSelectedItems).waitUntilVisible();
		deleteSelectedItems.click();
	}

	public void clickOnSyncToCloudSelectedItems() {
		WebElement syncToCloudSelectedItems = getDriver().findElement(
				By.cssSelector(".onActionCloudSync"));
		$(syncToCloudSelectedItems).waitUntilVisible();
		syncToCloudSelectedItems.click();
	}

	public void clickOnLinkToSelectedItems() {
		WebElement linkToSelectedItems = getDriver().findElement(
				By.cssSelector(".onActionLinkTo"));
		$(linkToSelectedItems).waitUntilVisible();
		linkToSelectedItems.click();
	}

	public void clickOnAnnotationsForSelectedItems() {
		WebElement annotationsForSelectedItems = getDriver().findElement(
				By.cssSelector("annotationsForSelectedItems"));
		$(annotationsForSelectedItems).waitUntilVisible();
		annotationsForSelectedItems.click();
	}

	public void clickOnDeselectAllSelectedItems() {
		WebElement deselectAllSelectedItems = getDriver().findElement(
				By.cssSelector(".onActionDeselectAll"));
		$(deselectAllSelectedItems).waitUntilVisible();
		deselectAllSelectedItems.click();
	}

	// ------------folder methods--------------
	public void clickOnDownloadAsZip() {
		WebElement downloadAsZip = getDriver().findElement(
				By.cssSelector("a[title='Download as Zip']"));
		$(downloadAsZip).waitUntilVisible();
		downloadAsZip.click();
	}

	public void clickOnViewDetails() {
		WebElement viewDetails = getDriver().findElement(
				By.cssSelector("a[title='View Details]"));
		$(viewDetails).waitUntilVisible();
		viewDetails.click();
	}

	public void clickOnEditProperties() {
		WebElement editProperties = getDriver().findElement(
				By.cssSelector("a[title='Edit Properties']"));
		$(editProperties).waitUntilVisible();
		editProperties.click();
	}

	public void clickOnCopyTo() {
		WebElement copyTo = getDriver().findElement(
				By.cssSelector("a[title='Copy to']"));
		$(copyTo).waitUntilVisible();
		copyTo.click();
	}

	public void clickOnMoveTo() {
		WebElement moveTo = getDriver().findElement(
				By.cssSelector("a[title*='Move to']"));
		$(moveTo).waitUntilVisible();
		moveTo.click();
	}

	public void clickOnLinkTo() {
		WebElement linkTo = getDriver().findElement(
				By.cssSelector("a[title='Link To']"));
		$(linkTo).waitUntilVisible();
		linkTo.click();
	}

	public void clickOnManageRules() {
		WebElement manageRules = getDriver().findElement(
				By.cssSelector("div.action-set"));
		$(manageRules).waitUntilVisible();
		manageRules.click();
	}

	public void clickOnDeleteFolder() {
		WebElement deleteFolder = getDriver().findElement(
				By.cssSelector("div.action-set"));
		$(deleteFolder).waitUntilVisible();
		deleteFolder.click();
	}

	public void clickOnManagePermissions() {
		WebElement managePermissions = getDriver().findElement(
				By.cssSelector("a[title='Manage Permissions']"));
		$(managePermissions).waitUntilVisible();
		managePermissions.click();
	}

	public void clickOnManageAspects() {
		WebElement manageAspects = getDriver().findElement(
				By.cssSelector("div.action-set"));
		$(manageAspects).waitUntilVisible();
		manageAspects.click();
	}

	public void clickOnMarkLogicSearch() {
		WebElement markLogicSearch = getDriver().findElement(
				By.cssSelector("div.action-set"));
		$(markLogicSearch).waitUntilVisible();
		markLogicSearch.click();
	}

	// ------------document methods-----------
	public void clickOnDownload() {
		WebElement download = getDriver().findElement(
				By.cssSelector("a[title='Download']"));
		$(download).waitUntilVisible();
		download.click();
	}

	public void clickOnFindeDuplicates() {
		WebElement findDuplicates = getDriver().findElement(
				By.cssSelector("a[title='Find Duplicates']"));
		$(findDuplicates).waitUntilVisible();
		findDuplicates.click();
	}

	public void clickOnViewInBrowser() {
		WebElement viewInBrowser = getDriver().findElement(
				By.cssSelector("a[title='View In Browser']"));
		$(viewInBrowser).waitUntilVisible();
		viewInBrowser.click();
	}

	public void clickOnUploadNewVersion() {
		WebElement uploadNewVersion = getDriver().findElement(
				By.cssSelector("a[title='Upload New Version'"));
		$(uploadNewVersion).waitUntilVisible();
		uploadNewVersion.click();
	}

	public void clickOnInlineEdit() {
		WebElement inlineEdit = getDriver().findElement(
				By.cssSelector("a[title='Inline Edit']"));
		$(inlineEdit).waitUntilVisible();
		inlineEdit.click();
	}

	public void clickOnEditOffline() {
		WebElement editOffline = getDriver().findElement(
				By.cssSelector("a[title='Edit Offline']"));
		$(editOffline).waitUntilVisible();
		editOffline.click();
	}

	public void clickOnDeleteDocument() {
		WebElement deleteDocument = getDriver().findElement(
				By.cssSelector("a[title='Delete Document']"));
		$(deleteDocument).waitUntilVisible();
		deleteDocument.click();
	}

	public void clickOnStartWorkFlow() {
		WebElement startWorkFlow = getDriver().findElement(
				By.cssSelector("a[title='Start Workflow']"));
		$(startWorkFlow).waitUntilVisible();
		startWorkFlow.click();
	}

	public void clickOnPublish() {
		WebElement publish = getDriver().findElement(
				By.cssSelector("a[title='Publish']"));
		$(publish).waitUntilVisible();
		publish.click();
	}

	public void clickOnAutomaticallyTag() {
		WebElement automaticallyTag = getDriver().findElement(
				By.cssSelector("a[title='Automatically Tag']"));
		$(automaticallyTag).waitUntilVisible();
		automaticallyTag.click();
	}

	public void clickOnSubmitToReview() {
		WebElement submitToReview = getDriver().findElement(
				By.cssSelector("a[title='Submit to review']"));
		$(submitToReview).waitUntilVisible();
		submitToReview.click();
	}

	public void clickOnSubmitToPublish() {
		WebElement submitToPublish = getDriver().findElement(
				By.cssSelector("a[title='Submit to publish']"));
		element(submitToPublish).waitUntilVisible();
		submitToPublish.click();
	}

	public void clickOnAnnotations() {
		WebElement annotations = getDriver().findElement(
				By.cssSelector("#onActionAnnotate > a > span"));
		$(annotations).waitUntilVisible();
		annotations.click();
	}

	public void clickOnAssemblyView() {
		WebElement assemblyView = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-assembly-view-button-button"));
		$(assemblyView).waitUntilVisible();
		assemblyView.click();
	}

	public void clickOnSortBtn() {
		WebElement sortBtn = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-sortAscending-button-button"));
		sortBtn.click();
	}

	public void clickOnSortFieldByName() {
		WebElement sortFieldByName = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-sortField-button-button"));
		sortFieldByName.click();
	}

	public void clickOnSortByName() {
		WebElement sortByName = getDriver().findElement(
				By.cssSelector("a[title='Name']"));
		sortByName.click();
	}

	public void clickOnSortByPopularity() {
		WebElement sortByPopularity = getDriver().findElement(
				By.cssSelector("a[title='Popularity']"));
		sortByPopularity.click();
	}

	public void clickOnSortByTitle() {
		WebElement sortByTitle = getDriver().findElement(
				By.cssSelector("a[title='Title']"));
		sortByTitle.click();
	}

	public void clickOnSortByDescription() {
		WebElement sortByDescription = getDriver().findElement(
				By.cssSelector("a[title='Description']"));
		sortByDescription.click();
	}

	public void clickOnSortByCreated() {
		WebElement sortByCreated = getDriver().findElement(
				By.cssSelector("a[title='Created']"));
		sortByCreated.click();
	}

	public void clickOnSortByCreator() {
		WebElement sortByCreator = getDriver().findElement(
				By.cssSelector("a[title='Creator']"));
		sortByCreator.click();
	}

	public void clickOnSortByModified() {
		WebElement sortByModified = getDriver().findElement(
				By.cssSelector("a[title='Modified']"));
		sortByModified.click();
	}

	public void clickOnSortByModifier() {
		WebElement sortByModifier = getDriver().findElement(
				By.cssSelector("a[title='Modifier']"));
		sortByModifier.click();
	}

	public void clickOnSortBySize() {
		WebElement sortBySize = getDriver().findElement(
				By.cssSelector("a[title='Size']"));
		sortBySize.click();
	}

	public void clickOnSortByMimetype() {
		WebElement sortByMimetype = getDriver().findElement(
				By.cssSelector("a[title='Mimetype']"));
		sortByMimetype.click();
	}

	public void clickOnSortByType() {
		WebElement sortByType = getDriver().findElement(
				By.cssSelector("a[title='Type']"));
		sortByType.click();
	}

	public void clickOnDefaultOptionsBtn() {
		WebElement defaultOptionsBtn = getDriver()
				.findElement(
						By.id("template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-options-button-button"));
		defaultOptionsBtn.click();
	}

	public void clickOnHideFolders() {
		WebElement hideFolders = getDriver().findElement(
				By.cssSelector(".hideFolders"));
		hideFolders.click();
	}

	public void clickOnHideBreadcrumb() {
		WebElement hideBreadCrumb = getDriver().findElement(
				By.cssSelector(".hidePath"));
		hideBreadCrumb.click();
	}

	public void clickOnRSSFeed() {
		WebElement RSSFeed = getDriver().findElement(By.cssSelector(".rss"));
		RSSFeed.click();
	}

	public void clickOnFullWindow() {
		WebElement fullWindow = getDriver().findElement(
				By.cssSelector(".fullWindow"));
		fullWindow.click();
	}

	public void clickOnFullScreen() {
		WebElement fullScreen = getDriver().findElement(
				By.cssSelector(".yuimenuitemlabel .fullScreen"));
		fullScreen.click();
	}

	public void clickOnSimpleView() {
		WebElement simpleView = getDriver().findElement(
				By.cssSelector(".view.simple"));
		simpleView.click();
	}

	public void clickOnDetailedView() {
		WebElement detailedView = getDriver().findElement(
				By.cssSelector(".view.detailed"));
		detailedView.click();
	}

	public void clickOnGalleryView() {
		WebElement galleryView = getDriver().findElement(
				By.cssSelector(".view.gallery"));
		galleryView.click();
	}

	public void clickOnFilmstripView() {
		WebElement filmstripView = getDriver().findElement(
				By.cssSelector(".view.gallery"));
		filmstripView.click();
	}

	public void clickOnTableView() {
		WebElement tableView = getDriver().findElement(
				By.cssSelector(".view.gallery"));
		tableView.click();
	}

	public void clickOnAudioView() {
		WebElement audioView = getDriver().findElement(
				By.cssSelector(".view.gallery"));
		audioView.click();
	}

	public void clickOnMediaView() {
		WebElement mediaView = getDriver().findElement(
				By.cssSelector(".view.gallery"));
		mediaView.click();
	}

	public void clickOnDetailedViewAsDefaultForThisFolder() {
		WebElement DetailedViewAsDefaultForThisFolder = getDriver()
				.findElement(By.cssSelector(".view.gallery"));
		DetailedViewAsDefaultForThisFolder.click();
	}

}