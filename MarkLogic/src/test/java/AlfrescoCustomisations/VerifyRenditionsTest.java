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
import com.steps.AlfrescoLoginSteps;
import com.steps.CreateFolderSteps;
import com.steps.CustomiseXMLSteps;
import com.steps.MarkLogicSearchSteps;


@Story(Application.Articles.VerifyRenditions.class)
@RunWith(ThucydidesRunner.class)
public class VerifyRenditionsTest {
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
	public CustomiseXMLSteps xmlCustomizeSteps;

	@Test
	public void verifyRenditions() {
		loginSteps.authentication("admin", "admin");
		loginSteps.navigateToFolder();
		createNewFolderSteps.clickOnFolder("Test");
		createNewFolderSteps.clickOnFolder("DemoTesting");
//		xmlCustomizeSteps.checkRenditions(".xml");
		
		xmlCustomizeSteps.verifyIfXMLFileExists("DemoTesting.xml");
		xmlCustomizeSteps.clickOnElement("DemoTesting.xml");
		xmlCustomizeSteps.verifyIfRenditionsExists();
		xmlCustomizeSteps.clickOnFirstRendition();
		xmlCustomizeSteps.clickOnSecondRendition();
		xmlCustomizeSteps.clickOnThirdRendition();
	}
}
