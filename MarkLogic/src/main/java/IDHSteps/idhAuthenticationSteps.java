package IDHSteps;

import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class idhAuthenticationSteps extends AbstractSteps{

	public idhAuthenticationSteps(Pages pages) {
		super(pages);
	}
	
	@StepGroup
	public void IDHauthentication(String u, String p){
		idhAuthenticationPage().inputUsername(u);
		idhAuthenticationPage().inputPassword(p);
		idhAuthenticationPage().clickOnLoginButton();
		idhAuthenticationPage().verifyIfUserIsLoggedIn();
	}

}
