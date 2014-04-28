package PublishingContent;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.openqa.selenium.WebDriver;

import com.steps.AlfrescoLoginSteps;
import com.steps.CreateNewFolderSteps;

public class CreateCollectionAndAddDocumentsTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	public AlfrescoLoginSteps login;

	@Steps
	public CreateNewFolderSteps createNewFolder;
	
	@StepGroup
	public void createAnnotation(){
		login.loginToSite("admin", "admin");
		login.GetToFolder();
		createNewFolder.createNewFolderTest("Test", "DemoTesting", "Test",
				"DemoTesting");
	}
}
