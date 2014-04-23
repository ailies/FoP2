package com.pages.Alfresco;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class UploadVideoAndGenerateFramesPage extends PageObject {

	@FindBy(id = "")
	WebElement video;

	@FindBy(id = "")
	WebElement generateFrames;
	
	public void uploadVideoToResearchFolder(){
		WebElement element = getDriver().findElement(By.name(""));
		WebElement target = getDriver().findElement(By.name("Wildlife"));
		(new Actions(getDriver())).dragAndDrop(element, target).perform();
	}

	public void clickVideo() {
		element(video).waitUntilVisible();
		video.click();
	}

	public void clickGenerateFrames() {
		element(generateFrames).waitUntilVisible();
		generateFrames.click();
	}

}
