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

import tools.Delay;
import AlfrescoSteps.AlfrescoLoginSteps;
import AlfrescoSteps.CreateFolderSteps;
import AlfrescoSteps.CustomiseXMLSteps;
import AlfrescoSteps.MarkLogicSearchSteps;

import com.requirements.Application;

@Story(Application.Articles.GenerateXML.class)
@RunWith(ThucydidesRunner.class)
public class GenerateXMLTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	public AlfrescoLoginSteps loginSteps;

	@Steps
	public MarkLogicSearchSteps markLogicSearch;

	@Steps
	public CreateFolderSteps createNewFolder;

	@Steps
	public CustomiseXMLSteps customizeXMLSteps;

	@Test
	public void reorderFilesUsingAssemblyView() {
		loginSteps.authentication("admin", "admin");
		loginSteps.navigateToFolder();
		createNewFolder.clickOnFolder("Test");
		createNewFolder.clickOnFolder("Demo");
		createNewFolder.clickOnFolder("Research");
		customizeXMLSteps.reorderFiles(".xml");

	}
}
