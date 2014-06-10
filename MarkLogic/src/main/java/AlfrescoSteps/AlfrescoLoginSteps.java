package AlfrescoSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;

import org.junit.Assert;

import tools.AbstractSteps;

@SuppressWarnings("serial")
public class AlfrescoLoginSteps extends AbstractSteps {
	public AlfrescoLoginSteps(Pages pages) {
		super(pages);
	}

	@Step
	public void verifyLoginPageIsOpen() {
		Assert.assertTrue(
				"Current page is not the login page!",
				alfrescoLoginPage().getDriver().getTitle()
						.matches("Alfresco.*Login"));
	}

	@StepGroup
	public void authentication(String screenName, String pass) {
		getDriver().manage().window().maximize();
		getDriver().get("http://172.16.10.115:8080/share/page/");
		verifyLoginPageIsOpen();
		alfrescoLoginPage().enterUsername(screenName);
		alfrescoLoginPage().enterPassword(pass);
		alfrescoLoginPage().clickOnLoginBtn();
		alfrescoLoginPage().assertThatUserDashboardShouldBeVisible();
	}

	@StepGroup
	public void navigateToFolder() {
		alfrescoLoginPage().clickOnSitesMenuTab();
		alfrescoLoginPage().clickOnTestSiteSubMenu();
		alfrescoLoginPage().assertThatDocumentLibraryShouldBeVisible();
		alfrescoLoginPage().clickOnDocumentLibrary();

	}
}
