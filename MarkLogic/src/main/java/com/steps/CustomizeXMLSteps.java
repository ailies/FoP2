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
	public void clickOnAssemblyView() {
		customizeXMLPage().clickOnAssemblyView();
	}

	@Step
	public void clickOnMasterXML() {
		customizeXMLPage().clickOnMasterXML();
	}

	@Step
	public void clickOnHTMLRendition() {
		customizeXMLPage().clickOnHTMLRendition();
	}

	@Step
	public void clickOnPDFRendition() {
		customizeXMLPage().clickOnPDFRendition();
	}

	@StepGroup
	public void CustomizeXML() {
		clickOnAssemblyView();
	}

}
