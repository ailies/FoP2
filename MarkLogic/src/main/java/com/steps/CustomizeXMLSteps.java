package com.steps;

import tools.AbstractSteps;

import com.pages.Alfresco.CustomizeXMLPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class CustomizeXMLSteps extends AbstractSteps {

	public CustomizeXMLSteps(Pages pages) {
		super(pages);
	}
	
	@Step
	public boolean verifyIfXMLFileExists(String term) {
		return alfrescoCreateNewFolderPage().verifyIfElementExists(term);
	}

	@Step
	public void clickOnXMLFile(String... terms) {
		alfrescoCreateNewFolderPage().clickOnFolder(terms);
	}
	
	@Step
	public void verifyIfRenditionsExists(){
		customizeXMLPage().verifyIfRenditionsExists();
	}
	
	@Step
	public void clickOnRendition(){
		customizeXMLPage().clickOnRendition();
	}
	
	@StepGroup
	public void xmlFiles(){
		verifyIfXMLFileExists("DemoTesting.xml");
		clickOnXMLFile("DemoTesting.xml");
		verifyIfRenditionsExists();
		clickOnRendition();
	}
}
