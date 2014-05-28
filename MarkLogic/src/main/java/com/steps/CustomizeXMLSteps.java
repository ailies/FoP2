package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class CustomizeXMLSteps extends AbstractSteps {

	public CustomizeXMLSteps(Pages pages) {
		super(pages);
	}

	@Step
	public void clickOnAssemblyView() {
		customizeXMLPage().clickOnAssemblyView();
	}

	@Step
	public void verifyIfAssemblyViewTreeIsDisplayed() {
		customizeXMLPage().verifyIfAssemblyViewTreeIsDisplayed();
	}

	@Step
	public void reorderXMLFilesInTree(String fileTitle) {
		customizeXMLPage().reorderXMLFilesInTree(fileTitle);
	}

//	@Step
//	public void checkIfXMLFileIsPresent(String XMLFiles) {
//		customizeXMLPage().checkIfXMLFileIsPresent(XMLFiles);
//	}

	@Step
	public void getTheSearchedElement(String... terms) {
		customizeXMLPage().getTheSearchedElement(terms);
	}

	@StepGroup
	public void reorderFiles(String fileTitle) {
		clickOnAssemblyView();
		verifyIfAssemblyViewTreeIsDisplayed();
		getTheSearchedElement("xml");
		// reorderXMLFilesInTree(fileTitle);
	}

	// -----------renditions--------------
	@Step
	public boolean verifyIfXMLFileExists(String term) {
		return alfrescoCreateNewFolderPage().verifyIfElementExists(term);
	}

	@Step
	public void clickOnXMLFile(String... terms) {
		alfrescoCreateNewFolderPage().clickOnElement(terms);
	}

	@Step
	public void verifyIfRenditionsExists() {
		customizeXMLPage().verifyIfRenditionsExists();
	}

	@Step
	public void clickOnFirstRendition() {
		customizeXMLPage().clickOnFirstRendition();
	}

	@Step
	public void clickOnSecondRendition() {
		customizeXMLPage().clickOnSecondRendition();
	}

	@Step
	public void clickOnThirdRendition() {
		customizeXMLPage().clickOnThirdRendition();
	}

	@Step
	public void checkTheMimetype() {
		customizeXMLPage().checkTheMimetype();
	}

	@StepGroup
	public void checkRenditions(String term) {
		verifyIfXMLFileExists("DemoTesting.xml");
		clickOnXMLFile("DemoTesting.xml");
		verifyIfRenditionsExists();
		clickOnFirstRendition();
		clickOnSecondRendition();
		clickOnThirdRendition();
	}

}
