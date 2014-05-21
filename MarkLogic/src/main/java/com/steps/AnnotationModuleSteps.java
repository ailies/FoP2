package com.steps;

import java.util.Date;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class AnnotationModuleSteps extends AbstractSteps{

	public AnnotationModuleSteps(Pages pages) {
		super(pages);
	}
	
	@Step
	public void verifyIfFilePreviewIsDisplayed() {
		annotationsModulePage().verifyIfFilePreviewIsDisplayed();
	}
	
	@Step
	public void clickOnAnnotations() {
		annotationsModulePage().clickOnAnnotations();
	}
	
	@Step
	public void insertCommentForAnnotation(String annotation) {
		annotationsModulePage().insertCommentForAnnotation(annotation);
	}
	
	@Step
	public void clickOnSubmitCommentButton() {
		annotationsModulePage().clickOnSubmitCommentButton();
	}
	
	@Step
	public void navigateToNextPage() {
		annotationsModulePage().navigateToNextPage();
	}
	
	@Step
	public void nativateToMainPage() {
		annotationsModulePage().nativateToMainPage();
	}
	
	@Step
	public void checkIfCommentDoesntExists(String userName, String message) {
		annotationsModulePage().checkIfCommentDoesntExists(userName, message);
	}
	
	@Step
	public void checkIfCommentIsPresent(String userName, String message) {
		annotationsModulePage().checkIfCommentIsPresent(userName, message);
	}
	
	@Step
	public void checkIfCommentIsPresent(String userName, String message,
			String... actionNames) {
		annotationsModulePage().checkIfCommentIsPresent(userName, message, actionNames);
	}
	
	@Step
	public void checkIfDocumentIsLocked(String message) {
		annotationsModulePage().checkIfDocumentIsLocked(message);
	}
	
	@Step
	public void checkThatDateCorespondWithSystemTime(Date systemDate) {
		annotationsModulePage().checkThatDateCorespondWithSystemTime(systemDate);
	}
	
	@StepGroup
	public void createAnnotation(String annotation, String userName, String message, String actionNames){
		verifyIfFilePreviewIsDisplayed();
		clickOnAnnotations();
		insertCommentForAnnotation(annotation);
		clickOnSubmitCommentButton();
		nativateToMainPage();
		checkIfCommentDoesntExists(userName, message);
		checkIfCommentIsPresent(userName, message);
		checkIfCommentIsPresent(userName, message, actionNames);
		checkIfDocumentIsLocked(message);
		checkThatDateCorespondWithSystemTime(null);
	}

}
