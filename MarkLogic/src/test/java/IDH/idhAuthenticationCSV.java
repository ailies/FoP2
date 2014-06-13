package IDH;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import IDHSteps.idhAuthenticationSteps;
import IDHSteps.idhCreateUserSteps;

import com.requirements.Application;

@Story(Application.IDHActions.Authentication.class)
@RunWith(ThucydidesParameterizedRunner.class)
@UseTestDataFrom("resources/idhUsers.csv")
public class idhAuthenticationCSV {

	String username;
	String password;

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.116:9003/")
	public Pages pages;

	@Steps
	public idhAuthenticationSteps idhAuthenticationSteps;

	@Steps
	public idhCreateUserSteps idhCreateUserSteps;

	@Test
	public void AuthenticationCSV() {
		idhAuthenticationSteps.IDHauthentication(username, password);
	}
}
