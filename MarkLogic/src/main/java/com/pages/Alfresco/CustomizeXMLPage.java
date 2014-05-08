package com.pages.Alfresco;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class CustomizeXMLPage extends PageObject {

	public void verifyIfRenditionsExists() {
		List<WebElement> searchResults = getDriver()
				.findElement(
						By.id("template_x002e_document-metadata_x002e_document-details_x0023_default-formContainer_assoc_rn_rendition-cntrl"))
				.findElements(By.cssSelector("a"));
		
		if (searchResults.size()==3)
		{
			System.out.println(searchResults.size());
		}else
		{
			System.out.println("Less than 3 renditions were generated!");
		}

	}

}
