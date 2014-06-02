package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class AnnotationModuleSteps extends AbstractSteps {

	public AnnotationModuleSteps(Pages pages) {
		super(pages);
	}

	@StepGroup
	public void addAnnotation(String annotation, String userName, String message) {
		annotationsModulePage().verifyIfFilePreviewIsDisplayed();
		customizeXMLPage().clickOnFirstRendition();
		annotationsModulePage().clickOnAnnotations();
		annotationsModulePage().drawALine();
		annotationsModulePage().insertCommentForAnnotation(message);
		annotationsModulePage().clickOnSubmitCommentButton();
		annotationsModulePage().checkIfCommentDoesntExists(userName, message);
		System.out.println(userName);
		System.out.println(message);
		annotationsModulePage().checkIfCommentDoesntExists(userName, message);
		waitABit(2000);
		annotationsModulePage().checkIfCommentIsPresent(userName, message);
		// annotationsModulePage().checkThatDateCorespondWithSystemTime(systemDate);
	}
}
