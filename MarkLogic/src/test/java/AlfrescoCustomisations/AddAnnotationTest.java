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
import com.steps.AnnotationModuleSteps;
import com.steps.CreateFolderSteps;
import com.steps.CustomiseXMLSteps;

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
		createNewFolderSteps.clickOnFolder("Ami");
		createNewFolderSteps.clickOnFolder(".xml");
		annotationModuleSteps.addAnnotation("message", "admin", "");

	}
}
