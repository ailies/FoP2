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

import AlfrescoSteps.AlfrescoLoginSteps;
import AlfrescoSteps.AnnotationModuleSteps;
import AlfrescoSteps.CreateFolderSteps;

import com.requirements.Application;

@Story(Application.Articles.AddAnnotation.class)
@RunWith(ThucydidesRunner.class)
public class AddAnnotationTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	public AlfrescoLoginSteps loginSteps;

	@Steps
	public CreateFolderSteps createNewFolderSteps;

	@Steps
	public AnnotationModuleSteps annotationModuleSteps;

	@Test
	public void addAnnotation() {
		loginSteps.authentication("admin", "admin");
		loginSteps.navigateToFolder();
		createNewFolderSteps.clickOnFolder("Test");
		createNewFolderSteps.clickOnFolder("Demo");
		createNewFolderSteps.clickOnFolder(".xml");
		annotationModuleSteps.addAnnotation("message", "admin", "");

	}
}
