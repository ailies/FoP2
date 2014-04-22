package Research;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

public class AlfrescoLoginCSVTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.115:8080/share/page/")
	public Pages pages;

	@Steps
	private LoginSteps loginStep;

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

		loginStep.loginToSite(username, password);
	}

}
