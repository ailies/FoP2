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
import com.steps.CreateNewFolderSteps;
import com.steps.CropImageSteps;

@Story(Application.Login.login.class)
@RunWith(ThucydidesRunner.class)
public class CropImageTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	public AlfrescoLoginSteps login;

	@Steps
	public CreateNewFolderSteps createNewFolder;

	@Steps
	public CropImageSteps cropImage;

	@Test
	public void cropImage() {
		login.loginToSite("admin", "admin");
		login.GetToFolder();
		cropImage.cropImage();
	}
}
