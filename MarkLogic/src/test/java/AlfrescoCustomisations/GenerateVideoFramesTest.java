package AlfrescoCustomisations;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.steps.AlfrescoLoginSteps;
import com.steps.CreateFolderSteps;
import com.steps.CustomiseXMLSteps;
import com.steps.MarkLogicSearchSteps;
import com.steps.UploadVideoSteps;

public class GenerateVideoFramesTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	public AlfrescoLoginSteps loginSteps;

	@Steps
	public MarkLogicSearchSteps markLogicSearch;

	@Steps
	public CreateFolderSteps createNewFolderSteps;

	@Steps
	public CustomiseXMLSteps customizeXMLSteps;

	@Steps
	public UploadVideoSteps generateRenditionsSteps;

	@Test
	public void generateVideoFramesTest() {
		loginSteps.authentication("admin", "admin");
		loginSteps.navigateToFolder();
		createNewFolderSteps.clickOnFolder("Test");
		createNewFolderSteps.clickOnFolder("DemoTesting");
		createNewFolderSteps.clickOnFolder("Research");
		generateRenditionsSteps.uploadVideo(
				"C:/Users/seleniumadmin/Videos/Sample Videos/Wildlife.wmv",
				"Wildlife.wmv");
	}
}
