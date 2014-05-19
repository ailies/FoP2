package com.pages.Alfresco;

import java.util.List;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class CustomizeXMLPage extends PageObject {

	public WebElement verifyIfRenditionsExists() {
		List<WebElement> searchResults = getDriver()
				.findElement(
						By.id("template_x002e_document-metadata_x002e_document-details_x0023_default-formContainer_assoc_rn_rendition-cntrl"))
				.findElements(By.cssSelector("a"));

		if (searchResults.size() == 3) {
			System.out.println(searchResults.size());

		} else {
			System.out.println("Less than 3 renditions were generated!");
		}
		return null;

	}

	public void clickOnRendition() {
		WebElement element = verifyIfRenditionsExists();
		System.out.println(element.getText());
		WebElement rendition = element
				.findElement(By
						.cssSelector("#template_x002e_document-metadata_x002e_document-details_x0023_default-formContainer_assoc_rn_rendition-cntrl > a > img:nht-child(1)"));

		if (element != null) {
			rendition.click();

		} /*else {
			Assert.fail("The rendition was not found!!!!");
		}*/

	}

}
