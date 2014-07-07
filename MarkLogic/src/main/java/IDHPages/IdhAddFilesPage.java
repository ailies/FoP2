package IDHPages;

import java.io.File;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;
import tools.Constants;

public class IdhAddFilesPage extends AbstractPage {

	public IdhAddFilesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "#UploadPanel .PanelHeader > a > img")
	WebElement uploadDocumentFromLocalComputer;

	@FindBy(css = "#UploadPanel > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > table > tbody > tr > td:nth-child(2) > div > input[type='file']")
	WebElement uploadIDMLButton;

	@FindBy(css = "#UploadPanel > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > table > tbody > tr > td:nth-child(3) > div > a")
	WebElement sendIDMLButton;

	@FindBy(css = "#UploadPanel > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > table > tbody > tr > td:nth-child(2) > div > input[type='file']")
	WebElement uploadJPEGButton;

	@FindBy(css = "#UploadPanel > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > table > tbody > tr > td:nth-child(3) > div > a")
	WebElement sendJPEGButton;

	@FindBy(css = "#UploadPanel > div:nth-child(2) > div:nth-child(1) > form:nth-child(4) > table > tbody > tr > td:nth-child(2) > div > input[type='file']")
	WebElement uploadZIPButton;

	@FindBy(css = "#UploadPanel > div:nth-child(2) > div:nth-child(1) > form:nth-child(4) > table > tbody > tr > td:nth-child(3) > div > a")
	WebElement sendZIPButton;

	@FindBy(css = "#ImportPanel > div.PanelHeader > a > img")
	WebElement importDocumentsFromServerDirectory;

	public void clickOnUploadDocumentFromLocalComputer() {
		element(uploadDocumentFromLocalComputer).waitUntilVisible();
		uploadDocumentFromLocalComputer.click();
	}

	public void clickOnUploadIDMLButton(String IDMLfilePath) {
		element(uploadIDMLButton).waitUntilVisible();
		uploadIDMLButton.click();
		uploadIDMLButton.sendKeys(" ");
		File idml = new File(IDMLfilePath);
		String idmlFile = idml.getAbsolutePath();
		System.out.println("File path absolute : " + idmlFile);
		waitABit(Constants.WAIT_TIME_LONG);
	}

	public void clickOnSendIDMLButton() {
		element(sendIDMLButton).waitUntilVisible();
		sendIDMLButton.click();
	}

	public void clickOnUploadJPEGButton(String JPEGfilePath) {
		element(uploadJPEGButton).waitUntilVisible();
		uploadJPEGButton.click();
		uploadJPEGButton.sendKeys(" ");
		File jpeg = new File(JPEGfilePath);
		String jpegFile = jpeg.getAbsolutePath();
		System.out.println("File path absolute : " + jpegFile);
		waitABit(Constants.WAIT_TIME_LONG);
	}

	public void clickOnSendJPEGButton() {
		element(sendJPEGButton).waitUntilVisible();
		sendJPEGButton.click();
	}

	public void clickOnUploadZIP(String ZIPfilePath) {
		element(uploadZIPButton).waitUntilVisible();
		uploadZIPButton.click();
		uploadJPEGButton.sendKeys(" ");
		File zip = new File(ZIPfilePath);
		String zipFile = zip.getAbsolutePath();
		System.out.println("File path absolute : " + zipFile);
		waitABit(Constants.WAIT_TIME_LONG);
	}

	public void clickOnSendZIPButton() {
		element(sendZIPButton).waitUntilVisible();
		sendZIPButton.click();
	}

	public void clickOnImportDocumentsFromServerDirectory() {
		element(importDocumentsFromServerDirectory).waitUntilVisible();
		importDocumentsFromServerDirectory.click();
	}

}
