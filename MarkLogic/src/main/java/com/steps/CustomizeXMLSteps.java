package com.steps;

import com.pages.CustomizeXMLPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class CustomizeXMLSteps extends ScenarioSteps {

	public CustomizeXMLSteps(Pages pages) {
		super(pages);
	}

	CustomizeXMLPage customizeXML;

	@Step
	public void clickOnAssemblyView() {
		customizeXML.clickOnAssemblyView();
	}
	
	@Step
	public void clickOnMasterXML() {
		customizeXML.clickOnMasterXML();
	}
	
	@Step
	public void clickOnHTMLRendition() {
		customizeXML.clickOnHTMLRendition();
	}
	
	@Step
	public void clickOnPDFRendition() {
		customizeXML.clickOnPDFRendition();
	}

	@StepGroup
	public void CustomizeXML() {
		clickOnAssemblyView();
	}

}
