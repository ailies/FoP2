package tools;

import com.pages.Alfresco.AlfrescoCreateNewFolderPage;
import com.pages.Alfresco.AlfrescoCreateNewUserPage;
import com.pages.Alfresco.AlfrescoLoginPage;
import com.pages.Alfresco.CropImageAndGenerateRenditionsPage;
import com.pages.Alfresco.CustomizeXMLPage;
import com.pages.Alfresco.GenerateVideoFramesPage;
import com.pages.Alfresco.MarkLogicSearchPage;
import com.pages.Alfresco.PublishOnBuildMyBookPage;
import com.pages.Alfresco.UploadVideoAndGenerateFramesPage;
import com.pages.BuildMyBook.BuildMyBookActionsPage;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

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

	protected AbstractPage abstractPage() {
		return getPages().currentPageAt(AbstractPage.class);
	}

	protected AlfrescoLoginPage alfrescoLoginPage() {
		return getPages().currentPageAt(AlfrescoLoginPage.class);
	}
	
	protected AlfrescoCreateNewFolderPage alfrescoCreateNewFolderPage() {
		return getPages().currentPageAt(AlfrescoCreateNewFolderPage.class);
	}

	protected AlfrescoCreateNewUserPage alfrescoCreateNewUserPage() {
		return getPages().currentPageAt(AlfrescoCreateNewUserPage.class);
	}

	protected CropImageAndGenerateRenditionsPage cropImageAndGenerateRenditionsPage() {
		return getPages().currentPageAt(
				CropImageAndGenerateRenditionsPage.class);
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

	protected PublishOnBuildMyBookPage publishOnBuildMyBookPage() {
		return getPages().currentPageAt(PublishOnBuildMyBookPage.class);
	}

	protected UploadVideoAndGenerateFramesPage uploadVideoAndGenerateFramesPage() {
		return getPages().currentPageAt(UploadVideoAndGenerateFramesPage.class);
	}

	protected BuildMyBookActionsPage buildMyBookActionsPage() {
		return getPages().currentPageAt(BuildMyBookActionsPage.class);
	}
}
