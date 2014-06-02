package AlfrescoCustomisations;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.requirements.Application;
import com.steps.CreateFolderSteps;
import com.steps.GenerateImageRenditionsSteps;
import com.steps.CustomiseXMLSteps;
import com.steps.AlfrescoLoginSteps;
import com.steps.MarkLogicSearchSteps;

@Story(Application.MediaFiles.GenerateImageRenditions.class)
@RunWith(ThucydidesRunner.class)
public class GenerateImageRenditionsTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	public AlfrescoLoginSteps loginSteps;

	@Steps
	public CreateFolderSteps createNewFolderSteps;

	@Steps
	public MarkLogicSearchSteps markLogicSearchSteps;

	@Steps
	public CustomiseXMLSteps customizeXMLSteps;

	@Steps
	public GenerateImageRenditionsSteps cropImageAndGemerateRenditionsSteps;

	@Test
	public void imageActions() {
		loginSteps.authentication("admin", "admin");
		loginSteps.navigateToFolder();
		createNewFolderSteps.clickOnFolder("Test");
		createNewFolderSteps.clickOnFolder("Ami");
		createNewFolderSteps.clickOnFolder("Research");
		cropImageAndGemerateRenditionsSteps.GenerateImageRenditions(".jpg");
	}
}
