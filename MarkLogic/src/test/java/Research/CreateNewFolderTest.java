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
import com.steps.CreateNewFolderSteps;
import com.steps.AlfrescoLoginSteps;

@Story(Application.BasicFunctionality.CreateFolder.class)
@RunWith(ThucydidesRunner.class)
public class CreateNewFolderTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	public AlfrescoLoginSteps loginSteps;

	@Steps
	public CreateNewFolderSteps createNewFolderSteps;

	@Test
	public void createNewFolder() {
		loginSteps.loginToSite("admin", "admin");
		loginSteps.navigateToFolder();
		createNewFolderSteps.createNewFolderTest("Test", "DemoTesting", "Test",
				"DemoTesting");
	}
}
