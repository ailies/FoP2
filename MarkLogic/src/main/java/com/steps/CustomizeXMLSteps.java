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

	@StepGroup
	public void checkRenditions(String term) {
		verifyIfXMLFileExists("DemoTesting.xml");
		alfrescoCreateNewFolderPage().clickOnElement("DemoTesting.xml");
		customizeXMLPage().verifyIfRenditionsExists();
		customizeXMLPage().clickOnFirstRendition();
		customizeXMLPage().clickOnSecondRendition();
		customizeXMLPage().clickOnThirdRendition();
	}

	@StepGroup
	public void editWithXopus(String term, String title) {
		customizeXMLPage().clickOnInlineEdit(term);
		customizeXMLPage().updateXMLTitle(title);
		customizeXMLPage().clickOnSubmitButton();
	}

}
