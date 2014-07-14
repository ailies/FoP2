package AlfrescoPages;

import net.thucydides.core.annotations.findby.By;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.AbstractPage;

public class PublishArticlePage extends AbstractPage {

	public PublishArticlePage(WebDriver driver) {
		super(driver);
	}

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
			$(moreButton).waitUntilVisible();
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
		WebElement tasksMenu = getDriver().findElement(
				By.cssSelector("#HEADER_TASKS_text"));
		$(tasksMenu).waitUntilVisible();
		tasksMenu.click();
		tasksMenu.click();
	}

	public void clickOnWorkflowsStartedSubmenu() {
		WebElement workflowsStartedSubmenu = getDriver().findElement(
				By.cssSelector("#HEADER_MY_WORKFLOWS > td > a"));
		$(workflowsStartedSubmenu).waitUntilVisible();
		workflowsStartedSubmenu.click();
	}

	public void clickOnWorkflow() {
		WebElement workflow = getDriver()
				.findElement(
						By.cssSelector(".yui-dt-rec.yui-dt-last.yui-dt-odd > td > div > h3 > a"));
		$(workflow).waitUntilVisible();
		workflow.click();
	}

	public void clickOnEditWorkflow() {
		WebElement workflowEdit = getDriver().findElement(
				By.cssSelector(".yui-dt-liner > .task-edit"));
		$(workflowEdit).waitUntilVisible();
		workflowEdit.click();
	}

	public void clickOnDropDownStatus() {
		WebElement status = getDriver()
				.findElement(
						By.cssSelector("#page_x002e_data-form_x002e_task-edit_x0023_default_prop_bpm_status > option[value='Completed']"));
		$(status).waitUntilVisible();
		status.click();
	}

	public void clickOnPublishEditedWorkflowBtn() {
		WebElement publishBtn = getDriver()
				.findElement(
						By.cssSelector("#page_x002e_data-form_x002e_task-edit_x0023_default_prop_ixpdc_publishOutcome-Publish-button"));
		$(publishBtn).waitUntilVisible();
		publishBtn.click();
	}

	public void clickOnTaskDoneBtn() {
		WebElement taskDoneBtn = getDriver()
				.findElement(
						By.cssSelector("#page_x002e_data-form_x002e_task-edit_x0023_default_prop_transitions-Next-button"));
		$(taskDoneBtn).waitUntilVisible();
		taskDoneBtn.click();
	}

}
