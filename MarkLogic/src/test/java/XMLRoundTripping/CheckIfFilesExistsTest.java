package XMLRoundTripping;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import AlfrescoSteps.AlfrescoLoginSteps;
import AlfrescoSteps.CreateFolderSteps;
import AlfrescoSteps.CustomiseXMLSteps;


//@Story(Application...class)
@RunWith(ThucydidesRunner.class)
public class CheckIfFilesExistsTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	public AlfrescoLoginSteps loginSteps;

	@Steps
	public CreateFolderSteps createNewFolderSteps;
	
	@Steps
	public CustomiseXMLSteps customiseXMLSteps;

/*	@Test
	public void checkIfRenditionsWereGenerated(){
		loginSteps.authentication("admin", "admin");
		loginSteps.navigateToFolder();
		createNewFolderSteps.clickOnFolder("Test");
		createNewFolderSteps.clickOnFolder("Demo");
		createNewFolderSteps.clickOnFolder("renditions");
		customiseXMLSteps.checkRenditionsInRenditionsFolder(".html", ".epub");
	}*/
	
	@Test
	public void checkIfRenditionsWereGenerated(){
		loginSteps.authentication("admin", "admin");
		loginSteps.navigateToFolder();
		createNewFolderSteps.clickOnFolder("People");
		createNewFolderSteps.clickOnFolder("Ami");
		createNewFolderSteps.clickOnFolder("4-6-2014-1");
		createNewFolderSteps.clickOnFolder("renditions");
		customiseXMLSteps.checkRenditionsInRenditionsFolder(".html", ".epub");
	}
}
