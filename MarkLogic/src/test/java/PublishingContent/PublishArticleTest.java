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
import com.steps.PublishArticleSteps;


@Story(Application.Articles.PublishArticle.class)
@RunWith(ThucydidesRunner.class)
public class PublishArticleTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	public AlfrescoLoginSteps loginSteps;

	@Steps
	public CreateFolderSteps createNewFolderSteps;
	
	@Steps
	public PublishArticleSteps publishArticleSteps;
	
	@Test
	public void publishArticle(){
		loginSteps.authentication("publisher", "demo");
		loginSteps.navigateToFolder();
		createNewFolderSteps.clickOnFolder("Test");
		createNewFolderSteps.clickOnFolder("DemoTesting");
		createNewFolderSteps.clickOnFolder(".xml");
		publishArticleSteps.publishArticle("publisher");
	}
}
