package com.pages;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class CustomizeXMLPage extends PageObject {

	@FindBy(id = "")
	WebElement assemblyView;

	public void clickOnAssemblyView() {
		element(assemblyView).waitUntilVisible();
		assemblyView.click();
	}
}
