package AlfrescoCustomization;

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
import com.steps.AlfrescoLoginSteps;
import com.steps.CreateFolderSteps;
import com.steps.UploadVideoSteps;

@Story(Application.MediaFiles.UploadVideo.class)
@RunWith(ThucydidesRunner.class)
public class UploadVideoAndGenerateVideoFramesTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	public AlfrescoLoginSteps loginSteps;

	@Steps
	public CreateFolderSteps createNewFolderSteps;

	@Steps
	public UploadVideoSteps uploadVideoAndGenerateRenditionsSteps;

	@Test
	public void uploadVideoTest() {
		loginSteps.authentication("admin", "admin");
		loginSteps.navigateToFolder();
		createNewFolderSteps.clickOnFolder("Test");
		createNewFolderSteps.clickOnFolder("DemoTesting");
		createNewFolderSteps.clickOnFolder("Research");
		uploadVideoAndGenerateRenditionsSteps.uploadVideo("C:/Users/seleniumadmin/Videos/Sample Videos/Wildlife.wmv", "Wildlife.wmv");
	}
	
	@Test
	public void generateVideoFramesTest() {
		loginSteps.authentication("admin", "admin");
		loginSteps.navigateToFolder();
		createNewFolderSteps.clickOnFolder("Test");
		createNewFolderSteps.clickOnFolder("DemoTesting");
		createNewFolderSteps.clickOnFolder("Research");
		uploadVideoAndGenerateRenditionsSteps.uploadVideo("C:/Users/seleniumadmin/Videos/Sample Videos/Wildlife.wmv","Wildlife.wmv");
	}
}
