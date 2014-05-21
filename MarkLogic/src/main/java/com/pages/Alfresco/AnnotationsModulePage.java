package com.pages.Alfresco;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import net.thucydides.core.annotations.findby.FindBy;

import tools.DateUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class AnnotationsModulePage extends AbstractPage {

	public AnnotationsModulePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "template_x002e_web-preview_x002e_document-details_x0023_default-previewer-div")
	WebElement filePreview;

	@FindBy(css = "#onActionAnnotate")
	WebElement annotationsBtn;

	@FindBy(css = "#ice-note-panel > textarea")
	WebElement commentContentInput;

	@FindBy(css = "#ice-note-add-button > span.ui-button-icon-primary.ui-icon.ice-icon-check")
	WebElement submitCommentButton;

	@FindBy(css = "#ice-note-cancel-button > span")
	WebElement cancelAnnotation;
	
	@FindBy(css = "div.navigation-bar > div > span")
	WebElement goBackLink;

	public void verifyIfFilePreviewIsDisplayed() {
		element(filePreview).isCurrentlyVisible();
	}

	public void clickOnAnnotations() {
		annotationsBtn.click();
		waitABit(2000);
	}

	public void insertCommentForAnnotation(String annotation) {
		element(commentContentInput).waitUntilVisible();
		commentContentInput.sendKeys(annotation);
		waitABit(5000);
	}

	public void clickOnSubmitCommentButton() {
		getDriver().switchTo().defaultContent();
		submitCommentButton.click();
	}

	// public void insertCommentContent(String content) {
	// getDriver().switchTo().frame(commentContentIframe);
	// commentContentInput.sendKeys(content);
	// }

	public void navigateToNextPage() {
		WebElement nextButton = getDriver()
				.findElement(
						By.cssSelector("div[id*='ice-main'] > div:nth-child(8)>div:first-child>button:nth-child(3)"));
		nextButton.click();
		waitABit(5000);
	}

	public void nativateToMainPage() {
		goBackLink.click();
	}

	public void checkIfCommentDoesntExists(String userName, String message) {
		List<WebElement> commentList = getDriver()
				.findElements(
						By.cssSelector("div[id*='comments-list'] table > tbody[class*='data'] > tr"));
		boolean foundComment = false;
		for (WebElement comment : commentList) {
			WebElement username = comment.findElement(By
					.cssSelector("div[class*='details'] > span:first-child a"));
			if (username.getText().contains(userName)) {
				WebElement commentText = comment.findElement(By
						.cssSelector("div[class*='details'] div:nth-child(3)"));
				if (commentText.getText().contains(message)) {
					foundComment = true;
					break;
				}
			}
		}
		Assert.assertFalse(
				String.format("The '%s' comment should not exist!", message),
				foundComment);
	}

	public void checkIfCommentIsPresent(String userName, String message) {
		List<WebElement> commentList = getDriver()
				.findElements(
						By.cssSelector("div[id*='comments-list'] table > tbody[class*='data'] > tr"));
		boolean foundUser = false;
		boolean foundComment = false;
		for (WebElement comment : commentList) {
			WebElement username = comment.findElement(By
					.cssSelector("div[class*='details'] > span:first-child a"));
			if (username.getText().contains(userName)) {
				foundUser = true;
				WebElement commentText = comment.findElement(By
						.cssSelector("div[class*='details'] div:nth-child(3)"));
				if (commentText.getText().contains(message)) {
					foundComment = true;
					break;
				}
			}
		}
		Assert.assertTrue(String.format(
				"No comment submitted by '%s' was found!", userName), foundUser);
		Assert.assertTrue(
				String.format("The '%s' comment was not found!", message),
				foundComment);
	}

	public void checkIfCommentIsPresent(String userName, String message,
			String... actionNames) {
		List<WebElement> commentList = getDriver()
				.findElements(
						By.cssSelector("div[id*='comments-list'] table > tbody[class*='data'] > tr"));
		boolean foundUser = false;
		boolean foundComment = false;
		for (WebElement comment : commentList) {
			WebElement username = comment
					.findElement(By
							.cssSelector("div.comment-details > div.details > span.info > a"));

			if (username.getText().contains(userName)) {
				foundUser = true;
				WebElement commentText = comment
						.findElement(By
								.cssSelector("div.comment-details > div.details > div.comment-content > p"));

				if (commentText.getText().contains(message)) {
					foundComment = true;
					mouseOver(comment);
					List<WebElement> actionsList = comment
							.findElements(By
									.cssSelector("div.comment-details > div.details > span.comment-actions > a"));
					for (String actionName : actionNames) {
						boolean foundAction = false;
						for (WebElement action : actionsList) {
							mouseOver(action);
							String actualActionTitle = action
									.getAttribute("title");
							if (actualActionTitle.equals(actionName)) {
								foundAction = true;
								break;
							}
						}
						Assert.assertTrue(String.format(
								"The '%s' action was not found!", actionName),
								foundAction);
					}
					break;
				}
			}
		}
		Assert.assertTrue(String.format(
				"No comment submitted by '%s' was found!", userName), foundUser);
		Assert.assertTrue(
				String.format("The '%s' comment was not found!", message),
				foundComment);
	}

	public void checkIfDocumentIsLocked(String message) {
		WebElement notification = getDriver()
				.findElement(
						By.cssSelector("div[class*='node-header']>div:first-child span"));
		Assert.assertTrue("The notification is not present", notification
				.getText().contains(message));
	}

	public void checkThatDateCorespondWithSystemTime(Date systemDate) {
		String date = getDriver().findElement(
				By.cssSelector("span[class*='modifier'] span")).getText();
		String dateTime = DateUtils.toString(systemDate,
				"EEE d MMM yyyy HH:mm:ss");
		DateUtils.checkDatesWithErrorMargin(dateTime,
				"EEE d MMM yyyy HH:mm:ss", date, "EEE d MMM yyyy HH:mm:ss", 1,
				Calendar.MINUTE);
	}

}
