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
import com.steps.BuildMyBookActionSteps;

@Story(Application.Login.login.class)
@RunWith(ThucydidesRunner.class)
public class CreateCollectionAndAddDocumentsTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://admin:admin@172.16.10.116:9002/")
	public Pages pages;

	@Steps
	BuildMyBookActionSteps buildMyBookActions;

	@Test
	public void searchArticle() {
		buildMyBookActions.buildMyBook("2014");
	}
}
