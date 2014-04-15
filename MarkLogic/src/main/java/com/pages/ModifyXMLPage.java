package com.pages;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class ModifyXMLPage extends PageObject{
	
	@FindBy (id ="")
	WebElement parentXML;
	
/*	@FindBy (id ="")
	WebElement ;
	
	@FindBy (id ="")
	WebElement ;
	
	@FindBy (id ="")
	WebElement ;
	
	@FindBy (id ="")
	WebElement ;
	
	@FindBy (id ="")
	WebElement ;*/
	
	public void open_parentXML(){
		element(parentXML).waitUntilVisible();
		parentXML.click();
	}
}
