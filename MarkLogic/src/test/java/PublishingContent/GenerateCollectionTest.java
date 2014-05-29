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

@Story(Application.BuildMyBook.CreateCollection.class)
@RunWith(ThucydidesRunner.class)
public class GenerateCollectionTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://admin:admin@172.16.10.116:9002/")
	public Pages pages;

	@Steps
	BuildMyBookActionSteps buildMyBookActionsSteps;

	@Test
	public void searchArticle() {
		buildMyBookActionsSteps.buildMyBook("2014");
	}
}
