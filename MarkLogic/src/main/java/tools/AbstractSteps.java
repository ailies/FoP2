package tools;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.Alfresco.AlfrescoActionsPage;
import com.pages.Alfresco.AlfrescoCreateFolderPage;
import com.pages.Alfresco.AlfrescoCreateUserPage;
import com.pages.Alfresco.AuthenticationPage;
import com.pages.Alfresco.AnnotationsModulePage;
import com.pages.Alfresco.CropImagePage;
import com.pages.Alfresco.CustomizeXMLPage;
import com.pages.Alfresco.GenerateImageRenditionsPage;
import com.pages.Alfresco.GenerateVideoFramesPage;
import com.pages.Alfresco.MarkLogicSearchPage;
import com.pages.Alfresco.PublishArticlePage;
import com.pages.Alfresco.UploadFilePage;
import com.pages.BuildMyBook.BuildMyBookActionsPage;

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

	protected AlfrescoCreateUserPage alfrescoCreateNewUserPage() {
		return getPages().currentPageAt(AlfrescoCreateUserPage.class);
	}

	protected GenerateImageRenditionsPage generateRenditionsPage() {
		return getPages().currentPageAt(GenerateImageRenditionsPage.class);
	}
	
	protected AnnotationsModulePage annotationsModulePage() {
		return getPages().currentPageAt(AnnotationsModulePage.class);
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

	protected UploadFilePage uploadFile() {
		return getPages().currentPageAt(UploadFilePage.class);
	}

	protected BuildMyBookActionsPage buildMyBookActionsPage() {
		return getPages().currentPageAt(BuildMyBookActionsPage.class);
	}
}
