package com.pages.Alfresco;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;

public class AnnotationsModulePage extends AbstractPage {

	public AnnotationsModulePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "")
	WebElement annotations;
	
	public void clickOnAnnotations(){
		annotations.click();
	}

}
