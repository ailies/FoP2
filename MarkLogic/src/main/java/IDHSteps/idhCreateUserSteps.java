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
	public void getToMenu() {
		idhCreateUsersPage().clickOnUsersMenu();
		idhCreateUsersPage().clickOnAddUserButton();
		idhCreateUsersPage().assertNewUserPanelShouldBeVisible();
	}

	String username, password;
	
	
	@StepGroup
	public void addUserCSV() {
		idhCreateUsersPage().inputNewUserName(username);
		idhCreateUsersPage().inputNewUserPassword(password);
		idhCreateUsersPage().clickOnUserRole();
		idhCreateUsersPage().clickOnAddUsern();
		idhCreateUsersPage().verifyIfUserWasCreated(username);
	}

	@StepGroup
	public void addUser(String username, String password, String... terms) {
		idhCreateUsersPage().inputNewUserName(username);
		idhCreateUsersPage().inputNewUserPassword(password);
		idhCreateUsersPage().clickOnUserRole();
		idhCreateUsersPage().clickOnAddUsern();
		idhCreateUsersPage().verifyIfUserWasCreated(terms);
	}

}
