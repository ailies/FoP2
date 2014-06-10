package IDH;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import IDHSteps.idhAuthenticationSteps;

import com.requirements.Application;


@Story(Application.IDHActions.Authentication.class)
@RunWith(ThucydidesRunner.class)
public class idhAuthenticationTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.116:9003/")
	public Pages pages;

	@Steps
	public idhAuthenticationSteps idhAuthenticationSteps;

	@Test
	public void Authentication() {
		idhAuthenticationSteps.IDHauthentication("admin", "admin");
	}
}
