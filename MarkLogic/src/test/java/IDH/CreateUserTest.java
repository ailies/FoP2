package IDH;

import java.io.IOException;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import IDHSteps.idhAuthenticationSteps;
import IDHSteps.idhCreateUserSteps;
import static net.thucydides.core.steps.StepData.withTestDataFrom;

import com.requirements.Application;

@Story(Application.IDHActions.Authentication.class)
@RunWith(ThucydidesRunner.class)
// @UseTestDataFrom("resources/idhUsers.csv")
public class CreateUserTest {

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
	public void createUsers() {
		idhAuthenticationSteps.IDHauthentication("admin", "admin");
		idhCreateUserSteps.getToMenu();
		try {
			withTestDataFrom("resources/idhUsers.csv").run(idhCreateUserSteps)
					.addUserCSV();
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail("An IOException has occured!");
		}

	}
}
