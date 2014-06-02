package com.pages.Alfresco;

import java.util.List;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.AbstractPage;
import tools.Constants;

public class PublishArticlePage extends AbstractPage {

	public PublishArticlePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "#onPublishWorkflow > a > span")
	WebElement submitToPublish;

	@FindBy(css = "#HEADER_TASKS_text")
	WebElement tasksMenu;

	@FindBy(css = "#HEADER_MY_WORKFLOWS")
	WebElement workflowsStartedSubmenu;

	@FindBy(css = "div#template_x002e_workflow-type-filter_x002e_my-workflows")
	private WebElement workflowTypeContainer;

	@FindBy(css = "div[id*='default-workflows']")
	private WebElement workflowsListContainer;

	@FindBy(css = ".yui-dt-rec.yui-dt-last > td > div > h3 > a")
	private WebElement currentTaskContainer;

	@FindBy(css = "div.start-workflow")
	private WebElement startWorkflowContainer;

	public void clickOnMoreOptions(String term) {
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

			WebElement submitToPublish = element.findElement(By
					.cssSelector("a[title='Start Workflow']"));

			submitToPublish.isDisplayed();
			waitABit(2000);
			submitToPublish.click();
		}
	}

	public void clickOnWorkflowDropDown() {
		WebElement selectWorkflow = getDriver()
				.findElement(
						By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-workflow-definition-button-button"));
		element(selectWorkflow).waitUntilVisible();
		selectWorkflow.click();
	}

	public void clickOnWorkflowType() {
		WebElement workflowType = getDriver()
				.findElement(
						By.cssSelector(".yuimenuitem.first-of-type.yui-button-selectedmenuitem"));
		element(workflowType).waitUntilVisible();
		workflowType.click();
	}

	public void clickOnSelectAssignee() {
		WebElement selectAssignee = getDriver().findElement(
				By.id("yui-gen13-button"));
		element(selectAssignee).waitUntilVisible();
		selectAssignee.click();
	}

	public void inputOnSearchAssigneeLabel(String assignee) {
		WebElement searchAssigneeLabel = getDriver()
				.findElement(
						By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id3_assoc_bpm_groupAssignee-cntrl-picker-searchText"));
		element(searchAssigneeLabel).waitUntilVisible();
		searchAssigneeLabel.sendKeys(assignee);
	}

	public void clickOnSearchAssigneeButton() {
		WebElement searchAssigneeButton = getDriver()
				.findElement(
						By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id3_assoc_bpm_groupAssignee-cntrl-picker-searchButton-button"));
		element(searchAssigneeButton).waitUntilVisible();
		searchAssigneeButton.click();
	}

	public void clickOnGroupAssignee() {
		WebElement groupAssignee = getDriver()
				.findElement(
						By.cssSelector("add-item add-template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id3_assoc_bpm_groupAssignee-cntrl"));
		element(groupAssignee).waitUntilVisible();
		groupAssignee.click();
	}

	public void clickOnGroupAssigneeOkButton() {
		WebElement groupAssigneeOkButton = getDriver()
				.findElement(
						By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id3_assoc_bpm_groupAssignee-cntrl-ok-button"));
		element(groupAssigneeOkButton).waitUntilVisible();
		groupAssigneeOkButton.click();
	}

	public void clickOnAddWorkflowButton() {
		WebElement addWorkflowButton = getDriver().findElement(
				By.cssSelector("#yui-gen33-button"));
		element(addWorkflowButton).waitUntilVisible();
		addWorkflowButton.click();
	}

	public void clickOnStartWorkflowButton() {
		WebElement startWorkflowButton = getDriver()
				.findElement(
						By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id3-form-submit-button"));
		element(startWorkflowButton).waitUntilVisible();
		startWorkflowButton.click();
	}

	public void clickOnSubmitToPublish() {
		element(submitToPublish).waitUntilVisible();
		submitToPublish.click();
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

	public void selectWorkflowTypeFilter(String workflowType) {
		element(workflowTypeContainer).waitUntilVisible();

		List<WebElement> list = workflowTypeContainer.findElements(By
				.cssSelector("li a"));

		for (WebElement item : list) {
			if (item.getText().equals(workflowType)) {
				element(item).waitUntilVisible();
				item.sendKeys("");
				item.click();
				break;
			}
		}
	}

	public void selectTheReviewedWorkflow(String workflowName) {
		element(workflowsListContainer).waitUntilVisible();

		List<WebElement> list = workflowsListContainer.findElements(By
				.cssSelector("div.yui-dt-liner h3 a"));

		for (WebElement item : list) {
			if (item.getText().equals(workflowName)) {
				element(item).waitUntilVisible();
				item.sendKeys("");
				item.click();
				break;
			}
		}
	}

	public void selectWorkflowType(String workflow) {
		element(startWorkflowContainer).waitUntilVisible();
		WebElement workflowButton = startWorkflowContainer
				.findElement(By
						.cssSelector("button[id*='default-workflow-definition-button-button']"));
		element(workflowButton).waitUntilVisible();
		workflowButton.click();
		waitABit(Constants.WAIT_TIME_SHORT);

		WebElement workflowDropdown = startWorkflowContainer.findElement(By
				.cssSelector("div[id*='default-workflow-definition-menu']"));
		List<WebElement> workflowOptions = workflowDropdown.findElements(By
				.cssSelector("li span:first-child"));

		for (WebElement elementNow : workflowOptions) {

			if (elementNow.getText().contentEquals(workflow)) {
				element(elementNow).click();
				elementNow.click();
				break;
			}
		}
	}

	public void verifyCurrentTaskStatus(String workflowApproved) {
		element(currentTaskContainer).waitUntilVisible();
		currentTaskContainer.click();
	}

	public void clickOnTask() {
		element(currentTaskContainer).waitUntilVisible();
		currentTaskContainer.click();
	}

	public void clickOnEditCurrentTask() {
		WebElement currentTask = getDriver()
				.findElement(
						By.cssSelector(".yui-dt-rec.yui-dt-last.yui-dt-odd .yui-dt-liner a.task-details"));
		element(currentTask).waitUntilVisible();
		currentTask.click();
	}

	public void clickOnEditBtn() {
		WebElement editBtn = getDriver()
				.findElement(
						By.id("page_x002e_data-actions_x002e_task-details_x0023_default-edit-button"));
		element(editBtn).waitUntilVisible();
		editBtn.click();
	}

	public void editWorkflowStatus() {
		WebElement status = getDriver()
				.findElement(
						By.cssSelector("select#page_x002e_data-form_x002e_task-edit_x0023_default_prop_bpm_status"));
		element(status).waitUntilVisible();
		status.click();
		WebElement statusType = getDriver()
				.findElement(
						By.cssSelector("#page_x002e_data-form_x002e_task-edit_x0023_default_prop_bpm_status > option:nth-child(5)"));
		element(statusType).waitUntilVisible();
		statusType.click();
	}

	public void clickOnPublishBtn() {
		WebElement publishBtn = getDriver()
				.findElement(
						By.cssSelector("#page_x002e_data-form_x002e_task-edit_x0023_default_prop_ixpdc_publishOutcome-Publish"));
		element(publishBtn).waitUntilVisible();
		publishBtn.click();
	}

}
