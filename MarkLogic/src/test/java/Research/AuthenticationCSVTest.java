package Research;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import AlfrescoSteps.AlfrescoLoginSteps;

import com.requirements.Application;

@Story(Application.BasicFunctionality.Authentication.class)
@RunWith(ThucydidesParameterizedRunner.class)
public class AuthenticationCSVTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	private AlfrescoLoginSteps loginSteps;

	private String username;
	private String password;

	// @Qualifier
	public String getQualifier() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Test
	public void loginToAlfrescoSite() {
		loginSteps.authentication(username, password);
	}

}
