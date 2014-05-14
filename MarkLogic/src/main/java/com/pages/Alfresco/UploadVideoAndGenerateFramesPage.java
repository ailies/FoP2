package com.pages.Alfresco;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tools.Constants;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class UploadVideoAndGenerateFramesPage extends PageObject {

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-fileUpload-button-button")
	WebElement uploadBtn;

	@FindBy(css = ".dnd-file-selection-button")
	WebElement selectFilesToUpload;

	@FindBy(id = "template_x002e_dnd-upload_x002e_documentlibrary_x0023_default-cancelOk-button-button")
	WebElement cancelUploadFiles;

	public void clickOnUploadBtn() {
		uploadBtn.click();
	}

	public void selectFilesToUpload() {
		uploadBtn.click();
	}

	public void uploadVideoToResearchFolder() {
		getDriver().findElement(By.id("urid")).sendKeys("Videos\\Wildlife.wmv");

		WebElement element = getDriver().findElement(By.name(""));
		WebElement target = getDriver().findElement(By.name("Wildlife"));
		(new Actions(getDriver())).dragAndDrop(element, target).perform();
	}

	public static void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(stringSelection, null);
	}

	public void uploadDocument(String fileName) {
		// disableFlash();

		// element(uploadBtn).waitUntilVisible();
		// uploadBtn.click();
		// uploadBtn.sendKeys(" ");
		//
		// System.out.println("File path absolute : " + fileName);
		// element(uploadInputNoFlash).waitUntilVisible();
		//
		// uploadInputNoFlash.sendKeys(fileName);
		//
		// element(uploadBtn).waitUntilPresent();
		// uploadBtn.click();
		// waitABit(Constants.WAIT_TIME_LONG);
	}
}
