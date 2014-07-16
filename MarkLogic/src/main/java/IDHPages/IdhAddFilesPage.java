package IDHPages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.AbstractPage;
import tools.Constants;

public class IdhAddFilesPage extends AbstractPage {

	public IdhAddFilesPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnUploadDocumentFromLocalComputer() {
		WebElement uploadDocumentFromLocalComputer = getDriver().findElement(
				By.cssSelector("#UploadPanel .PanelHeader > a > img"));
		$(uploadDocumentFromLocalComputer).waitUntilVisible();
		uploadDocumentFromLocalComputer.click();
	}

	public void clickOnUploadIDMLButton(String IDMLfilePath) {
		WebElement uploadIDMLButton = getDriver()
				.findElement(
						By.cssSelector("#UploadPanel > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > table > tbody > tr > td:nth-child(2) > div > input[type='file']"));
		$(uploadIDMLButton).waitUntilVisible();
		uploadIDMLButton.click();
		uploadIDMLButton.sendKeys(" ");
		File idml = new File(IDMLfilePath);
		String idmlFile = idml.getAbsolutePath();
		System.out.println("File path absolute : " + idmlFile);
		waitABit(Constants.WAIT_TIME_LONG);
	}

	public void clickOnSendIDMLButton() {
		WebElement sendIDMLButton = getDriver()
				.findElement(
						By.cssSelector("#UploadPanel > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > table > tbody > tr > td:nth-child(3) > div > a"));
		$(sendIDMLButton).waitUntilVisible();
		sendIDMLButton.click();
	}

	public void clickOnUploadJPEGButton(String JPEGfilePath) {
		WebElement uploadJPEGButton = getDriver()
				.findElement(
						By.cssSelector("#UploadPanel > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > table > tbody > tr > td:nth-child(2) > div > input[type='file'"));
		$(uploadJPEGButton).waitUntilVisible();
		uploadJPEGButton.click();
		uploadJPEGButton.sendKeys(" ");
		File jpeg = new File(JPEGfilePath);
		String jpegFile = jpeg.getAbsolutePath();
		System.out.println("File path absolute : " + jpegFile);
		waitABit(Constants.WAIT_TIME_LONG);
	}

	public void clickOnSendJPEGButton() {
		WebElement sendJPEGButton = getDriver()
				.findElement(
						By.cssSelector("#UploadPanel > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > table > tbody > tr > td:nth-child(3) > div > a"));
		$(sendJPEGButton).waitUntilVisible();
		sendJPEGButton.click();
	}

	public void clickOnUploadZIP(String ZIPfilePath) {
		WebElement uploadZIPButton = getDriver()
				.findElement(
						By.cssSelector("#UploadPanel > div:nth-child(2) > div:nth-child(1) > form:nth-child(4) > table > tbody > tr > td:nth-child(2) > div > input[type='file']"));
		WebElement uploadJPEGButton = getDriver()
				.findElement(
						By.cssSelector("#UploadPanel > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > table > tbody > tr > td:nth-child(2) > div > input[type='file'"));
		$(uploadZIPButton).waitUntilVisible();
		uploadZIPButton.click();
		uploadJPEGButton.sendKeys(" ");
		File zip = new File(ZIPfilePath);
		String zipFile = zip.getAbsolutePath();
		System.out.println("File path absolute : " + zipFile);
		waitABit(Constants.WAIT_TIME_LONG);
	}

	public void clickOnSendZIPButton() {
		WebElement sendZIPButton = getDriver()
				.findElement(
						By.cssSelector("#UploadPanel > div:nth-child(2) > div:nth-child(1) > form:nth-child(4) > table > tbody > tr > td:nth-child(3) > div > a"));
		$(sendZIPButton).waitUntilVisible();
		sendZIPButton.click();
	}

	public void clickOnImportDocumentsFromServerDirectory() {
		WebElement importDocumentsFromServerDirectory = getDriver()
				.findElement(
						By.cssSelector("#ImportPanel > div.PanelHeader > a > img"));
		$(importDocumentsFromServerDirectory).waitUntilVisible();
		importDocumentsFromServerDirectory.click();
	}

}
