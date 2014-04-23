package Research;

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
import com.steps.CreateNewFolderSteps;
import com.steps.MarkLogicSearchSteps;

@Story(Application.Login.login.class)
@RunWith(ThucydidesRunner.class)
public class MarkLogicSearchTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	public AlfrescoLoginSteps login;

	@Steps
	public CreateNewFolderSteps createNewFolder;

	@Steps
	public MarkLogicSearchSteps markLogicSearch;

	@Test
	public void markLogicSearch() {
		login.loginToSite("admin", "admin");
		login.GetToFolder();
		createNewFolder.CreateNewFolderTest("Test", "DemoTesting", "Test",
				"DemoTesting");
		markLogicSearch.searchAndImportWikiDocument();
	}
}
