package IDHSteps;

import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class idhCreateUserSteps extends AbstractSteps {

	public idhCreateUserSteps(Pages pages) {
		super(pages);
	}

	@StepGroup
	public void AddUser(String username, String password, String...terms) {
		idhCreateUsersPage().clickOnAddUserButton();
		idhCreateUsersPage().assertNewUserPanelShouldBeVisible();
		idhCreateUsersPage().inputNewUserName(username);
		idhCreateUsersPage().inputNewUserPassword(password);
		idhCreateUsersPage().clickOnUserRole();
		idhCreateUsersPage().clickOnAddUsern();
		idhCreateUsersPage().verifyIfUserWasCreated(terms);
	}

}
