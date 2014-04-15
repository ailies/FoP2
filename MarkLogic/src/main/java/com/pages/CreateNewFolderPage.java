package com.pages;

import java.io.Serializable;
import java.util.NoSuchElementException;

import javax.naming.Name;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.16.10.115:8080/share/page/")
public class CreateNewFolderPage extends PageObject {

	@FindBy(css = ".filename")
	WebElement testFolder;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createContent-button-button")
	WebElement createMenu;

	@FindBy(css = ".yuimenuitemlabel .folder-file")
	WebElement createFolder;

	@FindBy(css = "input[name='prop_cm_name']")
	WebElement newFolderName;

	@FindBy(id = "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder-form-submit-button")
	WebElement createFolderBtn;

	@FindBy(css = ".filename")
	WebElement folder;

	@FindBy(id = "")
	WebElement createFolderFromTemplate;

	@FindBy(id = "")
	WebElement contentFolder;

	@FindBy(id = "")
	WebElement contentFolderName;

	@FindBy(id = "")
	WebElement saveContentFolderBtn;

	/*
	 * @FindBy(css = "") WebElement createFolderFromTemplate;
	 * 
	 * @FindBy(css = "input[name='Content Folder']") WebElement contentFolder;
	 * 
	 * @FindBy(id =
	 * "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder_prop_cm_name"
	 * ) WebElement contentFolderName;
	 * 
	 * @FindBy(css =
	 * "template_x002e_documentlist_v2_x002e_documentlibrary_x0023_default-createFolder-form-submit-button"
	 * ) WebElement saveContentFolder;
	 */

	/*
	 * public boolean getElementIfExists2(By by, int waitingTime, TimeUnit
	 * timeUnit) { getDriver().manage().timeouts().implicitlyWait(waitingTime,
	 * timeUnit); try { WebElement mainFolder = getDriver().findElement(by);
	 * getDriver().manage().timeouts() .implicitlyWait(30, TimeUnit.SECONDS);
	 * return true; } catch (Exception e) { getDriver().manage().timeouts()
	 * .implicitlyWait(30, TimeUnit.SECONDS); return false; }
	 */

	/*
	 * public void mainFolder() { if (((PageObject)
	 * getDriver()).element("mainFolder").isDisplayed()) { mainFolder.click(); }
	 * { ((PageObject) getDriver()).element("createMainFolder").click(); }
	 */

	public void SelectCreateMenuOption() {
		element(createMenu).waitUntilVisible();
		createMenu.click();
	}

	public void SelectCreateFolder() {
		element(createFolder).waitUntilVisible();
		createFolder.click();
	}

	public void InsertNewFolderName(String name) {
		element(newFolderName).waitUntilVisible();
		newFolderName.sendKeys(name);
	}

	public void ClickCreateFolderBtn() {
		element(createFolderBtn).waitUntilVisible();
		createFolderBtn.click();
	}

	public void CheckNotificationMessage(String msg) {
		WebElement message = getDriver().findElement(By.id("lightboxCaption"));
		System.out.println("" + message.getText());
		Assert.assertTrue("The message is correct!", message.getText()
				.contains(msg));
	}

	/*public boolean CheckThatTheNewFolderWasCreated() {		
		WebElement newFolder = getDriver().findElement(By.tagName("DemoTesting"));
		Assert.assertTrue(newFolder.isDisplayed());
			newFolder.click();
			waitABit(1);
		*/
			
		/*if (exists)
		  {
		     getDriver.findElement(By.tagName("DemoTesting")).click();
		  }
		  else
		  {
		     driver.findElement(By.cssSelector("xxx")).click();
		   }*/
	

	public void OpenFolder() {
		folder.click();
	}

	public void SelectCreateFolderFromTemplate() {
		createFolderFromTemplate.click();
	}

	public void SelectContentFolder() {
		contentFolder.click();
	}

	public void InsertContentFolderName(String contentName) {
		contentFolderName.sendKeys(contentName);
	}

	public void SaveContentFolder() {
		saveContentFolderBtn.click();
	}

	public void CheckContentFolderWasCreated() {
		WebElement contentFolder = getDriver().findElement(
				By.tagName("DemoTesting"));
		Assert.assertTrue(contentFolder.isDisplayed());
	}
}