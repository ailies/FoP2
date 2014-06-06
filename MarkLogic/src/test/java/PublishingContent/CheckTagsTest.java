package PublishingContent;

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
import com.steps.CustomiseXMLSteps;

@Story(Application.Articles.PublishArticle.class)
@RunWith(ThucydidesRunner.class)
public class CheckTagsTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	public AlfrescoLoginSteps loginSteps;

	@Steps
	public CreateFolderSteps createNewFolderSteps;

	@Steps
	public CustomiseXMLSteps customizeXMLSteps;

//	@Test
//	public void verifyFileTags() {
//		loginSteps.authentication("publisher", "demo");
//		loginSteps.navigateToFolder();
//		createNewFolderSteps.clickOnFolder("Test");
//		createNewFolderSteps.clickOnFolder("Demo");
//		createNewFolderSteps.clickOnFolder(".xml");
//		customizeXMLSteps.verifyTags();
//	}
	
	@Test
	public void verifyFileTags() {
		loginSteps.authentication("publisher", "demo");
		loginSteps.navigateToFolder();
		createNewFolderSteps.clickOnFolder("People");
		createNewFolderSteps.clickOnFolder("Ami");
		createNewFolderSteps.clickOnFolder("4-6-2014-1");
		createNewFolderSteps.clickOnFolder(".xml");
		customizeXMLSteps.verifyTags();
	}
}
