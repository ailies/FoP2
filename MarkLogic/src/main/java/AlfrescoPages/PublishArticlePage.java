package AlfrescoPages;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.AbstractPage;

public class PublishArticlePage extends AbstractPage {

	public PublishArticlePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "#HEADER_TASKS_text")
	WebElement tasksMenu;

	@FindBy(css = "#HEADER_MY_WORKFLOWS > td > a")
	WebElement workflowsStartedSubmenu;

	@FindBy(css = ".yui-dt-rec.yui-dt-last.yui-dt-odd > td > div > h3 > a")
	WebElement workflow;

	@FindBy(css = ".yui-dt-liner > .task-edit")
	WebElement workflowEdit;

	@FindBy(css = "#page_x002e_data-form_x002e_task-edit_x0023_default_prop_bpm_status > option[value='Completed']")
	WebElement status;

	@FindBy(css = "#page_x002e_data-form_x002e_task-edit_x0023_default_prop_ixpdc_publishOutcome-Publish-button")
	WebElement publishBtn;

	@FindBy(css = "#page_x002e_data-form_x002e_task-edit_x0023_default_prop_transitions-Next-button")
	WebElement taskDoneBtn;

	public void clickOnSubmitToPublishOption(String term) {
		WebElement element = getTheSearchedElement(term);
		if (element == null) {
			Assert.fail("No element matching the given terms was found in the table!");
		} else {
			Actions mouseOver = new Actions(getDriver());
			mouseOver.moveToElement(element).build().perform();
			WebElement moreButton = element.findElement(By
					.cssSelector("#onActionShowMore a"));
			mouseOver.click(element).build().perform();
			element(moreButton).waitUntilVisible();
			moreButton.click();

			scrollPageDown();

			WebElement submitToPublish = element.findElement(By
					.cssSelector("#onPublishWorkflow > a > span"));

			submitToPublish.isDisplayed();
			waitABit(2000);
			submitToPublish.click();
		}
	}

	public void clickOnTasksMenu() {
		element(tasksMenu).waitUntilVisible();
		tasksMenu.click();
		tasksMenu.click();
	}

	public void clickOnWorkflowsStartedSubmenu() {
		element(workflowsStartedSubmenu).waitUntilVisible();
		workflowsStartedSubmenu.click();
	}

	public void clickOnWorkflow() {
		element(workflow).waitUntilVisible();
		workflow.click();
	}

	public void clickOnEditWorkflow() {
		element(workflowEdit).waitUntilVisible();
		workflowEdit.click();
	}

	public void clickOnDropDownStatus() {
		element(status).waitUntilVisible();
		status.click();
	}

	public void clickOnPublishEditedWorkflowBtn() {
		element(publishBtn).waitUntilVisible();
		publishBtn.click();
	}

	public void clickOnTaskDoneBtn() {
		element(taskDoneBtn).waitUntilVisible();
		taskDoneBtn.click();
	}

}
