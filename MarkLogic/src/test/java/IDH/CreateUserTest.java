package IDH;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import IDHSteps.idhAuthenticationSteps;
import IDHSteps.idhCreateUserSteps;

import com.requirements.Application;

@Story(Application.IDHActions.Authentication.class)
@RunWith(ThucydidesRunner.class)
public class CreateUserTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.16.10.116:9003/")
	public Pages pages;

	@Steps
	public idhAuthenticationSteps idhAuthenticationSteps;
	
	@Steps
	public idhCreateUserSteps idhCreateUserSteps;
	
	private String username;
	private String password;
	
	@Qualifier
    public String getQualifier() {
        return username;
    }
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public void setPassword(String password){
		this.password = password;
	}

	@Test
	public void Authentication() {
		idhAuthenticationSteps.IDHauthentication("admin", "admin");
		idhCreateUserSteps.AddUser(username, password, username);
		
	}
}
