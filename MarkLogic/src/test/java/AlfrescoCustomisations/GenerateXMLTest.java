package AlfrescoCustomisations;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.steps.AlfrescoLoginSteps;
import com.steps.CreateFolderSteps;
import com.steps.CustomizeXMLSteps;
import com.steps.MarkLogicSearchSteps;

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
	public CustomizeXMLSteps customizeXMLSteps;

	@Test
	public void reorderFilesUsingAssemblyView() {
		loginSteps.authentication("admin", "admin");
		loginSteps.navigateToFolder();
		createNewFolder.clickOnFolder("Test");
		createNewFolder.clickOnFolder("DemoTesting");
		createNewFolder.clickOnFolder("Research");
		customizeXMLSteps.reorderFiles(".xml");

	}
}
