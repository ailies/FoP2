package com.pages;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class GenerateVideoFramesPage extends PageObject {

	@FindBy(id = "")
	WebElement ResearchFolder;

	// Drag and drop video
	/*
	 * public void UploadVideoToResearchFolder(){ WebElement element =
	 * getDriver().findElement(By.name("Wildlife")); WebElement target =
	 * getDriver().findElement(By.link()); (new
	 * Action(getDriver()).dragAndDrop(element, target).perform(); }
	 */
}
