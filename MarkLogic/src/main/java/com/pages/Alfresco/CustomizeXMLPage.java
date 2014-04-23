package com.pages.Alfresco;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class CustomizeXMLPage extends PageObject {

	@FindBy(id = "")
	WebElement assemblyView;
	
	@FindBy(id = "")
	WebElement masterXML;
	
	@FindBy(id = "template_x002e_document-metadata_x002e_document-details_x0023_default-formContainer_assoc_rn_rendition-cntrl")
	WebElement renditionsContainer;
	
	@FindBy(id = "")
	WebElement XTMLRendition;
	
	@FindBy(id = "")
	WebElement PDFRendition;
	
	@FindBy(id = "")
	WebElement annotationComment;
	
	@FindBy(id = "")
	WebElement saveAnnotation;
	
	

	public void clickOnAssemblyView() {
		element(assemblyView).waitUntilVisible();
		assemblyView.click();
	}
	
	public void clickOnMasterXML(){
		element(masterXML).waitUntilVisible();
		masterXML.click();
	}
	
	public void clickOnHTMLRendition(){
		element(XTMLRendition).waitUntilVisible();
		XTMLRendition.click();
	}
	
	public void clickOnPDFRendition(){
		element(PDFRendition).waitUntilVisible();
		PDFRendition.click();
	}
	
	public void inputAnnotationComment(String comment){
		element(annotationComment).waitUntilVisible();
		annotationComment.sendKeys(comment);
	}
	
	public void clickOnSaveAnnotation(){
		element(saveAnnotation).waitUntilVisible();
		saveAnnotation.click();
	}
}
