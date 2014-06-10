package tools;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import AlfrescoPages.AlfrescoActionsPage;
import AlfrescoPages.AlfrescoCreateFolderPage;
import AlfrescoPages.AlfrescoCreateUserPage;
import AlfrescoPages.AnnotationModulePage;
import AlfrescoPages.AuthenticationPage;
import AlfrescoPages.CropImagePage;
import AlfrescoPages.CustomizeXMLPage;
import AlfrescoPages.DownloadFilesPage;
import AlfrescoPages.EditHTMLPage;
import AlfrescoPages.GenerateImageRenditionsPage;
import AlfrescoPages.GenerateVideoFramesPage;
import AlfrescoPages.MarkLogicSearchPage;
import AlfrescoPages.PublishArticlePage;
import AlfrescoPages.UploadFilePage;
import BuildMyBookPages.BuildMyBookActionsPage;

@SuppressWarnings("serial")
public class AbstractSteps extends ScenarioSteps {

	public AbstractSteps(Pages pages) {
		super(pages);

	}

	public void navigateToURL(String URL) {
		getDriver().get(URL);
		getDriver().manage().window().maximize();
	}

	protected void refreshPage() {
		getDriver().navigate().refresh();
	}

	protected AlfrescoActionsPage alfrescoActionsPage() {
		return getPages().currentPageAt(AlfrescoActionsPage.class);
	}

	protected AbstractPage abstractPage() {
		return getPages().currentPageAt(AbstractPage.class);
	}

	protected AuthenticationPage alfrescoLoginPage() {
		return getPages().currentPageAt(AuthenticationPage.class);
	}

	protected AlfrescoCreateFolderPage alfrescoCreateNewFolderPage() {
		return getPages().currentPageAt(AlfrescoCreateFolderPage.class);
	}

	protected AlfrescoCreateUserPage alfrescoCreateUserPage() {
		return getPages().currentPageAt(AlfrescoCreateUserPage.class);
	}

	protected GenerateImageRenditionsPage generateRenditionsPage() {
		return getPages().currentPageAt(GenerateImageRenditionsPage.class);
	}

	protected AnnotationModulePage annotationsModulePage() {
		return getPages().currentPageAt(AnnotationModulePage.class);
	}

	protected CropImagePage cropImagePage() {
		return getPages().currentPageAt(CropImagePage.class);
	}

	protected CustomizeXMLPage customizeXMLPage() {
		return getPages().currentPageAt(CustomizeXMLPage.class);
	}

	protected GenerateVideoFramesPage generateVideoFramesPage() {
		return getPages().currentPageAt(GenerateVideoFramesPage.class);
	}

	protected MarkLogicSearchPage markLogicSearchPage() {
		return getPages().currentPageAt(MarkLogicSearchPage.class);
	}

	protected PublishArticlePage publishOnBuildMyBookPage() {
		return getPages().currentPageAt(PublishArticlePage.class);
	}

	protected DownloadFilesPage downloadFilesPage() {
		return getPages().currentPageAt(DownloadFilesPage.class);
	}

	protected UploadFilePage uploadFile() {
		return getPages().currentPageAt(UploadFilePage.class);
	}

	protected BuildMyBookActionsPage buildMyBookActionsPage() {
		return getPages().currentPageAt(BuildMyBookActionsPage.class);
	}

	protected EditHTMLPage editHTMLPage() {
		return getPages().currentPageAt(EditHTMLPage.class);
	}

	// -------------IDH-------------

	protected IDHPages.idhAuthenticationPage idhAuthenticationPage() {
		return getPages().currentPageAt(IDHPages.idhAuthenticationPage.class);
	}

	protected IDHPages.idhCreateUsersPage idhCreateUsersPage() {
		return getPages().currentPageAt(IDHPages.idhCreateUsersPage.class);
	}
}
