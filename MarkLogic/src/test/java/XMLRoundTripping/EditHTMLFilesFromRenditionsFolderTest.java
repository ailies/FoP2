package XMLRoundTripping;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import AlfrescoSteps.AlfrescoLoginSteps;
import AlfrescoSteps.CreateFolderSteps;
import AlfrescoSteps.EditHTMLSteps;

import com.requirements.Application;

@Story(Application.Articles.EditFiles.class)
@RunWith(ThucydidesRunner.class)
public class EditHTMLFilesFromRenditionsFolderTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	public AlfrescoLoginSteps loginSteps;

	@Steps
	public CreateFolderSteps createNewFolderSteps;

	@Steps
	public EditHTMLSteps editHTMLSteps;

	@Test
	public void editHTMLRendition() {
		loginSteps.authentication("admin", "admin");
		loginSteps.navigateToFolder();
		createNewFolderSteps.clickOnFolder("People");
		createNewFolderSteps.clickOnFolder("Ami");
		createNewFolderSteps.clickOnFolder("6-6-2014-1");
		createNewFolderSteps.clickOnFolder("renditions");
		editHTMLSteps.editHTMLRendition("6-6-2014-1.html", "edit");
	}

}
