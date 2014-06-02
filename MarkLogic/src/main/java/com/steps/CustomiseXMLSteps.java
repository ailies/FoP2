package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import tools.AbstractSteps;

@SuppressWarnings("serial")
public class CustomiseXMLSteps extends AbstractSteps {

	public CustomiseXMLSteps(Pages pages) {
		super(pages);
	}

	@StepGroup
	public void reorderFiles(String fileTitle) {
		customizeXMLPage().clickOnAssemblyView();
		customizeXMLPage().verifyIfAssemblyViewTreeIsDisplayed();
		customizeXMLPage().getTheSearchedElement("xml");
		// customizeXMLPage().reorderXMLFilesInTree(fileTitle);
	}

	// -----------renditions--------------
	@Step
	public boolean verifyIfXMLFileExists(String term) {
		return alfrescoCreateNewFolderPage().verifyIfElementExists(term);
	}
	
	@Step
	public void clickOnElement(String element) {
		 alfrescoCreateNewFolderPage().clickOnElement(element);
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
	
	@StepGroup
	public void checkRenditions(String term) {
		verifyIfXMLFileExists("DemoTesting.xml");
		alfrescoCreateNewFolderPage().clickOnElement("DemoTesting.xml");
		customizeXMLPage().verifyIfRenditionsExists();
		customizeXMLPage().clickOnFirstRendition();
		getDriver().navigate().back();
		customizeXMLPage().clickOnSecondRendition();
		customizeXMLPage().clickOnThirdRendition();
	}

	@StepGroup
	public void editWithXopus(String term, String title) {
		customizeXMLPage().clickOnInlineEdit(term);
		customizeXMLPage().updateXMLTitle(title);
		customizeXMLPage().clickOnSubmitButton();
	}

	@StepGroup
	public void verifyTags() {
		customizeXMLPage().verifyIfSemanticTagsWereGenerated();
	}
	
	@StepGroup
	public void uploadFiles(String filePath, String term) {
		uploadFile().uploadDocument(filePath);
		alfrescoCreateNewFolderPage().verifyIfElementExists(term);
	}


}
